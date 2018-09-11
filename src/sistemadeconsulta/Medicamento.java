/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

/**
 *
 * @author EliasMancera
 */
public class Medicamento {
    String nombre;
    String[] enfermedades_limitantes;
    short edad_recomenda;

    public Medicamento(String nombre, String[] enfermedades_limitantes, short edad_recomenda) {
        this.nombre = nombre;
        this.enfermedades_limitantes = enfermedades_limitantes;
        this.edad_recomenda = edad_recomenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEnfermedades_limitantes() {
        return enfermedades_limitantes;
    }

    public void setEnfermedades_limitantes(String[] enfermedades_limitantes) {
        this.enfermedades_limitantes = enfermedades_limitantes;
    }

    public short getEdad_recomenda() {
        return edad_recomenda;
    }

    public void setEdad_recomenda(short edad_recomenda) {
        this.edad_recomenda = edad_recomenda;
    }
    
    
}
