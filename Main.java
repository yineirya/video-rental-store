import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    VideoStore videoStore = new VideoStore();
    boolean running = true;
    while (running) {
      System.out.println("\nPaul's Video Store\n");
      System.out.println("C: Add Customer");
      System.out.println("V: Add Video");
      System.out.println("R: Rent Video");
      System.out.println("X: Return Video");
      System.out.println("D: Display Renters by Video Title");
      System.out.println("Q: Exit");
      System.out.print("\nChoose an option: ");
      String choice = scanner.nextLine();
      switch (choice){
        case "C":
            addCustomer(scanner, videoStore);
            break;
        case "V":
            addVideo(scanner, videoStore);
            break;
        case "R":
            rentVideo(scanner, videoStore);
            break;
        case "X":
            returnVideo(scanner, videoStore);
            break;
        case "D":
            displayRenters(scanner, videoStore);
            break;
        case "Q":
            running = false;
            break;
        default: 
            System.out.println("Invalid choice");
            break;
      }
    }
        scanner.close();
  }

  public static void addCustomer(Scanner scanner, VideoStore videoStore){
    System.out.print("Enter customer's phone number: ");
    long phoneNumber = scanner.nextLong();
    scanner.nextLine();

    System.out.print("Enter customer's first name: ");
    String firstName = scanner.next();

    System.out.print("Enter customer's last name: ");
    String lastName = scanner.next();
    scanner.nextLine();
    
    Customer customer = new Customer(phoneNumber, firstName, lastName);
    videoStore.addCustomer(customer);
    System.out.println("Customer added");
  }
  public static void addVideo(Scanner scanner, VideoStore videoStore){
    System.out.print("Enter video name: ");
    String videoName = scanner.next();
    scanner.nextLine();
    System.out.print("Enter video barcode (12 digits): ");
    long barcode = scanner.nextLong();
    scanner.nextLine();
  
    if(String.valueOf(barcode).length() == 12){
      Video vids = new Video(barcode, videoName);
      videoStore.addVideo(vids);
      System.out.println("Video added");
    }
    else{
      System.out.println("Invalid barcode. It must be 12 digits");
    }
  }

  public static void rentVideo(Scanner scanner, VideoStore videoStore){
    System.out.print("Enter customer's phone number: ");
    long phoneNumber = scanner.nextLong();
    scanner.nextLine();
    System.out.print("Enter video barcode: ");
    long barcode = scanner.nextLong();
    scanner.nextLine();
    videoStore.rentVideo(phoneNumber, barcode);
  }

  public static void returnVideo(Scanner scanner, VideoStore videoStore){
    System.out.print("Enter customer's phone number: ");
    long phoneNumber = scanner.nextLong();
    scanner.nextLine();
    System.out.print("Enter video barcode: ");
    long barcode = scanner.nextLong();
    scanner.nextLine();
    videoStore.returnVideo(phoneNumber, barcode);
  }

  public static void displayRenters(Scanner scanner, VideoStore videoStore){
    System.out.print("Enter video title: ");
    String videoName = scanner.next();
    scanner.nextLine();
    System.out.println("Renters of '" + videoName + "':");
    videoStore.displayRentersByTitle(videoName);
  }
}