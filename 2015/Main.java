import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    //‘Q‰»®‚ğ—p‚¢‚Ä“ü—Í‚³‚ê‚½”‚Ì•½•ûª‚ğ‹‚ß‚é–â‘è
    public static void main(String args[]){
        String in_num_str = System.console().readLine("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
        int num = Integer.parseInt(in_num_str);
        double a = 1.0;
        for(int i = 0 ; i < 30; i ++){
            a = (a + num / a) / 2;
        }
        System.out.println("”š"+ num +"‚Ì•½•ûª‚Í" + a + "‚Å‚µ‚½");
    }
}