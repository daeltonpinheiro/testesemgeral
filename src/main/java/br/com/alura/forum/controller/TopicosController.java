package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
 
        Topico topico1 = new Topico("Dúvida","Dúvidas com Spring",new Curso("Spring","Programacao Back-End - Java"));
        Topico topico2 = new Topico("Dúvida","Dúvidas com Oracle",new Curso("Oracle","Programacao Back-End - Oracle"));
        Topico topico3 = new Topico("Dúvida","Dúvidas com Angular",new Curso("Angular","Programacao Front-End - Angular"));

        return Arrays.asList(topico1,topico2,topico3);
    }
    
}
