class Main_2 {

    public static void main(String[] args) {

        //入力された数値の文字列
        String arg = args[0];

        //入力された整数を配列として保持する
        int[] num_arr = new int[arg.length()];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = Integer.parseInt(arg.charAt(i) + "");
        }

        //整数の合計を求める
        int sum = 0;
        for (int i = 0; i < num_arr.length; i++) {
            sum += num_arr[i];
        }

        /*
        for (int i : num_arr) {
            sum += i;
        }
        */

        //奇数の最大値を求める
        int odd_max = 0;
        for (int i = 0; i < num_arr.length; i++) {
            if (num_arr[i] % 2 != 0 && num_arr[i] > odd_max) odd_max = num_arr[i];
        }

        /*
        for (int i : num_arr) {
            if (i % 2 != 0 && i > odd_max) odd_max = i;
        }
        */

        //実行結果の出力
        System.out.println("整数の数：" + arg.length());
        System.out.println("整数の列：" + arg);
        System.out.println("整数の合計：" + sum);
        String msg = "奇数はありません";
        if (odd_max != 0) msg = odd_max + "";
        System.out.println("奇数の最大値：" + msg);
        //System.out.println("奇数の最大値：" + (odd_max == 0 ? "奇数はありません" : odd_max));

    }

}