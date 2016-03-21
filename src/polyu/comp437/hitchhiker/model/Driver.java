/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package polyu.comp437.hitchhiker.model;
import java.sql.Date;

// line 10 "../../../../hitchhikers_umple.ump"
public class Driver
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Driver Attributes
  private String username;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private char gender;
  private String address;
  private String licenseID;
  private String password;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Driver(String aUsername, String aFirstName, String aLastName, Date aDateOfBirth, char aGender, String aAddress, String aLicenseID, String aPassword)
  {
    username = aUsername;
    firstName = aFirstName;
    lastName = aLastName;
    dateOfBirth = aDateOfBirth;
    gender = aGender;
    address = aAddress;
    licenseID = aLicenseID;
    password = aPassword;
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

  public boolean setLicenseID(String aLicenseID)
  {
    boolean wasSet = false;
    licenseID = aLicenseID;
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

  public String getUsername()
  {
    return username;
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

  public String getLicenseID()
  {
    return licenseID;
  }

  public String getPassword()
  {
    return password;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "username" + ":" + getUsername()+ "," +
            "firstName" + ":" + getFirstName()+ "," +
            "lastName" + ":" + getLastName()+ "," +
            "gender" + ":" + getGender()+ "," +
            "address" + ":" + getAddress()+ "," +
            "licenseID" + ":" + getLicenseID()+ "," +
            "password" + ":" + getPassword()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dateOfBirth" + "=" + (getDateOfBirth() != null ? !getDateOfBirth().equals(this)  ? getDateOfBirth().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}