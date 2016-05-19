package com.dodevjutsu.katas.brown_green_gildedrose.tests;

import com.dodevjutsu.katas.brown_green_gildedrose.GildedRose;
import com.dodevjutsu.katas.brown_green_gildedrose.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;

public class GildedRoseTest {
    @Test
    public void gilded_rose_can_have_several_items_in_its_catalog() {
        Item anItem = new Item("some regular item", 9, 10);
        Item anotherItem = new Item("another regular item", 3, 12);
        GildedRose gildedRose = GildedRose.witCatalogHaving(anItem, anotherItem);

        gildedRose.updateInventory();

        assertThat(anItem.quality, is(9));
        assertThat(anotherItem.quality, is(11));
    }
}
