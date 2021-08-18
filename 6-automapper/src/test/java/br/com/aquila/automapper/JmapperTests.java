package br.com.aquila.automapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.aquila.automapper.core.jmapper.Aluno;
import br.com.aquila.automapper.core.jmapper.AlunoDto;
import br.com.aquila.automapper.core.jmapper.Conversor;

@SpringBootTest
class JmapperTests {

	@Autowired
	private Conversor<AlunoDto, Aluno> alunoConversor;

	@Test
	void testeConversorAluno() {
		var aluno = new Aluno(1L, "Pedro");
		var dto = alunoConversor.modelToDto(aluno);
		System.out.println(dto.getNome());

		dto.setNome(dto.getNome() + " de Souza");

		var model = alunoConversor.dtoToModel(dto);

		System.out.println(model.getNome());
	}

}
