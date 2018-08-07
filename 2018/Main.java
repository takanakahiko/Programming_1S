import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
          任意の整数を入力し、以下の４つを出力せよ
          1, 整数の桁数
          2, 整数の列
          3, 全ての桁の合計
          4, 奇数の桁の最大値(奇数がない場合"奇数はありません"と出力)
        */
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();
        String[] numbersStr = line.split("");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbers.length; i++){
          numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        //1, 整数の桁数
        System.out.println("整数の桁数: " + numbers.length);
        //2, 整数の列
        System.out.println("整数の列: " + line);
        //3, 全ての桁の合計
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
         total += numbers[i];
        }
        System.out.println("全ての桁の合計: " + total);
        //4, 奇数の桁の最大値
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
          if (numbers[i] % 2 == 1 && max < numbers[i]){
            max = numbers[i];
          }
        }
        if (max == 0){
          System.out.println("奇数の桁の最大値: 奇数はありません");
        }else{
          System.out.println("奇数の桁の最大値: " + max);
        }
    }
}
