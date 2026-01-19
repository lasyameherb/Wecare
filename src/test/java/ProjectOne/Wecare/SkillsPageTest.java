package ProjectOne.Wecare;

import org.testng.annotations.Test;

public class SkillsPageTest extends baseTest {

	
	
	@Test
	public void clickSilksOption() {
		SkillsPage Skills = new SkillsPage(driver);
		Skills.clickToggle();	
		Skills.choosePartnerField();
		Skills.choosecategoryField();
		Skills.enterTopic("a".repeat(400));
		Skills.choosePlatformField();
	    Skills.minParticipate("67");
	    Skills.maxParticipate(77);
	    Skills.selectCheckbox();
	    Skills.remark("JS is only a fallback when Selenium actions fail.");
		
	}
	
	
	
	
}
