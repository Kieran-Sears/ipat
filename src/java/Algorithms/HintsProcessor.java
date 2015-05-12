package Algorithms;
import Src.Kernel;
import Src.Profile;
import Src.SolutionAttributes;
import Src.Utils;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author kieran
 */
public class HintsProcessor {

    /**
     * method that interprets the hints provided by the user and makes appropriate application-specific changes ot the profile variables
     * @param thisProfile
     * @return changed profile
     */
    public Profile InterpretHintInProfile( Profile toChange)
  {
    Profile thisProfile =  toChange;
    SolutionAttributes currentVariable = null;
    Hashtable profileLevelVars = thisProfile.getSolutionAttributes();
    Hashtable kernels =thisProfile.getKernels();
    String currentVarName;
    
    ArrayList variablesAffected = new ArrayList();
    
    //free back ground colour affects the page bg RGB values
    //relatively simple becuase these are profile level variables
      if (thisProfile.isFreezeBGColour())
        {
          variablesAffected.clear();
          variablesAffected.add("Page_bg_Red");
          variablesAffected.add("Page_bg_Blue");
            variablesAffected.add("Page_bg_Green");          
          
            for (Iterator iterator = variablesAffected.iterator(); iterator.hasNext();)
              {
                 currentVarName = (String) iterator.next();
                //get the variable from the local copy in the hashtable
                currentVariable = (SolutionAttributes) profileLevelVars.get(currentVarName);
                //set the rate of evoltion to zero so mutation has no effect
                currentVariable.setRateOfEvolution(0.0);
                //remove thee old variable with this name from thisProfile
                thisProfile.removeVariable(currentVarName);
                //write back in the changed variable
                thisProfile.addVariable(currentVariable);
              }
    //next hint freezes the colour and size of the foreground fonts
    //so it need ot do it in each kernel that represents a paragraph style
      if(thisProfile.isFreezeFGFonts())
        {
          variablesAffected.clear();
          variablesAffected.add("h1");
          variablesAffected.add("h2");
          variablesAffected.add("p");   
          
          
        //get a list of all the kernels present
        Enumeration enuKer = kernels.elements();
        // loop through each kernel in turn,
        while (enuKer.hasMoreElements()) 
        {
            //get the next kernel
            Kernel kernel = (Kernel) enuKer.nextElement();
            //see if it is one of the paragraph types
            if ((kernel.getName().equalsIgnoreCase("h1"))||(kernel.getName().equalsIgnoreCase("h2"))||(kernel.getName().equalsIgnoreCase("p")))
              {
                //get all of its variables
                Hashtable vars = kernel.getVariables();
                Enumeration eVar = vars.keys();
                //System.out.println(".....Kernel " + kernel.getName() + " has " + vars.size() + " elements");

                // and then set the value each of the variables within kernel in turn
                while (eVar.hasMoreElements()) 
                    {
                        currentVarName = eVar.nextElement().toString();
                        currentVariable = (SolutionAttributes) vars.get(currentVarName);
                      //set the rate of evoltion to zero so mutation has no effect
                        currentVariable.setRateOfEvolution(0.0);
                        vars.put(currentVarName, currentVariable);
                    }    
            
                //finally need to write this new kernel back to the profile in the  nextGen arraylist
                //delete the old one the add the new one
                thisProfile.removeKernel(kernel.getName());
                thisProfile.addKernel(kernel);
             } //end of code dealing with paragrpah kerel
        }//end of loop over all kernels
        }//end of code to freeze al aspects of foreground fonts
            
      
           
            
            
        }// end of loop mutating individual kernels
     
      
      
      // all hints have been dealt with - we can exit
      return thisProfile;
  }
}
