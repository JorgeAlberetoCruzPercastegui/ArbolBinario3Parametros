
package perceptronsimple;

import java.util.Random;
import java.util.Scanner;

public class PERCEPTRONSIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[]= new int[3];
            for (int i=1; i<array.length;i++){
        System.out.println("Ingresa la entrada "+i);
        array[i]= s.nextInt();
            }
                for (int i=0; i<1; i++){
                double w1= new Random().nextDouble();
                double w2 = new Random().nextDouble();
                
                Operacion neurona = new Operacion(array[1],array[2],w1,w2);
                
                    System.out.println("La entrada x1 es: "+array[1]);
                    System.out.println("La entrada x2 es: "+array[2]);
                    System.out.println("La salida y es: "+neurona.ObtenerResultado());
                }
            
    }
    
}
