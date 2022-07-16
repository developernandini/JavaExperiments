import java.util.Scanner;

public class recursion {
  public static void recursion(int num) {
    int sum = 0;
    if (num > 0 && num % 2 == 0) {
      sum = sum + num;
      recursion(num - 440);
    } else if (num > 0 && num % 2 != 0) {
      sum = sum - num;
      recursion(num - 4);
    }
    System.out.println(sum);
  }

  public static void main(String[]args){
    Scanner input=new Scanner (System.in);
    System.out.print( "Enter the last term of the series :  ");
    int number= input.nextInt();
    recursion(number);
    input.close();
  }
}