package br.com.aquila.springdata;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.aquila.springdata.interfaces.auxiliar.IExecuta;
import br.com.aquila.springdata.interfaces.auxiliar.ISeed;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	public SpringDataApplication(@Qualifier("FuncionarioRepositorio") IExecuta executa, ISeed seed) {
		this.executa = executa;
		this.seed = seed;
	}

	private ISeed seed;
	private IExecuta executa;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		seed.seed();
		executa.run();
	}

}
