package com.dodevjutsu.katas.brown_green_gildedrose;

abstract public class DegradableItem {
    private static final int MINIMUM_QUALITY = 0;
    private static final int MAXIMUM_QUALITY = 50;
    private final Item item;

    protected DegradableItem(Item item) {
        this.item = item;
    }

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

    abstract public void updateQuality();

    public void age() {
        item.sellIn -= 1;
    }

    protected boolean sellDateHasPassed() {
        return item.sellIn < 0;
    }

    protected void increaseQualityBy(int amount) {
        item.quality = Math.min(item.quality + amount, MAXIMUM_QUALITY);
    }

    protected void decreaseQualityBy(int amount) {
        item.quality = Math.max(item.quality - amount, MINIMUM_QUALITY);
    }
}
