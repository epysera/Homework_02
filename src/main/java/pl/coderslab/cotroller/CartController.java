package pl.coderslab.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.Cart;
import pl.coderslab.CartItem;
import pl.coderslab.Product;

import java.util.List;
import java.util.Random;

@Controller
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/cart")
    public String printAll(Model model) {
        model.addAttribute("list",cart.getCartItemList());
        return "cartItems";
    }

    @GetMapping("/addtocart")
    public String addToCartForm() {

        return "addProduct";
    }
    @PostMapping("/addtocart")
    public String addToCart(@RequestParam String id, @RequestParam String name, @RequestParam String price){
        CartItem cartItem = new CartItem(1, new Product(Long.parseLong(id),name,Double.parseDouble(price)));
        cart.addToCart(cartItem);

        return "addProduct";
    }
}
