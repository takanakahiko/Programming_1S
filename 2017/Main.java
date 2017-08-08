import java.io.Console;

public class Main{
  public static void main(String args[]){
    int[] m = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5};

    //(1) 配列mの要素と要素数を表示せよ
    System.out.println("(1)元の配列:");
    for(int i=0;i<m.length;i++){
      System.out.print(" "+m[i]);
    }
    System.out.println();
    System.out.println("配列の要素数:"+m.length);

    //(2) 配列mの算術平均を求めよ
    double arithmeric_mean = 0;
    for(int i=0;i<m.length;i++){
      arithmeric_mean += m[i];
    }
    arithmeric_mean /= m.length;
    System.out.println("(2)算術平均:"+arithmeric_mean);

    //(3) 配列mの要素について、偶数は加算、奇数は減算として、和を求め表示せよ
    int calculated = 0;
    for(int i=0;i<m.length;i++){
      if(m[i] % 2 == 0){
        calculated += m[i];
      }else{
        calculated -= m[i];
      }
    }
    System.out.println("(3)計算結果:"+calculated);

    //(4) 配列mの要素を逆順にした配列rを求めよ
    int[] r = new int[m.length];
    for(int i = 0;i<m.length;i++){
      r[i] = m[m.length - i - 1];
    }
    System.out.println("(4)配列r:");
    for(int i=0;i<r.length;i++){
      System.out.print(" "+r[i]);
    }
    System.out.println();

    //(5) 配列mの要素のうち、数値zの個数を求め表示せよ。ただし、zは0から9の任意の
    //値であり、キーボードから入力するものとする。さらにzを削除した配列sを求めよ。
    //また削除した要素位置は順次後ろの要素を詰めること。さらに、削除した要素の個数分
    //の-1を配列の後ろから埋めよ。配列sの要素を表示せよ。
    Console console = System.console();
    String line = console.readLine();
    int z = Integer.parseInt(line);
    int z_count = 0;
    for(int i=0;i<m.length;i++){
      if(m[i] == z){
        z_count++;
      }
    }
    System.out.println("(5.1)数値zの個数:"+z_count);
    int[] s = new int[m.length];
    int tmp = 0;
    for(int i=0;i<s.length;i++){
      if(m[i] != z){
        s[i-tmp] = m[i];
      }else{
        tmp++;
      }
    }
    for(int i=0;i<z_count;i++){
      s[s.length-i-1] = -1;
    }
    System.out.println("(5.2)配列s:");
    for(int i=0;i<s.length;i++){
      System.out.print(" "+s[i]);
    }
    System.out.println();

  }
}
