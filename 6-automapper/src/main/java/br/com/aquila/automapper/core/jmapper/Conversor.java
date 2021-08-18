package br.com.aquila.automapper.core.jmapper;

import com.googlecode.jmapper.JMapper;

public class Conversor<D, M> {
    private JMapper<D, M>  _modelToDto;
    private JMapper<M, D> _dtoToModel;

    public Conversor(JMapper<D, M> _modelToDto, JMapper<M, D> _dtoToModel){
        this._dtoToModel = _dtoToModel;
        this._modelToDto = _modelToDto; 
    }

    public M dtoToModel(D source){
        return  _dtoToModel.getDestination(source);
    }

    public D modelToDto(M source){
        return  _modelToDto.getDestination(source);
    }
}
