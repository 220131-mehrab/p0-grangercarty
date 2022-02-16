package com.github.grangercarty.smogonusage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SmogonUsageRepository {
    public ArrayList<Pokemon> smoUsageList;

    public SmogonUsageRepository(String fileName) {
        File smoUsageFile = new File(fileName);
        load (smoUsageFile);
    }

    public void load(File file) {
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String usageString = scanner.next();
                if (isMon(usageString)) {
                    Pokemon mon = new Pokemon(usageString);
                    smoUsageList.add(mon);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean isMon(String usageString) {
        return true;
    }
}
