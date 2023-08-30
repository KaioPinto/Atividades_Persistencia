package persistencia;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaTXT {
	public static void main(String[] args) {
		String conteudo = "este é um exemplo de persistencia em arquivo txt";
		try {
			FileWriter escritor = new FileWriter("arquivo.txt");
			escritor.write(conteudo);
			escritor.close();
			System.out.println("dados gravados");
			
		}catch(IOException e) {
			System.out.println("erro ao escrever" + e.getMessage());
		}

	}
}