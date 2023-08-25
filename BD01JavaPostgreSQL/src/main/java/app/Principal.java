package app;

import java.util.List;

import dao.UsuarioDAO;
import model.Usuario;

public class Principal {
	public UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	void Listar() {
		List<Usuario> usuarios = usuarioDAO.get();
		for (Usuario u: usuarios) {
			MyIO.println(u.toString());
		}
		
	}
	void Inserir(int codigo, String login, String senha, char sexo) {
		Usuario usuario = new Usuario(11, login, senha,sexo);
		if(usuarioDAO.insert(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}
	}
	
	static void terminal() {
		int n;
		MyIO.println("SELECIONE OPÇÃO");	
		MyIO.println("Listar 1");	
		MyIO.println("Inserir 2");
		MyIO.println("Excluir 3");	
		MyIO.println("Atualizar 4");	
		MyIO.println("Sair 0");	
		
		switch (n) {
		case 0:
			break;
			
		case 1:
			//Listar();
			break;
		
		case 2:
			Inserir();
			break;
		}
	}

	public static void main(String args[]) {
		while (true) {
			
		}
	}
	
	
	
	
}
