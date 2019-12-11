  
import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        
        //write and implement the sieve algorithm
        int n = 1;
        int x = 2;
        for(int i = 2; i <= 999; i++){
            n++;
            if(sieve[i] == false){
            }
            else if(i % n == 0){
                for(x = 2; (x * n) <= 999; x++){
                    sieve[x * n] = false;
                }
            }
            else{
            }
        }
        int[]result = collectPrimes();
        
        //print a list of prime numbers to the console
        System.out.println(java.util.Arrays.toString(result));
        printPrimeFactors(result,8);
    }
    public static int[] collectPrimes(){
        int u = 0;
        for(int x = 0; x <= 999; x++){
            if(sieve[x] == true){
                u++;
            }
        }
        int[] zoom = new int[u];
        int z = 0;
        for(int r = 0; r < 1000; r++){
            if(sieve[r] == true){
                zoom[z] = r;
                z++;
            }
            
        }
        //System.out.print(java.util.Arrays.toString(zoom));
        return zoom;
    }
    public static void printPrimeFactors(int[] boomer, int b){
        int i = 168;
        int a = 1;
        while (i > 0 && a == 1){
            i--;
            if(b% boomer[i] == 0){
                a = 0;
                System.out.println(boomer[i]);
                int x = b / boomer[i];
                for(int p = i; p >= 0; p--){
                    while (x % boomer[p] == 0){
                        System.out.println(boomer[p]);
                        int o = p / boomer[x];
                        System.out.println(boomer[o]);
                        while(o % boomer[o] == 0){
                            int d = o % boomer[o];
                            if(d <= 0){
                            System.out.println(boomer[d]);
                            while(d % boomer[d] == 0){
                                int y = d % boomer[d];
                                if(y % boomer[y] > 0){
                                }
                            }
                        }
                        }
                    }
                }
            }
        }
    }
}