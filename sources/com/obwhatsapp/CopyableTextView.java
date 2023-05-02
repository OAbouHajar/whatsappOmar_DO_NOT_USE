package com.obwhatsapp;

import X.AnonymousClass01V;
import X.C14870pt;
import X.C53072ew;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends WaTextView implements View.OnClickListener {
    public C14870pt A00;
    public AnonymousClass01V A01;
    public String A02;
    public String A03;
    public boolean A04;

    public CopyableTextView(Context context) {
        super(context);
        A00();
        A0A(context, (AttributeSet) null);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A0A(context, attributeSet);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A0A(context, attributeSet);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public final void A0A(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A08);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = context.getString(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onClick(View view) {
        ClipboardManager A0B;
        if (!TextUtils.isEmpty(this.A03) && (A0B = this.A01.A0B()) != null) {
            try {
                A0B.setPrimaryClip(ClipData.newPlainText(getText(), TextUtils.isEmpty(this.A02) ? getText() : this.A02));
                this.A00.A0H(this.A03, 0);
            } catch (NullPointerException | SecurityException unused) {
            }
        }
    }

    public void setDataToCopy(String str) {
        this.A02 = str;
    }

    public void setToastString(String str) {
        this.A03 = str;
    }
}
