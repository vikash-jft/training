package com.SpringBoot.shoping.services;

import com.SpringBoot.shoping.bean.Item;
import com.SpringBoot.shoping.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;

@Service
public class ItemServices {
    @Autowired
    ItemDao itemDao;

    public Item getItemById(int id){
        return itemDao.findOne(id);
    }

    public Collection<Item> getAllItems() {
        return itemDao.findAll();
    }

    public Boolean removeItemById(int id) {
        boolean  b=itemDao.exists(id);
        if(b == true){
            itemDao.delete(id);
            return true;
        }
        return false;
    }

    public void insertItem(Item item) {
        itemDao.save(item);
    }
}
