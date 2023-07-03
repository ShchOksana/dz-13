package person;

import org.testng.Assert;
import org.testng.annotations.*;

public class IsRetiredTests extends BeforeClassPerson{
    @BeforeClass
    public void init(){
        createPersons();
    }
    @Test
    public void testManShouldNotBeRetired(){
        Assert.assertFalse(men1.isRetired(), "Men's age >= 65");
    }
    @Test
    public void testMenShouldBeRetired(){
        Assert.assertTrue(men2.isRetired(),"Men's age < 65");
    }
    @Test
    public void testWomenShouldNotBeRetired(){
        Assert.assertFalse(women1.isRetired(), "Women's age >= 60");
    }
    @Test
    public void testWomanShouldBeRetired(){
        Assert.assertTrue(women2.isRetired(),"Women's age < 60");
    }

    public class StaticProvider {
        @DataProvider(name = "persons")
        public static Object[][] createPersons() {
            return new Object[][] {
                    new Object[] {  }
            };
        }
    }


}
