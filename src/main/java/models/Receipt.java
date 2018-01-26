package models;

import java.util.ArrayList;

/**
 * Created by Guest on 1/24/18.
 */
public class Receipt {
    private String receiptName;
    private int total;
    private Boolean cleared;
    private int id;

    public Receipt (String receiptName) {
        this.receiptName = receiptName;
        this.cleared = false;
    }

    public int getId(){
        return this.id;
    }

}
