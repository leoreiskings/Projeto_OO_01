package principal;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {

		System.out.println("Projeto Java Orientado a Objetos-01");

		Cliente cliente = new Cliente();

		cliente.setIdCliente(1);
		cliente.setNome("Leandro Reis");
		cliente.setCpf("123.456.789-00");
		cliente.setEmail("leo19reis@gmail.com");

		System.out.println("\nDados do Cliente:\n");
		System.out.println("ID do Cliente: " + cliente.getIdCliente());
		System.out.println("Nome.........: " + cliente.getNome());
		System.out.println("CPF..........: " + cliente.getCpf());
		System.out.println("Email........: " + cliente.getEmail());

		ClienteRepository clienteRepository = new ClienteRepository();
		
		clienteRepository.exportarTxt(cliente);
		clienteRepository.exportarJson(cliente);
		
	}
}
