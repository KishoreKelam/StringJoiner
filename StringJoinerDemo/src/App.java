import java.util.StringJoiner;

public class App {
    public static void main(String[] args) throws Exception {
        // create a stringjoiner to delemit with ,

        StringJoiner names = new StringJoiner(",");
        // now lets add values to our newly created object
        names.add("Kishore");
        names.add("Kumar");
        names.add("Kelam");
        System.out.println(names);

        // output would be Kishore,Kumar,Kelam

        // with prefix and suffix
        StringJoiner prefixSuffixNames = new StringJoiner(",", "[","]");
        prefixSuffixNames.add("Kishore");
        prefixSuffixNames.add("Kumar");
        prefixSuffixNames.add("Kelam");
        System.out.println(prefixSuffixNames);

        // output would be [Kishore,Kumar,Kelam]


    }
}
