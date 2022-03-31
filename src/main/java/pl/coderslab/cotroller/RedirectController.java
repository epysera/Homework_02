package pl.coderslab.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedirectController {

    @RequestMapping("/first")
    public String first() {
        return "first";
    }
    @RequestMapping("/second")

    public String second() {
        return "redirect:third";
    }
    @RequestMapping("/third")
    public String third() {
        return "third";
    }

}
