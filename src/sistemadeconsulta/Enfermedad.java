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
public class Enfermedad {
    private String nombre;
    private Lista<String> sintomas;
    private Lista<Medicamento> medicamentos;

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

    public Lista<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Lista<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        this.medicamentos.agregar(medicamento);
    }
}
