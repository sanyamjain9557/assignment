/*

Print any given inputString in following format.

Output

index:  0    1   2   3   4   
chars:  H    e   l   l   o

Every character is separated by tab, use "\t" for inserting tab.
*/

import java.util.Scanner;
public class Assign {
    

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String inputString= sc.nextLine();
        
        System.out.print("index:    ");
        for(int i=0;i< inputString.length();i++){
            System.out.print(i);
            System.out.print("\t");
            
         
        }
        System.out.println();
        System.out.print("char:     ");
        for(int i=0;i< inputString.length();i++){
            System.out.print(inputString.charAt(i));
            System.out.print("\t");
        }
        
    }
    
}
