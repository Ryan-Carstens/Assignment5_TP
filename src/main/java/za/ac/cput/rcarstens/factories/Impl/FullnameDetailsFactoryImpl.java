package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.FullnameDetails;
import za.ac.cput.rcarstens.factories.FullnameDetailsFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class FullnameDetailsFactoryImpl implements FullnameDetailsFactory {
    private static FullnameDetailsFactoryImpl factory = null;

    private  FullnameDetailsFactoryImpl() {
    }
    public static FullnameDetailsFactoryImpl getInstance(){
        if(factory ==null)
            factory = new FullnameDetailsFactoryImpl();
        return factory;
    }

    public FullnameDetails createFullnameDetails(String firstname, String lastname) {
        FullnameDetails fullnameDetails = new  FullnameDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .firstname(firstname)
                .lastname(lastname)
                .build();
        return fullnameDetails;
    }

}
