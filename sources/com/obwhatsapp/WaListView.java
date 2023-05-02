package com.obwhatsapp;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

public class WaListView extends ListView implements AbsListView.OnScrollListener, AnonymousClass006 {
    public int A00;
    public AbsListView.OnScrollListener A01;
    public C52662eE A02;
    public boolean A03;

    public WaListView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 0;
        super.setOnScrollListener(this);
    }

    public WaListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A00 = 0;
        super.setOnScrollListener(this);
    }

    public WaListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 0;
        super.setOnScrollListener(this);
    }

    public WaListView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public int getScrollState() {
        return this.A00;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        AbsListView.OnScrollListener onScrollListener = this.A01;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i2, i3, i4);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        this.A00 = i2;
        AbsListView.OnScrollListener onScrollListener = this.A01;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i2);
        }
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A01 = onScrollListener;
    }
}
