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
public class Enfermedad {
    private String nombre;
    private Lista<String> sintomas;
    private Lista<String> medicamentos;

    public Enfermedad(String nombre, Lista<String> sintomas, Lista<String> medicamentos) {
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(Lista<String> sintomas) {
        this.sintomas = sintomas;
    }

    public Lista<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Lista<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarMedicamento(String medicamento) {
        this.medicamentos.agregar(medicamento);
    }
}
