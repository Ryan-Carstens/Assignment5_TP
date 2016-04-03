package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.LoginDetails;
import za.ac.cput.rcarstens.factories.LoginDetailsFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class LoginDetailsFactoryImpl implements LoginDetailsFactory {
    private static LoginDetailsFactoryImpl factory = null;

    private  LoginDetailsFactoryImpl() {
    }
    public static LoginDetailsFactoryImpl getInstance(){
        if(factory ==null)
            factory = new LoginDetailsFactoryImpl();
        return factory;
    }

    public  LoginDetails createLoginDetails(String email, String password) {
        LoginDetails addressDetails = new  LoginDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .email(email)
                .password(password)
                .build();
        return addressDetails;
    }
}
