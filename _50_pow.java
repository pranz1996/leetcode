package leetcode;

class _50_pow {
    public double myPow(double x, int n) {

       double answer = 0.0;

        if(n <= Integer.MIN_VALUE) {
            if( x < 0) {
                return 1;
            } else if(x != (double)(1)){
                return answer;
            }
        }
        
        if(n > 0 && x > 0 || n < 0 && x < 0){
            answer = calculate(x,n);
        } else if(x < 0 && n > 0){
            answer = calculate(x,n); 
        } else{
            answer = 1/calculate(x,-n);   
        }
        return answer;
    }
   private static double calculate(double x, int n){
        return Math.pow(x,n);
    }
}