package ci.jvision.admin201818049.web;

import ci.jvision.admin201818049.service.ProductsService;
import ci.jvision.admin201818049.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;

    @PostMapping("/api/v1/products")
    public String save(
            @RequestBody ProductsSaveRequestDto requestDto
            ) {
        return productsService.save(requestDto);
    }
}
