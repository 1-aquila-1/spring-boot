package br.com.aquila.springdata.auxiliar;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.aquila.springdata.interfaces.auxiliar.ISeed;
import br.com.aquila.springdata.interfaces.repository.ICargoRepository;
import br.com.aquila.springdata.interfaces.repository.IFuncionarioRepository;
import br.com.aquila.springdata.model.Cargo;
import br.com.aquila.springdata.model.Funcionario;

@Component
public class Seed implements ISeed{

    public Seed(IFuncionarioRepository funcionarioRepo, ICargoRepository cargoRepo) {
        this.cargoRepo = cargoRepo;
        this.funcionarioRepo = funcionarioRepo;
    }

    private IFuncionarioRepository funcionarioRepo;
    private ICargoRepository cargoRepo;

    @Override
    public void seed() {
        funcionario();        
    }

    private void funcionario(){
        var f1 = new Funcionario();
        var c1 = new Cargo("Analista de sistema");
        f1.setCargo(c1);
        f1.setCpf("123456789");
        f1.setDataContratacao(LocalDate.of(2021, 05, 01));
        f1.setNome("Pedro");
        f1.setSalario(3000.00);
        
        cargoRepo.save(c1);
        funcionarioRepo.save(f1);
    }
    
}
