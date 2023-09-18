package com.example.estadosprojeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValorAliquotaTests {
    ValorAliquota valorAliquota;

    @BeforeEach
    public void setUp() {
        valorAliquota = new ValorAliquota(50);
    }

    @Test
    void deveRetornarEstadoValido() {
        valorAliquota.setEstado("MG");
        assertEquals("MG", valorAliquota.getEstado());
    }

    @Test
    void deveRetornarEstadoInvalido() {
        try {
            valorAliquota.setEstado("ZZ");
        } catch (IllegalArgumentException e) {
            assertEquals("Estado Inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroNumeroCaracteres() {
        try {
            valorAliquota.setEstado("ZZZZ");
        } catch (IllegalArgumentException e) {
            assertEquals("A sigla do estado deve ter dois caracteres!", e.getMessage());
        }
    }

    @Test
    void deveRetornarValordoProduto() {
        valorAliquota.setValor(20);
        assertEquals(20, valorAliquota.getValor());
    }

    @Test
    void deveRetornarValorInvalido() {
        try {
            valorAliquota.setValor(0);
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior do que zero!", e.getMessage());
        }
    }

    @Test
    void deveRetornarValorInvalido2() {
        try {
            valorAliquota.setValor(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior do que zero!", e.getMessage());
        }
    }

    @Test
    void deveRetornarValorAcre() {
        valorAliquota.setEstado("AC");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorAlagoas() {
        valorAliquota.setEstado("AL");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorRoraima() {
        valorAliquota.setEstado("RR");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorSantaCatarina() {
        valorAliquota.setEstado("SC");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorEspiritoSanto() {
        valorAliquota.setEstado("ES");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorGoias() {
        valorAliquota.setEstado("GO");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorPara() {
        valorAliquota.setEstado("PA");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorMatoGrosso() {
        valorAliquota.setEstado("MT");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorMatoGrossoSul() {
        valorAliquota.setEstado("MS");
        assertEquals(58.5, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorAmazonas() {
        valorAliquota.setEstado("AM");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorAmapa() {
        valorAliquota.setEstado("AP");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorBahia() {
        valorAliquota.setEstado("BA");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorCeara() {
        valorAliquota.setEstado("CE");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorDistritoFederal() {
        valorAliquota.setEstado("DF");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorSergipe() {
        valorAliquota.setEstado("SE");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorMaranhao() {
        valorAliquota.setEstado("MA");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorMinasGerais() {
        valorAliquota.setEstado("MG");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorParaiba() {
        valorAliquota.setEstado("PB");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorParana() {
        valorAliquota.setEstado("PR");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorPernambuco() {
        valorAliquota.setEstado("PE");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorPiaui() {
        valorAliquota.setEstado("PI");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorRioGrandeNorte() {
        valorAliquota.setEstado("RN");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorRioGrandeSul() {
        valorAliquota.setEstado("RS");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorRioDeJaneiro() {
        valorAliquota.setEstado("RJ");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorSaoPaulo() {
        valorAliquota.setEstado("SP");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorTocantins() {
        valorAliquota.setEstado("TO");
        assertEquals(59, valorAliquota.calcularImposto());
    }

    @Test
    void deveRetornarValorRondonia() {
        valorAliquota.setEstado("RO");
        assertEquals(58.75, valorAliquota.calcularImposto());
    }
}
