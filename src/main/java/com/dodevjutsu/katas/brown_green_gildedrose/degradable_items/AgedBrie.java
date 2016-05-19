package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

import com.dodevjutsu.katas.brown_green_gildedrose.Item;

class AgedBrie extends DegradableItem {
    AgedBrie(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQualityBy(1);
    }
}
