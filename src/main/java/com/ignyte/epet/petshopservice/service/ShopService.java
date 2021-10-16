package com.ignyte.epet.petshopservice.service;

import com.ignyte.epet.petshopservice.dto.ShopDto;
import reactor.core.publisher.Flux;

public interface ShopService {

    Flux<ShopDto> getAllShops();
}
