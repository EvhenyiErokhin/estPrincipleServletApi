package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class ShopService {
    private final HashMap<String, Shop> shopHashMap = new HashMap<>();

    public Shop addShop(Shop shop) {
        shopHashMap.put(shop.getShopId(), shop);
        return shop;
    }

    public Shop deleteShopId(String shopId) {
        return shopHashMap.remove(shopId);
    }

    public Shop getShop(String shopId) {
        Shop shop = shopHashMap.get(shopId);
        return shop;
    }

    public Collection<Shop> shopCollection() {
        return shopHashMap.values();
    }

    public Shop update(Shop shop, String shopId) {
        Shop newShop = shopHashMap.get(shopId);

        newShop.setCity(shop.getCity());
        newShop.setName(shop.getName());
        newShop.setStreet(shop.getStreet());
        newShop.setEmployees(shop.getEmployees());
        newShop.setShopSite(shop.isShopSite());
        return newShop;
    }
}
