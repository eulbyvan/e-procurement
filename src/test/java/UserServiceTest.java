import com.eulbyvan.model.User;
import com.eulbyvan.repo.IRoleRepo;
import com.eulbyvan.repo.IUserRepo;
import com.eulbyvan.service.implementation.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private IUserRepo mockUserRepo;
    @Mock
    private IRoleRepo mockRoleRepo;
    @Mock
    private PasswordEncoder mockPasswordEncoder;
    private UserService userService;

    @BeforeEach
    void setup() {
        userService = new UserService(mockUserRepo, mockRoleRepo, mockPasswordEncoder);
    }

    @Test
    public void itShould_ReturnListOfUser_When_GetUsers() {
        List<User> dummyUsers = new ArrayList<>();
        when(mockUserRepo.findAll()).thenReturn(dummyUsers);

        List<User> actualUsers = userService.getUsers();

        assertEquals(actualUsers, dummyUsers);
    }
}
