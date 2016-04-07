package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.Recruit;
import za.ac.cput.rcarstens.factories.RecruitFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */

public class RecruitFactoryImpl implements RecruitFactory {

    private static RecruitFactoryImpl factory = null;

    private RecruitFactoryImpl() {
    }
    public static RecruitFactoryImpl getInstance(){
        if(factory ==null)
            factory = new RecruitFactoryImpl();
        return factory;
    }

    public Recruit createRecruit(String southAfricanID, String firstName, String lastName) {
        Recruit recruit = new Recruit
                .Builder()
                .southAfricanID(southAfricanID)
                .firstName(firstName)
                .lastName(lastName)
                .build();
        return recruit;
    }
}
