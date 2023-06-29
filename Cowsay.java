import java.util.Scanner;

public class Cowsay {
    
    public static void main(String[] args) {
        Animal animal= new Animal();
        Servicio servicio = new Servicio();
        String mensaje;
        int opcion=0;

        while(opcion!=1){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar el mensaje");
        mensaje=leer.nextLine();

        //metodo para repedir el caracter
        System.out.println(" " + servicio.repetir_caracter('-', mensaje.length() + 2));
        //metodo parar imprimir el mensaje
        
        servicio.imprimir_mensaje(mensaje);
        System.out.println(" " + servicio.repetir_caracter('-',mensaje.length() + 2));
        animal.dibujar();
        System.out.println("Si desa continuar presione 0, sino presione 1");
        Scanner op= new Scanner(System.in);
        opcion=op.nextInt();
        }
     
    }
}
