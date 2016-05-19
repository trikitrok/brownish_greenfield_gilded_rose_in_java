package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private final List<DegradableItem> items;

    private Catalog(List<DegradableItem> items) {
        this.items = items;
    }

    public void update() {
        for (DegradableItem item : items) {
            item.age();
            item.updateQuality();
        }
    }

    public static Catalog withItems(Item[] items) {
        List<DegradableItem> degradableItems = new ArrayList<>();
        for (Item item : items) {
            degradableItems.add(DegradableItemFactory.create(item));
        }
        return new Catalog(degradableItems);
    }
}
