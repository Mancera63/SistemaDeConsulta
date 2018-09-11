/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

/**
 *
 * @author Aux Sistemas
 */
public class NodoEnfermedad {
    Enfermedad enfermedad;
    NodoEnfermedad nodoSiguiente;

    public NodoEnfermedad(Enfermedad enfermedad, NodoEnfermedad nodoSiguiente) {
        this.enfermedad = enfermedad;
        this.nodoSiguiente = nodoSiguiente;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public NodoEnfermedad getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoEnfermedad nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
