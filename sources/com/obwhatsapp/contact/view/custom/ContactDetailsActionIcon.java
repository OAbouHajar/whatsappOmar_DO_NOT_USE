package com.obwhatsapp.contact.view.custom;

import X.AnonymousClass00T;
import X.AnonymousClass49R;
import X.C004601z;
import X.C45922Bq;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

public class ContactDetailsActionIcon extends LinearLayout {
    public int A00;
    public int A01;
    public ImageView A02;
    public WaTextView A03;

    public ContactDetailsActionIcon(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public ContactDetailsActionIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public ContactDetailsActionIcon(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(context, attributeSet);
    }

    public void A00(int i2, String str) {
        this.A02.setImageResource(i2);
        this.A03.setText(C45922Bq.A00(getContext(), str), TextView.BufferType.SPANNABLE);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.layout012b, this, true);
        this.A02 = (ImageView) C004601z.A0E(this, R.id.action_icon);
        this.A03 = (WaTextView) C004601z.A0E(this, R.id.action_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass49R.A00);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            Context context2 = getContext();
            if (resourceId == 0) {
                resourceId = R.color.color079c;
            }
            this.A01 = AnonymousClass00T.A00(context2, resourceId);
            this.A00 = AnonymousClass00T.A00(getContext(), R.color.color01d6);
            this.A03.setTextColor(this.A01);
            A00(obtainStyledAttributes.getResourceId(0, 0), context.getString(obtainStyledAttributes.getResourceId(1, 0)));
            obtainStyledAttributes.recycle();
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.A02.setEnabled(z2);
        this.A03.setTextColor(z2 ? this.A01 : this.A00);
    }

    public void setTitle(int i2) {
        this.A03.setText(C45922Bq.A00(getContext(), getResources().getString(i2)), TextView.BufferType.SPANNABLE);
    }
}
