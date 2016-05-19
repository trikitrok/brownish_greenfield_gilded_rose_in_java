package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private final Item item;

    public GildedRose(Item item) {
        this.item = item;
    }

    public void updateInventory() {
        item.quality -= 1;
    }
}
