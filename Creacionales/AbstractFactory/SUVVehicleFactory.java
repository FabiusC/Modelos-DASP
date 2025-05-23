// File Name: SUVVehicleFactory.java

public class SUVVehicleFactory extends VehicleFactory {

  public LuxurySUV getLuxury() {
    return new LuxurySUV("Luxury-SUV");
  }

  public NonLuxurySUV getNonLuxury() {
    return new NonLuxurySUV("Non-Luxury-SUV");
  }
} // End of class
