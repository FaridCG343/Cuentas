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
public class Cuentas {
    private String eMail;
    private String Contrasenia;
    private String nombre;
    private Date Fnac;

    public Cuentas(String eMail, String Contrasenia, String nombre, Date Fnac) {
        this.eMail = eMail;
        this.Contrasenia = Contrasenia;
        this.nombre = nombre;
        this.Fnac = Fnac;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFnac() {
        return Fnac;
    }

    public void setFnac(Date Fnac) {
        this.Fnac = Fnac;
    }
    
    @Override
    public String toString() {
        return "Cuentas" + "\neMail: " + eMail + "\nContrasenia: " + Contrasenia + "\nnombre: " + nombre + "\nFnac: " + Fnac ;
    }
    
}
