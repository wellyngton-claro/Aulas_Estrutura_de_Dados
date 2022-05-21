package Atividade3.main.java;

import Atividade2.main.java.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2010100590
 */
public class VetorAluno2 implements IVetor {
    Aluno alunos[];
    int index=0;
    public VetorAluno2(int i){
        alunos = new Aluno[i];
    }
    
    public void addAluno(Aluno aluno){
        alunos[index]=aluno;
        index++;
    }
    
    public int tamanhoTurma(){
        return alunos.length;
    }
    
    public boolean alunoPresente(Aluno aluno){
        for(int i=0; i<tamanhoTurma();i++){
            if(alunos[i].getNome()== aluno.getNome()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void adiciona(double elem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean cheio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(double elem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
}
