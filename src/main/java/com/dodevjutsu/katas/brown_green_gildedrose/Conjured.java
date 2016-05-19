package com.dodevjutsu.katas.brown_green_gildedrose;

public class Conjured extends DegradableItem {
    private final DegradableItem degradableItem;

    public Conjured(DegradableItem degradableItem) {
        super(degradableItem.item());
        this.degradableItem = degradableItem;
    }

    @Override
    public void updateQuality() {
        degradableItem.updateQuality();
        degradableItem.updateQuality();
    }
}
