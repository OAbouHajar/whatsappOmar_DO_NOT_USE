package com.obwhatsapp.identity;

import X.AnonymousClass01V;
import X.AnonymousClass137;
import X.AnonymousClass15P;
import X.AnonymousClass16S;
import X.AnonymousClass19B;
import X.AnonymousClass19T;
import X.AnonymousClass1BL;
import X.AnonymousClass1SL;
import X.AnonymousClass1WA;
import X.AnonymousClass1WC;
import X.AnonymousClass27N;
import X.AnonymousClass27O;
import X.AnonymousClass2Rf;
import X.AnonymousClass37U;
import X.AnonymousClass42Y;
import X.AnonymousClass4QJ;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
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
import X.C16490t9;
import X.C17090uW;
import X.C17220uj;
import X.C17250um;
import X.C17650vQ;
import X.C18260wP;
import X.C19410yO;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26191Mr;
import X.C33441ia;
import X.C34901l3;
import X.C48682Ol;
import X.C49132Rg;
import X.C51252bG;
import X.C54932iV;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.BidiToolbar;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0;
import com.obwhatsapp.qrcode.WaQrScannerView;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IdentityVerificationActivity extends C14530pL implements C33441ia, AnonymousClass27N, AnonymousClass27O {
    public int A00;
    public int A01;
    public MenuItem A02;
    public View A03;
    public Animation A04;
    public ImageView A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public C51252bG A09;
    public BidiToolbar A0A;
    public AnonymousClass19T A0B;
    public C17090uW A0C;
    public C17650vQ A0D;
    public C16000sG A0E;
    public C16080sP A0F;
    public AnonymousClass1SL A0G;
    public C16260sj A0H;
    public C48682Ol A0I;
    public AnonymousClass19B A0J;
    public C16010sH A0K;
    public C19410yO A0L;
    public AnonymousClass137 A0M;
    public C16490t9 A0N;
    public C26191Mr A0O;
    public AnonymousClass16S A0P;
    public AnonymousClass1BL A0Q;
    public WaQrScannerView A0R;
    public C17220uj A0S;
    public boolean A0T;
    public boolean A0U;
    public final AnonymousClass1WC A0V;
    public final AnonymousClass4QJ A0W;
    public final AnonymousClass4QJ A0X;
    public final Runnable A0Y;
    public final Map A0Z;

    public IdentityVerificationActivity() {
        this(0);
        this.A0Z = Collections.singletonMap(AnonymousClass42Y.A01, "ISO-8859-1");
        this.A0Y = new RunnableRunnableShape9S0100000_I0_8(this, 42);
        this.A0V = new IDxDObserverShape77S0100000_2_I0(this, 2);
        this.A0W = new IDxFCallbackShape85S0100000_2_I0(this, 0);
        this.A0X = new IDxFCallbackShape85S0100000_2_I0(this, 1);
    }

    public IdentityVerificationActivity(int i2) {
        this.A0T = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 54));
    }

    public void A1q() {
        if (!this.A0T) {
            this.A0T = true;
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
            this.A0N = (C16490t9) r1.AQz.get();
            this.A0C = (C17090uW) r1.ADM.get();
            this.A0D = C16150sX.A0J(r1);
            this.A0E = (C16000sG) r1.A4x.get();
            this.A0S = (C17220uj) r1.A9x.get();
            this.A0F = (C16080sP) r1.AQ9.get();
            this.A0O = (C26191Mr) r1.AAe.get();
            this.A0P = (AnonymousClass16S) r1.AFt.get();
            this.A0B = (AnonymousClass19T) r1.ABw.get();
            this.A0H = (C16260sj) r1.AQe.get();
            this.A0M = (AnonymousClass137) r1.A6f.get();
            this.A0L = (C19410yO) r1.A4T.get();
            this.A0G = (AnonymousClass1SL) r1.A1P.get();
            this.A0J = (AnonymousClass19B) r1.APX.get();
            this.A0Q = (AnonymousClass1BL) r1.AJE.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == 101) {
            A39();
            this.A0U = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (X.C35981mo.A02(r2, r3) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00fa, code lost:
        if (r4 == -1) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0093 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0 A[Catch:{ 1bD -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da A[Catch:{ 1bD -> 0x0101 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A35(byte[] r8) {
        /*
            r7 = this;
            X.2Ol r0 = r7.A0I
            X.1o3 r2 = r0.A01     // Catch:{ 1bD -> 0x0101 }
            X.1o3 r0 = X.C36751o3.A04     // Catch:{ 1bD -> 0x0101 }
            X.1Wm r3 = X.C28541Wm.A0E(r0, r8)     // Catch:{ 1bD -> 0x0101 }
            X.1o3 r3 = (X.C36751o3) r3     // Catch:{ 1bD -> 0x0101 }
            int r4 = r3.A00     // Catch:{ 1bD -> 0x0101 }
            r1 = 4
            r0 = r4 & 4
            if (r0 != r1) goto L_0x00fd
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x00fd
            r1 = 1
            r0 = r4 & 1
            if (r0 != r1) goto L_0x00fd
            int r1 = r3.A01     // Catch:{ 1bD -> 0x0101 }
            int r0 = r2.A01     // Catch:{ 1bD -> 0x0101 }
            if (r1 != r0) goto L_0x00fd
            X.1o4 r0 = r2.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0029
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0029:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0031
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0031:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            r6 = -2
            r5 = 1
            if (r0 == 0) goto L_0x005a
            X.1o4 r0 = r2.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0041
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0041:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0049
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0049:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0053
            r4 = -2
            goto L_0x005b
        L_0x0053:
            boolean r0 = X.C35981mo.A02(r2, r3)     // Catch:{ 1bD -> 0x0101 }
            r4 = 1
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r4 = 2
        L_0x005b:
            X.1o4 r0 = r2.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0061
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0061:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0069
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0069:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 == 0) goto L_0x008f
            X.1o4 r0 = r2.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0077
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0077:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x007f
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x007f:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 == 0) goto L_0x00fc
            boolean r0 = X.C35981mo.A01(r2, r3)     // Catch:{ 1bD -> 0x0101 }
            r4 = 2
            if (r0 == 0) goto L_0x008f
            r4 = 1
        L_0x008f:
            X.1o4 r0 = r2.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x0095
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x0095:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x009d
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x009d:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            r6 = -3
            if (r0 == 0) goto L_0x00c4
            X.1o4 r0 = r2.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00ac
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00ac:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00b4
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00b4:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 == 0) goto L_0x00fc
            boolean r0 = X.C35981mo.A02(r2, r3)     // Catch:{ 1bD -> 0x0101 }
            r4 = 2
            if (r0 == 0) goto L_0x00c4
            r4 = 1
        L_0x00c4:
            X.1o4 r0 = r2.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00ca
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00ca:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A03     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00d2
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00d2:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 == 0) goto L_0x00f8
            X.1o4 r0 = r2.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00e0
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00e0:
            X.1Ww r1 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            X.1o4 r0 = r3.A02     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00e8
            X.1o4 r0 = X.C36761o4.A03     // Catch:{ 1bD -> 0x0101 }
        L_0x00e8:
            X.1Ww r0 = r0.A02     // Catch:{ 1bD -> 0x0101 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1bD -> 0x0101 }
            if (r0 == 0) goto L_0x00fc
            boolean r0 = X.C35981mo.A01(r2, r3)     // Catch:{ 1bD -> 0x0101 }
            if (r0 != 0) goto L_0x00f7
            r5 = 2
        L_0x00f7:
            r4 = r5
        L_0x00f8:
            r6 = r4
            r0 = -1
            if (r4 == r0) goto L_0x00fe
        L_0x00fc:
            return r6
        L_0x00fd:
            r6 = -1
        L_0x00fe:
            java.lang.String r0 = "idverification/versionmismatch"
            goto L_0x0104
        L_0x0101:
            r6 = -4
            java.lang.String r0 = "idverification/invalidprotobuf"
        L_0x0104:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.identity.IdentityVerificationActivity.A35(byte[]):int");
    }

    public final void A36() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 11));
        translateAnimation.setDuration(300);
        this.A03.startAnimation(translateAnimation);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A37() {
        /*
            r23 = this;
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r2 = r23
            android.view.WindowManager r0 = r2.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r3)
            int r1 = r3.x
            int r0 = r3.y
            int r0 = java.lang.Math.min(r1, r0)
            int r0 = r0 << 1
            int r1 = r0 / 3
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r3)
            r0 = -1
            r15.drawColor(r0)
            X.2bG r0 = r2.A09
            X.4R5 r14 = r0.A04
            int r13 = r14.A01
            int r12 = r14.A00
            int r11 = r1 / 12
            int r0 = r11 << 1
            int r1 = r1 - r0
            float r10 = (float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r0
            float r0 = (float) r13
            float r16 = r10 / r0
            float r0 = (float) r12
            float r10 = r10 / r0
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setColor(r0)
            r8 = 0
        L_0x004e:
            r6 = 1
            if (r8 >= r13) goto L_0x0085
            r7 = 0
        L_0x0052:
            if (r7 >= r12) goto L_0x0082
            byte[][] r0 = r14.A02
            r0 = r0[r7]
            byte r0 = r0[r8]
            if (r0 != r6) goto L_0x007e
            float r6 = (float) r11
            float r5 = (float) r8
            float r5 = r5 * r16
            float r5 = r5 + r6
            float r4 = (float) r7
            float r4 = r4 * r10
            float r4 = r4 + r6
            int r0 = r8 + 1
            float r1 = (float) r0
            float r1 = r1 * r16
            float r1 = r1 + r6
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r0 * r10
            float r6 = r6 + r0
            r21 = r6
            r22 = r9
            r20 = r1
            r19 = r4
            r18 = r5
            r17 = r15
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x007e:
            int r7 = r7 + 1
            r6 = 1
            goto L_0x0052
        L_0x0082:
            int r8 = r8 + 1
            goto L_0x004e
        L_0x0085:
            r4 = 0
            r10 = 1
            X.0sb r1 = r2.A04
            java.lang.String r0 = "code.png"
            java.io.File r7 = r1.A0N(r0)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x00a2 }
            r1.<init>(r7)     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x00a2 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x009d }
            r3.compress(r0, r4, r1)     // Catch:{ all -> 0x009d }
            r1.close()     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x009d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            throw r0     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x01d1 }
        L_0x00a6:
            r3.recycle()
            X.2Ol r0 = r2.A0I
            X.4TV r0 = r0.A00
            java.lang.String r5 = r0.A00
            java.lang.String r3 = r0.A01
            int r1 = r5.compareTo(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 > 0) goto L_0x00f2
            r0.<init>()
            r0.append(r5)
            r0.append(r3)
        L_0x00c2:
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r1 = r3.length()
        L_0x00cf:
            if (r6 > r1) goto L_0x00fc
            int r0 = r6 + -1
            char r0 = r3.charAt(r0)
            r5.append(r0)
            if (r6 == r1) goto L_0x00e5
            int r0 = r6 % 20
            if (r0 != 0) goto L_0x00e8
            r0 = 10
            r5.append(r0)
        L_0x00e5:
            int r6 = r6 + 1
            goto L_0x00cf
        L_0x00e8:
            int r0 = r6 % 5
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = " "
            r5.append(r0)
            goto L_0x00e5
        L_0x00f2:
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            goto L_0x00c2
        L_0x00fc:
            java.lang.String r0 = "mailto:"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0, r1)
            X.0sK r0 = r2.A01
            r0.A0B()
            X.1ZT r9 = r0.A05
            X.AnonymousClass00B.A06(r9)
            r8 = 2131888945(0x7f120b31, float:1.941254E38)
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            X.013 r1 = r2.A01
            X.0sK r0 = r2.A01
            java.lang.String r0 = r0.A07()
            java.lang.String r0 = r1.A0G(r0)
            r6[r4] = r0
            X.013 r4 = r2.A01
            java.lang.String r1 = r9.user
            X.1Mf r0 = X.C26071Mf.A00()
            java.lang.String r0 = X.C24561Gk.A00(r0, r1)
            java.lang.String r0 = r4.A0H(r0)
            r6[r10] = r0
            java.lang.String r1 = r2.getString(r8, r6)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r3.putExtra(r0, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 2131888944(0x7f120b30, float:1.9412538E38)
            java.lang.String r0 = r2.getString(r0)
            r9.append(r0)
            java.lang.String r4 = "\n"
            r9.append(r4)
            X.013 r1 = r2.A01
            java.lang.String r0 = r5.toString()
            java.lang.String[] r10 = r0.split(r4)
            X.02E r8 = r1.A03()
            int r1 = r0.length()
            int r6 = r10.length
            int r0 = r6 << 2
            int r1 = r1 + r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r4 = 0
        L_0x0172:
            if (r4 >= r6) goto L_0x018f
            r1 = r10[r4]
            X.02F r0 = X.AnonymousClass02G.A04
            if (r1 != 0) goto L_0x0186
            r0 = 0
        L_0x017b:
            r5.append(r0)
            r0 = 10
            r5.append(r0)
            int r4 = r4 + 1
            goto L_0x0172
        L_0x0186:
            java.lang.CharSequence r0 = r8.A03(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x017b
        L_0x018f:
            java.lang.String r0 = r5.toString()
            r9.append(r0)
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "android.intent.extra.TEXT"
            r3.putExtra(r0, r1)
            android.content.Context r0 = r2.getApplicationContext()
            android.net.Uri r1 = X.AnonymousClass1XI.A01(r0, r7)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "image/png"
            r3.setType(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r0)
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r3, r0)
            r2.startActivity(r0)
            return
        L_0x01bf:
            r1 = move-exception
            java.lang.String r0 = "idverification/sharefailed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01d1 }
            X.0pt r1 = r2.A05     // Catch:{ all -> 0x01d1 }
            r0 = 2131891709(0x7f1215fd, float:1.9418146E38)
            r1.A09(r0, r4)     // Catch:{ all -> 0x01d1 }
            r3.recycle()
            return
        L_0x01d1:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.identity.IdentityVerificationActivity.A37():void");
    }

    public final void A38() {
        WaQrScannerView waQrScannerView = this.A0R;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            return;
        }
        if (this.A0H.A03("android.permission.CAMERA") != 0) {
            C54932iV r2 = new C54932iV(this);
            r2.A01 = R.drawable.permission_cam;
            r2.A06 = R.string.str11a8;
            r2.A09 = R.string.str11a7;
            r2.A0K = new String[]{"android.permission.CAMERA"};
            startActivityForResult(r2.A00(), 1);
            return;
        }
        findViewById(R.id.overlay).setVisibility(0);
        this.A0R.setVisibility(0);
        this.A07.setVisibility(8);
        this.A05.A0J(this.A0Y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0201 A[LOOP:3: B:60:0x01f7->B:64:0x0201, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A39() {
        /*
            r18 = this;
            r13 = r18
            X.2Ol r0 = r13.A0I
            r2 = 1
            if (r0 != 0) goto L_0x0024
            r5 = 0
            r13.A3E(r5)
            android.widget.TextView r4 = r13.A08
            r3 = 2131892624(0x7f121990, float:1.9420002E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.0sP r1 = r13.A0F
            X.0sH r0 = r13.A0K
            java.lang.String r0 = r1.A0C(r0)
            r2[r5] = r0
            java.lang.String r0 = r13.getString(r3, r2)
            r4.setText(r0)
            return
        L_0x0024:
            int r4 = r13.A01
            int r10 = r13.A00
            r0 = 2131366892(0x7f0a13ec, float:1.835369E38)
            android.view.View r6 = r13.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r6 = (com.obwhatsapp.TextEmojiLabel) r6
            r8 = 0
            r6.setFocusable(r8)
            X.3MF r3 = new X.3MF
            r3.<init>()
            r1 = 45
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r13, r1)
            r3.A01 = r0
            r6.A07 = r3
            X.0sP r1 = r13.A0F
            X.0sH r0 = r13.A0K
            java.lang.String r0 = r1.A0C(r0)
            java.lang.String r12 = android.text.Html.escapeHtml(r0)
            X.16S r0 = r13.A0P
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 != 0) goto L_0x0113
            if (r10 > 0) goto L_0x0113
            X.0uj r1 = r13.A0S
            java.lang.String r0 = "28030015"
        L_0x0061:
            android.net.Uri r0 = r1.A04(r0)
            java.lang.String r11 = r0.toString()
            X.0sK r1 = r13.A01
            X.0sH r0 = r13.A0K
            X.0rv r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x00ce
            X.0pd r3 = r13.A0C
            r1 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x00ce
            r1 = 2131889506(0x7f120d62, float:1.9413677E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r8] = r11
        L_0x0088:
            java.lang.String r1 = r13.getString(r1, r0)
        L_0x008c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            android.text.Spanned r0 = X.AnonymousClass1ZW.A01(r1, r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            int r1 = r4.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r7 = r4.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x0123
            int r5 = r7.length
            r9 = 0
        L_0x00a7:
            if (r9 >= r5) goto L_0x0119
            r10 = r7[r9]
            X.0pt r15 = r13.A05
            X.01V r0 = r13.A08
            X.0uW r14 = r13.A0C
            java.lang.String r17 = r10.getURL()
            X.2uk r12 = new X.2uk
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            int r3 = r4.getSpanStart(r10)
            int r1 = r4.getSpanEnd(r10)
            int r0 = r4.getSpanFlags(r10)
            r4.setSpan(r12, r3, r1, r0)
            int r9 = r9 + 1
            goto L_0x00a7
        L_0x00ce:
            X.137 r0 = r13.A0M
            X.0pd r3 = r0.A0E
            r1 = 903(0x387, float:1.265E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            r9 = 2
            if (r0 == 0) goto L_0x00e7
            r1 = 2131892632(0x7f121998, float:1.9420018E38)
        L_0x00e0:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r12
            r0[r2] = r11
            goto L_0x0088
        L_0x00e7:
            r0 = 3
            if (r4 <= 0) goto L_0x0103
            if (r10 <= 0) goto L_0x010b
            X.013 r7 = r13.A01
            r5 = 2131755385(0x7f100179, float:1.9141648E38)
        L_0x00f1:
            long r3 = (long) r10
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r8] = r12
            r1[r2] = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r9] = r0
            java.lang.String r1 = r7.A0J(r1, r5, r3)
            goto L_0x008c
        L_0x0103:
            if (r10 <= 0) goto L_0x010f
            X.013 r7 = r13.A01
            r5 = 2131755386(0x7f10017a, float:1.914165E38)
            goto L_0x00f1
        L_0x010b:
            r1 = 2131892633(0x7f121999, float:1.942002E38)
            goto L_0x00e0
        L_0x010f:
            r1 = 2131892631(0x7f121997, float:1.9420016E38)
            goto L_0x00e0
        L_0x0113:
            X.0uj r1 = r13.A0S
            java.lang.String r0 = "26000361"
            goto L_0x0061
        L_0x0119:
            if (r8 >= r5) goto L_0x0123
            r0 = r7[r8]
            r4.removeSpan(r0)
            int r8 = r8 + 1
            goto L_0x0119
        L_0x0123:
            X.01V r1 = r13.A08
            X.2q8 r0 = new X.2q8
            r0.<init>(r6, r1)
            r6.setAccessibilityHelper(r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r6.setText(r4, r0)
            r0 = 2131365585(0x7f0a0ed1, float:1.835104E38)
            android.view.View r5 = r13.findViewById(r0)
            com.obwhatsapp.QrImageView r5 = (com.obwhatsapp.QrImageView) r5
            java.lang.Class<X.41U> r0 = X.AnonymousClass41U.class
            java.util.EnumMap r4 = new java.util.EnumMap     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            r4.<init>(r0)     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            X.2Ol r0 = r13.A0I     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            X.1o3 r0 = r0.A01     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            byte[] r3 = r0.A02()     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r1 = new java.lang.String     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            r1.<init>(r3, r0)     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            X.2bE r0 = X.C51232bE.A02     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            X.2bG r1 = X.C51242bF.A00(r0, r1, r4)     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            r13.A09 = r1     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            r0 = 0
            r5.setQrCode(r1, r0)     // Catch:{ 440 | UnsupportedEncodingException -> 0x015e }
            goto L_0x0164
        L_0x015e:
            r1 = move-exception
            java.lang.String r0 = "idverification/"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0164:
            X.2Ol r0 = r13.A0I
            X.4TV r0 = r0.A00
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r0.A01
            int r1 = r4.compareTo(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 > 0) goto L_0x01b8
            r0.<init>()
            r0.append(r4)
            r0.append(r3)
        L_0x017d:
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r3 = r4.length()
            r6 = 0
            r1 = 1
        L_0x018c:
            if (r1 > r3) goto L_0x01c2
            int r0 = r1 + -1
            char r0 = r4.charAt(r0)
            r5.append(r0)
            if (r1 == r3) goto L_0x01a8
            int r0 = r1 % 20
            if (r0 != 0) goto L_0x01ab
            if (r6 != 0) goto L_0x01a3
            java.lang.String r6 = r5.toString()
        L_0x01a3:
            r0 = 10
        L_0x01a5:
            r5.append(r0)
        L_0x01a8:
            int r1 = r1 + 1
            goto L_0x018c
        L_0x01ab:
            int r0 = r1 % 5
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = "     "
            r5.append(r0)
            goto L_0x01a8
        L_0x01b5:
            r0 = 32
            goto L_0x01a5
        L_0x01b8:
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            goto L_0x017d
        L_0x01c2:
            android.widget.TextView r0 = r13.A08
            float r4 = r0.getTextSize()
            android.widget.TextView r0 = r13.A08
            android.text.TextPaint r0 = r0.getPaint()
            float r7 = r0.measureText(r6)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            android.view.WindowManager r0 = r13.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r3)
            int r1 = r3.x
            int r0 = r3.y
            int r0 = java.lang.Math.min(r1, r0)
            float r3 = (float) r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166273(0x7f070441, float:1.7946787E38)
            float r0 = r1.getDimension(r0)
            float r3 = r3 - r0
        L_0x01f7:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0212
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0212
            float r4 = r4 - r1
            android.widget.TextView r0 = r13.A08
            r0.setTextSize(r4)
            android.widget.TextView r0 = r13.A08
            android.text.TextPaint r0 = r0.getPaint()
            float r7 = r0.measureText(r6)
            goto L_0x01f7
        L_0x0212:
            android.widget.TextView r1 = r13.A08
            java.lang.String r0 = r5.toString()
            r1.setText(r0)
            android.widget.TextView r0 = r13.A08
            X.C45902Bo.A03(r0)
            r13.A3E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.identity.IdentityVerificationActivity.A39():void");
    }

    public final void A3A(Intent intent) {
        C14870pt r2;
        int i2;
        NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        UserJid nullable = UserJid.getNullable(new String(ndefMessage.getRecords()[0].getId(), Charset.forName("US-ASCII")));
        if (nullable != null) {
            C16010sH A0A2 = this.A0E.A0A(nullable);
            this.A0K = A0A2;
            String A0C2 = this.A0F.A0C(A0A2);
            A2f(getString(R.string.str198f, new Object[]{A0C2}));
            A3D(false);
            if (this.A0I == null) {
                Log.w("idverification/ndef/no-fingerprint");
                return;
            }
            int A35 = A35(payload);
            if (A35 == -3) {
                r2 = this.A05;
                i2 = R.string.str1996;
            } else if (A35 != -2) {
                if (A35 != 1) {
                    if (A35 == 2) {
                        A3F(false);
                    } else {
                        return;
                    }
                }
                A3F(true);
                return;
            } else {
                r2 = this.A05;
                i2 = R.string.str1995;
            }
            r2.A0H(getString(i2, new Object[]{A0C2}), 1);
        }
    }

    public final void A3B(UserJid userJid) {
        if (this.A01.A0I(userJid) || userJid.equals(this.A0K.A08(UserJid.class))) {
            runOnUiThread(new RunnableRunnableShape9S0100000_I0_8(this, 46));
        }
    }

    public final void A3C(Runnable runnable) {
        WaQrScannerView waQrScannerView = this.A0R;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            findViewById(R.id.main_layout).setVisibility(0);
            findViewById(R.id.scan_code).setVisibility(0);
            findViewById(R.id.verify_identity_qr_tip).setVisibility(8);
            findViewById(R.id.overlay).setVisibility(8);
            this.A07.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration((long) getResources().getInteger(17694721));
            translateAnimation.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(runnable, 3, this));
            findViewById(R.id.main_layout).startAnimation(translateAnimation);
        }
    }

    public final void A3D(boolean z2) {
        Ac1();
        AnonymousClass4QJ r5 = z2 ? this.A0X : this.A0W;
        C26191Mr r4 = this.A0O;
        AnonymousClass1WA r3 = r4.A04;
        r3.A00();
        new AnonymousClass37U(r4, r5, (UserJid) this.A0K.A08(UserJid.class)).A02.executeOnExecutor(r3, new Void[0]);
    }

    public final void A3E(boolean z2) {
        MenuItem menuItem = this.A02;
        if (menuItem != null) {
            menuItem.setVisible(z2);
        }
        View findViewById = findViewById(R.id.footer);
        int i2 = 0;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        findViewById.setVisibility(i3);
        View findViewById2 = findViewById(R.id.verify_identity_tip);
        int i4 = 8;
        if (z2) {
            i4 = 0;
        }
        findViewById2.setVisibility(i4);
        View findViewById3 = findViewById(R.id.qr_code_group);
        if (!z2) {
            i2 = 8;
        }
        findViewById3.setVisibility(i2);
    }

    public final void A3F(boolean z2) {
        this.A05.setVisibility(0);
        ImageView imageView = this.A05;
        int i2 = R.drawable.red_circle;
        if (z2) {
            i2 = R.drawable.green_circle;
        }
        imageView.setBackgroundResource(i2);
        ImageView imageView2 = this.A05;
        int i3 = R.string.str0b32;
        if (z2) {
            i3 = R.string.str0b33;
        }
        imageView2.setContentDescription(getString(i3));
        ImageView imageView3 = this.A05;
        int i4 = R.drawable.ill_verification_failure;
        if (z2) {
            i4 = R.drawable.ill_verification_success;
        }
        imageView3.setImageResource(i4);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration((long) getResources().getInteger(17694721));
        this.A05.startAnimation(animationSet);
        this.A05.setFocusable(true);
        this.A05.setFocusableInTouchMode(true);
        this.A05.requestFocus();
        this.A05.A0L(this.A0Y, 4000);
    }

    public void AN7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (C34901l3.A00(this.A0K.A08(UserJid.class), deviceJid == null ? null : deviceJid.getUserJid())) {
                A3D(false);
            }
        }
    }

    public void ARn(DeviceJid deviceJid, int i2) {
        runOnUiThread(new RunnableRunnableShape8S0200000_I0_6(this, 2, deviceJid));
    }

    public void AS5(DeviceJid deviceJid) {
        A3B(deviceJid.getUserJid());
    }

    public void AS6(DeviceJid deviceJid) {
        A3B(deviceJid.getUserJid());
    }

    public void AS7(DeviceJid deviceJid) {
        A3B(deviceJid.getUserJid());
    }

    public void AZT(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            A3B(userJid);
        }
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0R;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0 && findViewById(R.id.main_layout).getVisibility() == 8) {
            A3C((Runnable) null);
        } else {
            super.finish();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            A38();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0070, code lost:
        if (r6.A0C.A0E(X.C16620tM.A02, 1967) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r1 = r6.getIntent()     // Catch:{ 1W4 -> 0x01ba }
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ 1W4 -> 0x01ba }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.get(r0)     // Catch:{ 1W4 -> 0x01ba }
            X.0sG r0 = r6.A0E
            X.0sH r0 = r0.A0A(r1)
            r6.A0K = r0
            r0 = 2131559158(0x7f0d02f6, float:1.8743652E38)
            r6.setContentView((int) r0)
            r5 = 2131893723(0x7f121ddb, float:1.942223E38)
            r6.setTitle(r5)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r6, r0)
            com.obwhatsapp.BidiToolbar r4 = (com.obwhatsapp.BidiToolbar) r4
            r6.A0A = r4
            X.013 r3 = r6.A01
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131231482(0x7f0802fa, float:1.8079046E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131100869(0x7f0604c5, float:1.7814132E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r2, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r3)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            com.obwhatsapp.BidiToolbar r0 = r6.A0A
            r0.setTitle((int) r5)
            X.0sK r1 = r6.A01
            X.0sH r0 = r6.A0K
            X.0rv r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0072
            X.0pd r2 = r6.A0C
            r1 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r2.A0E(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r4 = 0
            com.obwhatsapp.BidiToolbar r5 = r6.A0A
            if (r0 == 0) goto L_0x0165
            X.0sP r2 = r6.A0F
            X.013 r1 = r6.A01
            X.0sH r0 = r6.A0K
            java.lang.String r0 = X.C40641uS.A00(r6, r2, r1, r0)
        L_0x0082:
            r5.setSubtitle((java.lang.CharSequence) r0)
            com.obwhatsapp.BidiToolbar r1 = r6.A0A
            r0 = 2131101259(0x7f06064b, float:1.7814923E38)
            r1.setBackgroundResource(r0)
            com.obwhatsapp.BidiToolbar r1 = r6.A0A
            r0 = 2131952361(0x7f1302e9, float:1.9541163E38)
            r1.A0C(r6, r0)
            com.obwhatsapp.BidiToolbar r2 = r6.A0A
            r1 = 24
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.setNavigationOnClickListener(r0)
            com.obwhatsapp.BidiToolbar r0 = r6.A0A
            r6.Aem(r0)
            r0 = 2131364073(0x7f0a08e9, float:1.8347973E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A08 = r0
            r0 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.A06 = r0
            r0 = 2131363533(0x7f0a06cd, float:1.8346878E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A07 = r0
            r0 = 2131365595(0x7f0a0edb, float:1.835106E38)
            android.view.View r0 = r6.findViewById(r0)
            com.obwhatsapp.qrcode.WaQrScannerView r0 = (com.obwhatsapp.qrcode.WaQrScannerView) r0
            r6.A0R = r0
            r0 = 2131364009(0x7f0a08a9, float:1.8347843E38)
            android.view.View r0 = r6.findViewById(r0)
            r6.A03 = r0
            X.0rz r0 = r6.A09
            boolean r0 = r0.A1Y()
            if (r0 != 0) goto L_0x0101
            X.0rz r3 = r6.A09
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            java.lang.String r0 = "security_notifications_alert_timestamp"
            boolean r0 = r3.A1n(r0, r1)
            if (r0 == 0) goto L_0x0101
            android.view.View r3 = r6.A03
            r0 = 49
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r2 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r2.<init>(r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x0101:
            r0 = 2131363440(0x7f0a0670, float:1.8346689E38)
            android.view.View r2 = r6.findViewById(r0)
            r1 = 23
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.setOnClickListener(r0)
            r0 = 2131362762(0x7f0a03ca, float:1.8345314E38)
            android.view.View r2 = r6.findViewById(r0)
            r1 = 12
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            com.obwhatsapp.qrcode.WaQrScannerView r1 = r6.A0R
            java.util.Map r0 = r6.A0Z
            r1.setQrDecodeHints(r0)
            X.3Gp r0 = new X.3Gp
            r0.<init>(r6)
            r1.setQrScannerCallback(r0)
            r6.A3E(r4)
            r6.A3D(r4)
            r0 = 2131365820(0x7f0a0fbc, float:1.8351516E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r6, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A05 = r0
            r0 = 2131365885(0x7f0a0ffd, float:1.8351648E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r6, r0)
            r1 = 25
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.setOnClickListener(r0)
            X.0sj r1 = r6.A0H
            java.lang.String r0 = "android.permission.NFC"
            int r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x01a3
            android.nfc.NfcAdapter r2 = android.nfc.NfcAdapter.getDefaultAdapter(r6)
            if (r2 == 0) goto L_0x018c
            goto L_0x017b
        L_0x0165:
            r3 = 2131892623(0x7f12198f, float:1.942E38)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.0sP r1 = r6.A0F
            X.0sH r0 = r6.A0K
            java.lang.String r0 = r1.A0C(r0)
            r2[r4] = r0
            java.lang.String r0 = r6.getString(r3, r2)
            goto L_0x0082
        L_0x017b:
            X.4gn r1 = new X.4gn     // Catch:{ IllegalStateException | SecurityException -> 0x0186 }
            r1.<init>(r6)     // Catch:{ IllegalStateException | SecurityException -> 0x0186 }
            android.app.Activity[] r0 = new android.app.Activity[r4]     // Catch:{ IllegalStateException | SecurityException -> 0x0186 }
            r2.setNdefPushMessageCallback(r1, r6, r0)     // Catch:{ IllegalStateException | SecurityException -> 0x0186 }
            goto L_0x018c
        L_0x0186:
            r1 = move-exception
            java.lang.String r0 = "idverification/ "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x018c:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a3
            android.content.Intent r0 = r6.getIntent()
            r6.A3A(r0)
        L_0x01a3:
            X.1SL r0 = r6.A0G
            r0.A02(r6)
            X.19T r0 = r6.A0B
            r0.A02(r6)
            X.19B r0 = r6.A0J
            r0.A02(r6)
            X.0yO r1 = r6.A0L
            X.1WC r0 = r6.A0V
            r1.A02(r0)
            return
        L_0x01ba:
            r1 = move-exception
            java.lang.String r0 = "idverification/finishing due to invalid jid"
            com.whatsapp.util.Log.e(r0, r1)
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.identity.IdentityVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_share, 0, R.string.str15f0).setIcon(R.drawable.ic_action_share);
        this.A02 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A02;
        boolean z2 = false;
        if (this.A0I != null) {
            z2 = true;
        }
        menuItem.setVisible(z2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A03(this);
        this.A0B.A03(this);
        this.A0J.A03(this);
        this.A0L.A03(this.A0V);
        this.A05.A0J(this.A0Y);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            A3A(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_share) {
            WaQrScannerView waQrScannerView = this.A0R;
            if (waQrScannerView == null || waQrScannerView.getVisibility() != 0) {
                A37();
                return true;
            }
            A3C(new RunnableRunnableShape9S0100000_I0_8(this, 43));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        if (this.A0R.getVisibility() == 0) {
            this.A0R.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0R.getVisibility() == 4) {
            this.A0R.setVisibility(0);
        }
        this.A05.Acl(new RunnableRunnableShape9S0100000_I0_8(this, 47));
    }
}
