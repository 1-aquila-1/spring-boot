package br.com.aquila.springdata.auxiliar;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.aquila.springdata.interfaces.auxiliar.IExecuta;
import br.com.aquila.springdata.interfaces.repository.IFuncionarioRepository;

@Qualifier("FuncionarioRepositorio")
@Component
public class FuncionarioRepositorioTeste implements IExecuta {

    public FuncionarioRepositorioTeste(IFuncionarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    private IFuncionarioRepository repositorio;

    @Override
    public void run() {
        testeBuscarFuncionarioNome();
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
