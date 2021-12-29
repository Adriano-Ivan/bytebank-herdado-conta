package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClasseAnonima {

	public static void main(
			String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Hans");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Orbuld");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Venkis");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        lista.sort(new Comparator<Conta>(){

        	@Override
        	public int compare(Conta c1,
        			Conta c2) {
        		
        		return Integer.compare(c1.getNumero(),c2.getNumero());
        		//return c1.getNumero() - c2.getNumero();
        		
        	}
        	
        });
        
        Comparator<Conta> comp = new  Comparator<Conta>(){
        	public int compare(Conta c1, Conta c2) {
        		String nomeC1 = c1.getTitular().getNome();
        		String nomeC2 = c2.getTitular().getNome();
        		
        		return nomeC1.compareTo(nomeC2);
        	}
        };
        
        System.out
				.println("DEPOIS DA ORDENA��O.");
        
        for(Conta conta:lista) {
        	System.out
					.println(conta.getNumero());
        }

        Comparator<String> compStrings = new Comparator<String>() {
        	public int compare(String s1,String s2) {
        		return s1.compareTo(s2);
        	}
        };
        
       
	}
}


