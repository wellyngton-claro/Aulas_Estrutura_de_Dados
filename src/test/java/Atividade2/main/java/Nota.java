package Atividade2.main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 2010100590
 */
public class Nota {
    private double [] nota = new double[5];
    private int index=0;
    
    public void add(double d){
        nota[index]=d;
        index++;
    }
    
    public int tamanho(){
        return nota.length;
    }
    
    public boolean contem(double d){
        for(int i=0; i<tamanho();i++){
            if(nota[i]== d){
                return true;
            }
        }
        return false;
    }
}
