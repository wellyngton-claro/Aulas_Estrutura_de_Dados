package Atividade2.main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 2010100590
 */
public class Aluno {
    private String nome;
    private int idade;
    Nota nota= new Nota();
    
    public Aluno(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    
    public void addNota(double d){
        nota.add(d);
    }
    
    public String getNome(){
        return nome;
    }    
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String s){
        nome=s;
    }
    
    public void setIdade(int i){
        idade=i;
    }
}
