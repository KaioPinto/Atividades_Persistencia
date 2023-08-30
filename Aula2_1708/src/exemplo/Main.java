package exemplo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect( "https://ge.globo.com/").get();
			
			System.out.println(doc);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
