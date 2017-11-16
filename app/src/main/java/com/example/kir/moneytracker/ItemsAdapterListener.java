package com.example.kir.moneytracker;

/**
 * Created by Kir on 16.11.2017.
 */

public interface ItemsAdapterListener {

    void onItemClick(Item item, int position);

    void onItemLongClick(Item item, int position);

}
