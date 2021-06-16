package br.com.gestao.igreja.service;

import org.springframework.stereotype.Service;

import br.com.gestao.igreja.interfaces.repository.IMembroRepository;
import br.com.gestao.igreja.interfaces.service.IMembroService;
import br.com.gestao.igreja.model.Membro;

@Service
public class MembroService extends BaseService<Membro, Long> implements IMembroService {

    public MembroService(IMembroRepository membroRepo) {
        super(membroRepo);
        this.membroRepo = membroRepo;
    }

    private IMembroRepository membroRepo;
    
}
