package overriding;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

class Vehicle{
	public String getType() {
		return "Vehicle";
	}
}
class Car  extends Vehicle{
	public String getType() {
		return "Car";
	}
}
class Bus extends Vehicle {
	public String getType() {
		return "Bus";
	}
}
public class GenerricsUpperBound {
	public static void main(String[] args) {
		List<Car> cars=new ArrayList<>();
		cars.add(new Car());
		cars.add(new Car());
		
		List<Bus> buses=new ArrayList<>();
		buses.add(new Bus());
		buses.add(new Bus());
		
		List<Vehicle> vehicles=new ArrayList<>();
		
		printVehicleList(buses);
		printVehicleList(cars);
		printVehicleList(vehicles);
		
		print(vehicles);
		//print(buses);	
	}
	
	public static void printVehicleList(List<? extends Vehicle> vehicles) {
		for(Vehicle ve:vehicles) {
			System.out.println(ve.getType());
		}
	}
	
	public static void print(List<? super Car> car) {
		for(Object ve:car) {
			System.out.println( ((Car)ve).getType());
		}
		}
		
	}


