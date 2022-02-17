package com.github.grangercarty.smogonusage;

public class App {
    public static void main(String[] args) {
        SmogonUsageRepository smoUsageRepository = new SmogonUsageRepository("gen8ou_2022_01.txt");
        SmogonUsageService smoUsageService =  new SmogonUsageService(smoUsageRepository);
        Server server = new Server(smoUsageService);
        server.run();
    }
}
