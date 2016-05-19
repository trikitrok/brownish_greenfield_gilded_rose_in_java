package com.dodevjutsu.katas.brown_green_gildedrose;

public class GildedRose {
    private final Catalog catalog;

    private GildedRose(Catalog catalog) {
        this.catalog = catalog;
    }

    public void updateInventory() {
        catalog.update();
    }

    public static GildedRose witCatalogHaving(Item... items) {
        return new GildedRose(Catalog.withItems(items));
    }
}
