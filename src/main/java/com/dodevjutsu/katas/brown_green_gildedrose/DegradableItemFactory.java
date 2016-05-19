package com.dodevjutsu.katas.brown_green_gildedrose;

public class DegradableItemFactory {
    public static DegradableItem create(Item item) {
        if(item.name.indexOf("conjured") != -1) {
            return new Conjured(
              createDegradableItem(
                  "any regular item", item
              )
            );
        }

        return createDegradableItem(item.name, item);
    }

    private static DegradableItem createDegradableItem(String name, Item item) {
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
