public class Video{
  long barcode;
  String video;
  
  public Video(long barcode, String video){
    this.barcode = barcode;
    this.video = video;
  }
  public void printVideo(){
    System.out.println("Video: " +video+ "\n, Barcode: " + barcode);
  }
  public long getBarcode(){ 
    return barcode; 
  }
  public String getVideo(){ 
    return video; 
  }
}