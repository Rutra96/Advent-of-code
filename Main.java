import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int fuelReq = 0;
    int sum = 0;
      
    
    try{ 
      File x = new File("text2.txt");
      Scanner sc = new Scanner(x);
      while(sc.hasNextInt()){
        int mass = sc.nextInt();
 
        fuelReq = mass/3-2;

        //System.out.println(fuelReq);
        
        sum += fuelReq; 

        System.out.println(sum);

      }

    sc.close(); 
    }catch(FileNotFoundException e){
      System.out.println("Error File Not Found");
    }

  }

}
