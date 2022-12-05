package br.ufc.sd.servicoA;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "bar-client", url = "${bar.url}")
public interface BarClient {

    @RequestMapping(method = RequestMethod.GET, value = "/bar")
    String bar();
}
