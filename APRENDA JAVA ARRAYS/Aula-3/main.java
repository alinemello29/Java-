import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();
        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));
    }
}