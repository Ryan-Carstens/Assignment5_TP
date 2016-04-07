package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.IdentificationCheck;
import za.ac.cput.rcarstens.factories.Impl.IdentificationCheckFactoryImpl;

/**
 * Created by sanXion on 2016/04/07.
 */
public class IdentificationCheckTest {

    private IdentificationCheckFactory identificationCheckFactory;
    private IdentificationCheck identificationCheck;

    @Before
    public void setUp() throws Exception
    {
        identificationCheckFactory = IdentificationCheckFactoryImpl.getInstance();
        identificationCheck = identificationCheckFactory.createIdentificationCheck(true);
    }

    @Test
    public void testCreateIdentificationCheck() throws Exception
    {
        Assert.assertEquals(identificationCheck.getResponse(), true);

    }

    @Test
    public void testUpdateIdentificationCheck() throws Exception
    {
        IdentificationCheck updateIdentificationCheck = new IdentificationCheck.Builder().copy(identificationCheck).response(false).build();
        Assert.assertEquals(updateIdentificationCheck.getResponse(),false);
    }
}
