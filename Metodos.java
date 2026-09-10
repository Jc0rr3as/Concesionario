import java.util.Scanner;
import java.util.Stack;

public class Metodos{
    Scanner sc = new Scanner(System.in);
    public Stack<Objvehiculo> Registro(){
        Stack<Objvehiculo> Pila = new Stack<>();
        boolean continuar = true;
        while (continuar) {
        String marca = "";
        String modelo = "";
        int año = 0;
        String color = "";
        Double precio = 0.0;
        String tipo = "";
            System.out.println("Ingrese la marca del vehiculo: ");
            marca = sc.nextLine();
            System.out.println("Ingrese el modelo del vehiculo: ");
            modelo = sc.nextLine();
            System.out.println("Ingrese el año del vehiculo: ");
            año = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el color del vehiculo: ");
            color = sc.nextLine();
            System.out.println("Ingrese el precio del vehiculo: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese el tipo de vehiculo: carro / camioneta");
            tipo = sc.nextLine();
            Objvehiculo o = new Objvehiculo(marca, modelo, año, color, precio, tipo);
            Pila.push(o);
        }
    return Pila;
}
}
