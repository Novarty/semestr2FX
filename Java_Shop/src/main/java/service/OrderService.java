package service;

import model.ItemsInOrder;

import java.util.List;

/**
 * Created by admin on 09.05.2017.
 */
public interface OrderService {
    void save();
    List<ItemsInOrder> findAll();
}
