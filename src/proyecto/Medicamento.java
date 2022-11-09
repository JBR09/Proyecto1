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
public class Medicamento extends Paciente {

    String medicamento;
    String Pertenece;
    int cantidad;

   

    public Medicamento() {
    }

    public Medicamento(String medicamento, String Pertenece, int cantidad) {
        this.medicamento = medicamento;
        this.Pertenece = Pertenece;
        this.cantidad = cantidad;
    }

    public Medicamento(String medicamento, String Pertenece, int cantidad, String cedula, String nombre) {
        super(cedula, nombre);
        this.medicamento = medicamento;
        this.Pertenece = Pertenece;
        this.cantidad = cantidad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getPertenece() {
        return Pertenece;
    }

    public void setPertenece(String Pertenece) {
        this.Pertenece = Pertenece;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

//    public LinkedList<String> getListaMedicamentos() {
//        return listaMedicamentos;
//    }
//
//    public void setListaMedicamentos(LinkedList<String> listaMedicamentos) {
//        this.listaMedicamentos = listaMedicamentos;
//    }

//    public LinkedList<String> getListaNombres() {
//        return listaNombres;
//    }
//
//    public void setListaNombres(LinkedList<String> listaNombres) {
//        this.listaNombres = listaNombres;
//    }

    

    
    

//    public void infoMedicamentos() {
//        System.out.println("Informacion del Medicamento: medicamento" + medicamento
//                + "Pertenece: " + Pertenece + "listaMedicamentos: "
//                + listaMedicamentos + "Cantidad de medicamentos: " + cantidad);
//
//    }

}
