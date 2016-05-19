package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

import com.dodevjutsu.katas.brown_green_gildedrose.Item;

class RegularItem extends DegradableItem {
    RegularItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if(sellDateHasPassed()) {
            decreaseQualityBy(2);
            return;
        }
        decreaseQualityBy(1);
    }
}
