package cuentas;

/**
 * Clase principal que contiene el método main para la ejecución del programa.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        // Creación de una cuenta con datos de ejemplo
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Obtiene y muestra el saldo actual de la cuenta
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Realiza operaciones de retiro e ingreso en la cuenta creada.
     *
     * @param cuenta1 Objeto de tipo CCuenta sobre el cual se realizan las operaciones.
     * @param cantidad Monto que se intenta retirar o ingresar en la cuenta.
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            // Intentar retirar 2300 unidades monetarias
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            // Intentar ingresar 695 unidades monetarias
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
