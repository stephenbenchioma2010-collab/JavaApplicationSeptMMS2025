public class IntegerSet {
    private boolean[] set = new boolean[101]; // 0-100

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet res = new IntegerSet();
        for (int i=0; i<=100; i++) res.set[i] = a.set[i] || b.set[i];
        return res;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet res = new IntegerSet();
        for (int i=0; i<=100; i++) res.set[i] = a.set[i] && b.set[i];
        return res;
    }

    public void insertElement(int k) { if(k>=0&&k<=100) set[k]=true; }
    public void deleteElement(int m) { if(m>=0&&m<=100) set[m]=false; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=100;i++) if(set[i]) sb.append(i).append(" ");
        return sb.isEmpty() ? "---" : sb.toString().trim();
    }

    public boolean isEqualTo(IntegerSet other) {
        for(int i=0;i<=100;i++) if(set[i]!=other.set[i]) return false;
        return true;
    }
}