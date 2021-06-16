package br.com.gestao.igreja.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao.igreja.interfaces.service.IBaseService;
import br.com.gestao.igreja.model.Entidade;

public abstract class BaseService<T extends Entidade, ID> implements IBaseService<T, ID>{

    protected JpaRepository<T, ID> repositorio;

    public BaseService(JpaRepository<T, ID> repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void salvar(T obj) throws Exception{
        repositorio.save(obj);
    }

    @Override
    public T obter(ID id) throws Exception{
        var obj = repositorio.findById(id);
        if(!obj.isPresent()){
            throw new Exception("Objeto não encontrado");
        }
        return obj.get();
    }
}
