package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.LoginDetails;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface LoginDetailsFactory {
    LoginDetails createLoginDetails(String email, String password);
}
