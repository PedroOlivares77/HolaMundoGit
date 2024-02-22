package cuentas;

/** @author Pedro Olivares Amer 
 * @version 2.0
 */

public class CCuenta {

// @see nos fijamos que estos atributos estan referenciados con setters y getters mas abajo
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(/** @param Inicializamos el metodo */)
    { 
    }

    public CCuenta(String nom, String cue, double sal, double tipo /** @param Referenciamos CCuenta con todos sus parametros */) 
    { // @param nom, cue, sal, tipo Aqui tenemos los parametro que vamos a utilizar
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado(/** @param Inicializamos estado*/)
    { //@return Devolvemos el saldo
        return getSaldo();
    }

    public void ingresar(double cantidad /** @throws Inicializamos metodo ingresar con una excpcion junto un if */) throws Exception
    { //@exception Creamos esta excepcion para que no se puede ingresar ninguna cantidad negativa
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad /** @throws Metodo retirar junto con dos If y dos excepciones */) throws Exception 
    {
        if (cantidad <= 0) //@exception Creamos esta excepcion para que no se puede ingresar ninguna cantidad negativa y si no hay suficiente saldo
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
