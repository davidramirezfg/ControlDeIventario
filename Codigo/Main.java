import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) {  

        List<Inventario> listaInventario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);  
        boolean bucle = true;

        while (bucle) {

            System.out.println("Ingrese el producto: ");
            String producto = sc.nextLine();

           
            int cantidad = 0;
            boolean cantidadValida = false;
            while (!cantidadValida) {
                try {
                    System.out.println("Ingrese la cantidad: ");
                    cantidad = Integer.parseInt(sc.nextLine()); 
                    cantidadValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("ingrese solo números enteros");
                }
            }

            // --- FECHA ---
            LocalDate fecha = null;
            boolean fechaValida = false;
            while (!fechaValida) {
                try {
                    System.out.println("Ingrese la fecha (YYYY-MM-DD): ");
                    String fechaTexto = sc.nextLine();
                    fecha = LocalDate.parse(fechaTexto); 
                    fechaValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println(" Formato incorrecto, usa YYYY-MM-DD");
                }
            }

            // --- GUARDAR EN LISTA ---
            Inventario item = new Inventario(cantidad, producto, fecha);
            listaInventario.add(item);
            System.out.println("Producto agregado!");

            // --- ¿CONTINUAR? ---
            System.out.println("¿Desea agregar otro producto? (si/no): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {  
                bucle = false;
            }
        }

        // --- MOSTRAR LISTA FINAL ---
        System.out.println("\n Lista de Inventario:");
        for (Inventario item : listaInventario) {
            System.out.println(item);
        }

        sc.close();
    }
}From https://github.com/davidramirezfg/ControlIventario
 * branch            main       -> FETCH_HEAD
Already up to date.i