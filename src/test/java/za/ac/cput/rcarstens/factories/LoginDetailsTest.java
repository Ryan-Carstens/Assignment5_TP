package za.ac.cput.rcarstens.factories;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.rcarstens.domain.LoginDetails;
import za.ac.cput.rcarstens.factories.Impl.LoginDetailsFactoryImpl;

/**
 * Created by sanXion on 2016/04/03.
 */
public class LoginDetailsTest {

    private LoginDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = LoginDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testAddressDetailsCreation() throws Exception {
        LoginDetails loginDetails = factory.createLoginDetails("ADMIN", "System Administrator");
        Assert.assertEquals(loginDetails.getEmail(), "ADMIN");
        Assert.assertEquals(loginDetails.getPassword(),"System Administrator");
        Assert.assertNotNull(loginDetails.getId());
    }


    @Test
    public void testAddressDetailsUpdate() throws Exception {
        LoginDetails loginDetails = factory.createLoginDetails("ADMIN", "System Administrator");
        Assert.assertEquals(loginDetails.getEmail(), "ADMIN");
        Assert.assertEquals(loginDetails.getPassword(), "System Administrator");
        Assert.assertNotNull(loginDetails.getId());

        // Updated Description

        LoginDetails updateLoginDetails = new LoginDetails.Builder()
                .copy(loginDetails)
                .email("Administrator")
                .build();

        Assert.assertEquals(updateLoginDetails.getEmail(), "Administrator");
        Assert.assertEquals(loginDetails.getPassword(), updateLoginDetails.getPassword());
        Assert.assertEquals(loginDetails.getId(), updateLoginDetails.getId());
    }
}
