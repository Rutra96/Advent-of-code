import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try{ 
      File x = new File("text.txt");
      Scanner sc = new Scanner(x);
      while(sc.hasNextInt()){
        int mass = sc.nextInt();
        System.out.println(mass);
      }
      sc.close();
    }catch(FileNotFoundException e){
      System.out.println("Error");
    }
 
   // int sum = 0;
    
   // sum = mass/3-2;
  
   // System.out.println(sum);


  }
}
