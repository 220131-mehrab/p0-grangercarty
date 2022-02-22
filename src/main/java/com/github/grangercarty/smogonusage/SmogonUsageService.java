package com.github.grangercarty.smogonusage;

public class SmogonUsageService {
    SmogonUsageRepository smoUsageRepository;

    public SmogonUsageService(SmogonUsageRepository smoUsageRepository) {
        this.smoUsageRepository = smoUsageRepository;
        this.smoUsageRepository.load("gen8ou_2022_01.txt");
    }
}
