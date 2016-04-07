package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.IdentificationCheck;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface IdentificationCheckFactory {
    IdentificationCheck createIdentificationCheck(boolean response);
}
