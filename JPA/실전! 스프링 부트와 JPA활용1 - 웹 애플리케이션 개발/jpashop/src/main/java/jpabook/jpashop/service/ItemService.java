package jpabook.jpashop.service;

import jpabook.jpashop.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }

    @Transactional
    public void updateItem(Long itemId, String name, int price, int quantity) {
        Item findItem = itemRepository.findOne(itemId);
        findItem.setName(name);
        findItem.setPrice(price);
        findItem.setStockQuantity(quantity);
    }
    public List<Item> findItem() {
        return itemRepository.findAll();
    }
}
