public class HugeInteger {
    private int[] digits = new int[40];

    public void parse(String s) {
        for(int i=0;i<40;i++) digits[i]=0;
        int start = Math.max(0, s.length()-40);
        for(int i=start;i<s.length();i++)
            digits[40 - (s.length()-i)] = s.charAt(i)-'0';
    }

    public String toString() {
        StringBuilder sb=new StringBuilder();
        int i=0; while(i<40 && digits[i]==0) i++;
        if(i==40) return "0";
        while(i<40) sb.append(digits[i++]);
        return sb.toString();
    }

    public HugeInteger add(HugeInteger other) {
        HugeInteger res=new HugeInteger(); int carry=0;
        for(int i=39;i>=0;i--){
            int sum=digits[i]+other.digits[i]+carry;
            res.digits[i]=sum%10; carry=sum/10;
        }
        return res;
    }

    public boolean isEqualTo(HugeInteger o) { for(int i=0;i<40;i++) if(digits[i]!=o.digits[i]) return false; return true; }
    public boolean isGreaterThan(HugeInteger o) { for(int i=0;i<40;i++) if(digits[i]>o.digits[i]) return true; else if(digits[i]<o.digits[i]) return false; return false; }
}