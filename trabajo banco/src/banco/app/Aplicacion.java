package banco.app;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class    Aplicacion {
    public static void main(String[] args) {
        System.out.print("hola mundo");

        Persona mateo = new Persona();
        CuentaBancaria miCuenta = new CuentaBancaria();



        mateo.nombre = "Mateo";

        miCuenta.titular = mateo;
        miCuenta.saldo = 20000;


    }
}
