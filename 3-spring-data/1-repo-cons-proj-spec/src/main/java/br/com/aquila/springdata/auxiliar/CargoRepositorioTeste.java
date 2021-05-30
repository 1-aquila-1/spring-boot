package br.com.aquila.springdata.auxiliar;

import org.springframework.stereotype.Component;

import br.com.aquila.springdata.interfaces.auxiliar.IExecuta;
import br.com.aquila.springdata.interfaces.repository.ICargoRepository;
import br.com.aquila.springdata.model.Cargo;

@Component
public class CargoRepositorioTeste implements IExecuta{


    public CargoRepositorioTeste(ICargoRepository repositorio){
        this.repositorio = repositorio;
    }

    private ICargoRepository repositorio;

    @Override
    public void run() {
        // salvar();
        // obterCargo(1L);
        // atualizar();
        // deletar();
    }


    private void salvar(){
        Cargo cargo = new Cargo("PROGRAMADOR");
        repositorio.save(cargo);
    }

    private void obterCargo(Long id){
        var cargo = repositorio.findById(id).get();
        System.out.println(cargo.getDescricao());
    }

    private void atualizar(){
        var cargo = repositorio.findById(1L).get();
        cargo.setDescricao("ANALISTA E PROGRAMADOR");
        repositorio.save(cargo);
        System.out.println("Atualização realizada com sucesso");
    }

    private void deletar(){
        repositorio.deleteById(1L);
        System.out.println("Excluido com sucesso");
    }
    
}
