package ro.uvt;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Order> nume_mancare;

    public Order( List<Order> nume_mancare) {
        this.nume_mancare=nume_mancare;
    }

    public Order() {

    }


    public List<Order> getNume_mancare() {
        return nume_mancare;
    }

    public void setNume_mancare(List<Order> nume_mancare) {
        this.nume_mancare = nume_mancare;
    }

}
