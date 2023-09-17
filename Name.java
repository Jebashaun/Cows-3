
public class Name {
  
  String firstName;
  String middleName;
  String lastName;

  public Name(String firstName, String middleName, String lastName){
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }
  
  public String getFirstName(){
      return firstName;
  }
  
  public String getMiddleName(){
      return middleName;
  }
  
  public String getLastName(){
      return lastName;
  }
  
  public String toString(){
      return firstName + " " + middleName + " " + lastName;
  }
  
  public boolean equals(Name otherName){
      return (firstName == otherName.getFirstName()) && (middleName == otherName.getMiddleName()) && (lastName == otherName.getLastName());
  }
  
  public int compareTo(Name otherName){
      if (equals(otherName)){
        return 0;
      }
        int lastNameComparison = this.lastName.compareTo(otherName.lastName);

        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        int firstNameComparison = this.firstName.compareTo(otherName.firstName);

        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

    return this.middleName.compareTo(otherName.middleName);
  }

}
