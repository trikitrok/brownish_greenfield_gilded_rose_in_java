package com.dodevjutsu.katas.brown_green_gildedrose;

public class BackstagePasses extends DegradableItem {
    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
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
