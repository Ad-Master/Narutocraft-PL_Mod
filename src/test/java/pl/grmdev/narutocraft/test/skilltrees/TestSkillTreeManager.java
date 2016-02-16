package pl.grmdev.narutocraft.test.skilltrees;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.fail;

import java.security.InvalidParameterException;

import org.junit.Test;

import pl.grmdev.narutocraft.handlers.JutsuManager;
import pl.grmdev.narutocraft.jutsu.Jutsu;
import pl.grmdev.narutocraft.jutsu.JutsuParams;
import pl.grmdev.narutocraft.skilltrees.SkillTree;
import pl.grmdev.narutocraft.skilltrees.SkillTreeEntry;
import pl.grmdev.narutocraft.skilltrees.SkillTreeEnum;
import pl.grmdev.narutocraft.skilltrees.SkillTreeManager;

public class TestSkillTreeManager {

	SkillTreeManager skillsManager;
	JutsuManager jM = new JutsuManager();
	JutsuParams jutsu = JutsuParams.RASENGAN;

	@Test
	public void testInstance() {
		skillsManager = SkillTreeManager.instance;
		assertThat(skillsManager, notNullValue());
	}

	@Test
	public void testInitCall() {
		skillsManager = SkillTreeManager.instance;
		try {
			skillsManager.init();
		}
		catch (InvalidParameterException e) {
			assertThat(e.getMessage(), containsString("Unable to locate one or more prerequisite"));
		}
		catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage() + " with " + e.getStackTrace());
		}
	}

	@Test
	public void testRegisterEntry() {
		skillsManager = SkillTreeManager.instance;
		skillsManager.init();
		assertThat(skillsManager.getEntry(jutsu), notNullValue());
		SkillTreeEntry entry = skillsManager.getEntry(JutsuParams.RASENGAN);
		assertThat(entry.getJutsu().getJutsuProps(), is(((Jutsu) jutsu.getJutsu()).getJutsuProps()));
	}

	@Test
	public void testLoadPrerequisites() {
		skillsManager = SkillTreeManager.instance;
		skillsManager.init();
		SkillTree tree = skillsManager.getTreefromTreeMap(SkillTreeEnum.NINJUTSU);

		// if(tree.containsKey())
		// TODO test method impl
	}

	@Test
	public void testLockAllEntries() {
		// TODO test method impl
	}

	@Test
	public void testGetterLockedJutsusID() {
		// TODO test method impl
	}

	@Test
	public void testGetterJutsuTreeEntry() {
		// TODO test method impl
	}

	@Test
	public void testTreeGetter() {
		// TODO test method impl
	}
}