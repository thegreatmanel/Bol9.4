/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Tabla {
    public Tabla(){
        
    }
    public void calcularTablas(){
     
     int num;
     int i=1;
 
    do{
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero"));
        if(num!=0)
        for(i=1;i<10;i++){
        System.out.println(num + "*" + i + "="+ num*i );}
        
   }while(num!=0);
    }
    
}
