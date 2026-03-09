import java.time.LocalDate;

public class Inventario {
    int cantidad;
    String producto;
    LocalDate fecha;

    public Inventario(int cantidad, String producto, LocalDate fecha) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.fecha = fecha;  // tenías this.LocalDate=LocalDate
    }

    //imprimir bonito el objeto
    @Override
    public String toString() {
        return "Producto: " + producto + 
               " | Cantidad: " + cantidad + 
               " | Fecha: " + fecha;
    }
}