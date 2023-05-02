package com.obwhatsapp.contact.picker;

import X.AnonymousClass013;
import X.C16150sX;
import X.C23061Ai;
import X.C52652eD;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.redex.IDxSListenerShape15S0101000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.collections.observablelistview.ObservableListView;

public class BidiContactListView extends ObservableListView {
    public AnonymousClass013 A00;
    public C23061Ai A01;
    public boolean A02;

    public BidiContactListView(Context context) {
        super(context);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    private void A00() {
        int dimensionPixelSize;
        Resources resources;
        int i2;
        if (this.A00.A0T()) {
            setVerticalScrollbarPosition(1);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fd);
            resources = getResources();
            i2 = R.dimen.dimen01fc;
        } else {
            setVerticalScrollbarPosition(2);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fc);
            resources = getResources();
            i2 = R.dimen.dimen01fd;
        }
        setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        this.A08 = new IDxSListenerShape15S0101000_2_I1(this);
    }

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A01 = (C23061Ai) A002.AC0.get();
            this.A00 = C16150sX.A0Z(A002);
        }
    }
}
