package com.imobiliaria.main;

import java.time.LocalDate;
import com.imobiliaria.classes.Aluguel;
import com.imobiliaria.classes.Venda;

public class Princiapl {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Aluguel apto1 = new Aluguel("Rua aclimação, 32", LocalDate.now(), 1800);
    System.out.println("Endereço: " + apto1.getEndereco());
    System.out.println("Valor aluguel: " + apto1.getValorAluguel());

    Venda apto2 = new Venda("Rua consolaçao, 123", LocalDate.now(), 6000000);
    System.out.println("Endereço: " + apto2.getEndereco());
    System.out.println("Valor venda: " + apto2.getValorVenda());

    apto1.ativarcadastro();

    apto1.alugar();
    System.out.println(apto1.isAlugado());
  }

}
