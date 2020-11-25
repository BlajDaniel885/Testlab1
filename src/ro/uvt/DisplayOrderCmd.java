package ro.uvt;

import java.util.List;

public class DisplayOrderCmd{



    public DisplayOrderCmd(Order order) {

    }

    private double calculateTotalCost() {
        double cost = 0.0D;

        for (Order Order : nume_mancare) {
            cost += Order.getPrice();
        }

        return cost;
    }
    public void execute() {
    }
}
