/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.de.estudio.pkg1.josé.ignacio.garcia.rivas;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class CasoDeEstudio1JoséIgnacioGarciaRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Bienvenido");
        String opcion = "";
        
        double comision = 0;
        int puntos = 0;
        
        opcion = JOptionPane.showInputDialog("Desea registrar facturas?");
        Facturas Factura = new Facturas();
        while (opcion.equals("Si")){

        Factura.Nombre = (JOptionPane.showInputDialog("Ingrese su nombre: "));
        Factura.Cedula = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula: ")));
        Factura.vehiculo = (JOptionPane.showInputDialog("Cuenta con vehiculo propio?"));
        Factura.CodigoFactura = (JOptionPane.showInputDialog("Ingrese el codigo de la factura: "));
        Factura.MontoFac = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Monto de la Factura: ")));
        Factura.ProdElectricos = (Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos electricos?")));
        Factura.ProdAutomotriz = (Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos automotrices?")));
        Factura.ProdConstruccion = (Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos construccion?")));
        opcion = JOptionPane.showInputDialog("Desea ingresar otra factura?");
        
        }
         if(Factura.ProdConstruccion>0 && Factura.ProdAutomotriz>0  &&  Factura.ProdConstruccion>0){
             comision +=  Factura.MontoFac * 0.04;
             puntos += 3;
        }
         if (Factura.ProdElectricos >= 3){
             comision += Factura.MontoFac * 0.04;
         } else{
             comision += Factura.MontoFac * 0.02;
         }
         puntos +=1;
         if (Factura.ProdConstruccion>0) {
             comision *= Factura.MontoFac * 0.08;
             puntos +=2;
         }
         if(Factura.MontoFac> 5000){
             comision += Factura.MontoFac * 0.05;
             puntos += 1;
         }
         JOptionPane.showMessageDialog(null, 
                 "*********Reporte********" +
                         "\n Nombre: " + Factura.Nombre +
                         "\n Cedula: " + Factura.Cedula  +
                         "\n Codigo: " + Factura.CodigoFactura + 
                         "\n Vehiculo propio: " + Factura.vehiculo + 
                         "\n Total Vendido: " + Factura.MontoFac + 
                         "\n Comisiones: + " + comision + 
                         "\n Puntos: " + puntos);
                         
         
         
}
}