package Assignment4;

/**
 * @author Mert Yacan
 */
public class Assignment04 {
    
    public static boolean isEven(int number){
        System.out.println("Is " + number + " even will be executed.");
        //We will check the last bit of the number. For odd binary numbers the first bit is always 1.
        return (number & 1) == 0;
    }
    
    public static String resolveAreaCode(int code){
        //For every code we return the name and if we cant find the code we will return "Wrong code".
        System.out.println("Resolve " + code + " area code will be executed.");
        switch (code){
            case 212:
                return "Istanbul";
            case 216:
                return "Istanbul 2";
            case 312:
                return "Ankara";
            case 232:
                return "Izmir";
            case 322:
                return "Adana";
            case 266:
                return "Balıkesir";
            case 224:
                return "Burse";
            case 462:
                return "Trabzon";
            case 532:
                return "Turkcell";
            case 542:
                return "Vodafone";
            case 505:
                return "Turk Telekom";
            default:
                return "Wrong code";
        }
    }
    
    public static void fibonacciSeries(int n){
        int n1 = 0;
        int eskisayi;
        int simdikisayi = 1;
        System.out.println("Fibonacci " + n + " times will be executed.");
        while(n1 < Math.abs(n)){
            System.out.println((++n1) + ". number of fibonacci series is " + (n1-1));
            if(2==n1) break;
        }        
        while(n1 < Math.abs(n)){
            System.out.println((++n1) + ". number of fibonacci series is " + simdikisayi);
            eskisayi = simdikisayi;
            simdikisayi = simdikisayi + eskisayi;
        }
        System.out.println("\n");
    }
    
    public static void fibonacciUntil(int n){
        int n1 = 2;
        int eskisayi;
        int simdikisayi = 1;
        System.out.println("Fibonacci until bigger than " + n + " will be executed.");
        if(n>1){
            System.out.println("1. number of fibonacci series is 0");
            System.out.println("2. number of fibonacci series is 1");
            do{
                System.out.println((++n1) + ". number of fibonacci series is " + simdikisayi);
                eskisayi = simdikisayi;
                if(simdikisayi >= n) break;
                simdikisayi = simdikisayi + eskisayi;
            } while(true);
            //infinite loop till we get a bigger value then break the loop.
        }
        System.out.println("\n");
    }
    
    public static void squares(int n){
        int n2 = n;
        int n1 = 0;
        System.out.println(n + " times square will be executed.");
        while(n2-- > 0){
            System.out.println("Square of " + n1 + " is " + (n1*n1++));
        }
        System.out.println("\n");
    }
    
    public static void squaresUntil(int n){
        int n2 = 0;
        int n1 = -1;
        System.out.println("Squares until bigger than " + n + " will be executed.");
        do{
            System.out.println("Square of " + n2 + " is " + (n2*n2++));
            if(n < n1) break;
            n1 = n2*n2;
        }while(true);
        //infinite loop till we get a bigger value then break the loop.
        System.out.println("\n");
    }
    
    public static void randomTest(){
        System.out.println("Random test will be executed. 1000 integers between 50 and 150 will be created.");
        double max = 0;
        for (int i=0; i<1000 ;i++)
            max = max + (Math.random()*100+50);   // multiply by the range and add the starting point
        System.out.println("Average of the created random numbers is: " + max/1000 + "\n"); 
    }
    
    public static void countdown(int n){
        System.out.println("Countdown " + n + " times will be executed.");
        while(n > 0){
            System.out.print(n-- + " ");
        }
        System.out.println("\n");
    }
    
    
}
