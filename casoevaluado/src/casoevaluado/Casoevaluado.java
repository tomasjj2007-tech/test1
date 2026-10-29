/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Casoevaluado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int preciodia=0;
       int cantidaddias=0;
       int tipocliente=0;
       int autos=0;
       int costobase=0;
       int seguro=0;
       int gps =0;
       int lealtad=0;
       int mes=0;
       String mest="";
       String tipoclientet="";
       String marca="";
       String cantidaddiast="";
       String preciodiat="";
       String placa="";
       String autost="";
       String gpst="";
       String segurot="";
       String cliente="";
       String cedula="";
       mest=JOptionPane.showInputDialog("Digite el numero de mes");
       mes=Integer.parseInt(mest);
        switch (mes) {
            case 1:
                mest="enero";
           case 2:
               mest="febrero";
           case 3:
               mest="marzo";
           case 4:
               mest="abril";
           case 5:
               mest="mayo";
           case 6:
                mest="junio";
           case 7:
               mest="julio";
           case 8:
               mest="agosto";
           case 9:
               mest="septiembre";
           case 10:
               mest="octubre";
           case 11:
               mest="nobiembre";
           case 12:
               mest="diciembre";
               
                break;
            default:
                throw new AssertionError();
        }
       cliente=JOptionPane.showInputDialog("ingrese su nombre completo ");
       cedula=JOptionPane.showInputDialog("ingrese su numero de cedula");
       placa=JOptionPane.showInputDialog("digite el numero de placa ");
       marca=JOptionPane.showInputDialog("indique la marca del auto ");
       cantidaddiast=JOptionPane.showInputDialog("cuantos dias desea alquilar el auto ");
       preciodiat=JOptionPane.showInputDialog("digite el precio por dia del auto deseado ");
       tipoclientet=JOptionPane.showInputDialog("es ud vip?"
               + "1=si 2=no");
       tipocliente=Integer.parseInt(tipoclientet);
       segurot=JOptionPane.showInputDialog("el alquiler cuenta con seguro"
               + " 1=si 2=no ");
       gpst=JOptionPane.showInputDialog("el alquiler incluye GPS"
               + " 1=si 2=no ");
       gps=Integer.parseInt(gpst);
       seguro=Integer.parseInt(segurot);
       cantidaddias=Integer.parseInt(cantidaddiast);
       preciodia=Integer.parseInt(preciodiat);
      if (cantidaddias>=7&&tipocliente==1){
        costobase=(int) (preciodia*cantidaddias*0.020);
        lealtad=(int) (+5*2);
    }
      else
          costobase=preciodia*cantidaddias;
      if (gps==1&&seguro==1){
          costobase=(int) (+7000*cantidaddias);
          lealtad=(int) (+2);
      }
      else 
         costobase=preciodia*cantidaddias;
JOptionPane.showMessageDialog(null,"PLACA: "+placa
+"MARCA: "+marca
+"PRECIO X DIA:"+preciodia
+"DIAS: "+cantidaddias
+"SEGURO COMPLETO"+ seguro);      

JOptionPane.showMessageDialog(null,"===============RESUMEN DE ALQUILER================="
+"CLIENTE: "+cliente
        
+"CEDULA: "+ cedula
        
+"CATEGORIA: "+tipocliente
+ "(1)=VIP (2)= REGULAR"
        
+"MES DE REGISTRO: "+mes
+"==================================================================="
+ "SUBTOTAL: "+costobase
+"PUNTOS ACUMULADOS: "+lealtad
+"TOTAL A PAGAR: "+costobase);
      }
     
      
      }
  
    
    
     
    
     
     
   
         
     
     
       
    
    

