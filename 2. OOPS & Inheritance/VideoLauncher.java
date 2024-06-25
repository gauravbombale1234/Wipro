/**
 * Video Rental Inventory System
 * 
 * The goal of this project is to design and implement a simple inventory control system 
 * for a small video rental store.
 * 
 * Classes to be implemented:
 * 
 * 1. Video
 *    - Member variables:
 *      String videoName
 *      boolean checkout
 *      int rating
 *    - Member functions:
 *      String getName();
 *      void doCheckout();
 *      void doReturn();
 *      void receiveRating(int rating);
 *      int getRating();
 *      boolean getCheckout();
 *    - Constructor:
 *      Video(String name)
 * 
 * 2. VideoStore
 *    - Member variables:
 *      Video[] store;
 *    - Member functions:
 *      void addVideo(String name);
 *      void doCheckout(String name);
 *      void doReturn(String name);
 *      void receiveRating(String name, int rating);
 *      void listInventory();
 * 
 * 3. VideoLauncher
 *    - Contains the main method to test the program
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 class Video {
     private String videoName;
     private boolean checkout;
     private int rating;
 
     public Video(String name) {
         this.videoName = name;
         this.checkout = false;
         this.rating = 0;
     }
 
     public String getName() {
         return videoName;
     }
 
     public void doCheckout() {
         checkout = true;
     }
 
     public void doReturn() {
         checkout = false;
     }
 
     public void receiveRating(int rating) {
         this.rating = rating;
     }
 
     public int getRating() {
         return rating;
     }
 
     public boolean getCheckout() {
         return checkout;
     }
 }
 
 class VideoStore {
     private ArrayList<Video> store;
 
     public VideoStore() {
         store = new ArrayList<Video>();
     }
 
     public void addVideo(String name) {
         Video video = new Video(name);
         store.add(video);
         System.out.println("Video \"" + name + "\" added successfully.");
     }
 
     public void doCheckout(String name) {
         for (Video video : store) {
             if (video.getName().equals(name)) {
                 video.doCheckout();
                 System.out.println("Video \"" + name + "\" checked out successfully.");
                 return;
             }
         }
         System.out.println("Video \"" + name + "\" not found in inventory.");
     }
 
     public void doReturn(String name) {
         for (Video video : store) {
             if (video.getName().equals(name)) {
                 video.doReturn();
                 System.out.println("Video \"" + name + "\" returned successfully.");
                 return;
             }
         }
         System.out.println("Video \"" + name + "\" not found in inventory.");
     }
 
     public void receiveRating(String name, int rating) {
         for (Video video : store) {
             if (video.getName().equals(name)) {
                 video.receiveRating(rating);
                 System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                 return;
             }
         }
         System.out.println("Video \"" + name + "\" not found in inventory.");
     }
 
     public void listInventory() {
         System.out.println("--------------------------------------------------------");
         System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
         System.out.println("--------------------------------------------------------");
         for (Video video : store) {
             System.out.println(video.getName() + "\t\t|\t" + (video.getCheckout() ? "Checked out" : "Available") + "\t|\t" + video.getRating());
         }
         System.out.println("--------------------------------------------------------");
     }
 }
 
 public class VideoLauncher {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         VideoStore store = new VideoStore();
         int choice = 0;
 
         while (choice != 6) {
             System.out.println("MAIN MENU");
             System.out.println("==========");
             System.out.println("1. Add Videos:");
             System.out.println("2. Check Out Video:");
             System.out.println("3. Return Video:");
             System.out.println("4. Receive Rating:");
             System.out.println("5. List Inventory:");
             System.out.println("6. Exit:");
             System.out.print("Enter your choice (1..6): ");
             choice = scanner.nextInt();
             scanner.nextLine();  // consume newline
 
             switch (choice) {
                 case 1:
                     System.out.print("Enter the name of the video you want to add: ");
                     String name = scanner.nextLine();
                     store.addVideo(name);
                     break;
                 case 2:
                     System.out.print("Enter the name of the video you want to check out: ");
                     name = scanner.nextLine();
                     store.doCheckout(name);
                     break;
                 case 3:
                     System.out.print("Enter the name of the video you want to return: ");
                     name = scanner.nextLine();
                     store.doReturn(name);
                     break;
                 case 4:
                     System.out.print("Enter the name of the video you want to rate: ");
                     name = scanner.nextLine();
                     System.out.print("Enter the rating for this video: ");
                     int rating = scanner.nextInt();
                     scanner.nextLine();  // consume newline
                     store.receiveRating(name, rating);
                     break;
                 case 5:
                     store.listInventory();
                     break;
                 case 6:
                     System.out.println("Exiting... Goodbye!");
                     break;
                 default:
                     System.out.println("Invalid choice! Please try again.");
             }
         }
 
         scanner.close();
     }
 }
 