/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package polyu.comp437.hitchhiker.model;
import java.sql.Date;

// line 33 "../../../../hitchhikers_umple.ump"
public class Hitchhiker
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hitchhiker Attributes
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private char gender;
  private String address;

  //Hitchhiker Associations
  private Trip trip;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hitchhiker(String aUsername, String aPassword, String aFirstName, String aLastName, Date aDateOfBirth, char aGender, String aAddress, Trip aTrip)
  {
    username = aUsername;
    password = aPassword;
    firstName = aFirstName;
    lastName = aLastName;
    dateOfBirth = aDateOfBirth;
    gender = aGender;
    address = aAddress;
    if (!setTrip(aTrip))
    {
      throw new RuntimeException("Unable to create Hitchhiker due to aTrip");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstName(String aFirstName)
  {
    boolean wasSet = false;
    firstName = aFirstName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastName(String aLastName)
  {
    boolean wasSet = false;
    lastName = aLastName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDateOfBirth(Date aDateOfBirth)
  {
    boolean wasSet = false;
    dateOfBirth = aDateOfBirth;
    wasSet = true;
    return wasSet;
  }

  public boolean setGender(char aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public Date getDateOfBirth()
  {
    return dateOfBirth;
  }

  public char getGender()
  {
    return gender;
  }

  public String getAddress()
  {
    return address;
  }

  public Trip getTrip()
  {
    return trip;
  }

  public boolean setTrip(Trip aNewTrip)
  {
    boolean wasSet = false;
    if (aNewTrip != null)
    {
      trip = aNewTrip;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    trip = null;
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "username" + ":" + getUsername()+ "," +
            "password" + ":" + getPassword()+ "," +
            "firstName" + ":" + getFirstName()+ "," +
            "lastName" + ":" + getLastName()+ "," +
            "gender" + ":" + getGender()+ "," +
            "address" + ":" + getAddress()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dateOfBirth" + "=" + (getDateOfBirth() != null ? !getDateOfBirth().equals(this)  ? getDateOfBirth().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "trip = "+(getTrip()!=null?Integer.toHexString(System.identityHashCode(getTrip())):"null")
     + outputString;
  }
}