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
public class Alumno {

    private String nome;
    private float nota;
    private int numReferencia;
    //variables de clase(static).E dicir,a variable ten un valor e ao engadir unha liña nova que incremente
    private static int referencia = 6220; //variable de clase, comun a todos os obxetos.
    //como nos da erro, pq desp de sumar por 1vez e queremos volver a visualizalo colle o ultima referencia e non o asignado.

    public Alumno() {
        referencia++;//contador que suma 1

    }
    //construcctores

//    public Alumno(String nome, float nota, int refe) {
//        this.nome = nome;
//        this.nota = nota;
//        numReferencia = refe;
//    }
    public Alumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
        numReferencia = ++referencia;
    }
//metodos de acceso
//    public void setNumReferencia(int refe) {
//        numReferencia = refe;
//    }
//
//    public int getNumReferencia() {
//        return numReferencia;
//    }
    
    public void amosar() {
        System.out.println("nome:" + nome + "  nota:" + nota + "  referencia:" + numReferencia);
    }

}