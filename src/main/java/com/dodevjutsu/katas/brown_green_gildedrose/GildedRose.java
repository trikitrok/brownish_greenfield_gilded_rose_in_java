package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private final Catalog catalog;

    private GildedRose(Catalog catalog) {
        this.catalog = catalog;
    }

    public void updateInventory() {
        catalog.update();
    }

    public static GildedRose witCatalogHaving(Item... items) {
        List<DegradableItem> degradableItems = new ArrayList<>();
        for (Item item : items) {
            degradableItems.add(new DegradableItem(item));
        }
        return new GildedRose(new Catalog(degradableItems));
    }
}
