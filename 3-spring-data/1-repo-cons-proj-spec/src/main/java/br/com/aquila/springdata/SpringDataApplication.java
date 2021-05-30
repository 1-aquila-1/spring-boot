package br.com.aquila.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.aquila.springdata.interfaces.auxiliar.IExecuta;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	public SpringDataApplication(IExecuta executa) {
		this.executa = executa;
	}

	private IExecuta executa;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		executa.run();
	}

}
