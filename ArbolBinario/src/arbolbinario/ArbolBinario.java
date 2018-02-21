
package arbolbinario;
import arbolbinario.datos;
import javax.swing.JOptionPane;


public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       datos raiz= new datos(1);//nodo padre
       datos nodo2= new datos(2);//nodo padre
       datos nodo3= new datos(3);//nodo padre
       
       nodo2.setNodoIzquierdo(new datos(4));//nodo hijo
       
       nodo3.setNodoIzquierdo(new datos(5));//nodo hijo
       nodo3.setNodoDerecho(new datos(6));// nodo hijo
       
       
       raiz.setNodoIzquierdo(nodo2);//Ejecucion raiz padre
       raiz.setNodoDerecho(nodo3);//Ejecucion raiz padre
       
        String opc= JOptionPane.showInputDialog(null, "Elige una opcion\n1.-PreOrden\n2.-Post Orden\n3.-InOrden");
        switch(Integer.parseInt(opc)){
            case 1:
                preOrden(raiz);
                break;
            case 2:
                postOrden(raiz);
                break;
            case 3:
                inOrden(raiz);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
        
        }
        
       
       
       
        
    }

    private static void preOrden(datos raiz) {
        if(raiz !=null){
        System.out.println(raiz.getdato());
        preOrden(raiz.getNodoIzquierdo());
        preOrden(raiz.getNodoDerecho());
        }
        
    }
    private static void postOrden(datos raiz){
    if (raiz !=null){
    postOrden(raiz.getNodoIzquierdo());
    postOrden(raiz.getNodoDerecho());
        System.out.println(raiz.getdato());
    
    }
    }
    private static void inOrden(datos raiz){
    if (raiz !=null){
    inOrden(raiz.getNodoIzquierdo());
        System.out.println(raiz.getdato());
        inOrden(raiz.getNodoDerecho());
    }
    
    }
    
}
