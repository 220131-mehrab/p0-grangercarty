package com.github.grangercarty.smogonusage;

public class SmogonPokemonUse {
    public int rank;
    public String pokemonName;
    public String usageRate;

    public static boolean isSmoUsage(String usageString) {
        String[] stringArray = usageString.split("\\|");
        return ( (stringArray.length > 3) && (stringArray[1].strip().matches("\\d+")) );
    }

    public SmogonPokemonUse(String usageString) {
        String[] stringArray = usageString.split("\\|");
        this.rank = Integer.parseInt(stringArray[1].strip());
        this.pokemonName = stringArray[2].strip();
        this.usageRate = stringArray[3].strip();
    }

    public int getRank() {
        return rank;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getUsageRate() {
        return usageRate;
    }
}
