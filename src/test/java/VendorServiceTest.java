import com.eulbyvan.model.Vendor;
import com.eulbyvan.repo.IVendorRepo;
import com.eulbyvan.service.implementation.VendorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
public class VendorServiceTest {
    @Mock
    private IVendorRepo mockVendorRepo;

    private VendorService vendorService;

    @BeforeEach
    void setup() {
        vendorService = new VendorService(mockVendorRepo);
    }

    @Test
    public void itShould_ReturnListOfVendor_When_GetVendors() {
        List<Vendor> dummyVendors = new ArrayList<>();
        when(mockVendorRepo.findAll()).thenReturn(dummyVendors);

        List<Vendor> actualVendors = vendorService.getVendors();

        assertEquals(actualVendors, dummyVendors);
    }
}
