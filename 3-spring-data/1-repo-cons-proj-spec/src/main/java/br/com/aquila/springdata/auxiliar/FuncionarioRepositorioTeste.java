package br.com.aquila.springdata.auxiliar;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import br.com.aquila.springdata.interfaces.auxiliar.IExecuta;
import br.com.aquila.springdata.interfaces.repository.IFuncionarioRepository;
import br.com.aquila.springdata.model.Funcionario;
import br.com.aquila.springdata.repository.FuncionarioSpecificationRepository;

@Qualifier("FuncionarioRepositorio")
@Component
public class FuncionarioRepositorioTeste implements IExecuta {

    public FuncionarioRepositorioTeste(IFuncionarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    private IFuncionarioRepository repositorio;

    @Override
    public void run() {
        testeConsultaSpecification();
    }

    private void testeConsultaSpecification(){
        var nome = "p";
        var cpf = "123456789";
        var funcionarios = repositorio.findAll(
            Specification.where(FuncionarioSpecificationRepository.nome(nome)).or(FuncionarioSpecificationRepository.cpf(cpf))
            );
        funcionarios.forEach( f -> System.out.println(f.getId() + " | " + f.getNome() + " | " + f.getSalario()));
    }

    private void testeProjecao(){
        var funcionarios = repositorio.findFuncionarioSalario();
        funcionarios.forEach( f -> System.out.println(f.getId() + " | " + f.getNome() + " | " + f.getSalario()));
    }

    private void testePaginacaoOrdenacao(){
        int page = 0, size = 5;
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "nome"));
        Page<Funcionario> funcionarios = repositorio.findAll(pageable);
        System.out.println("Página atual .: " + funcionarios.getNumber());
        System.out.println("Lista de página .: " + funcionarios.getTotalPages());
        funcionarios.forEach( f -> System.out.println(f));
    }

    private void testePaginacao(){
        int page = 1, size = 5;
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Page<Funcionario> funcionarios = repositorio.findAll(pageable);
        System.out.println("Página atual .: " + funcionarios.getNumber());
        System.out.println("Lista de página .: " + funcionarios.getTotalPages());
        funcionarios.forEach( f -> System.out.println(f));
    }

    private void testeBuscarFuncionarioNome() {
        repositorio.findByNome("Um nome");
    }

    private void testeFindNomeSalarioMaiorDataContratacao() {
        var funcionarios = repositorio.findNomeSalarioMaiorDataContratacao("Pedro", 1200.0, LocalDate.of(2020, 05, 20));
    }

    private void testeFindDataContratacaoMaior() {
        var funcionarios = repositorio.findDataContratacaoMaior(LocalDate.of(2020, 05, 20));
    }

}
