import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    
   int [] tablica = {1,1,1,4,99,5,6,0,99};
   
   

   for (int i = 0; i < tablica.length; i++){
    //int number = tablica[i];
  

    if (tablica[0] == 1){

      //tablica [1] = a;
      //tablica [2] = b;
      //tablica [3] = c;
     
     tablica [tablica [3]] = tablica [tablica [1]] + tablica [tablica [2]];

    }else if (tablica[0] == 2) {

     tablica [tablica [3]] = tablica [tablica [1]] * tablica [tablica [2]];

    }else if (tablica[0] == 99) {
      
      System.out.println("Wystąpiła liczba 99 - koniec programu");

      break;
    }


    //a = i + 4;



    System.out.println(tablica[i]);

   }


  }

}
