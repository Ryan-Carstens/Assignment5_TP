package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.RegistrationEntry;
import za.ac.cput.rcarstens.factories.Impl.RegistrationEntryFactoryImpl;

/**
 * Created by sanXion on 2016/04/07.
 */
public class RegistrationEntryTest {
    private RegistrationEntryFactory registrationEntryFactory;
    private RegistrationEntry registrationEntry;

    @Before
    public void setUp() throws Exception
    {
        registrationEntryFactory = RegistrationEntryFactoryImpl.getInstance();
        registrationEntry = registrationEntryFactory.createRegistrationEntry("9004275201088", "Male", "Navy");
    }

    @Test
    public void testCreateRegistrationEntry() throws Exception
    {
        //Assert.assertEquals(registrationEntry.getSouthAfricanID(),"9004275201088");
        //Assert.assertEquals(registrationEntry.getGender(),"Male");
        Assert.assertEquals(registrationEntry.getPlacementChoice(),"Navy");
    }

    @Test
    public void testUpdateRegistrationEntry() throws Exception
    {
        RegistrationEntry updateRegistrationEntry = new RegistrationEntry.Builder().copy(registrationEntry).placementChoice("Navy").build();
        Assert.assertEquals(updateRegistrationEntry.getPlacementChoice(),"Navy");
    }
}
