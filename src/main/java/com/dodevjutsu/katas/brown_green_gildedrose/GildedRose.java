package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private final Item item;

    public GildedRose(Item item) {
        this.item = item;
    }

    public void updateInventory() {
        item.sellIn -= 1;

        item.quality -= 1;
        if(item.sellIn < 0) {
            item.quality -= 1;
        }
    }
}
