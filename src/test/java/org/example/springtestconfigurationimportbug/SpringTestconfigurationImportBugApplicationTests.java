package org.example.springtestconfigurationimportbug;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestConstructor;

@WebMvcTest(controllers = DummyController.class)
@Import(TestConfig.class)
class SpringTestconfigurationImportBugApplicationTests {
    @Test
    void contextLoads() {

    }
}
