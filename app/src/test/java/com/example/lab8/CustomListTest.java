package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * put a city into the list
     * check if the city is in the list
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.hasCity(city),true);
    }

    /**
     * put a city into the list
     * get the count of the list
     * delete the city from the list
     * get the count of the list
     * check if the count of the list is one less than the initial count
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }

    @Test
    public void getCountTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.getCount(),1);
    }

}
