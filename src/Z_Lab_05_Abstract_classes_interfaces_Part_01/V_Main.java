
package Z_Lab_05_Abstract_classes_interfaces_Part_01;


class V_Main {
  public static void main(String[] args) {
      
  
      V_Person ob1 = new V_Person("Danushka",40000, 1000, 5);
      ob1.calculate();
      ob1.display();
      
      System.out.println("");
      
      V_Box ob2 = new V_Box(10, 20, 30);
      ob2.calculate();
      ob2.display();
      
  }
}