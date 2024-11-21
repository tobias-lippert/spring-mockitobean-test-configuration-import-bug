package org.example.springtestconfigurationimportbug;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    private final DummyBean dummyBean;

    public DummyController(DummyBean dummyBean) {
        this.dummyBean = dummyBean;
    }
}
