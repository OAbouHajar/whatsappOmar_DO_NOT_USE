package com.facebook.redex;

import X.AnonymousClass0CB;
import X.AnonymousClass0Cz;
import X.AnonymousClass0DD;
import X.AnonymousClass0DE;
import X.AnonymousClass0OK;
import X.C004601z;
import X.C02570Cy;
import X.C03570Ja;
import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.List;

public class IDxLListenerShape143S0100000_I1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape143S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        switch (this.A01) {
            case 0:
                C02570Cy r2 = (C02570Cy) this.A00;
                if (r2.AJh()) {
                    List<AnonymousClass0OK> list = r2.A0O;
                    if (list.size() > 0 && !((AnonymousClass0OK) list.get(0)).A02.A0E) {
                        View view = r2.A06;
                        if (view == null || !view.isShown()) {
                            r2.dismiss();
                            return;
                        }
                        for (AnonymousClass0OK r0 : list) {
                            r0.A02.AfT();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass0Cz r22 = (AnonymousClass0Cz) this.A00;
                if (r22.AJh()) {
                    AnonymousClass0DE r1 = r22.A0I;
                    if (!r1.A0E) {
                        View view2 = r22.A03;
                        if (view2 == null || !view2.isShown()) {
                            r22.dismiss();
                            return;
                        } else {
                            r1.AfT();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
                if (!appCompatSpinner.A02.AJh()) {
                    appCompatSpinner.A01();
                }
                viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                break;
            case 3:
                AnonymousClass0DD r23 = (AnonymousClass0DD) this.A00;
                AppCompatSpinner appCompatSpinner2 = r23.A04;
                if (!C004601z.A0t(appCompatSpinner2) || !appCompatSpinner2.getGlobalVisibleRect(r23.A03)) {
                    r23.dismiss();
                    return;
                }
                r23.A02();
                IDxLListenerShape143S0100000_I1.super.AfT();
                return;
            default:
                AnonymousClass0CB r24 = (AnonymousClass0CB) this.A00;
                if (r24.A0C) {
                    int i2 = r24.A02;
                    Animator.AnimatorListener animatorListener = r24.A0E;
                    r24.clearAnimation();
                    r24.setScaleX(1.5f);
                    r24.setScaleY(1.5f);
                    r24.animate().setDuration((long) i2).setInterpolator(r24.A04).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(animatorListener);
                } else {
                    boolean equals = r24.A05.equals(C03570Ja.TOP);
                    int height = r24.getHeight();
                    if (equals) {
                        height = -height;
                    }
                    r24.setTranslationY((float) height);
                    r24.A02(r24.A0E, r24.A02);
                }
                r24.A00();
                viewTreeObserver = r24.getViewTreeObserver();
                break;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
