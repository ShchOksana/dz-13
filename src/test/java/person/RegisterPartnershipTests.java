package person;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPartnershipTests extends BeforeClassPerson{
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void init(){
        createPersons();
        women1.registerPartnership(men1); //WomenRegisterPartnership
        men2.registerPartnership(women2); //MenRegisterPartnership
    }

    @Test
    public void testWomenLastNameShouldBeChangedAfterWomenRegisterPartnership(){
        Assert.assertEquals(women1.getLastName(), "Ivanov(a)", "Women's last name was not changed");
    }

    @Test
    public void testWomenPartnerShouldBeSetAfterWomenRegisterPartnership(){
        softAssert.assertNotNull(women1.getPartner(),"Men doesn't set as a partner. Check partnership registration.");
        softAssert.assertEquals(women1.getPartner().getLastName(), "Ivanov","Women's last name is incorrect");
        softAssert.assertAll();
    }

    @Test
    public void testMenPartnerShouldBeSetAfterWomenRegisterPartnership(){
        softAssert.assertNotNull(men1.getPartner(),"Women doesn't set as a partner. Check partnership registration.");
        softAssert.assertEquals(men1.getPartner().getLastName(), "Ivanov(a)","Women's last name is incorrect");
        softAssert.assertAll();
    }
    @Test
    public void testWomenLastNameShouldBeChangedAfterMenRegisterPartnership(){
        Assert.assertEquals(women2.getLastName(), "Poliakov(a)", "Women's last name was not changed");
    }

    @Test
    public void testWomenPartnerShouldBeSetAfterMenRegisterPartnership(){
        softAssert.assertNotNull(women2.getPartner(),"Men doesn't set as a partner. Check partnership registration.");
        softAssert.assertEquals(women2.getPartner().getLastName(), "Poliakov","Women's last name is incorrect");
        softAssert.assertAll();
    }

    @Test
    public void testMenPartnerShouldBeSetAfterMenRegisterPartnership(){
        softAssert.assertNotNull(men2.getPartner(),"Women doesn't set as a partner. Check partnership registration.");
        softAssert.assertEquals(men2.getPartner().getLastName(), "Poliakov(a)","Women's last name is incorrect");
        softAssert.assertAll();
    }

    @Test
    public void testWomenLastNameShouldBeNotChangedNoRegisterPartnership(){
        Assert.assertEquals(women4.getLastName(), "Petrenko", "Women's last name was changed");
    }
    @Test
    public void testWomenPartnerShouldNotBeSetNoRegisterPartnership(){
        Assert.assertNull(women4.getPartner(),"There was no partnership registration but partner is set.");
    }
    @Test
    public void testMenPartnerShouldNotBeSetNoRegisterPartnership(){
        Assert.assertNull(men4.getPartner(),"There was no partnership registration but partner is set.");
    }

}
