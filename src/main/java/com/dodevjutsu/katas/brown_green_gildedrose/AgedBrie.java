package com.dodevjutsu.katas.brown_green_gildedrose;

public class AgedBrie extends DegradableItem {
    protected AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQualityBy(1);
    }
}
