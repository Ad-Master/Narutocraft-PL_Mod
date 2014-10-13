package pl.grm.narutocraft.skilltrees;

import java.util.ArrayList;

import pl.grm.narutocraft.jutsu.IJutsu;
import pl.grm.narutocraft.jutsu.JutsuEnum;
import pl.grm.narutocraft.jutsu.JutsuTier;

public class SkillTreeEntry {
	private int					x;
	private int					y;
	private SkillTree			tree;
	private JutsuTier			tier;
	private IJutsu				jutsu;
	private int					points;
	private SkillTreeEntry[]	prerequisites;
	private EntryStates			entryState;
	private JutsuEnum			reqJutsu;
	
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
	public SkillTreeEntry(int x, int y, SkillTree tree, IJutsu jutsu, JutsuTier tier, int points,
			ArrayList<SkillTreeEntry> prerequisites) {
		this.x = x;
		this.y = y;
		this.tree = tree;
		this.jutsu = jutsu;
		this.tier = tier;
		this.points = points;
		convertAndSavePrerequisites(prerequisites);
		convertAndSaveReqJutsu();
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
	
	private void convertAndSaveReqJutsu() {
		for (SkillTreeEntry skillTreeEntry : prerequisites) {
			IJutsu jutsuTemp = skillTreeEntry.getJutsu();
			JutsuEnum jutsuE = JutsuEnum.getByIJutsu(jutsuTemp);
			this.reqJutsu = jutsuE;
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public SkillTree getTree() {
		return this.tree;
	}
	
	public JutsuTier getTier() {
		return this.tier;
	}
	
	public IJutsu getJutsu() {
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
	
	public JutsuEnum getReqJutsu() {
		return this.reqJutsu;
	}
	
	public void setEntryState(EntryStates entryState) {
		this.entryState = entryState;
	}
}