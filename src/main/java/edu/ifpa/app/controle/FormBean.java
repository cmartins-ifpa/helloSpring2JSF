package edu.ifpa.app.controle;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class FormBean {
    private String nome;

    public void mudaNome() {    	
    	this.nome = new StringBuilder(this.nome)
    			.reverse().toString()
    			.toUpperCase();    	
    }
    // getters e setters
	public String getNome() {return nome; }
	public void setNome(String nome) {this.nome = nome;}
}
