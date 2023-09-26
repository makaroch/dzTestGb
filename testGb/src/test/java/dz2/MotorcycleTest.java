package dz2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorcycleTest {

    @Test
    public void testCarIsVehicle(){
        Motorcycle motorcycle = new Motorcycle("testCompany", "testModel", 2021);

        assertThat((Vehicle) motorcycle).isInstanceOf(Vehicle.class);
    }
    @Test
    public void testCarHasFourWheels(){
        Motorcycle motorcycle = new Motorcycle("testCompany", "testModel", 2021);

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    public void testSpeedInTestDrive(){
        Motorcycle motorcycle = new Motorcycle("testCompany", "testModel", 2021);
        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    public void testSpeedInPark(){
        Motorcycle motorcycle = new Motorcycle("testCompany", "testModel", 2021);
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
