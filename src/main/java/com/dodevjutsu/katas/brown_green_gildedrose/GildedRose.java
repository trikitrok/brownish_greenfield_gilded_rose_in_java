package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private final DegradableItem degradableItem;

    public GildedRose(Item item) {
        this.degradableItem = new DegradableItem(item);
    }

    public void updateInventory() {
        ageItem();
        updateItemQuality();
    }

    private void updateItemQuality() {
        degradableItem.updateQuality();
    }

    private void ageItem() {
        degradableItem.age();
    }
}
