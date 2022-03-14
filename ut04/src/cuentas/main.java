package cuentas;

public class main {

	
	/*se crea cantidad de tipo float, clic derecho refactorizar y convertir variable local en campo*/
    private static float cantidad;
	public static void main(String[] args) {
        CCuenta cuenta1;
        /*pinchas en la palabra"miCuenta" y con el clic derecho del ratón le das a refactorizar y cambias el nombre,
        automáticamente se cambia en todos lados.*/
        double saldoActual;

        operativa_cuenta();
    }
//seleccionaslas lineas deseadas, clic derecho refactorizar y extraer método.
	private static void operativa_cuenta() {
		CCuenta cuenta1;
		float cantido;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
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
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}