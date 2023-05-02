package com.obwhatsapp.profile;

import X.AnonymousClass01V;
import X.AnonymousClass121;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass1A8;
import X.AnonymousClass1BQ;
import X.AnonymousClass1NO;
import X.AnonymousClass27A;
import X.AnonymousClass29I;
import X.AnonymousClass2Rf;
import X.AnonymousClass5RN;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14770pj;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16010sH;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17020u3;
import X.C17140ub;
import X.C17160ud;
import X.C17250um;
import X.C18260wP;
import X.C18900xR;
import X.C19090xk;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C23061Ai;
import X.C23071Aj;
import X.C33481ie;
import X.C49132Rg;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;

public class ProfilePhotoReminder extends C14530pL {
    public Bitmap A00;
    public Handler A01;
    public View A02;
    public ImageView A03;
    public C18900xR A04;
    public WaEditText A05;
    public C17160ud A06;
    public C17140ub A07;
    public AnonymousClass152 A08;
    public C16010sH A09;
    public C206711d A0A;
    public AnonymousClass29I A0B;
    public AnonymousClass1BQ A0C;
    public C19090xk A0D;
    public C14770pj A0E;
    public C17020u3 A0F;
    public AnonymousClass121 A0G;
    public AnonymousClass1A8 A0H;
    public Runnable A0I;
    public boolean A0J;
    public final AnonymousClass5RN A0K;
    public final C33481ie A0L;

    public ProfilePhotoReminder() {
        this(0);
        this.A0K = new IDxCListenerShape203S0100000_2_I0(this, 9);
        this.A0L = new IDxCObserverShape68S0100000_2_I0(this, 25);
    }

    public ProfilePhotoReminder(int i2) {
        this.A0J = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 69));
    }

    public void A1q() {
        if (!this.A0J) {
            this.A0J = true;
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
            this.A04 = (C18900xR) r1.ALD.get();
            this.A0A = (C206711d) r1.AKp.get();
            this.A06 = (C17160ud) r1.A4t.get();
            this.A0D = (C19090xk) r1.AF1.get();
            this.A0H = (AnonymousClass1A8) r1.AKL.get();
            this.A07 = (C17140ub) r1.A4y.get();
            this.A0C = (AnonymousClass1BQ) r1.A7f.get();
            this.A0E = (C14770pj) r1.AF9.get();
            this.A0G = (AnonymousClass121) r1.AJY.get();
            this.A0F = (C17020u3) r1.AMG.get();
            this.A08 = (AnonymousClass152) r1.A51.get();
        }
    }

    public final void A35() {
        Bitmap A002;
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0694);
        float dimension = getResources().getDimension(R.dimen.dimen0692);
        C16040sK r0 = this.A01;
        r0.A0B();
        if (AnonymousClass27A.A00(r0.A05)) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
            A002 = this.A00;
            if (A002 == null) {
                A002 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                this.A00 = A002;
            }
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
            A002 = this.A08.A00(this, this.A09, dimension, dimensionPixelSize);
            if (A002 == null) {
                C16010sH r1 = this.A09;
                if (r1.A05 == 0 && r1.A04 == 0) {
                    this.A02.setVisibility(0);
                    Handler handler = this.A01;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        this.A01 = handler;
                        this.A0I = new RunnableRunnableShape12S0100000_I0_11((Object) this, 31);
                    }
                    handler.removeCallbacks(this.A0I);
                    this.A01.postDelayed(this.A0I, AnonymousClass1NO.A0L);
                } else {
                    this.A02.setVisibility(4);
                }
                A002 = C17160ud.A00(this, dimension, R.drawable.avatar_contact, dimensionPixelSize);
            }
        }
        this.A03.setImageBitmap(A002);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 12) {
            if (i2 != 13) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            this.A0G.A01.A0N("tmpi").delete();
            if (i3 != -1) {
                if (i3 == 0 && intent != null) {
                    this.A0G.A03(intent, this);
                    return;
                }
                return;
            }
        } else if (i3 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A02.setVisibility(0);
                    this.A0G.A08(this.A09);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0G.A01.A0N("tmpi").delete();
                }
            }
            this.A0G.A04(intent, this, 13);
            return;
        } else {
            return;
        }
        if (this.A0G.A0A(this.A09)) {
            this.A02.setVisibility(0);
        }
    }

    public void onBackPressed() {
        if (!this.A0B.A02()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0117, code lost:
        if (X.C45902Bo.A01 == false) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r2 = r27
            r0 = r28
            super.onCreate(r0)
            r0 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r2.setTitle(r0)
            X.02i r10 = r2.x()
            X.AnonymousClass00B.A06(r10)
            r8 = 1
            r10.A0O(r8)
            r0 = 2131559644(0x7f0d04dc, float:1.8744638E38)
            r2.setContentView((int) r0)
            X.0sK r0 = r2.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            r2.A09 = r0
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "profilephotoreminder/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.C14750ph.A04(r2)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x0039:
            r0 = 2131364793(0x7f0a0bb9, float:1.8349433E38)
            android.view.View r9 = r2.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131363376(0x7f0a0630, float:1.834656E38)
            android.view.View r13 = r2.findViewById(r0)
            android.widget.ImageButton r13 = (android.widget.ImageButton) r13
            r0 = 2131365712(0x7f0a0f50, float:1.8351297E38)
            android.view.View r0 = r2.findViewById(r0)
            com.obwhatsapp.WaEditText r0 = (com.obwhatsapp.WaEditText) r0
            r2.A05 = r0
            X.0pd r0 = r2.A0C
            r17 = r0
            X.1Ai r0 = r2.A0B
            r16 = r0
            X.0so r15 = r2.A03
            X.0um r14 = r2.A0B
            X.11d r12 = r2.A0A
            X.01V r11 = r2.A08
            X.013 r6 = r2.A01
            X.1BQ r5 = r2.A0C
            X.0rz r4 = r2.A09
            X.0u3 r3 = r2.A0F
            r0 = 2131364431(0x7f0a0a4f, float:1.8348699E38)
            android.view.View r1 = r2.findViewById(r0)
            X.0qs r1 = (X.C15430qs) r1
            com.obwhatsapp.WaEditText r0 = r2.A05
            X.2JH r7 = new X.2JH
            r20 = r6
            r21 = r12
            r22 = r14
            r23 = r5
            r24 = r17
            r25 = r3
            r26 = r16
            r18 = r11
            r19 = r4
            r16 = r1
            r17 = r0
            r14 = r13
            r12 = r7
            r13 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.5RN r0 = r2.A0K
            r7.A0C(r0)
            r0 = 2131363408(0x7f0a0650, float:1.8346624E38)
            android.view.View r6 = r2.findViewById(r0)
            com.obwhatsapp.emoji.search.EmojiSearchContainer r6 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r6
            X.0um r5 = r2.A0B
            X.11d r4 = r2.A0A
            X.013 r1 = r2.A01
            X.0u3 r0 = r2.A0F
            X.29I r3 = new X.29I
            r12 = r2
            r13 = r1
            r14 = r7
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.A0B = r3
            r1 = 7
            com.facebook.redex.IDxEListenerShape200S0100000_2_I0 r0 = new com.facebook.redex.IDxEListenerShape200S0100000_2_I0
            r0.<init>(r2, r1)
            r3.A00 = r0
            r1 = 30
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r2, (int) r1)
            r7.A0E = r0
            r0 = 2131362707(0x7f0a0393, float:1.8345202E38)
            android.view.View r3 = r2.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.A03 = r3
            r1 = 27
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r0 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            X.013 r7 = r2.A01
            r0 = 2131889632(0x7f120de0, float:1.9413933E38)
            java.lang.String r6 = r2.getString(r0)
            r0 = 28
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r4 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r4.<init>(r2, r0)
            android.content.Context r0 = r10.A02()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            r3 = 2131558441(0x7f0d0029, float:1.8742198E38)
            r1 = 0
            r0 = 0
            android.view.View r5 = r5.inflate(r3, r1, r0)
            r0 = -2
            X.05K r3 = new X.05K
            r3.<init>((int) r0, (int) r0)
            boolean r0 = r7.A0T()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0119
            boolean r1 = X.C45902Bo.A01
            r0 = 3
            if (r1 != 0) goto L_0x011a
        L_0x0119:
            r0 = 5
        L_0x011a:
            r3.A00 = r0
            r10.A0H(r5, r3)
            r0 = 2131361905(0x7f0a0071, float:1.8343576E38)
            android.view.View r1 = r5.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r7.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            java.lang.String r0 = r6.toUpperCase(r0)
            r1.setText(r0)
            r0 = 2131361904(0x7f0a0070, float:1.8343574E38)
            android.view.View r0 = r5.findViewById(r0)
            r0.setOnClickListener(r4)
            r0 = 2131362708(0x7f0a0394, float:1.8345204E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.A02 = r0
            r2.A35()
            X.013 r1 = r2.A01
            com.obwhatsapp.WaEditText r0 = r2.A05
            X.C45902Bo.A0C(r0, r1)
            com.obwhatsapp.WaEditText r7 = r2.A05
            X.0um r6 = r2.A0B
            X.01V r5 = r2.A08
            X.013 r3 = r2.A01
            X.0u3 r1 = r2.A0F
            r4 = 25
            r17 = 0
            X.35O r0 = new X.35O
            r16 = 25
            r18 = 0
            r11 = r9
            r12 = r5
            r13 = r3
            r14 = r6
            r15 = r1
            r9 = r0
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7.addTextChangedListener(r0)
            com.obwhatsapp.WaEditText r3 = r2.A05
            android.text.InputFilter[] r1 = new android.text.InputFilter[r8]
            X.4jh r0 = new X.4jh
            r0.<init>(r4)
            r1[r17] = r0
            r3.setFilters(r1)
            X.0sK r0 = r2.A01
            java.lang.String r1 = r0.A07()
            com.obwhatsapp.WaEditText r0 = r2.A05
            r0.setText(r1)
            com.obwhatsapp.WaEditText r1 = r2.A05
            int r0 = r1.length()
            r1.setSelection(r0)
            X.0xR r0 = r2.A04
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = "profilephotoreminder/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xk r1 = r2.A0D
            X.0pj r0 = r2.A0E
            X.C46052Cd.A02(r2, r1, r0)
        L_0x01a9:
            X.0ub r1 = r2.A07
            X.1ie r0 = r2.A0L
            r1.A02(r0)
            return
        L_0x01b1:
            X.0xR r0 = r2.A04
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "profilephotoreminder/sw-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xk r1 = r2.A0D
            X.0pj r0 = r2.A0E
            X.C46052Cd.A03(r2, r1, r0)
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ProfilePhotoReminder.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A03(this.A0L);
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A0I);
        }
    }
}
