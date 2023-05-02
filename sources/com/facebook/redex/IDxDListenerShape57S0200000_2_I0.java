package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1ZK;
import X.AnonymousClass2S6;
import X.AnonymousClass2T8;
import X.AnonymousClass3EX;
import X.AnonymousClass3K2;
import X.C54612hq;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.obwhatsapp.location.WaMapView;

public class IDxDListenerShape57S0200000_2_I0 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape57S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                float width = (float) view.getWidth();
                AnonymousClass3EX r4 = (AnonymousClass3EX) this.A00;
                float f2 = r4.A06;
                if (r4.A0C) {
                    f2 = (f2 * width) / 100.0f;
                }
                view.setTranslationX(f2);
                float height = (float) view.getHeight();
                float f3 = r4.A07;
                if (r4.A0D) {
                    f3 = (f3 * height) / 100.0f;
                }
                view.setTranslationY(f3);
                if (r4.A09) {
                    float width2 = (float) view.getWidth();
                    float f4 = r4.A01;
                    if (r4.A0A) {
                        f4 = (f4 * width2) / 100.0f;
                    }
                    view.setPivotX(f4);
                    float height2 = (float) view.getHeight();
                    float f5 = r4.A02;
                    if (r4.A0B) {
                        f5 = (f5 * height2) / 100.0f;
                    }
                    view.setPivotY(f5);
                }
                viewTreeObserver = view.getViewTreeObserver();
                break;
            case 1:
                AnonymousClass3K2.A10((View) this.A01, this);
                ((C54612hq) this.A00).A05.A0D().A0c();
                return true;
            case 2:
                WaMapView waMapView = (WaMapView) this.A00;
                AnonymousClass2S6 r0 = waMapView.A01;
                AnonymousClass00B.A04(r0);
                AnonymousClass3K2.A10(r0, this);
                waMapView.A01.post(new RunnableRunnableShape18S0100000_I1_1((Object) this, 48));
                return true;
            case 3:
                AnonymousClass2T8 r2 = (AnonymousClass2T8) this.A00;
                AnonymousClass00B.A01();
                if (r2.A01) {
                    viewTreeObserver = ((View) this.A01).getViewTreeObserver();
                    break;
                } else {
                    r2.A00 = SystemClock.elapsedRealtime();
                    return true;
                }
            case 4:
                AnonymousClass3K2.A10((View) this.A01, this);
                ((Runnable) this.A00).run();
                return true;
            default:
                View view2 = (View) this.A01;
                int width3 = view2.getWidth();
                if (width3 <= 0) {
                    return true;
                }
                AnonymousClass3K2.A10(view2, this);
                TextView textView = ((AnonymousClass1ZK) this.A00).A0i;
                int compoundPaddingLeft = width3 - (textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight());
                String charSequence = textView.getText().toString();
                float textSize = textView.getTextSize();
                while (textSize > 1.0f && textView.getPaint().measureText(charSequence) >= ((float) compoundPaddingLeft)) {
                    textSize -= 1.0f;
                    textView.setTextSize(textSize);
                }
                return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
