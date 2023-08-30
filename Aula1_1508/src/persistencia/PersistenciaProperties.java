package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersistenciaProperties {
	public static void main(String[] args) {
		Properties propriedades = new Properties();
		propriedades.setProperty("usuario", "kaio");
		propriedades.setProperty("senha", "kaio");
		try {
			FileOutputStream arquivo  = new FileOutputStream("arquivo.proprerties");
			propriedades.store(arquivo, "dados do usuario");
			arquivo.close();
			System.out.println("Dados gravados");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
