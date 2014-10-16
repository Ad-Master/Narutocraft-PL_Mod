package pl.grm.narutocraft.skilltrees;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import pl.grm.narutocraft.jutsu.JutsuEnum;
import pl.grm.narutocraft.jutsu.JutsuTier;
import pl.grm.narutocraft.jutsu.ninjutsu.Meisaigakure;

public class TestSkillTree {
	
	private SkillTree		sTree;
	private SkillTreeEntry	entry;
	
	@Test
	public void testConstructor() {
		sTree = new SkillTree(0);
		assertTrue(sTree.getEntryMap() != null);
	}
	
	@Test
	public void testAddEntry() {
		sTree = new SkillTree(0);
		setupEntry();
		sTree.addEntry(entry);
		if (!sTree.getEntry(entry.getJutsu().getJutsuProps().getID()).equals(entry)) {
			fail("Entry input != output!");
		}
	}
	
	@Test
	public void testContains1() {
		sTree = new SkillTree(0);
		setupEntry();
		sTree.addEntry(entry);
		assertTrue("There is no this entry or method contsins broken.", sTree.contains(entry));
	}
	
	@Test
	public void testContains2() {
		sTree = new SkillTree(0);
		setupEntry();
		sTree.addEntry(entry);
		assertTrue("There is no this entry or method contsins broken.",
				sTree.contains(JutsuEnum.MEISAIGAKURE.getJutsuID()));
	}
	
	private void setupEntry() {
		entry = new SkillTreeEntry(2, 2, SkillTreeEnum.NONE, new Meisaigakure(), JutsuTier.A, 15,
				new ArrayList<SkillTreeEntry>());
	}
}
