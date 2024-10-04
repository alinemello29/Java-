public class Newsfeed {
    String[] trendingArticles;
    int[] views;
    double[] ratings;
    
    public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
      trendingArticles = initialArticles;
      views = initialViews;
      ratings = initialRatings;
    }
    
    public String getTopArticle(){
      return trendingArticles[0];
    }
    
    public void viewArticle(int articleNumber){
      views[articleNumber] = views[articleNumber] + 1;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }
    
    public void changeRating(int articleNumber, double newRating){
      if (newRating > 5 || newRating < 0) {
        System.out.println("The rating must be between 0 and 5 stars!");
      } else {
        ratings[articleNumber] = newRating;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
      }
    }