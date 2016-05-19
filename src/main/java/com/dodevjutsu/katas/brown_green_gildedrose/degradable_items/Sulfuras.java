package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

import com.dodevjutsu.katas.brown_green_gildedrose.Item;

class Sulfuras extends DegradableItem {
    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        // do nothing
    }

    @Override
    protected void age() {
        // do nothing
    }
}
