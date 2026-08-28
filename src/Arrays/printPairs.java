package Arrays;

public class printPairs {
    public static void Printpairs(int num[]){
        int tp=0;
        for (int i = 0; i < num.length ; i++) {
            int curr = num[i];
            for (int j = i+1; j <num.length ; j++) {
                System.out.print("(" +curr+ "," +num[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" +tp);
    }

    static void main(String[] args) {
        int num[] ={2,5,7,8,7,6,5};
        Printpairs(num);
    }

}
