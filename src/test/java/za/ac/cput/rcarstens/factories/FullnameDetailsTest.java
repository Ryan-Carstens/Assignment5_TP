package za.ac.cput.rcarstens.factories;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.rcarstens.domain.FullnameDetails;
import za.ac.cput.rcarstens.factories.Impl.FullnameDetailsFactoryImpl;

/**
 * Created by sanXion on 2016/04/03.
 */
public class FullnameDetailsTest {

    private FullnameDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = FullnameDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testAddressDetailsCreation() throws Exception {
        FullnameDetails fullnameDetails = factory.createFullnameDetails("ADMIN", "System Administrator");
        Assert.assertEquals(fullnameDetails.getFirstname(), "ADMIN");
        Assert.assertEquals(fullnameDetails.getLastname(),"System Administrator");
        Assert.assertNotNull(fullnameDetails.getId());
    }


    @Test
    public void testAddressDetailsUpdate() throws Exception {
        FullnameDetails fullnameDetails = factory.createFullnameDetails("ADMIN", "System Administrator");
        Assert.assertEquals(fullnameDetails.getFirstname(), "ADMIN");
        Assert.assertEquals(fullnameDetails.getLastname(), "System Administrator");
        Assert.assertNotNull(fullnameDetails.getId());

        // Updated Description

        FullnameDetails updateFullnameDetails = new FullnameDetails.Builder()
                .copy(fullnameDetails)
                .firstname("Administrator")
                .build();

        Assert.assertEquals(updateFullnameDetails.getFirstname(), "Administrator");
        Assert.assertEquals(fullnameDetails.getLastname(), updateFullnameDetails.getLastname());
        Assert.assertEquals(fullnameDetails.getId(), updateFullnameDetails.getId());
    }
}
