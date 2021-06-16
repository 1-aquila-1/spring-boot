package br.com.gestao.igreja.interfaces.service;

import org.springframework.data.repository.NoRepositoryBean;

import br.com.gestao.igreja.model.Entidade;

@NoRepositoryBean
public interface IBaseService<T extends Entidade, ID> {
    void salvar(T obj) throws Exception;
    T obter(ID id) throws Exception;
}
