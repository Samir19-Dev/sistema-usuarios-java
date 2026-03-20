import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;

    Usuario(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> eliminar();
            }

        } while (opcion != 0);
    }

    static void agregar() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        usuarios.add(new Usuario(nombre));
    }

    static void listar() {
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + " - " + usuarios.get(i).nombre);
        }
    }

    static void eliminar() {
        listar();
        System.out.print("Índice a eliminar: ");
        int i = sc.nextInt();
        usuarios.remove(i);
    }
}
