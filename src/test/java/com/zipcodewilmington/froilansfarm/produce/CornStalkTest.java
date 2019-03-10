package com.zipcodewilmington.froilansfarm.produce;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CornStalkTest {

    CornStalk cornStalk;

    @Test
    public void yield() {
        //Given
        this.cornStalk = new CornStalk();
        EarCorn earCorn;

        //When
        earCorn = cornStalk.yield();

        //Then
        Assert.assertNotNull(earCorn);
    }

    @Test
    public void createCornStalksTest(){
        //Given
        ArrayList<CornStalk> cornStalkArrayList;
        cornStalkArrayList = new ArrayList<CornStalk>(CornStalk.createCornStalks(1));

        //When
        Integer actualSize = cornStalkArrayList.size();

        //Then
        Integer expectedSize = cornStalkArrayList.size();
        Assert.assertEquals(expectedSize, actualSize);
    }
}