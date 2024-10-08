import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Newsfeed sampleFeed = new Newsfeed();
        
    System.out.println("The top topic is " + sampleFeed.getFirstTopic());
        
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
        
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
  }
}