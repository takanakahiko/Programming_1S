public class Main {
    public static void main(String[] args) {

        int m[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6, 2, 6, 4, 3, 3, 8, 3, 2, 7, 9, 5};
        
        //問1：配列mの要素と要素数を表示せよ
        for(int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        System.out.println("配列の要素数：" + m.length);

		System.out.println("----------------------------------------------");

        //問2：配列mの要素の算術平均を求めよ
        int sum = 0;
        for(int i = 0; i < m.length; i++) {
            sum = sum + m[i];
        }
        System.out.println("配列の算術平均は" + ((double)sum / m.length) + "です");

		System.out.println("----------------------------------------------");

        //問3：配列mの要素について、偶数は加算、奇数は減算として和を求め表示せよ
        sum = 0;
        for(int i = 0; i < m.length; i++) {
            if(m[i] % 2 == 0) {
                sum = sum + m[i];
            } else {
                sum = sum - m[i];
            }
        }
        System.out.println(sum);

		System.out.println("----------------------------------------------");

        /*問4：配列mの要素のうち、数値zの個数を求め表示せよ
        　   　ただし、zは0から9任意の値であり、キーボードから入力するものとする
               さらに、zを削除した配列sを求めよ
               また削除した要素位置は順次後ろの要素を詰めること
               さらに、削除した要素の個数分の-1を配列の配列の後ろから埋めよ
               配列sの要素を表示せよ
        */
        int z = Integer.parseInt(System.console().readLine());
        sum = 0;
        for(int i = 0; i < m.length; i++) {
            if(m[i] == z) sum++;
        }
        System.out.println("配列mに含まれる" + z + "の個数は" + sum + "です");
        int s[] = new int[m.length];
        int j = 0;
        for(int i = 0; i < m.length; i++) {
            if(m[i] != z) {
                s[j] = m[i];
                j++;
            }
        }
        for(int i = s.length - sum; i < s.length; i++) {
            s[i] = -1;
        }
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

    }
}