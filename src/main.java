//import whatever you need


public class Main{
    //function to convert text file to string
    public static String eatFilePoopString(String filepath)throws Exception
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(filepath)));
            return data;
        }


//    Set the above to be a String in Java, so something like String unText = "...";
//
//    From this string, make a HashMap of each unique word and the frequency it appears in the text.
//
//    A word is delimited by a space or punctuation mark(s).
//    The spaces and punctuation marks do NOT appear in the word list.
//    The word list is NOT case sensitive: Lambda / lambda will count as the same word.
//    Words such as co-operation that contain a hyphen are considered one word.
//    A hyphen alone does not separate words. Numbers count as one word, so 23 is a word.
//    Print to the console the top 50 appearing words along with their counts.
//
//    Remember that HashMaps are not sorted nor easily sortable.
//    You could convert the HashMap to an array list and then sort the array list.
//    Alternatively, you can find the most common word, print it, remove it, and repeat the process.
        public static void main(){
            //converts the textfile to a string
           String declarationOfHumanRights = eatFilePoopString("./declaration.text");
            //removes all remaining punctuation and converts all characters to lowercase
            String prettydeclarationOfHumanRights = declarationOfHumanRights.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "").toLowerCase();
            //split string into an arraylist

            //create hashmap that counts word frequencies

            //loop over the arraylist
                // check if word is already a key in hashmap
                    //if it is then increment the value in the hashmap
                    //continue to the next word
                //if it isnt then add the key to the hashmap with a value of one, and continue to the next word
            //loop done


        }
}
