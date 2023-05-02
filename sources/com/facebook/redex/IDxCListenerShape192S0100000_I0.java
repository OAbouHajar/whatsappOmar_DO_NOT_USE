package com.facebook.redex;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public class IDxCListenerShape192S0100000_I0 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape192S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        if (this.A01 == 0) {
            ((SearchView) this.A00).A0K(i2);
        }
    }
}
