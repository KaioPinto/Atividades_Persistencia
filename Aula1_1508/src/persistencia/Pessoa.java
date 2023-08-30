package persistencia;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int age;

	public Pessoa(String name, int age) {
		this.name = name;
		this.age = age;

	}

}
