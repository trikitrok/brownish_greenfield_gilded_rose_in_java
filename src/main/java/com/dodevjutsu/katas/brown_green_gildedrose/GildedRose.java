package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private final DegradableItem item;
    private final List<DegradableItem> items = new ArrayList<>();

    public GildedRose(Item item) {
        this.item = new DegradableItem(item);
        this.items.add(this.item);
    }

    public void updateInventory() {
        for(DegradableItem item : items) {
            item.age();
            item.updateQuality();
        }
    }

}
