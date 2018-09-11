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
    private String nombre;
    private Lista<String> enfermedades_limitantes;
    private short edad_minima_recomendada;

    public Medicamento() {}

    public Medicamento(String nombre, Lista<String> enfermedades_limitantes, short edad_minima_recomendada) {
        this.nombre = nombre;
        this.enfermedades_limitantes = enfermedades_limitantes;
        this.edad_minima_recomendada = edad_minima_recomendada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista<String> getEnfermedades_limitantes() {
        return enfermedades_limitantes;
    }

    public void setEnfermedades_limitantes(Lista<String> enfermedades_limitantes) {
        this.enfermedades_limitantes = enfermedades_limitantes;
    }

    public int getEdad_minima_recomendada() {
        return edad_minima_recomendada;
    }

    public void setEdad_minima_recomendada(short edad_minima_recomendada) {
        this.edad_minima_recomendada = edad_minima_recomendada;
    }
}
