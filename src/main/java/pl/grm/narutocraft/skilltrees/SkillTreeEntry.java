package pl.grm.narutocraft.skilltrees;

import java.util.*;

import pl.grm.narutocraft.jutsu.*;

public class SkillTreeEntry {
	private int					x;
	private int					y;
	private SkillTreeEnum		tree;
	private JutsuTier			tier;
	private Jutsu				jutsu;
	private int					points;
	private SkillTreeEntry[]	prerequisites;
	private EntryStates			entryState;
	private JutsuParams			reqJutsu;
	
	/**
	 * @param x
	 *            x position.
	 * @param y
	 *            y position.
	 * @param tree
	 *            SkillTree type.
	 * @param jutsu
	 *            Jutsu of IJutsu Interface.
	 * @param tier
	 *            which Tier it is.
	 * @param points
	 *            how many points it require to unlock.
	 * @param prerequisites
	 *            what entry should be unlocked before this.
	 */
	public SkillTreeEntry(int x, int y, SkillTreeEnum tree, Jutsu jutsu, JutsuTier tier,
			int points, ArrayList<SkillTreeEntry> prerequisites) {
		this.x = x;
		this.y = y;
		this.tree = tree;
		this.jutsu = jutsu;
		this.tier = tier;
		this.points = points;
		convertAndSavePrerequisites(prerequisites);
		extractRequiredJutsus();
	}
	
	/**
	 * Converts ArrayList of Prerequisites to Array and save to prerequisites
	 * Array.
	 * 
	 * @param prerequisites
	 */
	private void convertAndSavePrerequisites(ArrayList<SkillTreeEntry> prerequisites) {
		this.prerequisites = prerequisites.toArray(new SkillTreeEntry[prerequisites.size()]);
	}
	
	/**
	 * Extracts Jutsus from prerequisites.
	 */
	private void extractRequiredJutsus() {
		if (prerequisites.length == 0) {
			this.reqJutsu = null;
		} else {
			for (SkillTreeEntry skillTreeEntry : prerequisites) {
				IJutsu jutsuTemp = skillTreeEntry.getJutsu();
				JutsuParams jutsuE = JutsuParams.getByIJutsu(jutsuTemp);
				this.reqJutsu = jutsuE;
			}
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public SkillTreeEnum getTree() {
		return this.tree;
	}
	
	public JutsuTier getTier() {
		return this.tier;
	}
	
	public Jutsu getJutsu() {
		return this.jutsu;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public SkillTreeEntry[] getPrerequisites() {
		return this.prerequisites;
	}
	
	public EntryStates getEntryState() {
		return this.entryState;
	}
	
	public JutsuParams getReqJutsu() {
		return this.reqJutsu;
	}
	
	public void setEntryState(EntryStates entryState) {
		this.entryState = entryState;
	}
}