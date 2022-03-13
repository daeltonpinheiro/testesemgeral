package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {
    
    public String titulo;
    public String mensagem;
    public String nomeCurso;
  
    //Getters and Setters
  
    public Topico converter(CursoRepository cursoRepository){
        
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo,mensagem,curso);
    } 

}
