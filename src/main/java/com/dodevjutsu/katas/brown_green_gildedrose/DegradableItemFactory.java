package com.dodevjutsu.katas.brown_green_gildedrose;

public class DegradableItemFactory {
    public static DegradableItem create(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrie(item);
        } else if (item.name.equals("Sulfuras")) {
            return new Sulfuras(item);
        } else if(item.name.equals("Backstage passes")) {
            return new BackstagePasses(item);
        }
        return new RegularItem(item);
    }
}
