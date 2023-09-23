// import java.util.jar.Attributes.Name;

public class Person {
  Name theName;
  MyDate birthDay;
  int socialSecurityNumber;

  public Person(Name name2, MyDate birthDay, int socialSecurityNumber){
    theName = name2;
    this.birthDay = birthDay;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public Name getName(){
    return theName;
  }

  public MyDate getBirthDay(){
    return birthDay;
  }


  public int getSocSecNumber(){
    return socialSecurityNumber;
  }

  public String toString(){

    return theName + " " + birthDay + " " + socialSecurityNumber; 
  }

  public boolean equals(Person otherPerson){
    return socialSecurityNumber == otherPerson.getSocSecNumber();
  }

  public int compareTo(Person otherPerson){
    return theName.compareTo(otherPerson.getName());
  }
}
