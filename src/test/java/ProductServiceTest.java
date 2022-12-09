import com.eulbyvan.model.Product;
import com.eulbyvan.repo.IRoleRepo;
import com.eulbyvan.repo.IProductRepo;
import com.eulbyvan.service.implementation.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private IProductRepo mockProductRepo;

    private ProductService productService;

    @BeforeEach
    void setup() {
        productService = new ProductService(mockProductRepo);
    }

    @Test
    public void itShould_ReturnListOfProduct_When_GetProducts() {
        List<Product> dummyProducts = new ArrayList<>();
        when(mockProductRepo.findAll()).thenReturn(dummyProducts);

        List<Product> actualProducts = productService.getProducts();

        assertEquals(actualProducts, dummyProducts);
    }
}
