package com.obwhatsapp.youbasha.ui.views;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final View f1437a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f1438b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1439c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f1440d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f1441e;

    /* renamed from: f  reason: collision with root package name */
    public String f1442f;

    public c(View view) {
        this.f1437a = view;
        this.f1438b = (ImageView) view.findViewWithTag("i");
        this.f1439c = (TextView) view.findViewWithTag("n");
        this.f1440d = (CheckBox) view.findViewWithTag("c");
        this.f1441e = (ImageView) view.findViewWithTag("r");
    }
}
