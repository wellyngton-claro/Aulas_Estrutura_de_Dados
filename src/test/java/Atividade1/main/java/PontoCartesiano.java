package Atividade1.main.java;
/**
 *
 * @author 2010100590
 */
public class PontoCartesiano {
    
    int pontos [][] = new int [2][2];
    public PontoCartesiano(int x1,int x2, int y1, int y2){
        pontos[0][0] = x1;
        pontos[0][1] = y1;
        pontos[1][0] = x2;
        pontos[1][1] = y2;
}
    public int getX1(){
        return pontos [0][0];
    }
    
    public int getX2(){
        return pontos [1][0];
    }
    
    public int getY1(){
        return pontos [0][1];
    }
    
    public int getY2(){
        return pontos [1][1];
    }
    
    public void setX1(int i){
        pontos [0][0] = i;
    }
    
    public void setX2(int i){
        pontos [1][0] = i;
    }
    
    public void setY1(int i){
        pontos [0][1] = i;
    }
    
    public void setY2(int i){
        pontos [1][1] = i;
    }
    
    public double distanciaEuclidiana(){
        double resposta;
        resposta = Math.sqrt((pontos[1][0]-pontos[0][0])^2+(pontos[1][1]-pontos[0][1])^2);
        return resposta;
    }
    
}
