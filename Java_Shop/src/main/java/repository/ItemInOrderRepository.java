package repository;

import model.ItemsInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 09.05.2017.
 */
public interface ItemInOrderRepository extends JpaRepository<ItemsInOrder,Long> {
//    List<Item> getAll();
//    @Query("")
//    List<Item> findItemsOfUser();
}
