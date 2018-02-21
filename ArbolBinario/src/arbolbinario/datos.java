
package arbolbinario;

/**
 *
 * @author PERCASTEGUI
 */
public class datos {
    private datos izq;
    private datos der;
    private int dato;
    
    public datos(int dato){
        this.dato= dato;
    }
    public datos getNodoIzquierdo(){
    return izq;
    }
    public datos getNodoDerecho(){
    return der;
    }
    public void setNodoIzquierdo(datos nodo){
    izq=nodo;
    }    
    public void setNodoDerecho(datos nodo){
    der=nodo;
    }
    public int getdato(){
        return dato;
    
    }
    
    
}
