/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

/**
 *
 * @author mrebelladofernandez
 */
public class ExemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Alumno alum1 = new Alumno("Ana", 5f, 6221);
//        alum1.amosar();
//        Alumno alum2 = new Alumno("Pepe", 8f, 6222);
//        alum2.amosar();
        Alumno alum1 = new Alumno("Ana", 5f); //se e static sacamos o numero de referencia porque xa o temos.
        alum1.amosar();
        Alumno alum2 = new Alumno("Pepe", 8f);
        alum2.amosar();
        alum1.amosar();
      
    }

}