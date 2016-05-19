package com.dodevjutsu.katas.brown_green_gildedrose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {

    private final List<DegradableItem> items;

    private Catalog(List<DegradableItem> items) {
        this.items = items;
    }

    public void update() {
        items.forEach(this::update);
    }

    private void update(DegradableItem item) {
        item.age();
        item.updateQuality();
    }

    public static Catalog withItems(Item[] items) {
        return new Catalog(createDegradableItemsFrom(items));
    }

    private static List<DegradableItem> createDegradableItemsFrom(Item[] items) {
        return Arrays.asList(items).stream()
            .map(item -> DegradableItemFactory.create(item))
            .collect(Collectors.toList());
    }
}
