package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
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
        degradableItem.updateQuality();
    }

    private void ageItem() {
        item.sellIn -= 1;
    }
}
