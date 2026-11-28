class Solution {
    static int pow(int x, int n) {
        int res=1;
        x%=1337;
        while(n>0){
            res=(res*x)%1337;
            n--;
        }
        return res;
    }

    public int superPow(int a, int[] b) {
        a%=1337;
        int ans= 1;
        for (int num: b) ans=(pow(ans,10)*pow(a,num))%1337;
        return ans;
    }

    
}