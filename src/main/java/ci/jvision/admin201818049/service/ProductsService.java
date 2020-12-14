package ci.jvision.admin201818049.service;

import ci.jvision.admin201818049.domain.products.ProductsRepository;
import ci.jvision.admin201818049.web.dto.ProductsListResponseDto;
import ci.jvision.admin201818049.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Transactional
    public String save(ProductsSaveRequestDto requestDto)
    {
        return productsRepository.save(requestDto.toEntity()).getP_id();
    }


    @Transactional
    public List<ProductsListResponseDto> findAllDesc()
    {
        return productsRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
