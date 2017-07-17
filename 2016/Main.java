import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    public static void main(String args[]){
        //2‚Ì—İæ‚ğ‹‚ß‚é–â‘è
        System.out.println("2‚Ìnæ‚ğ‹‚ß‚Ü‚·");
        int q1_num = Integer.parseInt(System.console().readLine("”šn‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:"));
        int ret1 = 1;
        for(int i = 0 ; i < q1_num; i ++){
            ret1 *= 2;
        }
        System.out.println("2‚Ì"+ q1_num +"æ‚Í" + ret1 + "‚Å‚·");

        System.out.println("----------------------------------------------");
        
        //5‚ÌŠKæ‚ğ‹‚ß‚é–â‘è
        System.out.println("5‚ÌŠKæ‚ğ‹‚ß‚Ü‚·");
        int ret2 = 1;
        for(int i = 0 ; i < 5; i ++){
            ret2 *= (i+1);
        }
        System.out.println("5‚ÌŠKæ‚Í" + ret2 + "‚Å‚·");

        System.out.println("----------------------------------------------");

        //—^‚¦‚ç‚ê‚½~…Šm—¦‚É‚æ‚Á‚Äo—Í‚·‚é•¶Í‚ğ•Ï‚¦‚é–â‘è(hˆÈãh‚âhˆÈ‰ºhAh–¢–hAh‚æ‚èãh‚Ì”»’è)
        System.out.println("~…Šm—¦‚É‚æ‚Á‚ÄƒƒbƒZ[ƒW‚ğ•\¦‚µ‚Ü‚·");
        int q3_num = Integer.parseInt(System.console().readLine("~…Šm—¦‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0~100):"));
        if(q3_num >= 80){
            System.out.println("P‚ğ–Y‚ê‚¸‚É‚Á‚Ä‚­‚¾‚³‚¢‚Ë");
        }else if(q3_num > 30){
            System.out.println("”O‚Ì‚½‚ßÜ‚èô‚İP‚ğ‚¿‚Ü‚µ‚å‚¤");
        }else{
            System.out.println("‰õ°“ú˜a‚Å‚·I");
        }
    }
}