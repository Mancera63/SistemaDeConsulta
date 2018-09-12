package sistemadeconsulta;

import java.io.IOException;

/**
 *
 * @author Equipo verde
 */

public class Main {
    public static void main(String[] args) throws IOException {
        
        ManejadorDeArchivos ma = new ManejadorDeArchivos();
        ma.escribir();
        ma.leerEnfermedades();
        System.exit(0);
        
        Enfermedad e = new Enfermedad();
        Lista<String> sintomas = new Lista<>();
        Lista<String> enfermedades_limitantes = new Lista<>();
        Lista<String> enfermedades_limitantes2 = new Lista<>();

        Medicamento medicamento = new Medicamento();
        medicamento.setNombre("Medicamento1");
        medicamento.setEdad_minima_recomendada((short) 10);
        enfermedades_limitantes.agregar("Enf1");
        enfermedades_limitantes.agregar("Enf2");
        enfermedades_limitantes.agregar("Enf3");
        medicamento.setEnfermedades_limitantes(enfermedades_limitantes);

        Medicamento medicamento2 = new Medicamento();
        medicamento2.setNombre("Medicamento2");
        medicamento2.setEdad_minima_recomendada((short) 10);
        enfermedades_limitantes2.agregar("Enf1");
        enfermedades_limitantes2.agregar("Enf2");
        enfermedades_limitantes2.agregar("Enf3");
        medicamento2.setEnfermedades_limitantes(enfermedades_limitantes2);

        Lista<Medicamento> medicamentos = new Lista<>();
        medicamentos.agregar(medicamento);
        medicamentos.agregar(medicamento2);

        sintomas.agregar("Sintoma1");
        sintomas.agregar("Sintoma2");
        sintomas.agregar("Sintoma3");
        e.setNombre("Gripa");
        e.setSintomas(sintomas);
        e.setMedicamentos(medicamentos);

        /*Recorrer sintomas de la enfermedad*/
        for(int i=0; i < e.getSintomas().tamanio(); i++) {
            System.out.println(e.getSintomas().obtener(i));
        }

        /*Recorrer lista de medicamentos de la enferemedad*/
        for (int i=0; i < e.getMedicamentos().tamanio(); i++) {
            System.out.println(e.getMedicamentos().obtener(i).getNombre());
        }

    }
}
