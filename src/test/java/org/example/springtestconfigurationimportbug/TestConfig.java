package org.example.springtestconfigurationimportbug;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;

@TestConfiguration
public class TestConfig {
    @MockBean
    private DummyBean dummyBeanUnused;
}
