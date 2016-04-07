package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.IdentificationCheck;
import za.ac.cput.rcarstens.factories.IdentificationCheckFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class IdentificationCheckFactoryImpl implements IdentificationCheckFactory {
    private static IdentificationCheckFactoryImpl factory = null;

    private IdentificationCheckFactoryImpl() {
    }
    public static IdentificationCheckFactoryImpl getInstance(){
        if(factory ==null)
            factory = new IdentificationCheckFactoryImpl();
        return factory;
    }

    public  IdentificationCheck createIdentificationCheck(boolean response) {
        IdentificationCheck identificationCheck = new  IdentificationCheck
                .Builder()
                .id(UUID.randomUUID().toString())
                .response(response)
                .build();
        return identificationCheck;
    }
}
