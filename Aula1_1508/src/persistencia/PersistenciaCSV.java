package persistencia;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaCSV {

	public static void main(String[] args) {

		try {
			FileWriter escritor = new FileWriter("arquivo.csv");

			escritor.append("Kaio, 23, Masculino\n");
			escritor.append("João, 12, Masculino\n");
			escritor.append("Lais, 19, Feminino\n");

			escritor.close();
			System.out.println("dados gravados");

		} catch (IOException e) {
			System.out.println("erro ao escrever" + e.getMessage());
		}

	}

}
