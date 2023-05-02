package com.mod.libs;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

public abstract class TListViewEvents implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {
    public TListViewEvents(Context context) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        onListViewItemClick(adapterView, view, i2, j2);
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        return onListViewItemLongClick(adapterView, view, i2, j2);
    }

    public abstract boolean onListViewItemClick(AdapterView<?> adapterView, View view, int i2, long j2);

    public abstract boolean onListViewItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2);
}
