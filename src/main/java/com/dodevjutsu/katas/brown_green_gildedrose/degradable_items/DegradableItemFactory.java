package com.dodevjutsu.katas.brown_green_gildedrose.degradable_items;

import com.dodevjutsu.katas.brown_green_gildedrose.Item;

public class DegradableItemFactory {
    public static DegradableItem create(Item item) {
        if(isConjured(item)) {
            return conjured(degradableItem(item));
        }
        return degradableItem(item);
    }

    private static Conjured conjured(DegradableItem item) {
        return new Conjured(item);
    }

    private static String notConjuredName(Item item) {
        return item.name.replace("Conjured", "").replace("conjured", "").replaceAll("\\s+", " ").trim();
    }

    private static boolean isConjured(Item item) {
        return item.name.contains("conjured") || item.name.contains("Conjured");
    }

    private static DegradableItem degradableItem(Item item) {
        String name = notConjuredName(item);
        if (isAgedBrie(name)) {
            return new AgedBrie(item);
        } else if (isSulfuras(name)) {
            return new Sulfuras(item);
        } else if(areBackstagePasses(name)) {
            return new BackstagePasses(item);
        }
        return new RegularItem(item);
    }

    private static boolean areBackstagePasses(String name) {
        return name.equals("Backstage passes");
    }

    private static boolean isSulfuras(String name) {
        return name.equals("Sulfuras");
    }

    private static boolean isAgedBrie(String name) {
        return name.equals("Aged Brie");
    }
}
