//import whatever you need


public class Main{
    //function to convert text file to string
    public static String eatFilePoopString(String filepath)throws Exception
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(filepath)));
            return data;
        }

        public static void main(){
           String declarationOfHumanRights = eatFilePoopString("./declaration.text")
        }
}
