package service.impl;

import model.ItemsInOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemInOrderRepository;
import service.OrderService;

import java.util.List;

/**
 * Created by admin on 09.05.2017.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    ItemInOrderRepository itemInOrderRepository;

    @Override
    public void save() {
        ItemsInOrder inOrder = new ItemsInOrder();
        itemInOrderRepository.save(inOrder);
    }

    @Override
    public List<ItemsInOrder> findAll() {
        return itemInOrderRepository.findAll();
    }

//    @Override
//    public List<Item> getAll() {
//        List<Item> list = itemInOrderRepository.getAll();
//        return list;
//    }
}
