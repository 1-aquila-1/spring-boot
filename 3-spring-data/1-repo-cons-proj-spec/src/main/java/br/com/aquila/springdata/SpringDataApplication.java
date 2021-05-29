package br.com.aquila.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.aquila.springdata.model.Cargo;
import br.com.aquila.springdata.repository.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	public SpringDataApplication(CargoRepository repository) {
		this.repository = repository;
	}

	private CargoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo("Programador");
		repository.save(cargo);
	}

}
