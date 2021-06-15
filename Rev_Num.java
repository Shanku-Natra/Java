write  a   program   to  display   reverse  of  a  given   number .


package   Numbers;
import  java.util.*;
public  class  Rev_Num {
       public  static  void  main(String[]  args) {
              Scanner  obj = new  Scanner(System.in);
              System.out.println("Enter  Number : ");
              int  n = obj.nextInt();
              int  rev = 0 , rem ; 
              while(n != 0)
                  {
                    rem = n%10;
                    rev = rev*10 + rem;
                    n = n/10;
                 }
                 System.out.println("Reverse  = " + rev);
    }
   }

OUTPUT :
---------------
Enter  Number :
1234
Reverse = 4321