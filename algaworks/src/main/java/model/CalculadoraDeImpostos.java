package model;

import algaworks.DAO.Logger;

public class CalculadoraDeImpostos {

    private Logger logger;

    public CalculadoraDeImpostos(Logger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {
        double imposto = valor * 0.1; // Calcula 10% do valor como imposto
        double valorTotal = valor + imposto; // Soma o imposto ao valor original

        logger.log("Imposto calculado para o valor R$" + valor + ": R$" + imposto);
        logger.log("Valor total com imposto: R$" + valorTotal);

    }
}
