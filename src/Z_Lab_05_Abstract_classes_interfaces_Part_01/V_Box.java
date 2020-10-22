/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_05_Abstract_classes_interfaces_Part_01;

/**
 *
 * @author Dananjaya
 */
public class V_Box implements V_ICompute{
    
   private int length, width, height;
   private int volume;

   
   public V_Box(int length,int width,int height){
       
       this.length = length;
       this.height = height;
       this.width = width;
   }
   
    public void calculate(){
        
        volume = length * width * height;
    }
    
    public void display(){
        
        System.out.println("Volume is = "+volume);
     
    }

}
