package br.com.aquila.automapper.core;

import com.googlecode.jmapper.JMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.aquila.automapper.core.jmapper.Aluno;
import br.com.aquila.automapper.core.jmapper.AlunoDto;
import br.com.aquila.automapper.core.jmapper.Conversor;

@Configuration
public class ConversorConfiguration {

    @Bean
    public Conversor<AlunoDto, Aluno> alunoConversor(){
        return new Conversor<AlunoDto, Aluno>(new JMapper<>(AlunoDto.class, Aluno.class), new JMapper<>(Aluno.class, AlunoDto.class));
    }
}
