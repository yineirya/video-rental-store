public class VideoStore {
  public Customer[] customers; 
  public Video[] videos;
  public Rental[] rentals;
  public int customerCount;
  public int videoCount;
  public int rentalCount;

  public VideoStore(){
      customers = new Customer[200];
      videos = new Video[200]; 
      rentals = new Rental[200];
      customerCount = 0;
      videoCount = 0;
      rentalCount = 0;
    }
    

  public void addCustomer(Customer customer){
    customers[customerCount++] = customer;
  }

  public void addVideo(Video video){
    videos[videoCount++] = video;
  }

  public void rentVideo(long phoneNumber, long barcode){
    Customer customer = findCustomer(phoneNumber);
    Video video = findVideo(barcode);
    if (customer != null && video != null) {
      Rental rental = findRental(customer);
      if (rental == null) {
        rental = new Rental(customer);
        rentals[rentalCount++] = rental;
      }
      rental.addVideo(video);
      System.out.println("You have rented a Video");
    } else {
        System.out.println("Invalid customer or video.");
    }
  }

  public void returnVideo(long phoneNumber, long barcode){
    Customer customer = findCustomer(phoneNumber);
    if (customer != null){
      Rental rental = findRental(customer);
      if (rental != null){
        rental.removeVideo(barcode);
        System.out.println("Video returned");
      } 
      else{
        System.out.println("No rentals found for this customer.");
      }
    } else{
        System.out.println("Customer not found.");
    }
  }

  public void displayRentersByTitle(String videoName){
    for (int i = 0; i < rentalCount; i++){
      Rental rental = rentals[i];
      Video[] rentalVideos = rental.getVideos();
        for (int j = 0; j < rental.getVideoCount(); j++){
          if (rentalVideos[j].getVideo().equalsIgnoreCase(videoName)){
            rental.display();
            break;
        }
      }
    }
  }


  public Customer findCustomer(long phoneNumber){
    for (int i = 0; i < customerCount; i++){
      if (customer[i].getPhoneNumber() == phoneNumber){
        return customer[i];
      }
    }
    return null;
  }

  public Video findVideo(long barcode){
    for (int i = 0; i < videoCount; i++){
      if (videos[i].getBarcode() == barcode){
        return videos[i];
      }
    }
    return null;
  }
  public Rental findRental(Customer customer){
    for (int i = 0; i < rentalCount; i++) {
      if (rentals[i].customer.equals(customer)){
        return rentals[i];
      }
    }
    return null;
  }
}

