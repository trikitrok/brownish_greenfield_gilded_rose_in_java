package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private static final int MINIMUM_QUALITY = 0;
    private static final int MAXIMUM_QUALITY = 50;
    private final Item item;
    private final DegradableItem degradableItem;

    public GildedRose(Item item) {
        this.item = item;
        this.degradableItem = new DegradableItem(item);
    }

    public void updateInventory() {
        if(item.name.equals("Sulfuras")){
            return;
        }
        ageItem();
        
        updateItemQuality();
    }

    private void updateItemQuality() {
        if(item.name.equals("Sulfuras")){
            return;
        }

        if(item.name.equals("Aged Brie")) {
            increaseQualityBy(1);
            return;
        }

        if(item.sellIn < 0) {
            decreaseQualityBy(2);
            return;
        }
        decreaseQualityBy(1);
    }

    private void increaseQualityBy(int amount) {
        item.quality = Math.min(item.quality + amount, MAXIMUM_QUALITY);
    }

    private void ageItem() {
        item.sellIn -= 1;
    }

    private void decreaseQualityBy(int amount) {
        item.quality = Math.max(item.quality - amount, MINIMUM_QUALITY);
    }
}
