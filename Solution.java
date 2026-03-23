public class Solution {
    public long fibonacci(long n){
        if(n < 0){
            return -1;
        }
        if(n == 0) return 0;
        if(n == 1) return 1;
        long a = 0;
        long b = 1;
        long result = 0;
        for (long i = 2; i <= n; i++){
            result = a + b;
            a = b;
            b = result;
        }
        return result;   
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fibonacci(0));
        System.out.println(sol.fibonacci(1));
        System.out.println(sol.fibonacci(5));
        System.out.println(sol.fibonacci(10));
    }
}