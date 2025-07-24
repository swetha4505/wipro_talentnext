package mini_project2;

public class VideoId {
    private static int idCounter = 0;

    private int videoID;
    private String videoName;
    private boolean checkout;
    private int rating;

    public VideoId(String name) {
        this.videoID = ++idCounter;
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public int getVideoID() {
        return videoID;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
    	System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
        return checkout;


    }
}
