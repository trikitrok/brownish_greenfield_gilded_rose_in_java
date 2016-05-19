package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.List;

public class Catalog {

    private final List<DegradableItem> items;

    public Catalog(List<DegradableItem> items) {
        this.items = items;
    }

    public void update() {
        for (DegradableItem item : items) {
            item.age();
            item.updateQuality();
        }
    }
}
