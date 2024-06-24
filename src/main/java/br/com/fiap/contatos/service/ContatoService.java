package br.com.fiap.contatos.service;

import br.com.fiap.contatos.dto.ContatoExibicaoDto;
import br.com.fiap.contatos.model.Contato;
import br.com.fiap.contatos.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;
    public ContatoExibicaoDto gravar(Contato contato){
        return new ContatoExibicaoDto(repository.save(contato));
    }

    public ContatoExibicaoDto buscarPorId(Long id){
        Optional<Contato> contatoOptional = repository.findById(id);
        if(contatoOptional.isPresent()){
            return new ContatoExibicaoDto(contatoOptional.get());
        }else{
            throw new RuntimeException("Contato não existe");
        }
    }

    public List<Contato> listarTodos(){
        return repository.findAll();
    }

    public void excluir(Long id){
        repository.delete(repository.findById(id).get());
    }

    public ContatoExibicaoDto atualizar(Contato contato){
        return new ContatoExibicaoDto(repository.save(contato));
    }

}
