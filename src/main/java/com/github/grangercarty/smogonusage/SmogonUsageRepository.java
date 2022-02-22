package com.github.grangercarty.smogonusage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SmogonUsageRepository {
    public ArrayList<SmogonPokemonUse> smoUsageList;

    public SmogonUsageRepository() {
        this.smoUsageList = new ArrayList<>();
    }

    public void load(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String usageString = scanner.next();
                if (SmogonPokemonUse.isSmoUsage(usageString)) {
                    SmogonPokemonUse mon = new SmogonPokemonUse(usageString);
                    smoUsageList.add(mon);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printUsageRepo() {
        for (int i = 0; i < smoUsageList.size(); i++) {
            smoUsageList.get(i).printPokemonUsage();
        }
    }
}
