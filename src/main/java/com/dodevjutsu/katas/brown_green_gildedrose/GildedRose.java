package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private final DegradableItem item;

    public GildedRose(Item item) {
        this.item = new DegradableItem(item);
    }

    public void updateInventory() {
        item.age();
        item.updateQuality();
    }

}
