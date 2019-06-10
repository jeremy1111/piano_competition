public class JudgePanel
   {
   /**Instance variables*/
   private String judgeNames; // names of judges
   private String judgeCountries; // country of origin of judges
   private boolean passCandidate; // whether judges pass a candidate
   /**Constructor*/
   /** This constructor assumes you know all three instance variables,
    * ie who they are, where they come from and if they pass a candidate
    */
   public JudgePanel(String someNames, String someCountries, boolean aVerdict)
   {
   this.judgeNames = someNames;
   this.judgeCountries = someCountries;
   this.passCandidate = aVerdict;
   }
   /** This constructor assumes you only know the judges' names, but not
    * their country of origin or their decision
    */
   public JudgePanel(String someNames)
   {
   this.judgeNames = someNames;
   this.judgeCountries = null; // unknown
   this.passCandidate = false; // assume panel fails candidate by default
   }
   /**Methods*/
   /** Setter for the judges' names */
   public void setNames(String someNames)
   {
      this.judgeNames = someNames;
   }
   /** Setter for the judges' countries of origin */
   public void setCountries(String someCountries)
   {
      this.judgeCountries = someCountries;
   }
   /** Getter for judges' names */
   public String getNames()
   {
      return this.judgeNames;
   }
   /** Getter for judges' countries of origin */
   public String getCountries()
   {
      return this.judgeCountries;
   }
   /** Setter for panel's decision */
   public void setVerdict(boolean aVerdict)
   {
      this.passCandidate = aVerdict;
   }
   /** Getter for panel's decision */
   public boolean getVerdict()
   {
      return this.passCandidate;
   }
   /** Returns as a string the judges' names and their 
    * countries of origin. If the latter is unknown, it will print
    * 'unknown countries' */
   public String toString()
   {
   String tempCountries;
   if (this.judgeCountries == null)
   {
      tempCountries = "unknown countries";
   }
   else
   {
      tempCountries = this.judgeCountries;
   }
   return this.judgeNames + " from " + tempCountries ;
   }
}
      
