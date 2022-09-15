package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
public class ShopController {
    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping(value = "/shops",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    @DeleteMapping("/{shopId}")
    public Shop delete(@PathVariable String shopId) {
        return shopService.deleteShopId(shopId);
    }

    @GetMapping("/{shopId}")
    public Shop getShop(@PathVariable String shopId) {
        return shopService.getShop(shopId);
    }

    @GetMapping
    public Collection<Shop> shopCollection() {
        return shopService.shopCollection();
    }

    @PutMapping(value = "/{shopId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop update(@RequestBody Shop shop, @PathVariable String shopId) {
        return shopService.update(shop, shopId);
    }
}
