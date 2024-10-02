/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import datos.Empresa;
import datos.Vehiculo;

/**
 *
 * @author Arturo
 */
public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
         empresa.addVehiculo(new Vehiculo("ABC123", "Sedan", "Ultimo", true, "toyota"));
         empresa.addVehiculo(new Vehiculo("ABC123", "SEDAN", "NO ULTIMO", false, "Claro"));
         empresa.addVehiculo(new Vehiculo("LIV007", "VANS", "ULtimo", true, "pepsi"));
         System.out.println(""+empresa.toString());
         //System.out.println(""+empresa.costoPorDiaAutoDadaPlaca("ABC123"));
         //System.out.println(""+empresa.costoPorDiaAutoDadaPlaca("ORO777"));
         //empresa.cambiarModeloDadaPlaca("ABC123","Messi");
         //System.out.println(""+empresa.toString());
         //System.out.println(""+empresa.porcentajeVehiculosAutomaticos());
         //empresa.eliminarPorPlaca("oro777");
         empresa.eliminarPorPlaca("ABC123");
         //empresa.eliminarPorPlaca("LIV007");
         System.out.println(""+empresa.toString());
         
         //Dada placa de vehiculo eliminarlo
         //Hallar todas las marcas posibles sin repetición
         //System.out.println(""+empresa.listaMarcas());
         
    }
}
