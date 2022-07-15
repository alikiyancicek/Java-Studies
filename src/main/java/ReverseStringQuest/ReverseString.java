package YoutubeQuestions;

public class ReverseString {

    public static void main(String[] args) {
        //important note followed
        //s.reverse() there is no reverse function . bcs string is immutable in java.
        String s = "Selenium";

        int len = s.length(); //length is 8

        String rev=""; // to store the reverse string for future
        // looping through minus length of the string . then assigning to index.
        for (int i = len-1; i>=0; i--){
            // get index number from length variable and assign it to char at method.
            // method going to take character according to index number
            // then will  store on the reverse variable
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }

}
