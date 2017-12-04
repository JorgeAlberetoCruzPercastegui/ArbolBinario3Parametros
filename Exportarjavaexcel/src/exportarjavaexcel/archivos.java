/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportarjavaexcel;

import java.io.File;

/**
 *
 * @author PERCASTEGUI
 */


public class archivos{

    public static void carpeta(){

	//La carpeta1 se creara en la ruta designada
        File Carpeta1= new File("C:\\PROYECTO");

	//La carpeta 2 se creara dentro de la carpeta 1
        File Carpeta2= new File("C:\\PROYECTO\\audiovisual");
       
        
       if(Carpeta1.exists()){
	}
	
	    if(!Carpeta1.exists()){
            Carpeta1.mkdir();
            Carpeta2.mkdir();
           
            }
    }
}
