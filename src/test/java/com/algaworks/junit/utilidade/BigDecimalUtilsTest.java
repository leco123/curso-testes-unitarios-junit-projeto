package com.algaworks.junit.utilidade;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BigDecimalUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "10.00,10",
            "9.00,09.00"
    })
    void iguais(BigDecimal x, BigDecimal y) {

        assertTrue(BigDecimalUtils.iguais(x,y));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numeros.csv")
    void diferentes(BigDecimal x, BigDecimal y) {
        assertFalse(BigDecimalUtils.iguais(x,y));
    }


}