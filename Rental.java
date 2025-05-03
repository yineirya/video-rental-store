public class Rental{
  Customer customer;
  int MAX;
  Video[] vids;
  int currentSize;

  public Rental(Customer customer){
    this.customer = customer;
    this.MAX = 3;
    this.vids = new Video[MAX]; 
    this.currentSize = 0;
  }
  public int getVideoCount(){
    return currentSize;
  }
  public Video[] getVideos(){
   return vids;
  }
  public void addVideo(Video vid){
    if(currentSize < MAX){
      vids[currentSize] = vid;
      currentSize++;
    } 
    else {
      System.out.println("Maximum rental amount met");
    }
  }

  public void removeVideo(long barcode){
    boolean found = false;
    for(int i = 0; i < currentSize; i++){
      if(vids[i].getBarcode() == barcode){
        for(int j = i; j < currentSize - 1; j++){
          vids[j] = vids[j + 1];
        }
        vids[currentSize - 1] = null;
        currentSize--;
        found = true;
        break;
      }
    }
    if(!found){
      System.out.println("Video not found");
    }
  }
    
  public boolean containsVideo(long barcode){
    for (int i = 0; i < currentSize; i++) {
      if (vids[i].getBarcode() == barcode){
        return true;
      }
    }
    return false;
  } 
  public void display(){
    customer.printCustomer();
    for (int i = 0; i < currentSize; i++){
      vids[i].printVideo();
    }
  }

}
