package cuentas;

/**
 * Clase que representa una cuenta bancaria con el nombre del titular,
 * número de cuenta, saldo y tipo de interés.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta.
     * @param sal  Saldo  de la cuenta.
     * @param tipo Tipo de interés  de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return Tipo de interés aplicado.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés Nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Consulta el estado de la cuenta, devolviendo el saldo que hay en la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad a la cuenta y la suma al saldo de la cuenta ya existente.
     *
     * @param cantidad Monto a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta y le resta el valor de la cantidad al saldo de la cuenta.
     *
     * @param cantidad Monto a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
