package com.obwhatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass32z;
import X.C102824za;
import X.C102834zb;
import X.C108105Mr;
import X.C13680ns;
import X.C13690nt;
import X.C55602k1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.obwhatsapp.WaEditText;

public class DoodleEditText extends WaEditText {
    public int A00;
    public C108105Mr A01;
    public boolean A02;

    public DoodleEditText(Context context) {
        super(context);
        A02();
        this.A00 = 0;
        setLayerType(1, (Paint) null);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A00 = 0;
        setLayerType(1, (Paint) null);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A00 = 0;
        setLayerType(1, (Paint) null);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void onDraw(Canvas canvas) {
        if (this.A00 == 3) {
            int currentTextColor = getCurrentTextColor();
            setTextColor(-16777216);
            getPaint().setStrokeWidth(getTextSize() / 12.0f);
            C13690nt.A0y(getPaint());
            super.onDraw(canvas);
            setTextColor(currentTextColor);
            getPaint().setStrokeWidth(0.0f);
            getPaint().setStyle(Paint.Style.FILL);
        }
        super.onDraw(canvas);
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        C108105Mr r0 = this.A01;
        if (r0 != null) {
            C102824za r02 = (C102824za) r0;
            C55602k1 r3 = r02.A00;
            C102834zb r2 = r02.A01;
            if (i2 == 4 && keyEvent.getAction() == 1) {
                r3.A04.A05(r3.A06);
                r2.A04.A03 = C13680ns.A0f(r3.A05);
                r2.dismiss();
            }
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    public void setFontStyle(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            setTypeface(i2 == 3 ? AnonymousClass32z.A02(getContext()) : i2 == 2 ? AnonymousClass32z.A03(getContext()) : i2 == 1 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            setAllCaps(false);
        }
    }

    public void setOnKeyPreImeListener(C108105Mr r1) {
        this.A01 = r1;
    }
}
