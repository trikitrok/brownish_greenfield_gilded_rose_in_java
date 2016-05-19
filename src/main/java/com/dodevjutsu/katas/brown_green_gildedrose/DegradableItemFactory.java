package com.dodevjutsu.katas.brown_green_gildedrose;

public class DegradableItemFactory {
    public static DegradableItem create(Item item) {
        if (isAgedBrie(item)) {
            return new AgedBrie(item);
        } else if (isSulfuras(item)) {
            return new Sulfuras(item);
        } else if(areBackstagePasses(item)) {
            return new BackstagePasses(item);
        }
        return new RegularItem(item);
    }

    private static boolean areBackstagePasses(Item item) {
        return item.name.equals("Backstage passes");
    }

    private static boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras");
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }
}
