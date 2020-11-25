package ro.uvt;

import java.util.List;

public class CreateOrderCmd extends Order{

    public CreateOrderCmd(List<Order> nume_mancare) {
        super(nume_mancare);
    }

    public CreateOrderCmd() {
        super();
    }

    public  Order execute() {
    }
}
