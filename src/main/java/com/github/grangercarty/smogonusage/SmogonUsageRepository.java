package com.github.grangercarty.smogonusage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SmogonUsageRepository {
    public ArrayList<Pokemon> smoUsageList;

    public SmogonUsageRepository(String fileName) {
        File smoUsageFile = new File(fileName);
        try {
            Scanner scanner = new Scanner(smoUsageFile);
            scanner.useDelimiter("\n");
            int i = 0;
            while (scanner.hasNext()) {
                scanner.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
