package com.example.UserItem.Service;

import com.example.UserItem.Entities.Item;
import com.example.UserItem.Entities.User;
import com.example.UserItem.Repository.ItemRepository;
import com.example.UserItem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    UserRepository userRepository;

    public String addItem(Item item){

        User user = item.getUser();
        user.getItemList().add(item);
        userRepository.save(user);
        return "Item Added Successfully";
    }

    public List<Item> getAllItems(){
	
	  List<Item> itemList = new ArrayList<>();
	  repository.findAll().forEach(item -> itemList.add(item));
	  return itemList;
    }

    public Item get_ItemById(int Id) {
    	
	    Item item = userRepository.findById(Id);
	    return item;
    }
}
