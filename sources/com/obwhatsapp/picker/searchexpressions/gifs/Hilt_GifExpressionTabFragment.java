package com.obwhatsapp.picker.searchexpressions.gifs;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.C13690nt;
import X.C16150sX;
import X.C17020u3;
import X.C17050uS;
import X.C17060uT;
import X.C23061Ai;
import X.C25841Li;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_GifExpressionTabFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C13690nt.A0Y();
    public volatile C54442hW A04;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A01();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        return C54452hX.A00(super.A0v(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C54442hW.A00(r1) == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0V = r0
            android.content.ContextWrapper r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r2.A01()
            r2.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.picker.searchexpressions.gifs.Hilt_GifExpressionTabFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            GifExpressionTabFragment gifExpressionTabFragment = (GifExpressionTabFragment) this;
            C16150sX r1 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            C16150sX.A1E(r1, gifExpressionTabFragment);
            gifExpressionTabFragment.A03 = (C25841Li) r1.AB1.get();
            gifExpressionTabFragment.A02 = C16150sX.A0m(r1);
            gifExpressionTabFragment.A00 = C16150sX.A0T(r1);
            gifExpressionTabFragment.A07 = (C17020u3) r1.AMG.get();
            gifExpressionTabFragment.A01 = C16150sX.A0Y(r1);
            gifExpressionTabFragment.A08 = (C23061Ai) r1.AC0.get();
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}