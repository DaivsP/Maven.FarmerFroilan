package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


    @Test
    public void inheritanceTest() {

        Animal chicken = new Chicken();

        Assert.assertTrue(chicken instanceof Animal);

    }

     @Test
    public void implementationTest() {

        Produce chicken = (Produce) (Object) new Chicken();;

        Assert.assertTrue(chicken instanceof Produce);
    }

    //@Test
    public void eat() {
        //Given
        Chicken chicken = new Chicken();
        Edible edible = new Egg();
        Integer expected = 20;
        //When
        chicken.eat(edible);
        Integer actual = chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void makeNoise() {
        //Given
        Chicken chicken = new Chicken();
        String expected = "Cock-A-Doodle-Doo!";

        //When
        String actual=  chicken.makeNoise();
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yield() {
        //Given
        Chicken chicken = new Chicken();


        //When
        Integer expected = 1;
        chicken.yield();
        Integer actualYield = chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actualYield);


    }

    @Test
    public void setEggCount() {

        //Given
        Chicken chicken = new Chicken();


        //When
        chicken.setEggCount(10);
        Integer actual = chicken.getEggCount();

        //Then
        Integer expected = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getEggCount() {
        //Given
        Chicken chicken = new Chicken();
        chicken.yield();
        chicken.yield();
        chicken.yield();
        chicken.yield();
        chicken.yield();
        chicken.yield();
        Integer expected = 6;
        //When
        Integer actual=  chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHasBeenFertilizedTrue() {

        //Given
        Chicken chicken = new Chicken();

        //When
            chicken.setHasBeenFertilized(true);
       boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertTrue(actual);
        System.out.println(actual);

    }

    @Test
    public void getHasBeenFertilizedFalse() {

        //Given
        Chicken chicken = new Chicken();

        //When
        chicken.setHasBeenFertilized(false);
        boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertFalse(actual);
        System.out.println(actual);

    }
    @Test
    public void setHasBeenFertilized() {
        //Given
        Chicken chicken = new Chicken();

        //When
        chicken.setHasBeenFertilized(true);
        boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertTrue(actual);
        System.out.println(actual);

    }
}