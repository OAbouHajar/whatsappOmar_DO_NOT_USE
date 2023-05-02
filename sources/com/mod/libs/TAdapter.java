package com.mod.libs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public class TAdapter extends ArrayAdapter<String> {
    private Context context;
    private String thisItemListLayoutID;
    private OnListingEvent thisOnListingEvent;

    public interface OnListingEvent {
        void onListing(int i2, View view);
    }

    public TAdapter(Context context2, String str, List<String> list, OnListingEvent onListingEvent) {
        super(context2, 0, list);
        this.context = context2;
        this.thisItemListLayoutID = str;
        this.thisOnListingEvent = onListingEvent;
    }

    public TAdapter(Context context2, String str, String[] strArr, OnListingEvent onListingEvent) {
        super(context2, 0, strArr);
        this.context = context2;
        this.thisItemListLayoutID = str;
        this.thisOnListingEvent = onListingEvent;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(TTR.GetLayout(this.context, this.thisItemListLayoutID), viewGroup, false);
        this.thisOnListingEvent.onListing(i2, inflate);
        return inflate;
    }
}
