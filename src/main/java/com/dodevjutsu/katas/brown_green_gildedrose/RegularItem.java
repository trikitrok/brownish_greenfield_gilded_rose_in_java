package com.dodevjutsu.katas.brown_green_gildedrose;

public class RegularItem extends DegradableItem {
    protected RegularItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if(sellDateHasPassed()) {
            decreaseQualityBy(2);
            return;
        }
        decreaseQualityBy(1);
    }
}
