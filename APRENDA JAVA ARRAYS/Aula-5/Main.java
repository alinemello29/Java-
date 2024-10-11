import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Newsfeed sampleFeed = new Newsfeed();
      
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
      
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}