package za.ac.cput.rcarstens.factories;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.rcarstens.domain.ContactDetails;
import za.ac.cput.rcarstens.factories.Impl.ContactDetailsFactoryImpl;

/**
 * Created by sanXion on 2016/04/03.
 */
public class ContactDetailsTest {
    private ContactDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = ContactDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testContactDetailsCreation() throws Exception {
        ContactDetails contactDetails = factory.createContactDetails("7825647", "0822800822");
        Assert.assertEquals(contactDetails.getHomePhone(), "7825647");
        Assert.assertEquals(contactDetails.getCellPhone(),"0822800822");
        Assert.assertNotNull(contactDetails.getId());
    }


    @Test
    public void testContactDetailsUpdate() throws Exception {
        ContactDetails contactDetails = factory.createContactDetails("7825647", "0822800822");
        Assert.assertEquals(contactDetails.getHomePhone(),"7825647");
        Assert.assertEquals(contactDetails.getCellPhone(),"0822800822");
        Assert.assertNotNull(contactDetails.getId());

        // Updated Description

        ContactDetails updateContactDetails = new ContactDetails.Builder()
                .copy(contactDetails)
                .homePhone("0217825647")
                .build();

        Assert.assertEquals(updateContactDetails.getHomePhone(),"0217825647");
        Assert.assertEquals(contactDetails.getCellPhone(),updateContactDetails.getCellPhone());
        Assert.assertEquals(contactDetails.getId(),updateContactDetails.getId());

    }
}
