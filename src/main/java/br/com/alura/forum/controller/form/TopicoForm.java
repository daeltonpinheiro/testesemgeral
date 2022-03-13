package br.com.alura.forum.controller.form;

public class TopicoForm {
    
    public String titulo;
    public String mensagem;
    public String nomeCurso;
  
    //Getters and Setters
  
    public Topico converter(){
        return new Topico(titulo,mensagem,nomeCurso);
    } 

}
