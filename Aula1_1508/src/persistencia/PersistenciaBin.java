package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistenciaBin {
	public static void main(String[] args) {
		
		try

		{
			FileOutputStream arquivo = new FileOutputStream("arquivo.bin");
			ObjectOutputStream escritor = new ObjectOutputStream(arquivo);
			escritor.writeObject( new Pessoa("Kaio", 23));
			escritor.close();
			arquivo.close();
			System.out.println("dados gravados");
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
