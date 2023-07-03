package person;

import com.rd.person.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GettersSettersTest{
    private Person person1, person2;
    @BeforeTest (groups = {"SmokeTest"})
    public void createPersonForSmokeTest(){
        person1 = new Person("Illia", "Sokolov", 22) {
            @Override
            public boolean isRetired() {
                return false;
            }

            @Override
            public void registerPartnership(Person person) {

            }

            @Override
            public void deregisterPartnership(boolean isReturnLastName) {

            }
        };

        person2 = new Person("Alla", "Serikova", 35) {
            @Override
            public boolean isRetired() {
                return false;
            }

            @Override
            public void registerPartnership(Person person) {

            }

            @Override
            public void deregisterPartnership(boolean isReturnLastName) {

            }
        };
    }

    @Test(groups = {"SmokeTest"})
    public void testGetFirstName(){
        Assert.assertEquals(person1.getFirstName(),"Illia", "Incorrect first name");
    }

    @Test(groups = {"SmokeTest"})
    public void testSetFirstName(){
        person1.setFirstName("Illiaaaa");
        Assert.assertEquals(person1.getFirstName(),"Illiaaaa", "Incorrect first name");
    }

    @Test(groups = {"SmokeTest"})
    public void testGetLastName(){
        Assert.assertEquals(person1.getLastName(),"Sokolov", "Incorrect last name");
    }

    @Test(groups = {"SmokeTest"})
    public void testSetLastName(){
        person1.setLastName("Sokolovvvv");
        Assert.assertEquals(person1.getLastName(),"Sokolovvvv", "Incorrect last name");
    }

    @Test(groups = {"SmokeTest"})
    public void testGetAge(){
        Assert.assertEquals(person1.getAge(),22, "Incorrect age");
    }

    @Test(groups = {"SmokeTest"})
    public void testSetAge(){
        person1.setAge(24);
        Assert.assertEquals(person1.getAge(), 24,"Incorrect age");
    }

    @Test(groups = {"SmokeTest"})
    public void testGetPartnerShouldBeNull(){
        Assert.assertNull(person1.getPartner(), "Partner should be null");
    }
    @Test(groups = {"SmokeTest"})
    public void testSetPartnerShouldNotBeNull(){
        person1.setPartner(person2);
        Assert.assertNotNull(person1.getPartner(), "Partner should NOT be null");
    }
    @Test(groups = {"SmokeTest"})
    public void testGetGenderShouldBeNull(){
        Assert.assertNull(person1.getGender(), "Gender should be null");
    }
    @Test(groups = {"SmokeTest"})
    public void testSetGender(){
        person1.setGender("M");
        Assert.assertEquals(person1.getGender(),"M", "Incorrect gender");
    }
}
