package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass00X;
import X.AnonymousClass4BW;
import X.C108445Oa;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C64023Ml;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

public class StarRatingBar extends LinearLayout implements View.OnClickListener {
    public int A00;
    public C108445Oa A01;
    public final int A02;
    public final Drawable A03;
    public final Drawable A04;

    public StarRatingBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public StarRatingBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0F, 0, 0);
        try {
            this.A02 = obtainStyledAttributes.getInt(1, 5);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            this.A03 = drawable == null ? AnonymousClass00X.A04((Resources.Theme) null, getResources(), R.drawable.message_rating_star) : drawable;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
            this.A04 = drawable2 == null ? AnonymousClass00X.A04((Resources.Theme) null, getResources(), R.drawable.message_rating_star_border) : drawable2;
            obtainStyledAttributes.recycle();
            setSaveEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A00() {
        if (getChildCount() == 0) {
            int i2 = 0;
            while (i2 < this.A02) {
                ImageView imageView = new ImageView(getContext());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                i2++;
                Integer valueOf = Integer.valueOf(i2);
                imageView.setTag(valueOf);
                Resources resources = getResources();
                Object[] A1b = C13680ns.A1b();
                A1b[0] = valueOf;
                imageView.setContentDescription(resources.getQuantityString(R.plurals.plurals009a, i2, A1b));
                imageView.setImageDrawable(this.A04);
                imageView.setOnClickListener(this);
                addView(imageView);
            }
            return;
        }
        int i3 = 0;
        while (i3 < this.A02) {
            ImageView imageView2 = (ImageView) getChildAt(i3);
            i3++;
            imageView2.setImageDrawable(i3 <= this.A00 ? this.A03 : this.A04);
        }
    }

    public int getRating() {
        return this.A00;
    }

    public void onClick(View view) {
        int A0D = AnonymousClass000.A0D(view.getTag());
        this.A00 = A0D;
        A00();
        sendAccessibilityEvent(16384);
        C108445Oa r0 = this.A01;
        if (r0 != null) {
            r0.AVe(A0D, true);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64023Ml r2 = (C64023Ml) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A00 = r2.A00;
        A00();
    }

    public Parcelable onSaveInstanceState() {
        C64023Ml r1 = new C64023Ml(super.onSaveInstanceState());
        r1.A00 = this.A00;
        return r1;
    }

    public void sendAccessibilityEvent(int i2) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            super.sendAccessibilityEvent(i2);
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            List<CharSequence> text = obtain.getText();
            Resources A0D = C13680ns.A0D(this);
            Object[] A1Z = C13690nt.A1Z();
            AnonymousClass000.A1M(A1Z, this.A00, 0);
            text.add(C13700nu.A0F(A0D, Integer.valueOf(this.A02), A1Z, 1, R.string.str08e3));
            obtain.setEnabled(true);
            ((AccessibilityManager) getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public void setOnRatingChangeListener(C108445Oa r1) {
        this.A01 = r1;
    }

    public void setRating(int i2) {
        this.A00 = i2;
        A00();
        sendAccessibilityEvent(16384);
        C108445Oa r0 = this.A01;
        if (r0 != null) {
            r0.AVe(i2, false);
        }
    }
}
