
package Z_Lab_01_Introduction_to_Java;


public class Ex4 {
    
    public static void main(String args[]){
        
        
        
        String valueD = "value of the Day : ";
        String day = "Day of the Week : ";
        String endS = "Good Bye";
        int mDay = 3;
        
        switch(mDay){
            
            case 1:System.out.println(valueD+" 1");
                   System.out.println(day+" Monday");
                   System.out.println(endS);
                   break;
                   
            case 2:System.out.println(valueD+" 2");
                   System.out.println(day+" Tuesday");
                   System.out.println(endS);
                   break;
            case 3:System.out.println(valueD+" 3");
                   System.out.println(day+" Wednesday");
                   System.out.println(endS);
                   break;
            case 4:System.out.println(valueD+" 4");
                   System.out.println(day+" Thursday");
                   System.out.println(endS);
                   break;
            case 5:System.out.println(valueD+" 5");
                   System.out.println(day+" Friday");
                   System.out.println(endS);
                   break;
            case 6:System.out.println(valueD+" 6");
                   System.out.println(day+" Saturday");
                   System.out.println(endS);
                   break;
            case 7:System.out.println(valueD+" 7");
                   System.out.println(day+" Sunday");
                   System.out.println(endS);
                   break;
            default:System.out.println("Invalid input!");
            
        }
        
        
        
    }
    
}
