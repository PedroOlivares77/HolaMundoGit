package cuentas;

/** @author Pedro Olivares Amer */

public class Main {

    public static void main(String[] args) throws Exception { //@exception Empezamos el main con una excepcion y el metodo operativa_cuenta
        operativa_cuenta(0); // @param cantidad aqui creamos el parametro cantidad para usarlo abajo
    
    }
	private static void operativa_cuenta(float cantidad) throws Exception, Exception {
		CCuenta cuenta1;
        double saldoActual;
	
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) { // @exception Utilizamos la exception para el fallor al  retirar e ingresar
            System.out.print("Fallo al ingresar");
        }
	}
}