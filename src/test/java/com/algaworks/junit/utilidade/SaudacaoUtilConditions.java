package com.algaworks.junit.utilidade;

import org.assertj.core.api.Condition;

public class SaudacaoUtilConditions {

    private SaudacaoUtilConditions() {}

    public static Condition<String> igualBomdia() {

        return igual("Bom dia");
    }

    public static Condition<String> igual(String saudacaoCorreta) {
        return new Condition<>((String) -> String.equals(saudacaoCorreta),
                "igual a %s",
                saudacaoCorreta);
    }

}
