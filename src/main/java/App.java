import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner entrada=new Scanner(System.in);//recoje información que pasa el usuario por el teclado
        double precioTotal=0;
        double precioArticulo;
        String hayMasArticulos;
        do{ //alinear las llaves
            System.out.print("Ingrese el precio del artículo: ");
            //precioArticulo = input.nextint();
            // input utilizado no existe
            precioArticulo = entrada.nextDouble();
            while (precioArticulo < 0) {
                System.out.print("Precio inválido. Ingrese un precio positivo: ");
                precioArticulo = entrada.nextInt();
            }
            precioTotal += precioArticulo;
            System.out.print("¿Hay más artículos? (S/N): ");
            hayMasArticulos = entrada.next().toUpperCase();//convierte todo a mayuscula
        } while(hayMasArticulos.equals("S"));
        System.out.println("El total a pagar es: " + precioTotal + " €");
        System.out.print("Ingrese el dinero entregado por el cliente: ");
        double dineroADar = entrada.nextDouble();
        double cambio = dineroADar - precioTotal;
        System.out.println("El total a pagar son " + precioTotal + " €, el cliente entrega "
                + dineroADar + " €, por lo que el cambio es " + cambio + " €.");
    }
}