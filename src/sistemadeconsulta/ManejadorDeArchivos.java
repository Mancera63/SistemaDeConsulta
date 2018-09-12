/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

/**
 *
 * @author Equipo verde
 */

import java.io.*;

public class ManejadorDeArchivos {
    private RandomAccessFile archivo;

    public ManejadorDeArchivos(String nombre_archivo) throws IOException{
        this.archivo = new RandomAccessFile(nombre_archivo, "rw");
    }

    public RandomAccessFile getArchivo() {
        return archivo;
    }

    public String leerCadena(int longitud) {
        char [] cadena = new char[longitud];
        try {
            for (int i = 0; i < cadena.length; i++) {
                cadena[i] = archivo.readChar();
            }
        } catch (IOException e ) { e.printStackTrace(); }
        return new String(cadena);
    }
    
    public short leerShort(int longitud) {
        short corto=0;
        try {
            for (int i = 0; i < longitud; i++) {
                corto = archivo.readShort();
            }
        } catch (IOException e ) { e.printStackTrace(); }
        return corto;
    }

    void escribir(String dato) throws IOException {
        DataOutputStream archi = new DataOutputStream(new FileOutputStream("escritor"));
        archi.close();
    }

    
    void leerEnfermedades() throws IOException {
        long ap_actual, ap_final;
        
        System.out.println("Muestra Archivo");
        while ((ap_actual = archivo.getFilePointer()) != (ap_final = archivo.length())) {
            System.out.println(archivo.readUTF());
        }
        archivo.close();
    }
}
