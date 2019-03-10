package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void TractorConstructor() {
        // Given
        Tractor tractor = Tractor.createTractor();
        // Then
        Assert.assertNotNull(tractor);
    }

    @Test
    public void makeNoiseTest() {
        // Given
        Tractor tractor = Tractor.createTractor();
        String expected = "operating tractor";
        // When
        String actual = tractor.makeNoise();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest() {
        // Given
        Tractor tractor = Tractor.createTractor();
        String expected = "riding tractor";
        // When
        String actual = tractor.ride(tractor);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest() {
        // Given
        Tractor tractor = new Tractor();
        Crop tomatoCrop = TomatoPlant.createTomatoPlant();
        // When
        Boolean actual = tractor.harvest(tomatoCrop);
        // Then
        Assert.assertTrue(actual);
    }
}
