package com.example.estadosprojeto;

import java.util.HashMap;
import java.util.Map;

public class ValorImposto {
    private String estado;
    private float valor;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String[] estadosValidos = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"};

        if (estado.length() <= 2) {
            boolean estadoValido = false;
            for (String ufValido : estadosValidos) {
                if (ufValido.equals(estado)) {
                    estadoValido = true;
                    break;
                }
            }
            if (estadoValido) {
                this.estado = estado;
            } else {
                throw new IllegalArgumentException("Estado Inválido!");
            }
        } else {
            throw new IllegalArgumentException("O estado deve ter, no máximo, dois caracteres");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if(valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser maior do que zero!");
        }
    }

    public float calcularImposto() {
        Map<String, Float> aliquotasPorEstado = new HashMap<>();
        aliquotasPorEstado.put("AC", 0.17f);
        aliquotasPorEstado.put("AL", 0.17f);
        aliquotasPorEstado.put("AM", 0.18f);
        aliquotasPorEstado.put("AP", 0.18f);
        aliquotasPorEstado.put("BA", 0.18f);
        aliquotasPorEstado.put("CE", 0.18f);
        aliquotasPorEstado.put("DF", 0.18f);
        aliquotasPorEstado.put("ES", 0.17f);
        aliquotasPorEstado.put("GO", 0.17f);
        aliquotasPorEstado.put("MA", 0.18f);
        aliquotasPorEstado.put("MT", 0.17f);
        aliquotasPorEstado.put("MS", 0.17f);
        aliquotasPorEstado.put("MG", 0.18f);
        aliquotasPorEstado.put("PA", 0.17f);
        aliquotasPorEstado.put("PB", 0.18f);
        aliquotasPorEstado.put("PR", 0.18f);
        aliquotasPorEstado.put("PE", 0.18f);
        aliquotasPorEstado.put("PI", 0.18f);
        aliquotasPorEstado.put("RN", 0.18f);
        aliquotasPorEstado.put("RS", 0.18f);
        aliquotasPorEstado.put("RJ", 0.18f);
        aliquotasPorEstado.put("RO", 0.175f);
        aliquotasPorEstado.put("RR", 0.17f);
        aliquotasPorEstado.put("SC", 0.17f);
        aliquotasPorEstado.put("SP", 0.18f);
        aliquotasPorEstado.put("SE", 0.18f);
        aliquotasPorEstado.put("TO", 0.18f);

        Float aliquota = aliquotasPorEstado.getOrDefault(estado,0.0f);
        return valor * aliquota;
    }
}
