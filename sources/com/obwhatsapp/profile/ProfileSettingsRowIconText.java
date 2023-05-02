package com.obwhatsapp.profile;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2SR;
import X.AnonymousClass4BW;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import java.util.List;

public class ProfileSettingsRowIconText extends LinearLayout implements AnonymousClass006 {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public AnonymousClass013 A06;
    public C52662eE A07;
    public boolean A08;

    public ProfileSettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        setOrientation(1);
        setGravity(8388627);
        LayoutInflater.from(context).inflate(R.layout.layout04dd, this, true);
        this.A01 = (WaImageView) findViewById(R.id.profile_settings_row_icon);
        this.A02 = (WaImageView) findViewById(R.id.profile_settings_row_icon_placeholder);
        this.A03 = (WaImageView) findViewById(R.id.profile_settings_row_secondary_icon);
        this.A05 = (WaTextView) findViewById(R.id.profile_settings_row_text);
        this.A00 = (TextEmojiLabel) findViewById(R.id.profile_settings_row_subtext);
        this.A04 = (WaTextView) findViewById(R.id.profile_settings_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0A);
        try {
            setPrimaryIcon(obtainStyledAttributes.getDrawable(1));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                AnonymousClass2SR.A08(this.A01, color);
            }
            setSecondaryIcon(obtainStyledAttributes.getDrawable(3));
            int color2 = obtainStyledAttributes.getColor(4, -1);
            if (color2 != -1) {
                AnonymousClass2SR.A08(this.A03, color2);
            }
            setText(this.A06.A0F(obtainStyledAttributes, 6));
            setSubText(this.A06.A0F(obtainStyledAttributes, 5));
            setDescription(this.A06.A0F(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A00() {
        WaImageView waImageView;
        int i2;
        if (this.A01.getVisibility() == 0 && this.A04.getVisibility() == 0) {
            waImageView = this.A02;
            i2 = 4;
        } else {
            waImageView = this.A02;
            i2 = 8;
        }
        waImageView.setVisibility(i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A07;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        int i2 = 0;
        if (charSequence == null) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        A00();
        waTextView.setText(charSequence);
    }

    public void setPrimaryIcon(Drawable drawable) {
        WaImageView waImageView = this.A01;
        int i2 = 0;
        if (drawable == null) {
            i2 = 8;
        }
        waImageView.setVisibility(i2);
        A00();
        waImageView.setImageDrawable(drawable);
        this.A02.setImageDrawable(drawable);
    }

    public void setSecondaryIcon(Drawable drawable) {
        WaImageView waImageView = this.A03;
        int i2 = 0;
        if (drawable == null) {
            i2 = 8;
        }
        waImageView.setVisibility(i2);
        waImageView.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A00;
        int i2 = 0;
        if (charSequence == null) {
            i2 = 8;
        }
        textEmojiLabel.setVisibility(i2);
        textEmojiLabel.A0I((List) null, charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A05;
        int i2 = 0;
        if (charSequence == null) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(charSequence);
    }
}
