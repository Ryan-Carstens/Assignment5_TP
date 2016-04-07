package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.RegistryManager;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface RegistryManagerFactory {
    RegistryManager createRegistryManager(String southAfricanID, String firstName, String lastName, String email, String password);


}
