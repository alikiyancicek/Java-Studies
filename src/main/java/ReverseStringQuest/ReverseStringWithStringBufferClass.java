package YoutubeQuestions;

public class ReverseStringWithStringBufferClass {

    public static void main(String[] args) {

        // String buffer is mutable and it has reverse function
        String s = "Selenium";
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}
