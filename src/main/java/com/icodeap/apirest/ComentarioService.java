package com.icodeap.apirest;

import com.icodeap.apirest.model.Comentario;
import com.icodeap.apirest.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;


    public Comentario createComentario(Comentario comentario){
        return comentarioRepository.save(comentario);
    }

    public Comentario getComentarioById(Long id){
        Optional<Comentario> optionalComentario = comentarioRepository.findById(id);
        return optionalComentario.get();
    }

    public List<Comentario> getAllComentarios(){
        return comentarioRepository.findAll();
    }


    public void deleteComentario(Long id){
        comentarioRepository.deleteById(id);
    }


}
