/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josep_wht3r4a
 */
public class Menu {

    static LinkedList<Paciente> lista = new LinkedList<>();
    static LinkedList<Medicamento> listaMedicamentos = new LinkedList<>();
    Scanner e = new Scanner(System.in);

    public void menu() {

        int opcion = -1;

        do {
            System.out.println("Ingrese una opción"
                    + "\n1)Agregar Paciente"
                    + "\n2)Agregar medicamento"
                    + "\n3)Eliminar medicamento a Paciente"
                    + "\n4)Lista Pacientes"
                    + "\n5)Buscar Paciente"
                    + "\n6)Lista de Medicamentos"
                    + "\n7)Agegar medicamento a paciente"
                    + "\n8)Vaciar Lista Medicamentos"
                    + "\n9)Salir");
            opcion = e.nextInt();

            switch (opcion) {
                case 1:

                    agregarPaciente();
                    break;
                case 2:
                    agregarMedicamento();
                    break;
                case 3:
                    eliminarMedicamentoPaciente();
                    break;
                case 4:
                    ListarPacientes();
                    break;
                case 5:

                    BuscarPaciente();
                    break;
                case 6:
                    ListaMedicamentos();
                    break;
                case 7:
                    AgregarMedicamentoPaciente();

                    break;
                case 8:
                    eliminarListaMedicamentos();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    break;

            }
        } while (opcion != 9);

    }

    public void agregarPaciente() {

        Medicamento uno = new Medicamento();
        System.out.println("Ingrese el nombre: ");
        uno.setNombre(e.next());
        System.out.println("Ingrese la cedula");
        uno.setCedula(e.next());

        System.out.println("Ingrese el medicamento: ");
        uno.setMedicamento(e.next());
        uno.listaNombres.add(uno.getMedicamento());
        lista.add(uno);
        int op = -1;
        do {
            System.out.println("Desea ingresar otro medicamento: "
                    + "\n1)Si"
                    + "\n2)No");
            op = e.nextInt();
            if (op == 1) {
                System.out.println("Ingrese el medicamento: ");
                uno.setMedicamento(e.next());
                uno.listaNombres.add(uno.getMedicamento());

            } else {
                System.out.println("Regresando al menu principal");
            }
            //lista.add(uno);
        } while (op != 2);
        System.out.println("lista" + uno.getNombre());
    }

    public void BuscarPaciente() {
        System.out.println("Ingrese la cedula del paciente: ");
        String op = e.next();
        for (int i = 0; i < lista.size(); i++) {
            Paciente e = lista.get(i);
            if (e.getCedula().equals(op)) {
                e.infoPaciente();
            }

        }
    }

    public void ListarPacientes() {
        if (lista.isEmpty()) {
            System.out.println("la lista esta vacía");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Paciente pe = lista.get(i);
                pe.infoPaciente();
            }

        }
    }

    public void agregarMedicamento() {
        Medicamento uno = new Medicamento();
        //uno.listaMedicamentos uno.listaMedicamentos;
        System.out.println("Ingrese el medicamento: ");
        uno.setMedicamento(e.next());
        //lista.add(uno);
        listaMedicamentos.add(uno);

        int op = -1;
        do {
            System.out.println("Desea ingresar otro medicamento: "
                    + "\n1)Si"
                    + "\n2)No");
            op = e.nextInt();
            if (op == 1) {
                uno = new Medicamento();
                System.out.println("Ingrese el medicamento: ");
                uno.setMedicamento(e.next());
                //lista.add(uno);
                listaMedicamentos.add(uno);

            } else {
                System.out.println("Regresando al menu principal");
            }
        } while (op != 2);
    }

    public void ListaMedicamentos() {
        if (listaMedicamentos.isEmpty()) {
            System.out.println("la lista esta vacía");
        } else {
            for (int i = 0; i < listaMedicamentos.size(); i++) {
                Medicamento ma = (Medicamento) listaMedicamentos.get(i);
                System.out.print(i + ".[ " + ma.getMedicamento() + " ]" + " ->  ");
            }

        }

    }

    public void eliminarListaMedicamentos() {
        if (listaMedicamentos.isEmpty()) {
            System.out.println("la lista esta vacía");
        }
        if (!listaMedicamentos.isEmpty()) {
            listaMedicamentos.clear();
            ListaMedicamentos();
        }

    }

    public void AgregarMedicamentoPaciente() {

        System.out.println("Ingrese la cedula del paciente: ");
        String opc = e.next();
        for (int i = 0; i < lista.size(); i++) {
            Medicamento me = (Medicamento) lista.get(i);
            if (lista.get(i).getCedula().contains(opc) && lista.get(i).getCedula().equals(opc)) {
                System.out.println("ingrese el medicamento: ");
                me.setMedicamento(e.next());
                String prueba = me.getMedicamento();
                for (int j = 0; j < listaMedicamentos.size(); j++) {
                    if (listaMedicamentos.get(j).getMedicamento().contains(prueba)) {
                        me.listaNombres.add(prueba);
                        listaMedicamentos.remove(j);

                    }
                    if (listaMedicamentos.isEmpty()) {
                        System.out.println("La lista esta vacía, ya no hay medicamentos");
                    }

                }
                System.out.println("cantidad de medicamentos en lista " + listaMedicamentos.size());
            }
            if (lista.get(i).getCedula().contains(opc) && !lista.get(i).getCedula().equals(opc)) {
                System.out.println("La cedula no existe");
            }
        }
    }

    public void eliminarMedicamentoPaciente() {
        System.out.println("Ingrese la cedula del paciente: ");
        String opc = e.next();
        for (int i = 0; i < lista.size(); i++) {
            Medicamento me = (Medicamento) lista.get(i);
            if (lista.get(i).getCedula().contains(opc) && lista.get(i).getCedula().equals(opc)) {
                System.out.println("ingrese el medicamento que desea eliminar: ");
                me.setMedicamento(e.next());
                String prueba = me.getMedicamento();
                if (me.listaNombres.contains(prueba)) {
                    me.listaNombres.remove(prueba);
                    listaMedicamentos.add(me);
                } else {
                    System.out.println("El medicamento, ya fue removido o no está en la lista");
                }
                System.out.println("cantidad de medicamentos en lista " + listaMedicamentos.size());
            }
            if (lista.get(i).getCedula().contains(opc) && !lista.get(i).getCedula().equals(opc)) {
                System.out.println("La cedula no existe");
            }
        }
    }

}
