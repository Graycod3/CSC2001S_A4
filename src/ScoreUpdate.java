 /***
This class is for the scores update.
***/
import javax.swing.JLabel;


public class ScoreUpdate extends Thread{
    String typed;
    WordRecord[] words;
    JLabel caught;
    JLabel scr;
    public ScoreUpdate(String typed,WordRecord[] words,JLabel caught,JLabel scr)
    {
        this.typed=typed;
        this.words=words;
        this.caught=caught;
        this.scr=scr;
    }
   
    public void run()
    {
        for(int j=0;j<words.length;j++)
        {
           if(words[j].matchWord(typed)!=false)
           {
               WordApp.score.caughtWord(typed.length());

               caught.setText("Caught: " + WordApp.score.getCaught() + "    ");
               scr.setText("Score:" + WordApp.score.getScore()+ "    "); 
           }
        }
    }
    
}
