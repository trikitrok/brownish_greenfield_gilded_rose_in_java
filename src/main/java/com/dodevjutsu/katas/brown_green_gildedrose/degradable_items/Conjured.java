package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

class Conjured extends DegradableItem {
    private final DegradableItem degradableItem;

    Conjured(DegradableItem degradableItem) {
        super(degradableItem.item());
        this.degradableItem = degradableItem;
    }

    @Override
    protected void updateQuality() {
        degradableItem.updateQuality();
        degradableItem.updateQuality();
    }

    @Override
    protected void age() {
        degradableItem.age();
    }
}
