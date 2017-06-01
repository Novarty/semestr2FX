package model;

import model.enums.ItemStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 26.04.2017.
 */
@Entity
@Table(name = "orders") //The name "order" is a keyword of SQL
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToMany(mappedBy = "orders",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ItemsInOrder> itemsInOrderList = new ArrayList<>();

    @OneToOne(optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ItemStatus getStatus() {
        return status;
    }
    public void setStatus(ItemStatus status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<ItemsInOrder> getItemsInOrderList() {
        return itemsInOrderList;
    }
    public void setItemsInOrderList(List<ItemsInOrder> itemsInOrderList) {
        this.itemsInOrderList = itemsInOrderList;
    }
}
