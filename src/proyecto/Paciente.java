/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.LinkedList;

/**
 *
 * @author josep_wht3r4a
 */
public class Paciente {

    private String cedula;
    private String nombre;
    public LinkedList<String> listaNombres = new LinkedList<String>();

    public Paciente() {
    }
    public Paciente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getListaNombres() {
        return listaNombres;
    }

    public void setListaNombres(LinkedList<String> listaNombres) {
        this.listaNombres = listaNombres;
    }

    public void infoPaciente() {
        System.out.println("Datos del Paciente{" + "cedula=" + cedula + ", "
                + "nombre=" + nombre + ", lista Medicamentos =" + listaNombres + '}');

    }

}
