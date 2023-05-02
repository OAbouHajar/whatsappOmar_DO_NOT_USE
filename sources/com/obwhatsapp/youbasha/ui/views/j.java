package com.obwhatsapp.youbasha.ui.views;

import X.C005602k;
import X.C30991dI;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.status.ContactStatusThumbnail;
import com.obwhatsapp.yo.yo;

public final class j extends C005602k {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1461a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1462b;

    /* renamed from: c  reason: collision with root package name */
    public final TextEmojiLabel f1463c;

    /* renamed from: d  reason: collision with root package name */
    public final ContactStatusThumbnail f1464d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f1465e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f1466f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f1467g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f1468h;

    /* renamed from: i  reason: collision with root package name */
    public final View f1469i;

    /* renamed from: j  reason: collision with root package name */
    public final View f1470j;

    /* renamed from: k  reason: collision with root package name */
    public final View f1471k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f1472l;

    /* renamed from: m  reason: collision with root package name */
    public C30991dI f1473m;

    /* renamed from: n  reason: collision with root package name */
    public String f1474n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1475o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1476p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f1477q;

    /* renamed from: r  reason: collision with root package name */
    public int f1478r;

    public j(View view, View.OnClickListener onClickListener) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        this.f1461a = viewGroup;
        viewGroup.setOnClickListener(onClickListener);
        View findViewById = viewGroup.findViewById(yo.getID("add_button", "id"));
        this.f1462b = findViewById;
        ImageView imageView = (ImageView) findViewById.findViewById(yo.getID("icon", "id"));
        this.f1463c = (TextEmojiLabel) viewGroup.findViewById(yo.getID("contact_name", "id"));
        this.f1464d = (ContactStatusThumbnail) viewGroup.findViewById(yo.getID("contact_photo", "id"));
        this.f1465e = (FrameLayout) viewGroup.findViewById(yo.getID("contact_selector", "id"));
        this.f1466f = (ImageView) viewGroup.findViewById(yo.getID("mThumbnail", "id"));
        this.f1467g = (ImageView) viewGroup.findViewById(yo.getID("mThumbnail1", "id"));
        this.f1470j = viewGroup.findViewById(yo.getID("mThumbnailHolder", "id"));
        this.f1463c = (TextEmojiLabel) viewGroup.findViewById(yo.getID("contact_name", "id"));
        this.f1462b = viewGroup.findViewById(yo.getID("add_button", "id"));
        this.f1468h = (ImageView) viewGroup.findViewById(yo.getID("add_ic", "id"));
        this.f1469i = viewGroup.findViewById(yo.getID("mCounterHolder", "id"));
        this.f1471k = viewGroup.findViewById(yo.getID("mCounterHolder1", "id"));
        this.f1472l = (TextView) viewGroup.findViewById(yo.getID("mCounter", "id"));
    }
}
