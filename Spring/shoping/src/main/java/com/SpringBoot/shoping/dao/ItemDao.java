package com.SpringBoot.shoping.dao;

import com.SpringBoot.shoping.bean.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

public interface ItemDao extends JpaRepository<Item,Integer> {
}
