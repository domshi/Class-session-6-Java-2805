
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) {
    int num = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an int: ");
    boolean ok = true;
    try{
      num = in.nextInt();
      }
    catch (InputMismatchException e) {
      System.out.println("Not an int");
      System.out.println(e.getStackTrace());
      ok = false;
      }
    finally {
      System.out.println("This code always runs. ");
      }
    
    if (ok) System.out.println("You entered: " + num);
    
    
  }
  
}