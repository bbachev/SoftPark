package parkingSystem;


import org.junit.Before;
import org.junit.Test;

public class SoftParkTest {
    private SoftPark park;
    private Car car;
    @Before
    public void setUp(){
        this.park = new SoftPark();
        this.car = new Car("make","E2639MK");
    }
  @Test (expected = IllegalArgumentException.class)
    public  void testParkCarShouldThrowWhenParkingSportIsNotContained(){

      this.park.parkCar("H1",null);
  }
  @Test
    public void testParkCarShouldAddNewCar(){

        this.park.parkCar("A1",this.car);

  }
  @Test (expected = IllegalArgumentException.class)
  public void testParkCarShouldThrowWhenPakSpotIsNotNull(){
        int b =0;
        this.park.parkCar("A1",this.car);
        this.park.parkCar("A1",this.car);
  }

  @Test (expected = IllegalArgumentException.class)
    public void testRemoveCarShouldThrowWhenParkSpotIsNotPresented(){
        this.park.removeCar("C10",this.car);

  }
  @Test (expected = IllegalArgumentException.class)
    public void testRemoveCarShouldThrowWhenCarIsNull(){
        this.park.removeCar("A1",this.car);
  }
    @Test (expected = IllegalStateException.class)
    public void testParkCarShouldThrowWhenCarIsAlreadyParked(){
        this.park.parkCar("A1",this.car);
        this.park.parkCar("B1",this.car);

    }
}