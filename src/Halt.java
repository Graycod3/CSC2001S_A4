/*** 
 This class is for the end button to stop the game 
***/
public class Halt extends Thread{
    WordRecord[] words;
    
    public Halt(WordRecord[] words)
    {
        this.words = words;
    }
    /*** run methon for reseting the scores and stopping the game ***/
    public void run()
    {       WordApp.score.resetScore();
            WordApp.caught.setText("Caught: " + WordApp.score.getCaught() + "    ");
	    WordApp.missed.setText("Missed:" + WordApp.score.getMissed()+ "    ");
	    WordApp.scr.setText("Score:" + WordApp.score.getScore()+ "    "); 
            
            
            for(int i=0;i<words.length;i++)
            {
               words[i].resetWord(); 
            }
            Threadrop.drop=false;
    }
    
    
    
}
