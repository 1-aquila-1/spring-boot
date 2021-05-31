package br.com.aquila.springdata.auxiliar;

import br.com.aquila.springdata.interfaces.auxiliar.ISeed;

public class Seed implements ISeed{

    public Seed() {
    }

    @Override
    public void seed() {
                
    }

    private Seed funcionario(){
        return this;
    }
    
}
