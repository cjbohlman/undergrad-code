// CSc 127B Section 3 Part I Fall 2016

public class Exceptions {

    public static void main (String [] args) {

       StringBuffer source = new StringBuffer("Exceptions!");

       String[] substrings = nCharSubstrings(source,3);

       System.out.printf("The three-consecutive-character substrings of"
                       + " \"%s\" are:\n",source);

       for (int i = 0; i < substrings.length; i++) {
           System.out.println(substrings[i]);
       }

    } // main


    public static String[] nCharSubstrings (StringBuffer source, int n)
    {
        String[] substrings = new String[source.length()-n+1];

        for (int i = 0; i <= source.length()-n; i++) {
            substrings[i] = source.substring(i,i+n);
        }

        return substrings;
    } // nCharSubstrings

} // Exceptions
