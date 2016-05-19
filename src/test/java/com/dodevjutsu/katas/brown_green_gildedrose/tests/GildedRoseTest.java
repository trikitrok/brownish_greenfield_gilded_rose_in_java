package com.dodevjutsu.katas.brown_green_gildedrose.tests;

import com.dodevjutsu.katas.brown_green_gildedrose.GildedRose;
import com.dodevjutsu.katas.brown_green_gildedrose.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GildedRoseTest {
    @Test
    public void a_regular_item_quality_decreases_by_one_when_inventory_is_updated() {
        int initialQuality = 5;
        Item item = new Item("any regular item", 6, initialQuality);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality - 1));
    }
}
