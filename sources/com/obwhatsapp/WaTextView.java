package com.obwhatsapp;

import X.AnonymousClass013;
import X.AnonymousClass01S;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass1ZW;
import X.C14710pd;
import X.C16620tM;
import X.C30541cY;
import X.C53072ew;
import X.C53122f3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.method.TransformationMethod;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.obwhatsapp.yo.tf;
import com.whatsapp.util.Log;

public class WaTextView extends C30541cY {
    public int A00 = 0;
    public AnonymousClass013 A01;
    public C14710pd A02;
    public boolean A03;

    public WaTextView(Context context) {
        super(context);
        tf.myFace(this);
        A08();
    }

    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        tf.myFace(this);
        A06(context, attributeSet);
    }

    public WaTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        tf.myFace(this);
        A06(context, attributeSet);
    }

    private void A06(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0Z);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A01.A09(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(this.A01.A09(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A01.A09(resourceId3), getImeActionId());
            }
            this.A03 = obtainStyledAttributes.getBoolean(4, false);
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A01.A09(resourceId4));
            }
            obtainStyledAttributes.recycle();
            A08();
        }
    }

    public final void A08() {
        C14710pd r2;
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod == null) {
            return;
        }
        if (((transformationMethod instanceof AnonymousClass08M) || transformationMethod.getClass().getName().equals("android.text.method.AllCapsTransformationMethod")) && !this.A03 && (r2 = this.A02) != null && r2.A0E(C16620tM.A02, 1963)) {
            setAllCaps(false);
        }
    }

    public final void A09() {
        CharSequence text = getText();
        Typeface typeface = getTypeface();
        boolean z2 = false;
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            Class<StyleSpan> cls = StyleSpan.class;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(text.length() - 2, text.length() - 1, cls);
            if (((StyleSpan[]) spanned.getSpans(0, 1, cls)).length > 0 || styleSpanArr.length > 0) {
                z2 = true;
            }
        }
        this.A00 = ((typeface == null || !typeface.isItalic()) && !z2) ? 0 : (int) Layout.getDesiredWidth(AnonymousClass01S.A06, getPaint());
        invalidate();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth() + this.A00, getMeasuredHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAllCaps(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0014
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0019
            X.0pd r2 = r3.A02
            if (r2 == 0) goto L_0x0019
            r1 = 1963(0x7ab, float:2.751E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            r0 = 0
        L_0x0015:
            super.setAllCaps(r0)
            return
        L_0x0019:
            r0 = 1
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.WaTextView.setAllCaps(boolean):void");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && charSequence.length() >= 3000) {
            StringBuilder sb = new StringBuilder("WaTextView/maybePrintDebugInfoForLongText length=");
            sb.append(charSequence.length() / 1000);
            sb.append("k");
            Log.i(sb.toString());
            C53122f3.A00(this, "WaTextView/maybePrintDebugInfoForLongText/");
        }
        super.setText(AnonymousClass1ZW.A02(charSequence), bufferType);
        A09();
    }

    public void setTextAsError(CharSequence charSequence, AnonymousClass013 r5) {
        super.setContentDescription(r5.A0C(R.string.str1783, charSequence));
        super.setText(charSequence);
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (Build.MANUFACTURER.equalsIgnoreCase("lenovo") && Build.VERSION.SDK_INT == 17 && typeface != null && i2 > 0) {
            Typeface A002 = AnonymousClass08N.A00(getContext(), typeface, i2);
        }
        A09();
    }
}
