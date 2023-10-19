package com.example.UserItem.Controller;

import com.example.UserItem.Entities.Item;
import com.example.UserItem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "Item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/add_Item")
    public String addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    
    @GetMapping("/get_AllItems")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
}
