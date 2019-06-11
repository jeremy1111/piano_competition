public class PianoCompetition
{
   /**Instance variables*/
   private JudgePanel judgePanel; // a piano competition has-a judge panel
   private String musicPiece; // and a piece of music performed
   
   /**Constructor */
   public PianoCompetition(JudgePanel aJudgePanel, String aMusicPiece)
   {
      this.judgePanel = aJudgePanel;
      this.musicPiece = aMusicPiece;
   }
   /**Methods*/
   /** Sets the judges' names by invoking component's method
    * if judgePanel object exists. If it doesn't, it 
    * creates a new judgePanel object and provides the names 
    */
   public void setJudgeNames(String someNames)
   {
      if (this.judgePanel == null)
      {
         this.judgePanel = new JudgePanel(someNames, null, false);
      }
      else
      {
         this.judgePanel.setNames(someNames);
      }
   }
   /** Getter for judge's names if judgePanel object exists. 
    * If it doesn't, it returns the string 'Unknown' 
    */
   public String getJudgeNames()
   {
      if (this.judgePanel == null || this.judgePanel.getCountries() == null)
      {
         return "Unknown";
      }
      else
      {
         return this.judgePanel.getNames();
      }
   }
   /** Sets the judges' countries by invoking component's method
    * if judgePanel object exists. If it doesn't, it 
    * creates a new judgePanel object and provides the countries 
    */
   public void setJudgeCountries(String someCountries)
   {
      if (this.judgePanel == null)
      {
         this.judgePanel = new JudgePanel(null, someCountries, false);
      }
      else
      {
         this.judgePanel.setCountries(someCountries);
      }
   }
   /** Getter for judge's countries if judgePanel object exists. 
    * If it doesn't, it returns the string 'Unknown' 
    */
   public String getJudgeCountries()
   {
      if (this.judgePanel == null || this.judgePanel.getCountries() == null)
      {
         return "Unknown";
      }
      else
      {
         return this.judgePanel.getCountries();
      }
   }
   /** Sets the name of the music piece */
   public void setMusicPiece(String aMusicPiece)
   {
      this.musicPiece = aMusicPiece;
   }
   /** Gets the name of the music piece */
   public String getMusicPiece()
   {
      return this.musicPiece;
   }
   /** Checks whether panel passes or fails candidate.
    * Panel asks for encore if candidate passes, and eliminates
    * him/her if he/she fails
    */
   public String findOutVerdict()
   {
      String panelReaction;
      if (this.judgePanel.getVerdict() == true)
      {
         panelReaction = "they ask for encore";  
      }
      else
      {
         panelReaction = "they eliminate the candidate";
      }
      return panelReaction;
   }
   /** Returns string describing object, content will depend
    * on judge panel's decision */
   public String toString()
   {
      return "The recital of " + this.musicPiece + " is judged by " +
      this.judgePanel.toString() + " and " + this.findOutVerdict();
   }
}
