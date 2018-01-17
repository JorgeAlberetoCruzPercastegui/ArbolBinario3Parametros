
package neuronaartificial;

import java.util.Scanner;
/*
Autor: Cruz Percastegui Jorge Alberto
*/
public class NeuronaArtificial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j;
        int p=0;
        int suma4=1,suma=0,sumaa=0,suma3=0;
        int w1=1,w2=1;
        int sal = 0;
        int matriz[][]= new int [5][3];
        System.out.println("  Matriz AND");
        System.out.println("    X1  X2");
        for (i=0; i<=1; i++)
        {
            for (j=0; j<=1; j++){
                System.out.println("P"+(p+=1)+" ["+i+"],["+j+"] ");
                suma+= matriz[0][w1]*matriz[0][w2];
                sumaa+=matriz[0][w1]*matriz[1][w2];
                suma3+=matriz[1][w1]*matriz[0][w2];
                suma4+=matriz[1][w1]*matriz[1][w2];
            }
        }
        if (suma<=0 && sumaa<=0 && suma3<=0 && suma4>=1){
        sal+=1;
        }else{
        sal=0;
        }
        //Solo muestra los numeros que son 1, los ceros no los muestra
        System.out.println("     "+sal);
        System.out.println("*********************");
        System.out.println("Respuesta supervisada");
        /*
        System.out.println("Suma= "+matriz[0][1]+matriz[0][w2]);
        System.out.println("Suma= "+matriz[0][w1]+matriz[1][w2]);
        System.out.println("Suma= "+matriz[1][w1]+matriz[0][w2]);
        System.out.println("Suma= "+matriz[1][w1]+matriz[1][w2]);*/
        
            System.out.println("      "+suma+""+sumaa+""+suma3+""+suma4);
            
        
        
    }
    
}
