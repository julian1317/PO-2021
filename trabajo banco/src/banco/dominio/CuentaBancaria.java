package banco.dominio;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String tipo; // si es ahorros o corriente
    public Persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contraseña;
    public String estado;

    public boolean retirar(double valorARetirar){
        return false;


    }

    public boolean consignar(double valorAConsignar){
        return false;


    }
    public String consutarSaldo(double valorARetirar){
        return "hola, su saldo es"+saldo;


    }
    public boolean transferir (double valorATransferir, CuentaBancaria cuentaDestino){
        return false;

    }
}
