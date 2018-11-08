package com.fu.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fu.springmvc.form.ProductForm;
import com.fu.springmvc.service.ProductService;

import vo.Product;

@Controller
public class ProductController {

    private static final Log logger = LogFactory
            .getLog(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product_input")
    public String inputProduct() {
        logger.info("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_toForm")
    public String toForm() {
        return "Form";
    }

    
    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    //重定向的RedirectAttributes方法，用于重定向后还能带参数跳转
    public String saveProduct(@ModelAttribute("newproduct") Product product, ProductForm productForm, RedirectAttributes redirectAttributes) {
        logger.info("saveProduct called");
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (NumberFormatException e) {
        }

        Product savedProduct = productService.add(product);
        
        redirectAttributes.addFlashAttribute("message", "The product was successfully added.");

        return "redirect:/product_view/" + savedProduct.getId();
    }

    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "ProductView";
    }
}
