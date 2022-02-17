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
}
