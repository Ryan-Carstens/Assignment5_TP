package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.RegistrationEntry;
import za.ac.cput.rcarstens.factories.RegistrationEntryFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class RegistrationEntryFactoryImpl implements RegistrationEntryFactory {
    private static RegistrationEntryFactoryImpl factory = null;

    private RegistrationEntryFactoryImpl() {
    }
    public static RegistrationEntryFactoryImpl getInstance(){
        if(factory ==null)
            factory = new RegistrationEntryFactoryImpl();
        return factory;
    }

    public RegistrationEntry createRegistrationEntry(String southAfricanID, String gender, String placementChoice) {
        RegistrationEntry registrationEntry = new  RegistrationEntry
                .Builder()
                .southAfricanID(southAfricanID)
                .gender(gender)
                .placementChoice(placementChoice)
                .build();
        return registrationEntry;
    }

}