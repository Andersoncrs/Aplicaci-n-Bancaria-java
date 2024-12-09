import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleccion;
        String nombre = inializacionNombre();
        double saldo = inicializacionCuenta(nombre);
        Cuenta cuenta = new Cuenta(nombre, saldo);
        do {
            System.out.println("""
                **************************************
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Despositar
                9 - Salir
                """);
            eleccion = input.nextInt();
            switch (eleccion){
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    double cantidadARetirar;
                    do{
                        System.out.println("Ingrese la cantidad que desea retirar");
                        cantidadARetirar = input.nextDouble();
                        if(validacionValor(cantidadARetirar)){
                            cuenta.retirarSaldo(cantidadARetirar);
                            break;
                        }
                    } while(cantidadARetirar <= 0);
                    break;
                case 3:
                    double cantidadADepositar;
                    do {
                        System.out.println("Ingrese la cantidad que desea Depositar");
                        cantidadADepositar = input.nextDouble();
                        if(validacionValor(cantidadADepositar)){
                            cuenta.depositarSaldo(cantidadADepositar);
                            break;
                        }
                    }while(cantidadADepositar <= 0);
                    break;
                case 9:
                    System.out.println("Gracias por Utilizar nuestros Servicios :)");
                    break;
                default:
                    System.out.println("Eleccion Invalida, Intentelo de nuevo por favor");
            }
        } while(eleccion != 9);
    }

    public static String inializacionNombre(){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                *********Bienvenido al BanCol*********
                Ingrese su Nombre:""");
        return input.nextLine();
    }
    public static double inicializacionCuenta(String nombre){
        Scanner input = new Scanner(System.in);
        double saldo;
        do {
            System.out.println("Ingrese su Saldo Incial");
            saldo = input.nextDouble();
            if (validacionValor(saldo)) {
                break;
            }
        } while (saldo <= 0);
        System.out.printf("""
                **************************************
                
                Nombre del cliente: %s
                Saldo: %.2f$
                """, nombre, saldo);
        return saldo;
    }

    public static boolean validacionValor(double saldo){
        if (saldo <= 0) {
            System.out.println("Debe ingresar un valor mayor a 0, Intentelo de Nuevo");
            return false;
        }
        return true;
    }
}