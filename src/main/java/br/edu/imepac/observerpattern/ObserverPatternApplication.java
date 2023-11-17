package br.edu.imepac.observerpattern;

import br.edu.imepac.observerpattern.model.Estoque;
import br.edu.imepac.observerpattern.model.Gerente;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ObserverPatternApplication {

    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1100.00");
        BigDecimal desconto = new BigDecimal("10.00");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);

        System.out.println("----------------------------------------------------------------------");

        BigDecimal valorInicial2 = new BigDecimal("100.00");
        BigDecimal desconto2 = new BigDecimal("10.00");
        Gerente gerente2 = new Gerente("José");
        Estoque estoque2 = new Estoque("Camiseta", valorInicial2, desconto2);
        estoque2.attach(gerente2);
        estoque2.setValor(valorInicial2);
    }

}
