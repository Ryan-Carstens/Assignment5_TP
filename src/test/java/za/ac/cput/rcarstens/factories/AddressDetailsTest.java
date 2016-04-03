package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.AddressDetails;
import za.ac.cput.rcarstens.factories.Impl.AddressDetailsFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by sanXion on 2016/04/03.
 */
public class AddressDetailsTest {
    private AddressDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = AddressDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testAddressDetailsCreation() throws Exception {
        AddressDetails addressDetails = factory.createAddressDetails("24 Gunn Road", "PO BOX 989");
        Assert.assertEquals(addressDetails.getPhysicalAddress(),"24 Gunn Road");
        Assert.assertEquals(addressDetails.getPostalAddress(),"PO BOX 989");
        Assert.assertNotNull(addressDetails.getId());
    }


    @Test
    public void testAddressDetailsUpdate() throws Exception {
        AddressDetails addressDetails = factory.createAddressDetails("24 Gunn Road", "PO BOX 989");
        Assert.assertEquals(addressDetails.getPhysicalAddress(),"24 Gunn Road");
        Assert.assertEquals(addressDetails.getPostalAddress(),"PO BOX 989");
        Assert.assertNotNull(addressDetails.getId());

        // Updated Description

        AddressDetails updateAddressDetails = new AddressDetails.Builder()
                .copy(addressDetails)
                .physicalAddress("25 Gunn Road")
                .build();

        Assert.assertEquals(updateAddressDetails.getPhysicalAddress(),"25 Gunn Road");
        Assert.assertEquals(addressDetails.getPostalAddress(),updateAddressDetails.getPostalAddress());
        Assert.assertEquals(addressDetails.getId(),updateAddressDetails.getId());

    }
}
