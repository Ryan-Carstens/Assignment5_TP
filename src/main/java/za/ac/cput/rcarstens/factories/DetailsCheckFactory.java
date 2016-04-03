package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.DetailsCheck;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface DetailsCheckFactory {
    DetailsCheck createDetailsCheck(boolean response);
}
