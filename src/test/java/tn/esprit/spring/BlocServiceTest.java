package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Utilisation de OrderAnnotation pour ordonner les tests
public class BlocServiceTest {

    @BeforeAll
    static void beforeAll() {
        // Code à exécuter avant tous les tests
    }

    @AfterAll
    static void afterAll() {
        // Code à exécuter après tous les tests
    }

    @BeforeEach
    void beforeEach() {
        // Code à exécuter avant chaque test
    }

    @AfterEach
    void afterEach() {
        // Code à exécuter après chaque test
    }

    @Order(1)
    @RepeatedTest(4) // Test exécuté 4 fois
    void test() {
        // Logique du test
    }

    @Order(4)
    @Test
    void test2() {
        // Logique du test
    }

    @Order(2)
    @Test
    void test3() {
        // Logique du test
    }

    @Order(3)
    @Test
    void test4() {
        // Logique du test
    }
}
