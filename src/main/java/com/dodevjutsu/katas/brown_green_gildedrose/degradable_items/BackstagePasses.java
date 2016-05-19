package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

import com.dodevjutsu.katas.brown_green_gildedrose.Item;

class BackstagePasses extends DegradableItem {
    BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (sellDateHasPassed()) {
            qualityDropsToZero();
        } else if (daysToBeSold() <= 5) {
            increaseQualityBy(3);
        } else if (daysToBeSold() <= 10) {
            increaseQualityBy(2);
        } else {
            increaseQualityBy(1);
        }
    }
}
