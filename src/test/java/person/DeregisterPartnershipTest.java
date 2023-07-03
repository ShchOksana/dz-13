package person;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DeregisterPartnershipTest extends BeforeClassPerson{

    @BeforeClass
    public void init(){
        createPersons();
        men3.registerPartnership(women3);
        System.out.println();
        women3.deregisterPartnership(false); //WomenDivorce
        System.out.println();

        women5.registerPartnership(men5);
        System.out.println();
        men5.deregisterPartnership(true); //MenDivorce
    }

    @Test
    public void testWomenLastNameShouldNotBeChangedAfterWomenDivorce(){
        Assert.assertEquals(women3.getLastName(), "Petrov(a)", "Women's last name is incorrect after divorce");
    }

    @Test
    public void testWomenPartnerShouldNotBeSetAfterWomenDivorce(){
        Assert.assertNull(women3.getPartner(),"Women still has a partner after divorce.");
    }

    @Test
    public void testMenPartnerShouldNotBeSetAfterWomenDivorce(){
        Assert.assertNull(men3.getPartner(),"Men still has a partner after divorce.");
    }

    @Test
    public void testWomenLastNameShouldBeChangedAfterMenDivorce(){
        Assert.assertEquals(women5.getLastName(), "Koroliuk", "Women's last name is incorrect after divorce");
    }

    @Test
    public void testWomenPartnerShouldNotBeSetAfterMenDivorce(){
        Assert.assertNull(women5.getPartner(),"Women still has a partner after divorce.");
    }

    @Test
    public void testMenPartnerShouldNotBeSetAfterMenDivorce(){
        Assert.assertNull(men5.getPartner(),"Men still has a partner after divorce.");
    }
}
