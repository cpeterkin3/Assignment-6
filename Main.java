import java.util.Scanner;
public class Main {
    public static Scanner userinput=new Scanner (System.in);
    public static void main (String[]args){
        int[] myArray = new int [5];
        System.out.println("Enter 5 integers that are greater than 0");
        for(int i=0;i<5;i++){
            myArray[i]=userinput.nextInt();
    }
        System.out.println("Choose an option: 1) Find the average 2) Find the power 3) Is it prime? 4) Is it even or odd?");
        int choice= userinput.nextInt();
        switch(choice){
          case 1:  
            System.out.println ("The average is:"  +average(myArray));
            break;
          case 2:  
            int[] powers=  power(myArray);
            for(int i=0; i<5;i++){
              System.out.println("The power of" + " " +myArray[i]+" " +"raised to" + " " +myArray[(i+1)%5] + " "+ "is" + " "+ powers[i]);
            }
            break;
          case 3:
            for (int i=0;i<5;i++){
              prime(myArray[i]);
            }
            break;
          case 4:
              even (myArray);
              break;
        }
          
        }

        
    public static int average(int[] arr){
     int sum=0;
     for (int i=0; i<5; i++){
         sum= sum+ arr[i];
     } int average= sum/arr.length;
   
   return average; } 
     
     public static void prime(int i){
          boolean primenum=true;
          for (int j=2; j<i;j++){
              if (i % j == 0) {
                  primenum= false;
                  break;
              }
          }
          if (primenum)
            System.out.println(i + " " + "is prime");
          else System.out.println(i+ " " + "is not prime");
     } 
     public static int[] power(int[] arr){ 
       int [] myarray=  new int [5];
       for(int i=0;i<5;i++){
         myarray[i]=arr[(i+1)%5];
       }
       return (myarray);

     }
     public static  void even( int []arr){
       for(int i=0;i<5;i++){
         if(arr [i]%2==0){
           System.out.println(arr[i]+ " "+ "is even");
         } else System.out.println(arr[i]+ " "+ "is odd");
         } }}
       

     
   
   

