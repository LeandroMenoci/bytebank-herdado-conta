package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {
  public static void main(String[] args) {

    // int[] idades = new int[5];
    Object[] referencia = new Object[5];
    ContaCorrente cc1 = new ContaCorrente(33, 22);
    referencia[0] = cc1;

    ContaPoupanca cc2 = new ContaPoupanca(44, 55);
    referencia[1] = cc2;

    Cliente cliente = new Cliente();
    referencia[2] = cliente;

    // Object referenciaGenerica = referencia[1];

    // System.out.println(((Conta) referenciaGenerica).getNumero());

    ContaPoupanca ref = (ContaPoupanca) referencia[1]; // type cast
    System.out.println(ref.getAgencia());
  }
}
