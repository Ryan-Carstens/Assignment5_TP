package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.RegistryManager;
import za.ac.cput.rcarstens.factories.Impl.RegistryManagerFactoryImpl;

/**
 * Created by sanXion on 2016/04/07.
 */
public class RegistryManagerTest {
    private RegistryManagerFactory registryManagerFactory;
    private RegistryManager registryManager;

    @Before
    public void setUp() throws Exception
    {
        registryManagerFactory = RegistryManagerFactoryImpl.getInstance();
        registryManager = registryManagerFactory.createRegistryManager("9004275201088", "Rob", "Ash", "robza@gmail.com", "rob123");
    }

    @Test
    public void testCreateRegistryManager() throws Exception
    {
        //Assert.assertEquals(recruit.getSouthAfricanID(),"9004275201088");
        //Assert.assertEquals(recruit.getFirstName(),"Rob");
        //Assert.assertEquals(recruit.getLastName(),"Ash");
        Assert.assertEquals(registryManager.getEmail(),"robza@gmail.com");
        //Assert.assertEquals(registryManager.getPassword(),"rob123");
    }

    @Test
    public void testUpdateRegistryManager() throws Exception
    {
        RegistryManager updateRegistryManager = new RegistryManager.Builder().copy(registryManager).email("robertza@gmail.com").build();
        Assert.assertEquals(updateRegistryManager.getEmail(),"robertza@gmail.com");
    }
}
