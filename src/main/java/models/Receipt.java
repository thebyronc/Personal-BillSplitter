package models;

import java.util.ArrayList;

public class Receipt {
    private String receiptName;
    private int total;
    private Boolean cleared;
    private int id;

    public Receipt (String receiptName) {
        this.receiptName = receiptName;
        this.cleared = false;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }
    public String getReceiptName() {
        return this.receiptName;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }
    public Boolean getCleared() {
        return cleared;
    }

    public int getId(){
        return this.id;
    }

}
