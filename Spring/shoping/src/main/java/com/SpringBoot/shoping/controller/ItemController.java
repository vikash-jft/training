package com.SpringBoot.shoping.controller;

import com.SpringBoot.shoping.bean.Item;
import com.SpringBoot.shoping.services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ItemController {

    @Autowired
    ItemServices itemServices;

    private static String UPLOADED_FOLDER = "src/main/webapp/uploaded_files";

    @GetMapping("product_detail/{id}")
    //@ResponseBody
    public String getItemById(@PathVariable int id,ModelMap modelMap){
        modelMap.addAttribute("obj",itemServices.getItemById(id));
        return "product_detail";
    }

    @GetMapping("/index")
    //@ResponseBody
    public String getAllItems(ModelMap modelMap){
        modelMap.addAttribute("obj",itemServices.getAllItems());
        return "index";
    }

  /*  @GetMapping("/remove/{id}")
    @ResponseBody
    public String removeItemById(@PathVariable int id){
        if(itemServices.removeItemById(id)) {
            return "Item remove Sucessfully";
        }
        return "Please give right Id to delete.";
    }*/

    @GetMapping("/insert_profile")
    public String insertImage(){
        return "insert_profile";
    }

    @PostMapping("/insertProfile")
    public String insertItem(@ModelAttribute Item item,@RequestParam ("imagefile") MultipartFile image)
                                throws Exception{

        byte[] bytes = image.getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + image.getOriginalFilename());
        Files.write(path, bytes);

        item.setImage(image.getOriginalFilename());
        itemServices.insertItem(item);
        return "home";
    }


    /*@PostMapping("/home")
    public String handleFileUpload(@RequestParam("image") MultipartFile file) throws Exception{

        if(file.isEmpty()){
            return "/insertImage";
        }
        byte[] bytes = file.getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
        Files.write(path, bytes);

        return "home";
    }*/
}
