package br.ufc.sd.servicoA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final BarClient barClient;

    public FooController(BarClient barClient) {
        this.barClient = barClient;
    }

    @GetMapping("foo")
    public String foo() {
        return "foo " + barClient.bar();
    }
}
