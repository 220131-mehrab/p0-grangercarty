package com.github.grangercarty.smogonusage;

public class App {
    public static void main(String[] args) {
        SmogonUsageRepository smoUsageRepository = new SmogonUsageRepository();
        SmogonUsageService smoUsageService =  new SmogonUsageService(smoUsageRepository);
        SmogonUsageServer server = new SmogonUsageServer(smoUsageService);
        server.run();
    }
}
