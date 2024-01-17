package com.icodeap.apirest.controller;

import com.icodeap.apirest.ComentarioService;
import com.icodeap.apirest.model.Comentario;
import com.icodeap.apirest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @PostMapping
    public Comentario createComentario(@RequestBody Comentario comentario){
        return comentarioService.createComentario(comentario);
    }

    @GetMapping
    public List<Comentario> getAllComentarios(){
        return comentarioService.getAllComentarios();
    }

    @GetMapping("{id}")
    public Comentario searchComentarioById(@PathVariable("id") Long id){
        return comentarioService.getComentarioById(id);
    }

    @DeleteMapping("{id}")
    public void deleteComentarioById(@PathVariable("id") Long id){
        comentarioService.deleteComentario(id);
    }




}
