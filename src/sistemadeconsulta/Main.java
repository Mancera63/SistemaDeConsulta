package sistemadeconsulta;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Equipo verde
 */

public class Main {
    public static void main(String[] args) throws IOException {
        ManejadorDeArchivos archivo;
        Consulta con = new Consulta();
        Scanner global = new Scanner(System.in);
        Scanner actual = new Scanner(System.in);
        int opcion = 0;
        Lista<String> lSintomas = new Lista<>();
        Lista<String> enfermedadesLimitantes = new Lista<>();
        System.out.println("<<< Sistema de consulta >>>");
        while(opcion!=4) {
            System.out.println(
                "\nMenu\n\n" +
                "1) Realizar una consulta\n" +
                "2) Insertar enferemedad\n" +
                "3) Isertar medicamento\n" +
                "4) Salir");
            try {
                switch (Integer.parseInt(global.nextLine())) {
                    case 1: //Se realiza una consulta
                        System.out.println("Nueva consulta");
                        String decision = "S";
                        short edad_paciente;
                        while (decision.equals("S")) {
                            System.out.printf("Ingrese la clave del sintoma: ");
                            lSintomas.agregar(actual.next());
                            System.out.printf("Insertar otro sintoma? (S/N) ");
                            decision = actual.next();
                        }
                        System.out.println("El paciente tiene alguna de las siguientes enfermedades? (S/N)");
                        System.out.println(
                                "Enfermedad1 - lEN1\n" +
                                "Enfermedad2 - lEN2\n" +
                                "Enfermedad3 - lEN3\n" +
                                "Enfermedad4 - lEN4\n" +
                                "Enfermedad5 - lEN5\n");
                        decision = actual.next();
                        if(decision.equals("S")) {
                            while (decision.equals("S")) {
                                System.out.printf("Ingrese clave: ");
                                enfermedadesLimitantes.agregar(actual.next());
                                System.out.println("Tiene otra enfermedad? (S/N)");
                                decision = actual.next();
                            }
                        }
                        System.out.printf("Ingrese la edad del paciente: ");
                        edad_paciente = actual.nextShort();
                        con.buscaSintomas(lSintomas);
                        con.buscaMedicamentos(enfermedadesLimitantes, edad_paciente);
                        break;
                    case 2: //Insertar enferemedad
                        String enferemedad;
                        String[] sintomas = new String[5];
                        String[] medicamentos = new String[3];
                        int i;
                        archivo = new ManejadorDeArchivos("enfermedades");
                        System.out.printf("Nombre de la enferemedad: ");
                        enferemedad = actual.next();
                        for(i=0; i<5; i++) {
                            System.out.printf("Inserta sintoma"+(i+1)+": ");
                            sintomas[i] = actual.next();
                            if(i<4) {
                                System.out.println("Insertar otro sintoma? (S/N)");
                                if (actual.next().equals("N")) {
                                    i++;
                                    break;
                                }
                            }
                        }
                        while (i<5) {
                            sintomas[i] = "null";
                            i++;
                        }
                        for(i=0; i<3; i++) {
                            System.out.printf("Inserta medicamento"+(i+1)+": ");
                            medicamentos[i] = actual.next();
                            if(i<2) {
                                System.out.println("Insertar otro medicamento? (S/N)");
                                if (actual.next().equals("N")) {
                                    i++;
                                    break;
                                }
                            }
                        }
                        while (i<3) {
                            medicamentos[i] = "null";
                            i++;
                        }
                        archivo.getArchivo().seek(archivo.getArchivo().length());
                        archivo.getArchivo().writeChars(enferemedad);
                        for(String s : sintomas) { archivo.getArchivo().writeChars(s); }
                        for(String s : medicamentos) { archivo.getArchivo().writeChars(s); }
                        archivo.getArchivo().close();
                        System.out.println("Enfermedad insertada");
                        break;
                    case 3: //Insertar medicamento
                        archivo = new ManejadorDeArchivos("medicamentos");
                        String medicamento;
                        String[] enfermedades_limitantes = new String[3];
                        short edad_minima;
                        System.out.printf("Nombre del medicamento: ");
                        medicamento = actual.next();
                        System.out.printf("Edad minima recomendada: ");
                        edad_minima = actual.nextShort();

                        for(i=0; i<3; i++) {
                            System.out.printf("Inserta enfermedad limitante"+(i+1)+": ");
                            enfermedades_limitantes[i] = actual.next();
                            if(i<2) {
                                System.out.println("Insertar otra enfermedad? (S/N)");
                                if (actual.next().equals("N")) {
                                    i++;
                                    break;
                                }
                            }
                        }
                        while (i<3) {
                            enfermedades_limitantes[i] = "null";
                            i++;
                        }
                        archivo.getArchivo().seek(archivo.getArchivo().length());
                        archivo.getArchivo().writeChars(medicamento);
                        archivo.getArchivo().writeShort(edad_minima);
                        for(String s : enfermedades_limitantes) { archivo.getArchivo().writeChars(s); }
                        archivo.getArchivo().close();
                        System.out.println("Medicamento insertado");
                        break;
                    case 4:
                        opcion = 4;
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("ALERTA: Esta opcion no es valida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: Solo se pueden insertar numeros");
            }
        }
    }
}