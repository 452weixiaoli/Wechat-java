import java.util.Scanner;
 
public class code1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name=in.next();
        int num=5;
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("请输入学生第"+(i+1)+"门课的成绩:");
            int score=in.nextInt();
            sum=sum+score;
        }
        System.out.println(name+"五门课的总成绩为:"+sum);
    }   
}