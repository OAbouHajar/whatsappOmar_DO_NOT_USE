package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C52662eE;
import X.C53072ew;
import X.C55352jN;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

public class WaSwitchView extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final SwitchCompat A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public WaSwitchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WaSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public WaSwitchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        int i5;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        int i6 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C53072ew.A0Y, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i4 = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(3, R.style.style01bc);
                i5 = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i6 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        LinearLayout.inflate(context, R.layout.layout0611, this);
        C55352jN.A00(this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dimen0457);
        setPadding(getPaddingLeft() == 0 ? dimensionPixelOffset : getPaddingLeft(), getPaddingTop() == 0 ? dimensionPixelOffset : getPaddingTop(), getPaddingRight() == 0 ? getResources().getDimensionPixelOffset(R.dimen.dimen0458) : getPaddingRight(), getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelOffset);
        setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.dimen0459));
        WaTextView A0S = C13680ns.A0S(this, R.id.switch_view_title);
        this.A04 = A0S;
        if (i6 != 0) {
            C13690nt.A0s(context, A0S, i6);
        }
        if (i3 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0S.setTextAppearance(i3);
            } else {
                A0S.setTextAppearance(getContext(), i3);
            }
        }
        WaTextView A0S2 = C13680ns.A0S(this, R.id.switch_view_description);
        this.A03 = A0S2;
        if (i4 != 0) {
            C13690nt.A0s(context, A0S2, i4);
        }
        if (i5 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0S2.setTextAppearance(i5);
            } else {
                A0S2.setTextAppearance(getContext(), i5);
            }
        }
        this.A02 = (SwitchCompat) C004601z.A0E(this, R.id.switch_view_toggle);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z2) {
        this.A02.setChecked(z2);
    }

    public void setDescription(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A02.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchClickable(boolean z2) {
        this.A02.setClickable(z2);
    }

    public void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }
}
