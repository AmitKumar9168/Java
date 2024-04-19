
class sumofdigits1 {
    public static void main(String[] args) {
        int n,sum=0;
       n=89;
       int m;
        while(n>=0) {
            m=n%10;
            sum=sum+m;
            n=n/10;   
        }
        System.out.println(sum);
    }
}
