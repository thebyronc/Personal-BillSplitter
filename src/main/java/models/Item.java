package models;

public class Item {
    private String itemName;
    private double cost;
    private int receiptId;
    private int userId;
    private int id;

    public Item(String itemName, double cost) {
        this.itemName = itemName;
        this.cost = cost;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName() {
        return this.itemName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return this.cost;
    }

    public void setReceiptId(int id) {
        this.receiptId = id;
    }
    public int getReceiptId() {
        return this.receiptId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }
    public int getUserId() {
        return this.userId;
    }

    public int getId() {
        return this.id;
    }
}
