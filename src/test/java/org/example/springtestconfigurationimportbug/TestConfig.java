package org.example.springtestconfigurationimportbug;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@TestConfiguration
public class TestConfig {
    @MockitoBean
    private DummyBean dummyBeanUnused;
}
