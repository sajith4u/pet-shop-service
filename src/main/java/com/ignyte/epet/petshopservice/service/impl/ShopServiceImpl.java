package com.ignyte.epet.petshopservice.service.impl;

import com.ignyte.epet.petshopservice.dto.ShopDto;
import com.ignyte.epet.petshopservice.service.ShopService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Override
    public Flux<ShopDto> getAllShops() {
        List<ShopDto> allShops = new ArrayList<>();
        ShopDto shop1 = ShopDto.builder().name("Colombo 7").address("No 21/2 , Darly Road, Maradana").build();
        ShopDto shop2 = ShopDto.builder().name("Colombo 8").address("No 7/3 , Wellawaththa").build();
        allShops.add(shop1);
        allShops.add(shop2);
        return Flux.fromStream(allShops.stream());
    }
}
