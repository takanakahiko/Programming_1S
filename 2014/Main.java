import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    public static void main(String args[]){
        String in_sub_str = System.console().readLine("教科数を入力してください");
        int sub_n = Integer.parseInt(in_sub_str);
        
        String in_stu_str = System.console().readLine("学生数を入力してください");
        int stu_n = Integer.parseInt(in_stu_str);

        for(int i = 0; i < sub_n; i++){
            int top = 0;
            double sum = 0;
            for(int j = 0; j < stu_n; j++){
                String message = "学生" + j +"の教科"+ i +"のを入力してください";
                int score = Integer.parseInt(System.console().readLine(message));
                sum += score;
                if( top < score ) top = score;
            }
            System.out.println("教科"+ i +"のトップは" + top + "点でした");
            System.out.println("教科"+ i +"の平均は" + (sum/stu_n) + "点でした");
        }
    }
}