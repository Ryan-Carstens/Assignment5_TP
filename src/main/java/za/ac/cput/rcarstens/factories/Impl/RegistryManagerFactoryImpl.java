package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.RegistryManager;
import za.ac.cput.rcarstens.factories.RegistryManagerFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class RegistryManagerFactoryImpl implements RegistryManagerFactory {
    private static RegistryManagerFactoryImpl factory = null;

    private RegistryManagerFactoryImpl() {
    }
    public static RegistryManagerFactoryImpl getInstance(){
        if(factory ==null)
            factory = new RegistryManagerFactoryImpl();
        return factory;
    }

    public  RegistryManager createRegistryManager(String southAfricanID, String firstName, String lastName, String email, String password) {
        RegistryManager registryManager = new  RegistryManager
                .Builder()
                .southAfricanID(southAfricanID)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
        return registryManager;
    }
}
