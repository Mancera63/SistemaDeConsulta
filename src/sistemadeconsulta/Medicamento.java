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
    private Lista<String> enferemedades_limitantes;
    private int edad_minima_recomendada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista<String> getEnferemedades_limitantes() {
        return enferemedades_limitantes;
    }

    public void setEnferemedades_limitantes(Lista<String> enferemedades_limitantes) {
        this.enferemedades_limitantes = enferemedades_limitantes;
    }

    public int getEdad_minima_recomendada() {
        return edad_minima_recomendada;
    }

    public void setEdad_minima_recomendada(int edad_minima_recomendada) {
        this.edad_minima_recomendada = edad_minima_recomendada;
    }
}
