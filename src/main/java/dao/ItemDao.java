package dao;

import models.Item;

import java.util.List;

public interface ItemDao {
    void add(Item item);
    Item findById(int id);
    List<Item> getAll();

    void update(int id, String itemName, double cost, int userId);

    void deleteById(int id);
}
