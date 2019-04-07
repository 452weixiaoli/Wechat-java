public class code1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year=2000;
        int i=80000;
        while(i<=200000){
            i=i+(i/100*25);
            year++;
        }
        System.out.println("哪一年人数超过20W:"+year);
 
    }
}