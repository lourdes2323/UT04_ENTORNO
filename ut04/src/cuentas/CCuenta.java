/**
 * se crea un proyecto java nuevo, llamado ut04, dentro de este el paquete cuentas, el cual contiene CCuenta y mail 
afectando a su package y su localización en el disco.
* Esta clase define la cuenta bancaria de una persona
*@author Lourdes
*@version Eclipse IDE for Java Developers - 2021-09
*@since 08/03/2022
*/

package cuentas;

public class CCuenta {
//parámetros de la clase.

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteranos;

//Constructo vacío
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
    	/*los atributos son seleccionados, clic derecho, refactorizar y autoencapsular atributo y te crea los setter y getter*/
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);


    }

    public double estado()
    {
        return getSaldo();
    }
    /*
	 * @param recibe el estado de la cuenta
	 * @return muestra el saldo de la cuenta
	 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /*
	 * @param recibe la cantidad a ingresar
	 * @return muestra que la cantidad no sea negativa
	 */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /*
	 * @param recibe la cantidad a retirar
	 * @return muestra si la cantidad es negativa o inferior al saldo
	 */

	private String getNombre() {
		return nombre;
	}
	/*
	 * @param recibo el nombre
	 * @return nombre de la persona que recibe
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * @param recibo el nombre
	 */

	private String getCuenta() {
		return cuenta;
	}
	/*
	 * @param recibo una cuenta
	 * @return numero de cuenta de la persona
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/*
	 * @param recibo un numero de cuenta
	 */
	private double getSaldo() {
		return saldo;
	}
	/*
	 * @param recibo el saldo
	 * @return saldo de la persona de la cuenta
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}/*
 * @param recibe el saldo
 */
