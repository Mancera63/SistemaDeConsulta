/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

import java.io.IOException;

/**
 *
 * @author Equipo verde
 */
public class Consulta {

    ManejadorDeArchivos ma;
    Lista<Enfermedad> enfermedades = new Lista<>();
    Lista<String> sintomasEnf = new Lista<>(), medicamentos = new Lista<>();
    Enfermedad en;

    void buscaSintomas(Lista<String> sintomas) throws IOException {
        ma = new ManejadorDeArchivos("enfermedades");
        String enfermedad, sintoma, medicamento;
        boolean agregar = false;
        long ap_actual = 0, ap_final = ma.getArchivo().length();

        while (ap_actual < ap_final) {
            enfermedad = ma.leerCadena(3);
            //System.out.println(enfermedad);
            for (int i = 0; i < 5; i++) {
                sintoma = ma.leerCadena(4);
                sintomasEnf.agregar(sintoma);
                //System.out.println(sintoma);
                for (int j = 0; j < sintomas.tamanio(); j++) {
                    if (sintomas.obtener(j).equals(sintoma)) {
                        //System.out.println("Sí encontró");
                        agregar = true;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                medicamento = ma.leerCadena(4);
                medicamentos.agregar(medicamento);
                //System.out.println(medicamento);
            }
            if (agregar) {
                en = new Enfermedad(enfermedad, sintomasEnf, medicamentos);
                System.out.println("Se va a agregar a la lista: "+en.getNombre());
                enfermedades.agregar(en);
            }
            ap_actual += 70;
        }
        System.out.println("Nodo en 0: "+enfermedades.obtener(0).getNombre());
        System.out.println("Nodo en 1: "+enfermedades.obtener(1).getNombre());
    }

    void buscaMedicamentos(Lista<String> enfermedadesLimitantes, int edad) throws IOException {
        ma = new ManejadorDeArchivos("medicamentos");
        boolean agregar = false;
        String medicamento, cMedicamento;
        long ap_actual = 0, ap_final = ma.getArchivo().length();

        while (ap_actual < ap_final) {
            medicamento = ma.leerCadena(4);
            System.out.println(medicamento);
            System.out.println(enfermedades.tamanio());
            for (int i = 0; i < enfermedades.tamanio(); i++) {
                for (int j = 0; j < 3; j++) {
                    cMedicamento = enfermedades.obtener(i).getMedicamentos().obtener(j);
                    System.out.println(cMedicamento);
                    if (medicamento.equals(cMedicamento)) {
                        System.out.println("Para la enfermedad "+enfermedades.obtener(i).getNombre()+" se encontró el medicamento: "+cMedicamento);
                    }
                }
            }
            ap_actual += 34; 
        }
    }
}