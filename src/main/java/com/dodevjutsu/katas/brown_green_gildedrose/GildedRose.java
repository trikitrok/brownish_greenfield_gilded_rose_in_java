package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private static final int MINIMUM_QUALITY = 0;
    private final Item item;

    public GildedRose(Item item) {
        this.item = item;
    }

    public void updateInventory() {
        ageItem();
        updateItemQuality();
    }

    private void updateItemQuality() {
        if(item.name.equals("Aged Brie")) {
            item.quality += 1;
            return;
        }

        if(item.sellIn < 0) {
            decreaseQualityBy(2);
            return;
        }
        decreaseQualityBy(1);
    }

    private void ageItem() {
        item.sellIn -= 1;
    }

    private void decreaseQualityBy(int amount) {
        item.quality -= amount;
        if(item.quality < MINIMUM_QUALITY) {
            item.quality = MINIMUM_QUALITY;
        }
    }
}
