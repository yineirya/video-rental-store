public class Customer{
  long phoneNumber;
  String firstName;
  String lastName;

  public Customer(long phoneNumber, String firstName, String lastName){
    this.phoneNumber = phoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public void printCustomer(){
    System.out.println("Customer: " +"\nName: "+ firstName+ " " +lastName+ ", \nPhone Number: " + phoneNumber);
  }
  public long getPhoneNumber(){
    return phoneNumber; 
  }
  public String getFirstName(){ 
    return firstName; 
  }
  public String getLastName(){ 
    return lastName; 
  }
}
  