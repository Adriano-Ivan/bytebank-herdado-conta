package br.com.bytebank.banco.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;



public class TesteSerializacao {

	public static void main(
			String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Adriano");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("01393232312");

		ContaCorrente cc = new ContaCorrente(333,4444);
		cc.setTitular(cliente);
		cc.deposita(233.87);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}
}
