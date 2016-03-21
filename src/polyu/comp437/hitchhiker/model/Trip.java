/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package polyu.comp437.hitchhiker.model;
import java.sql.Date;
import java.sql.Time;

// line 23 "../../../../hitchhikers_umple.ump"
public class Trip
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Trip Attributes
  private Date date;
  private String departureCity;
  private Time startTime;
  private int tripID;

  //Trip Associations
  private Driver driver;
  private Car car;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Trip(Date aDate, String aDepartureCity, Time aStartTime, int aTripID, Driver aDriver, Car aCar)
  {
    date = aDate;
    departureCity = aDepartureCity;
    startTime = aStartTime;
    tripID = aTripID;
    if (!setDriver(aDriver))
    {
      throw new RuntimeException("Unable to create Trip due to aDriver");
    }
    if (!setCar(aCar))
    {
      throw new RuntimeException("Unable to create Trip due to aCar");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(Date aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setDepartureCity(String aDepartureCity)
  {
    boolean wasSet = false;
    departureCity = aDepartureCity;
    wasSet = true;
    return wasSet;
  }

  public boolean setStartTime(Time aStartTime)
  {
    boolean wasSet = false;
    startTime = aStartTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setTripID(int aTripID)
  {
    boolean wasSet = false;
    tripID = aTripID;
    wasSet = true;
    return wasSet;
  }

  public Date getDate()
  {
    return date;
  }

  public String getDepartureCity()
  {
    return departureCity;
  }

  public Time getStartTime()
  {
    return startTime;
  }

  public int getTripID()
  {
    return tripID;
  }

  public Driver getDriver()
  {
    return driver;
  }

  public Car getCar()
  {
    return car;
  }

  public boolean setDriver(Driver aNewDriver)
  {
    boolean wasSet = false;
    if (aNewDriver != null)
    {
      driver = aNewDriver;
      wasSet = true;
    }
    return wasSet;
  }

  public boolean setCar(Car aNewCar)
  {
    boolean wasSet = false;
    if (aNewCar != null)
    {
      car = aNewCar;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    driver = null;
    car = null;
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "departureCity" + ":" + getDepartureCity()+ "," +
            "tripID" + ":" + getTripID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "driver = "+(getDriver()!=null?Integer.toHexString(System.identityHashCode(getDriver())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "car = "+(getCar()!=null?Integer.toHexString(System.identityHashCode(getCar())):"null")
     + outputString;
  }
}