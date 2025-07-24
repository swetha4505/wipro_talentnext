package mini_project2;
import java.util.*;
public class VideoStore {
    private ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);
        if (video != null && !video.getCheckout()) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found or already checked out.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);
        if (video != null && video.getCheckout()) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found or not checked out.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
        for (Video video : store) {
            System.out.println(video.getName() + "\t|\t" + video.getCheckout() + "\t\t|\t" + video.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }

    private Video findVideo(String name) {
        for (Video video : store) {
            if (video.getName().equalsIgnoreCase(name)) {
                return video;
            }
        }
        return null;
    }
}
