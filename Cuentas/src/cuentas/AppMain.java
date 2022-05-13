/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;
import java.util.Date;
/**
 *
 * @author 701
 */
public class AppMain {
    public static void main(String[] args) {
        Date Hoy=new Date();
        Date Nac=new Date(103,11,6);
        //public Facebook(Date FechaCrea, String eMail, String Contrasenia, String nombre, Date Fnac) {
        Cuentas Farid=new Facebook(Hoy,"faridglez17@gmail.com","ella no te ama","Farid uwu",Nac);
        System.out.println(Farid);
    }
}
