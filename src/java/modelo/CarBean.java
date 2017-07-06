/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GustavoSantos
 */
public class CarBean {

    private List<Car> cars;

    public void CarListController() {
        cars = new ArrayList<Car>();
        cars.add(new Car("myModel", 2005, "ManufacturerX", "blue"));

    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


}
