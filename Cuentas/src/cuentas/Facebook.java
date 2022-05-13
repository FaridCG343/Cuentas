/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 701
 */
public class Facebook extends Cuentas implements Interaccion, Cancelar {

    private final Date FechaCrea;
    Scanner cap = new Scanner(System.in);

    public Facebook(Date FechaCrea, String eMail, String Contrasenia, String nombre, Date Fnac) {
        super(eMail, Contrasenia, nombre, Fnac);
        this.FechaCrea = FechaCrea;
    }

    @Override
    public void perfil() {
        String nombre;
        System.out.println("Perfil de Facebook");
        System.out.println("Nuevo Nombre");
        nombre = cap.nextLine();
        this.setNombre(nombre);
    }

    @Override
    public void iniciarsesion() {
        String eMail, contrasenia;
        System.out.println("E-mail");
        eMail=cap.next();
        System.out.println("Contrasenia");
        contrasenia=cap.next();
    }

    @Override
    public void cerrarsesion() {
        System.out.println("BYEEEEE");
    }

    @Override
    public void Cancelacion() {
        System.out.println("Su cuenta se cerrara despues de 30 dias");
    }

    public Date getFechaCrea() {
        return FechaCrea;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFacebook" + "\nFechaCrea: " + FechaCrea ;
    }

}
