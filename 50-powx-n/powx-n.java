class Solution {
    static double pow(double x, long n){ 
        if(n==0) return 1;
        else if(n%2==0){
            double half=pow(x,n/2);
            return half*half;
        }
        else return x*pow(x,n-1);
    }

    public double myPow(double x, int n) {
        long num=n;
        if(num<0){
            num=-num;
            return 1/pow(x,num);
        }
        return pow(x,num);
    }
}