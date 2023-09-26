package dz2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testCarIsVehicle(){
        Car car = new Car("testCompany", "testModel", 2021);

        assertThat((Vehicle) car).isInstanceOf(Vehicle.class);
    }
    @Test
    public void testCarHasFourWheels(){
        Car car = new Car("testCompany", "testModel", 2021);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void testSpeedInTestDrive(){
        Car car = new Car("testCompany", "testModel", 2021);
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void testSpeedInPark(){
        Car car = new Car("testCompany", "testModel", 2021);
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
