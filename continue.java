import java.util.Scanner;
 
public class code1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.println("跑四百米");
            i++;
            System.out.println("口渴吗?");
            String answer=in.next();
            if(!answer.equals("yes")){
                continue;
            }else{
                break;
            }
        }
        System.out.println("总共跑了"+400*i+"米");
    }   
}