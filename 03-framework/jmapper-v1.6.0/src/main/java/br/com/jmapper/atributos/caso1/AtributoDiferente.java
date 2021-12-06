package br.com.jmapper.atributos.caso1;

import com.googlecode.jmapper.JMapper;


public class AtributoDiferente {

    public void exemplo01() {
        var source = new Source("cod1", "teste", "teste1");
        var jmapper = new JMapper<>(Destination.class, Source.class);
        var destination = jmapper.getDestination(source);
        System.out.println(destination);
    }

    public static void main(String[] args) {
        var app = new AtributoDiferente();
        app.exemplo01();
    }
}
