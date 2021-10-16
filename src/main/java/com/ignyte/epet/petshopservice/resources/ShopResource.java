package com.ignyte.epet.petshopservice.resources;

import com.ignyte.epet.petshopservice.dto.ShopDto;
import com.ignyte.epet.petshopservice.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Controller
public class ShopResource {

    private final ShopService shopService;

    @Autowired
    public ShopResource(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping(value = "/myshops", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<ShopDto> getAllShops() {
        System.out.println("======================  Called ================");
        return shopService.getAllShops();
    }
}
