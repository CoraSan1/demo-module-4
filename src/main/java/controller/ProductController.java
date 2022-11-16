package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import service.ProductService;

import java.io.File;
import java.io.IOException;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public String getAll(Model model){
        model.addAttribute("products", ProductService.products);
        return "ShowProduct";
    }

    @GetMapping("/create")
    public String getCreat(){
        return "create";
    }

    @PostMapping("/create")
    public String creat(@ModelAttribute Product product, @RequestParam MultipartFile imgFile) throws IOException{
        String name = imgFile.getOriginalFilename();
        FileCopyUtils.copy(imgFile.getBytes(), new File("F:\\JavaWeb\\demo1\\src\\main\\webapp\\img\\" + name));
        product.getImg("/" + name);
        productService.add(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        productService.delete(id);
        return "redirect:/products";
    }
}
