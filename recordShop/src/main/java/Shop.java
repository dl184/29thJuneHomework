import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        ArrayList<ISell> stock = new ArrayList<ISell>();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }


    public double totalProfit() {

    }

    public double markUp() {

    }
}






