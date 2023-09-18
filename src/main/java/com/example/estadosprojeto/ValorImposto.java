package com.example.estadosprojeto;

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
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser maior do que zero!");
        }
    }

    public float calcularImposto() {
        float aliquota = 0.0f;

        if ("AC".equals(estado) || "AL".equals(estado) || "RR".equals(estado) || "SC".equals(estado) ||
                "ES".equals(estado) || "GO".equals(estado) || "PA".equals(estado) || "MT".equals(estado) ||
                "MS".equals(estado)) {
            aliquota = 0.17f;
        } else if ("AM".equals(estado) || "AP".equals(estado) || "BA".equals(estado) ||
                "CE".equals(estado) || "DF".equals(estado) || "SE".equals(estado) ||
                "MA".equals(estado) || "MG".equals(estado) || "PB".equals(estado) ||
                "PR".equals(estado) || "PE".equals(estado) || "PI".equals(estado) ||
                "RN".equals(estado) || "RS".equals(estado) || "RJ".equals(estado) ||
                "SP".equals(estado) || "TO".equals(estado)) {
            aliquota = 0.18f;
        } else if ("RO".equals(estado)) {
            aliquota = 0.175f;
        }

        return valor * aliquota;
    }
}
