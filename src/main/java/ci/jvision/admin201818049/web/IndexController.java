package ci.jvision.admin201818049.web;

import ci.jvision.admin201818049.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductsService productsService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("products", productsService.findAllDesc());
        return "index";
    }

    @GetMapping("/products/save")
    public String productsSave()
    {
        return "products-save";
    }

}
