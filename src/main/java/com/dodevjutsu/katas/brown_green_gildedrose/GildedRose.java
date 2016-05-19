package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<DegradableItem> items = new ArrayList<>();

    private GildedRose(List<DegradableItem> degradableItems) {
        this.items = degradableItems;
    }

    public void updateInventory() {
        for(DegradableItem item : items) {
            item.age();
            item.updateQuality();
        }
    }

    public static GildedRose witCatalogHaving(Item ... items) {
        List<DegradableItem> degradableItems = new ArrayList<>();
        for(Item item : items) {
            degradableItems.add(new DegradableItem(item));
        }
        return new GildedRose(degradableItems);
    }
}
