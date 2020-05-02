package Math;

class countPrimes {

	public static void main(String[] args) 
	{  
		System.out.println(countPrimesN(50)); 
    } 
    
    public static int countPrimesN(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        //no point in checking number and it's square becuase no primes exist
        //between it and it's square i->i*i there are no primes. 
        for (int i = 2; i * i < primes.length; i++) {
            if(primes[i]) {
                for (int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
        int primeCount =0;
        for(int i =2;i<primes.length;i++) {
            if(primes[i]) {
                primeCount++;
            }
        }
        return primeCount;
    }
    public int countPrimesB(int n) {

        int count = 0;
        boolean[] flagger = new boolean[n];
        
        for(int i = 2;i<n;i++) {
            if(flagger[i] == false) {
                count = count + 1;
                for (int j = 2; i*j < n; j++) {
                    flagger[i*j] = true;
                }
           
            }
        }
            return count;
        }
} 



