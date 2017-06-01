package controllers;

import model.Item;
import model.ItemsInOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;
import service.impl.ItemServiceImpl;

import java.util.List;

/**
 * Created by admin on 01.06.2017.
 */
@RestController
public class RestFXController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ItemServiceImpl itemService;

    @RequestMapping(value= "/allItems",  method = RequestMethod.GET, produces = "application/json")
    public List<Item> allItems(){
        return itemService.getAllItems();
    }
    @RequestMapping(value= "/allOrders",  method = RequestMethod.GET, produces = "application/json")
    public List<ItemsInOrder> allOrders(){
        return orderService.findAll();
    }
}
