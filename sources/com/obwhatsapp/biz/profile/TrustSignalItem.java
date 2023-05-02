package com.obwhatsapp.biz.profile;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass4BW;
import X.C13680ns;
import X.C13690nt;
import X.C35571m9;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import java.text.NumberFormat;

public class TrustSignalItem extends LinearLayout {
    public int A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;

    public TrustSignalItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOrientation(0);
        setClickable(true);
        setFocusable(true);
        LinearLayout.inflate(context, R.layout.layout05bf, this);
        this.A02 = C13690nt.A0R(this, R.id.linked_account_icon);
        this.A04 = C13680ns.A0S(this, R.id.linked_account_name);
        this.A03 = C13680ns.A0S(this, R.id.linked_account_info);
        this.A01 = C13690nt.A0R(this, R.id.linked_account_edit_button);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0H);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            this.A00 = integer;
            if (integer == 0) {
                setIcon(AnonymousClass00T.A04(getContext(), R.drawable.ic_settings_fb));
                this.A02.setColorFilter(AnonymousClass00T.A00(getContext(), R.color.color016c));
            } else if (integer == 1) {
                setIcon(AnonymousClass00T.A04(getContext(), R.drawable.ic_business_instagram));
            }
            setEditable(obtainStyledAttributes.getBoolean(2, false));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.A01.setColorFilter(AnonymousClass00T.A00(getContext(), resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void setAccountInfo(String str) {
        this.A03.setText(str);
    }

    private void setAccountName(String str) {
        if (this.A00 == 1) {
            str = C13680ns.A0h("@", str);
        }
        this.A04.setText(str);
    }

    private void setEditable(boolean z2) {
        WaImageView waImageView;
        int i2;
        WaTextView waTextView = this.A04;
        Context context = getContext();
        if (z2) {
            C13680ns.A0v(context, waTextView, R.color.color0660);
            waImageView = this.A01;
            i2 = 0;
        } else {
            C13680ns.A0v(context, waTextView, R.color.color0659);
            waImageView = this.A01;
            i2 = 8;
        }
        waImageView.setVisibility(i2);
    }

    private void setIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }

    public String getAccountName() {
        return C13690nt.A0b(this.A04);
    }

    public int getAccountType() {
        return this.A00;
    }

    public void setUpFromAccount(C35571m9 r6) {
        String string;
        int i2;
        if (r6 == null) {
            i2 = 8;
        } else {
            setAccountName(r6.A02);
            int i3 = r6.A01;
            if (i3 > 0) {
                int i4 = this.A00;
                int i5 = R.plurals.plurals00be;
                if (i4 == 0) {
                    i5 = R.plurals.plurals0092;
                }
                string = C13680ns.A0D(this).getQuantityString(i5, i3, AnonymousClass000.A1a(NumberFormat.getIntegerInstance().format((long) i3)));
            } else {
                Resources resources = getResources();
                int i6 = this.A00;
                int i7 = R.string.str0b84;
                if (i6 == 0) {
                    i7 = R.string.str08b1;
                }
                string = resources.getString(i7);
            }
            setAccountInfo(string);
            i2 = 0;
        }
        setVisibility(i2);
    }
}
