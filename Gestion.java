import java.util.*;

public class Gestion {
    private ArrayList<Estudiante> estudiantes;

    public Gestion() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el codigo:");
        long codigo = scanner.nextLong();
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, codigo, edad);
        estudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante agregado correctamente.");
    }
    

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de Estudiantes:");
            for (Estudiante estudiante : estudiantes) {
                estudiante.imprimirInfoEstudiante();
                System.out.println("------------------------");
            }
        }
    }

    public void buscarEstudiante() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante a buscar:");
        long codigoBuscar = scanner.nextLong();
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo() == codigoBuscar) {
                System.out.println("Estudiante encontrado:");
                estudiante.imprimirInfoEstudiante();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion gestion = new Gestion();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante por codigo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestion.agregarEstudiante();
                    break;
                case 2:
                    gestion.listarEstudiantes();
                    break;
                case 3:
                    gestion.buscarEstudiante();
                    break;
                case 4:
                    System.out.println("Sistema cerrado.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
        scanner.close();
    }
    
    
}

