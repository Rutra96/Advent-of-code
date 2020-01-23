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
      
        int fuelReq = 0;
        fuelReq = mass/3-2;

      
        
  
        System.out.println(fuelReq);
      }
      sc.close();
    }catch(FileNotFoundException e){
      System.out.println("Error File Not Found");
    }
  }
}
