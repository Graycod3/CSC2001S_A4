
import java.util.logging.Level;
import java.util.logging.Logger;
/***
 This class is for droping the words down the interface.
***/

public class Threadrop extends Thread{
    
    static boolean drop; WordRecord words;
    public Threadrop(WordRecord words)
    {
       this.words=words;
       drop=true;
    }
    /*** Overridden methon for thread to drop the words***/ 
    public void run()
    { 
        
      while(drop!=false){
        words.drop(20*words.getSpeed()/300);
          try {
              Thread.sleep(1200);
          } catch (InterruptedException ex) {
              Logger.getLogger(Threadrop.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
    
}
