package com.fu.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;

import com.fu.springmvc.form.ProductForm;

import vo.Product;

/*@Controller*/
public class ProductController2 {

    private static final Log logger = LogFactory.getLog(ProductController2.class);

   /* @RequestMapping(value="/product_input")*/
    public String inputProduct() {
        logger.info("inputProduct called");
        return "ProductForm";
    }

  /*  @RequestMapping(value="/product_save")*/
    public String saveProduct(ProductForm productForm, Model model) {
        logger.info("saveProduct called");
        // no need to create and instantiate a ProductForm
        // create Product
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(
                    productForm.getPrice()));
        } catch (NumberFormatException e) {
        }

        // add product

        model.addAttribute("product", product);
        return "ProductDetail";
    }
}
