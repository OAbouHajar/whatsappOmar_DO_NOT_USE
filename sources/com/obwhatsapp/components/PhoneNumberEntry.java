package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass1G1;
import X.AnonymousClass2TY;
import X.AnonymousClass35M;
import X.AnonymousClass3CQ;
import X.AnonymousClass4BW;
import X.AnonymousClass4SS;
import X.C004601z;
import X.C16150sX;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import X.C64033Mm;
import X.C99994uv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.whatsapp.util.Log;

public class PhoneNumberEntry extends LinearLayout implements AnonymousClass2TY, AnonymousClass006 {
    public TextWatcher A00;
    public AnonymousClass1G1 A01;
    public WaEditText A02;
    public WaEditText A03;
    public AnonymousClass4SS A04;
    public AnonymousClass01V A05;
    public C52662eE A06;
    public String A07;
    public boolean A08;

    public PhoneNumberEntry(Context context) {
        super(context);
        A00();
        A01(context, (AttributeSet) null);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context, attributeSet);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01(context, attributeSet);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A08) {
            this.A08 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A05 = C16150sX.A0T(A002);
            this.A01 = (AnonymousClass1G1) A002.AJl.get();
        }
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        setSaveEnabled(true);
        C004601z.A0f(this, 0);
        LinearLayout.inflate(context, R.layout.layout0492, this);
        this.A02 = (WaEditText) findViewById(R.id.registration_cc);
        WaEditText waEditText = (WaEditText) findViewById(R.id.registration_phone);
        this.A03 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A02.setSaveEnabled(false);
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        C45902Bo.A03(this.A03);
        C99994uv r2 = new C99994uv(this);
        WaEditText waEditText2 = this.A02;
        waEditText2.A01 = r2;
        this.A03.A01 = r2;
        waEditText2.addTextChangedListener(new AnonymousClass35M(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A09);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            C004601z.A0O(colorStateList, this.A03);
            C004601z.A0O(colorStateList, this.A02);
        }
        obtainStyledAttributes.recycle();
    }

    public void A02(String str) {
        this.A07 = str;
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            this.A03.removeTextChangedListener(textWatcher);
        }
        try {
            AnonymousClass3CQ r1 = new AnonymousClass3CQ(this, str);
            this.A00 = r1;
            this.A03.addTextChangedListener(r1);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public WaEditText getCountryCodeField() {
        return this.A02;
    }

    public WaEditText getPhoneNumberField() {
        return this.A03;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64033Mm r3 = (C64033Mm) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.A02.setText(r3.A00);
        this.A03.setText(r3.A01);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A02.getText();
        AnonymousClass00B.A06(text);
        String obj = text.toString();
        Editable text2 = this.A03.getText();
        AnonymousClass00B.A06(text2);
        return new C64033Mm(onSaveInstanceState, obj, text2.toString());
    }

    public void setOnPhoneNumberChangeListener(AnonymousClass4SS r1) {
        this.A04 = r1;
    }
}
