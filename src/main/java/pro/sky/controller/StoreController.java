package pro.sky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.model.Item;
import pro.sky.service.StoreService;

import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        storeService.add(ids);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }
}
