package com.obwhatsapp.yo;

import X.C005602k;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.youbasha.ui.TextBubbleLeft;

public final class f extends C005602k {

    /* renamed from: a  reason: collision with root package name */
    public final TextBubbleLeft f758a;

    /* renamed from: b  reason: collision with root package name */
    public final View f759b;

    public f(View view) {
        super(view);
        this.f759b = view;
        TextBubbleLeft textBubbleLeft = (TextBubbleLeft) ((ViewGroup) view).getChildAt(0);
        this.f758a = textBubbleLeft;
        textBubbleLeft.hideQuotedView(true);
    }
}
