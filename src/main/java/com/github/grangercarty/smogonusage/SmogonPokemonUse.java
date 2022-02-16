package com.github.grangercarty.smogonusage;

public class SmogonPokemonUse {
    public String rank;
    public String pokemonName;
    public String usageRate;

    public static boolean isSmoUsage(String usageString) {
        String[] stringArray = usageString.split("|");
        if ( (stringArray.length > 3) ) {
            return true;
        }
        return false;
    }

    public SmogonPokemonUse(String usageString) {
        String[] stringArray = usageString.split("|");
        this.rank = stringArray[1];
        this.pokemonName = stringArray[2];
        this.usageRate = stringArray[3];
    }
}
