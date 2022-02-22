package com.github.grangercarty.smogonusage;

import org.junit.jupiter.api.Test;

class SmogonUsageRepositoryTest {

    @Test
    public void constructorTest() {
        SmogonUsageRepository testRepo = new SmogonUsageRepository();
        testRepo.load("C:\\Users\\grang\\smogonapp\\src\\test\\resources\\gen8ou_2022_01test.txt");
        testRepo.printUsageRepo();
    }
}
