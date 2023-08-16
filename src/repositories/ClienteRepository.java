package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import entities.Cliente;

public class ClienteRepository {

	public void exportarTxt(Cliente cliente) {

		try {

			PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\clientes.txt"), true));

			printWriter.write("\nID do Cliente: " + cliente.getIdCliente());
			printWriter.write("\nNome.........: " + cliente.getNome());
			printWriter.write("\nCPF..........: " + cliente.getCpf());
			printWriter.write("\nEmail........: " + cliente.getEmail());
			printWriter.write("\n...");

			printWriter.flush();
			printWriter.close();

			System.out.println("\nDados gravados com Sucessoe m formato Txt!");

		} catch (Exception e) {
			System.out.println("\nOcorreu um erro ao gerar arquivo: " + e.getMessage());
		}

	}
	
	
	public void exportarJson(Cliente cliente) {
		
		try {
		
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\clientes.json"), true));
			
			HashMap<String, Object> mapa = new HashMap<String, Object>();
			
			mapa.put("idCliente", cliente.getIdCliente());
			mapa.put("nome", cliente.getNome());
			mapa.put("cpf", cliente.getCpf());
			mapa.put("email", cliente.getEmail());
			
			JSONObject json = new JSONObject(mapa);

			printWriter.write(json.toJSONString());
			printWriter.write("\n");
			
			printWriter.flush(); // salvando o arquivo
			printWriter.close(); // fechando o arquivo
			
			System.out.println("\nDados gravados com Sucesso em formato Json!");			
			
		} catch (Exception e) {
			System.out.println("\nOcorreu um erro ao gerar arquivo: " + e.getMessage());
		}		
	}
}
