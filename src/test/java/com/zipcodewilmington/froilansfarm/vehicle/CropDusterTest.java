package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.storage.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropDusterTest {
    @Test
    public void CropDusterConstructorTest() {
        // Given
        CropDuster cropDuster = CropDuster.createCropDuster();
        // Then
        Assert.assertNotNull(cropDuster);
    }

    @Test
    public void fertilizeTest() {
        // Given
        CropDuster cropDuster = CropDuster.createCropDuster();
        // When
        CropRow tomatoPlantCrop = new CropRow(new ArrayList());
        Boolean fertilized = cropDuster.fertilize(tomatoPlantCrop);
        // Then
        Assert.assertTrue(fertilized);
    }

    @Test
    public void fly() {
        // Given
        CropDuster cropDuster = CropDuster.createCropDuster();
        String expected = "flying cropduster";
        // When
        String actual = cropDuster.fly();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest() {
        // Given
        CropDuster cropDuster = CropDuster.createCropDuster();
        String expected = "riding cropduster";
        // When
        String actual = cropDuster.ride(cropDuster);
        // Then
        Assert.assertEquals(expected, actual);
    }
}
