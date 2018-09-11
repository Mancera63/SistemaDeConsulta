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
public class NodoMedicamento {
    Medicamento medicamento;
    NodoMedicamento nodoSiguiente;

    public NodoMedicamento(Medicamento medicamento, NodoMedicamento nodoSiguiente) {
        this.medicamento = medicamento;
        this.nodoSiguiente = nodoSiguiente;
    }
    
    public NodoMedicamento obtenerNodoSiguiente(){
        return this.nodoSiguiente;
    }
    
    public Medicamento obtenerMedicamento(){
        return this.medicamento;
    }
}
