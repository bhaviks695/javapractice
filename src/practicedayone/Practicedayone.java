
package practicedayone;

import java.util.Scanner;
public class Practicedayone {

    public static void forloop(){
    
      String name;
      Scanner s = new Scanner(System.in);
        
        for(int i=0;i<=10;i++){
        System.out.println("Enter name: ");
        name = s.next();
        System.out.println(name);
}
    }
   public static void whileloop(){
          Scanner s = new Scanner(System.in);
      int a  = 0;
        String n;
        
       while(a<5){
          System.out.println("enter name");
          a++; // if its not included there will be an infinite loop because a wont increase and since its less than zero the ondition will keep on running
        n=s.next(); 
       }
   }
    public static void nestedforloop(){
            // in the nested for loop, first x runs then a condion inside t=it thats the y for loop runs , and then x runs again. it will continue till x reaches 10.
   for (int x=0;x<=10;x++){ 
       for(int y=0;y<=10;y++){
           System.out.println(x + " " + " ," + y);
       }
   }
    }
    public static void main(String[] args) {
    char myChar ='9';
    System.out.println("The ascii value of"+ " " +  myChar+ " "+"is "+(int)myChar);
        }
}
