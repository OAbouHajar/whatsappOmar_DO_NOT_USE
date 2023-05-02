package com.obwhatsapp.settings;

import X.AnonymousClass013;
import X.AnonymousClass08E;
import X.AnonymousClass2SR;
import X.AnonymousClass2UH;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C447725m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

public class SettingsRowIconText extends AnonymousClass2UH {
    public WaImageView A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public AnonymousClass013 A04;

    public SettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    public SettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View inflate = LinearLayout.inflate(context, R.layout.layout0548, this);
        this.A01 = (WaImageView) C004601z.A0E(inflate, R.id.settings_row_icon);
        this.A03 = (WaTextView) C004601z.A0E(inflate, R.id.settings_row_text);
        this.A02 = (WaTextView) C004601z.A0E(inflate, R.id.settings_row_subtext);
        this.A00 = (WaImageView) C004601z.A0E(inflate, R.id.settings_row_badge);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0D);
        try {
            boolean z2 = obtainStyledAttributes.getBoolean(4, false);
            if (obtainStyledAttributes.hasValue(3)) {
                Drawable A012 = AnonymousClass08E.A01(context, obtainStyledAttributes.getResourceId(3, -1));
                WaImageView waImageView = this.A01;
                if (A012 == null) {
                    waImageView.setVisibility(8);
                } else {
                    waImageView.setVisibility(0);
                    if (z2) {
                        A012 = new C447725m(A012, this.A04);
                    }
                }
                this.A01.setImageDrawable(A012);
            }
            int color = obtainStyledAttributes.getColor(1, -1);
            if (color != -1) {
                AnonymousClass2SR.A08(this.A01, color);
            }
            setText(this.A04.A0F(obtainStyledAttributes, 6));
            setSubText(this.A04.A0F(obtainStyledAttributes, 5));
            if (obtainStyledAttributes.hasValue(2)) {
                Drawable A013 = AnonymousClass08E.A01(context, obtainStyledAttributes.getResourceId(2, -1));
                WaImageView waImageView2 = this.A00;
                int i2 = A013 != null ? 0 : 8;
                if (waImageView2.getVisibility() != i2) {
                    waImageView2.setVisibility(i2);
                }
                if (A013 != null && z2) {
                    A013 = new C447725m(A013, this.A04);
                }
                this.A00.setImageDrawable(A013);
            }
            int color2 = obtainStyledAttributes.getColor(0, -1);
            if (color2 != -1) {
                AnonymousClass2SR.A08(this.A00, color2);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                this.A02.setMaxLines(obtainStyledAttributes.getInt(7, 0));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public WaImageView getIcon() {
        return this.A01;
    }

    public void setBadgeIcon(Drawable drawable) {
        WaImageView waImageView = this.A00;
        int i2 = 8;
        if (drawable != null) {
            i2 = 0;
        }
        if (waImageView.getVisibility() != i2) {
            waImageView.setVisibility(i2);
        }
        waImageView.setImageDrawable(drawable);
    }

    public void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A01;
        int i2 = 0;
        if (drawable == null) {
            i2 = 8;
        }
        waImageView.setVisibility(i2);
        waImageView.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A02;
        int i2 = 0;
        if (charSequence == null) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        int i2 = 0;
        if (charSequence == null) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(charSequence);
    }
}
