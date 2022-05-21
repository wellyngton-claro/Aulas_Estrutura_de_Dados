package Atividade2.main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2010100590
 */
public class VetorAluno {
    Aluno alunos[];
    int index=0;
    public VetorAluno(int i){
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
    
    

    
}
