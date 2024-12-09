public class Cuenta {
    double saldo;
    String nombre;

    public Cuenta(String nombre, double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public void retirarSaldo(double saldoARetirar){
        if (saldoARetirar > saldo){
            System.out.println("No tiene esa cantidad en la cuenta");
            return;
        }
        saldo -= saldoARetirar;
        System.out.println("Saldo Retirado Con exito");
        System.out.printf("Nuevo Saldo: %.2f%n", saldo);
    }
    public void depositarSaldo(double saldoADepositar){
        if (saldoADepositar <= 0){
            System.out.println("El saldo a depositar debe ser mayor a 0");
            return;
        }
        System.out.println("Deposito realizado con Exito");
        saldo += saldoADepositar;
        System.out.println("Nuevo saldo: " + saldo);
    }
}
