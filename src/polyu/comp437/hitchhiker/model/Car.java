/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package polyu.comp437.hitchhiker.model;

// line 3 "../../../../hitchhikers_umple.ump"
public class Car
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Car Attributes
  private int id;
  private String make;
  private int year;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Car(int aId, String aMake, int aYear)
  {
    id = aId;
    make = aMake;
    year = aYear;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setMake(String aMake)
  {
    boolean wasSet = false;
    make = aMake;
    wasSet = true;
    return wasSet;
  }

  public boolean setYear(int aYear)
  {
    boolean wasSet = false;
    year = aYear;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public String getMake()
  {
    return make;
  }

  public int getYear()
  {
    return year;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "make" + ":" + getMake()+ "," +
            "year" + ":" + getYear()+ "]"
     + outputString;
  }
}