// class Solution {
//     public int countPrimes(int n) {
//         // if(n<2){
//         //     return 0;

//         // }
//         // boolean [] arr=new boolean[n];
//         // Arrays.fill(arr,true);
//         // arr[0] =arr[1]=false;

//         // for(int i=2;i*i<n;i++){
//         //     if(arr[i]){
//         //         for(int j=i*i;j<n;j+=i){
//         //             arr[j]=false;
//         //         }

//         //     }
//         // }

//         // int cou=0;
//         // for(int i=1;i<n;i++){
//         //     if(arr[i]){
//         //         cou++;
//         //     }
//         // }

//         // return cou;



class Solution {
    public int countPrimes(int n) {

        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        // assume all are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

    
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
     
        
    