package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.DetailsCheck;
import za.ac.cput.rcarstens.factories.DetailsCheckFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class DetailsCheckFactoryImpl implements DetailsCheckFactory {
    private static DetailsCheckFactoryImpl factory = null;

    private DetailsCheckFactoryImpl() {
    }
    public static DetailsCheckFactoryImpl getInstance(){
        if(factory ==null)
            factory = new DetailsCheckFactoryImpl();
        return factory;
    }

    public  DetailsCheck createDetailsCheck(boolean response) {
        DetailsCheck detailsCheck = new  DetailsCheck
                .Builder()
                .id(UUID.randomUUID().toString())
                .response(response)
                .build();
        return detailsCheck;
    }
}
