package com.github.grangercarty.smogonusage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonUseTest {

    @Test
    public void isSmoUseTest() {
        String poke = " | 17   | Tapu Fini          |  9.74931% | 199796 |  9.749% | 166642 | 10.385% | ";
        String notpoke = " | Rank | Pokemon            | Usage %   | Raw    | %       | Real   | %       | ";
        Assertions.assertTrue(SmogonPokemonUse.isSmoUsage(poke));
        Assertions.assertFalse(SmogonPokemonUse.isSmoUsage((notpoke)));
    }

    @Test
    public void smoPokemonUseTest() {
        SmogonPokemonUse testPokeUse = new SmogonPokemonUse(" | 17   | Tapu Fini          |  9.74931% | 199796 |  9.749% | 166642 | 10.385% | ");
        Assertions.assertEquals(17, testPokeUse.getRank());
        Assertions.assertEquals("Tapu Fini", testPokeUse.getPokemonName());
        Assertions.assertEquals("9.74931%", testPokeUse.getUsageRate());
    }
}
