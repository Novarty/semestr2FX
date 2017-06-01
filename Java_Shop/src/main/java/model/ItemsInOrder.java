package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 26.04.2017.
 */
@Entity
@Table(name = "itemsInOrder")
public class ItemsInOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @OneToOne(optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @OneToOne(optional = false)
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    @ManyToMany(cascade =
            {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "items_in_order",
            joinColumns = {
                    @JoinColumn(
                            name = "itemsInOrder_id",
                            referencedColumnName = "id"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "order_id",
                            referencedColumnName = "id"
                    )
            }
    )
    private List<Order> orders = new ArrayList<>();

    @Column(name = "amount_in_order")
    private Integer amount;

    public ItemsInOrder() {
    }

    public ItemsInOrder(Item item, Stock stock) {
        this.item = item;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
