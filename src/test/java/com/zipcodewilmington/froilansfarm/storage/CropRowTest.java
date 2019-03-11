package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Test;

public class CropRowTest {
    @Test
    public void cropRowTest(){
        CropRow<TomatoPlant> cropRow = new CropRow(Horse.horsesArrayList(10));
    }
}