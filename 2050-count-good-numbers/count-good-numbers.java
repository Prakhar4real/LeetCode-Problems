class Solution {
    static long pow(long x, long y){
        if(y==0) return 1;
        if(y%2==0){
            long half=pow(x,y/2);
            return (half*half)%1000000007L; //apply modulo here, VERY IMP, to manage the multiplication
        }
        else return (x*pow(x,y-1))%1000000007L; //apply modulo here, VERY IMP, to manage the multiplication
    }
    public int countGoodNumbers(long n) {
        long even=0, odd=0;
        if(n%2==0){ even=n/2; odd=n/2; }
        else{ even=(n/2)+1; odd=n-even; }

        long ans=0;
        long a= pow(5,even);
        long b= pow(4,odd);
        //the main formula is that every even index has 5 possiblities(0,2,4,6,8) and evey odd index has 4 possibilities(2,3,5,7), hence the total combinations that is possible is: ans= 5^even * 4^odd.

        ans=(a*b)%1000000007L;
        return (int)ans;

    }
}