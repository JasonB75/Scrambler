import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{
    /********************** Part (a) *********************/

    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains
     *    only uppercase letters.
     *  Postcondition: the string returned was created from word
     *      as follows:
     *   - the word was scrambled, beginning at the first letter
     *      and continuing from left to right
     *   - two consecutive letters consisting of "A" followed by
     *        a letter that was not "A" were swapped
     *   - letters were swapped at most once
     */
   
        public static String scrambleWord(String word)
    {
        String[] wordSplit = word.split("");
        String out = "";
        for (int i = 0; i<= wordSplit.length-2; i++) 
        { int j = i+1;
          
            if (wordSplit[i].equals("A") )
                {
                if (wordSplit[j].equals("A") == false)
                {
                 wordSplit[i] = wordSplit[j];
                 wordSplit[j] = "A";
                 i++;
                 
                }
            }
        }
        
        for (int i = 0; i<= wordSplit.length-1; i++)
        {
         out = out + wordSplit[i];
   
        }

        return out;
    }

        
        

    
    
       
    /********************** Test *********************/
    public static void main(String[] args)
    {
        System.out.println("\nTesting Part (a):\n");

        String[] words = {"TAN", "ABRACADABRA", "WHOA",
                "AARDVARK", "EGGS", "A", ""};
        for (String word : words)
            System.out.println(word + " becomes " + scrambleWord(word));
    }
    
    
}
