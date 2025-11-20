public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[num+1];
        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }
    prime[0] = false;
     prime[1] = false;
     int divisor = 2;
     int count = 0;
             
        while(divisor<= num){
            if (prime[divisor] == true) {
    
           for(int i = divisor * 2; i <= num; i += divisor) {
            if (prime[i] == true) {
                prime[i] = false;
                
            }
           }        
    }
    divisor++; 
}
    System.out.println("Prime numbers up to " + num +":");
    for(int i= 2; i < prime.length; i++){
        if (prime[i]== true){
            System.out.println((int)i);
            count++;
        }
    }
     double newNum = num;
     double newCount = count;
     double present = (newCount*100)/ newNum;
     int f = (int) present;
       
       

  System.out.println(" There are " + count + " primes between 2 and " + num + " (" + f + "% are primes)");
    
     
}
    }

    
