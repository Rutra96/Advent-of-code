import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter module mass:");

    int mass = myObj.nextInt();
    int sum = 0;
    
    sum = mass/3-2;
  
    System.out.println(sum);

  }
}
