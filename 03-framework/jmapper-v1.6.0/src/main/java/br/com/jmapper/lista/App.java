package br.com.jmapper.lista;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.googlecode.jmapper.JMapper;

public class App {
    public static void main(String[] args) {
        var jmapper = new JMapper<>(AlunoModel.class, Aluno.class);
        var aluno = Arrays.asList(new Aluno("A1"));

        var v1 = aluno.stream().map(t -> jmapper.getDestination(t)).collect(Collectors.toList());
        v1.forEach(a -> System.out.println(a.getNome()));

    }
}
