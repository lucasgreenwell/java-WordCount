//import cool collections stuff
import java.util.*;

package wordCount;
public class Main{
    //function to convert text file to string
    public static String eatFilePoopString(String filepath)throws Exception
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(filepath)));
            return data;
        };


//    Set the above to be a String in Java, so something like String unText = "...";
//


        public static void main(){
            //converts the textfile to a string
           String declarationOfHumanRights = eatFilePoopString("./declaration.text");
            //removes all remaining punctuation and converts all characters to lowercase
            String prettydeclarationOfHumanRights = declarationOfHumanRights.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "").toLowerCase();
            //split string into an arraylist
            String [] listOfAllTheWords = prettydeclarationOfHumanRights.split(" +")
            //create hashmap that counts word frequencies
            HashMap<String, Integer> hashMapThatCountsWords = new HashMap<String, Integer>();

            //loop over the arraylist
                // check if word is already a key in hashmap
                    //if it is then increment the value in the hashmap
                    //continue to the next word
                //if it isnt then add the key to the hashmap with a value of one, and continue to the next word
            //loop done


            //create arraylist that will be filled with keys sorted by frequency
            //loop over hashmap
                //for each word loop through the array
                    //until you find the spot for the key
                    //by matching the key in the array against the hashmap's value every time
                //and then continuing on to the next key in the hashmap
            //end of hash loop

            //output first fifty items in the array

            //stretch //create arraylist that will be filled with keys sorted by alphabet
            //            //loop over hashmap
            //                //for each word loop through the array
            //                    //until you find the spot for the key
            //                    //by matching the key in the array against the hashmap's value every time
            //                //and then continuing on to the next key in the hashmap
            //            //end of hash loop
            //

            //output first fifty items in the array
        }
}
