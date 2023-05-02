package com.obwhatsapp.status.playback;

import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass10X;
import X.AnonymousClass12W;
import X.AnonymousClass14W;
import X.AnonymousClass158;
import X.AnonymousClass15P;
import X.AnonymousClass19Y;
import X.AnonymousClass1A9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1CX;
import X.AnonymousClass1DX;
import X.AnonymousClass1KE;
import X.AnonymousClass1KX;
import X.AnonymousClass1L1;
import X.AnonymousClass1M5;
import X.AnonymousClass1M7;
import X.AnonymousClass1M9;
import X.AnonymousClass1ME;
import X.AnonymousClass1MF;
import X.AnonymousClass1MJ;
import X.AnonymousClass1P7;
import X.AnonymousClass1SS;
import X.AnonymousClass2Rf;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16760tb;
import X.C17020u3;
import X.C17150uc;
import X.C17200uh;
import X.C17250um;
import X.C18210wK;
import X.C18260wP;
import X.C18940xV;
import X.C19150xq;
import X.C19490yW;
import X.C19610yi;
import X.C19820z3;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C212613k;
import X.C23061Ai;
import X.C23071Aj;
import X.C25751Kz;
import X.C25791Ld;
import X.C25801Le;
import X.C25821Lg;
import X.C25831Lh;
import X.C25841Li;
import X.C25861Lk;
import X.C25981Lw;
import X.C49132Rg;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;

public class StatusReplyActivity extends MessageReplyActivity {
    public AnonymousClass158 A00;
    public C19150xq A01;
    public AnonymousClass1L1 A02;
    public boolean A03;
    public final Rect A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;
    public final C18940xV A06;
    public final Runnable A07;

    public StatusReplyActivity() {
        this(0);
        this.A04 = new Rect();
        this.A07 = new RunnableRunnableShape15S0100000_I0_14(this, 0);
        this.A06 = new IDxMObserverShape74S0100000_2_I0(this, 13);
        this.A05 = new IDxLListenerShape144S0100000_2_I0(this, 27);
    }

    public StatusReplyActivity(int i2) {
        this.A03 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 99));
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0h = (C25841Li) r1.AB1.get();
            this.A0U = (C25801Le) r1.AFa.get();
            this.A0C = (AnonymousClass10X) r1.ALc.get();
            this.A0Z = (C15810rt) r1.A43.get();
            this.A0d = (C16490t9) r1.AQz.get();
            this.A0H = (AnonymousClass1KE) r1.AMJ.get();
            this.A0D = (C16760tb) r1.APV.get();
            this.A0G = (AnonymousClass1KX) r1.A3h.get();
            this.A0l = (C18210wK) r1.AE4.get();
            this.A0b = (C206711d) r1.AKp.get();
            this.A0Q = (C17200uh) r1.A52.get();
            this.A0k = (AnonymousClass1P7) r1.ADc.get();
            this.A0N = (C16000sG) r1.A4x.get();
            this.A0S = (C25831Lh) r1.A5Q.get();
            this.A0t = (C212613k) r1.AK2.get();
            this.A12 = (AnonymousClass1A9) r1.AE7.get();
            this.A0J = (C25821Lg) r1.AMI.get();
            this.A0O = (C16080sP) r1.AQ9.get();
            this.A0K = (AnonymousClass01Y) r1.A1w.get();
            this.A0a = (C16460t6) r1.A5k.get();
            this.A0v = (AnonymousClass14W) r1.ANc.get();
            this.A0p = (AnonymousClass1DX) r1.A3R.get();
            this.A0i = (C25861Lk) r1.AJq.get();
            this.A13 = (C25791Ld) r1.AFY.get();
            this.A0V = (AnonymousClass12W) r1.AEM.get();
            this.A0w = (AnonymousClass1CX) r1.ANk.get();
            this.A0M = (AnonymousClass19Y) r1.A4r.get();
            this.A0c = (AnonymousClass1BQ) r1.A7f.get();
            this.A0W = (C16260sj) r1.AQe.get();
            this.A15 = (C25981Lw) r1.A7S.get();
            this.A0E = (C25751Kz) r1.A33.get();
            this.A0F = (C17150uc) r1.A34.get();
            this.A0u = (AnonymousClass1MF) r1.ANa.get();
            this.A0r = (C17020u3) r1.AMG.get();
            this.A0T = (C19610yi) r1.AEq.get();
            this.A17 = r2.A0i();
            this.A0L = (AnonymousClass1SS) r1.A4S.get();
            this.A0e = r2.A0L();
            this.A0o = (AnonymousClass1M5) r1.AHS.get();
            this.A10 = (AnonymousClass1M7) r1.ANp.get();
            this.A0x = (AnonymousClass1M9) r1.ANV.get();
            this.A0I = (AnonymousClass1ME) r1.AGk.get();
            this.A0Y = (AnonymousClass1MJ) r1.A69.get();
            this.A0X = (C19820z3) r1.A7p.get();
            this.A01 = (C19150xq) r1.AFC.get();
            this.A02 = (AnonymousClass1L1) r1.ANR.get();
            this.A00 = (AnonymousClass158) r1.AFX.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r0 = r5.A0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3E() {
        /*
            r5 = this;
            android.view.View r0 = r5.A04
            android.graphics.Rect r2 = r5.A04
            r0.getWindowVisibleDisplayFrame(r2)
            r0 = 2
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A04
            r0.getLocationOnScreen(r1)
            int r4 = r2.bottom
            android.view.View r0 = r5.A03
            int r0 = r0.getMeasuredHeight()
            int r4 = r4 - r0
            android.view.View r0 = r5.A04
            boolean r0 = X.C23061Ai.A00(r0)
            if (r0 != 0) goto L_0x006c
            X.2Jn r0 = r5.A0f
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x006c
            X.2Jn r0 = r5.A0f
            int r0 = r0.A01
        L_0x002e:
            int r4 = r4 - r0
            r0 = 1
            r0 = r1[r0]
            int r4 = r4 - r0
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Essential Products"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "PH-1"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0061
            android.content.res.Resources r3 = r5.getResources()
            java.lang.String r2 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)
            if (r1 <= 0) goto L_0x0061
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            int r4 = r4 - r0
        L_0x0061:
            android.view.View r1 = r5.A03
            int r0 = r1.getTop()
            int r4 = r4 - r0
            X.C004601z.A0b(r1, r4)
            return
        L_0x006c:
            r0 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.StatusReplyActivity.A3E():void");
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(134217728, 134217728);
            getWindow().setFlags(67108864, 67108864);
        }
        super.onCreate(bundle);
        View view = this.A04;
        if (view != null) {
            view.setSystemUiVisibility(4);
            this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A05);
            this.A01.A02(this.A06);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.A03(this.A06);
        View view = this.A04;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A05);
            this.A04.removeCallbacks(this.A07);
        }
    }
}
