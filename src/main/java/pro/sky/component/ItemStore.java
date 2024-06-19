package pro.sky.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pro.sky.model.Item;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemStore {
    public final Map<Integer, Item> itemsMap = new HashMap<>();

    @PostConstruct
    public void unit() {
        int idCounter = 1;
        itemsMap.put(idCounter, new Item(idCounter++, "Телефон"));
        itemsMap.put(idCounter, new Item(idCounter++, "Телевизор"));
        itemsMap.put(idCounter, new Item(idCounter++, "Ноутбук"));
        itemsMap.put(idCounter, new Item(idCounter++, "Фен"));
        itemsMap.put(idCounter, new Item(idCounter++, "Пылесос"));
    }

    public Item get(int id) {
        return itemsMap.get(id);
    }
}