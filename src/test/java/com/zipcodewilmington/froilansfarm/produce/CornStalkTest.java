package com.zipcodewilmington.froilansfarm.produce;

import org.junit.Assert;
import org.junit.Test;

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
}