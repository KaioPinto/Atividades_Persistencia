package exemplo;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Gravar {

	public static void main(String[] args) {
		try {

			Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/F%C3%B3rmula_1").get();
			FileWriter escritor = new FileWriter("arquivo.txt");
			escritor.write(doc.getElementsByTag("h1").text());
			System.out.println(doc.getElementsByTag("h1").text());
			escritor.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
