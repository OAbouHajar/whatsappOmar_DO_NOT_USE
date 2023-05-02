package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass1GN;
import X.AnonymousClass1K9;
import X.AnonymousClass1KA;
import X.AnonymousClass1KE;
import X.AnonymousClass1KX;
import X.AnonymousClass1KY;
import X.AnonymousClass38Q;
import X.AnonymousClass3F1;
import X.AnonymousClass3F2;
import X.AnonymousClass52P;
import X.AnonymousClass5MT;
import X.AnonymousClass5TL;
import X.C13700nu;
import X.C14710pd;
import X.C14870pt;
import X.C16040sK;
import X.C16320sq;
import X.C16490t9;
import X.C17090uW;
import X.C17150uc;
import X.C17170ue;
import X.C18640x1;
import X.C19980zJ;
import X.C23081Ak;
import X.C23091Al;
import X.C25751Kz;
import X.C25821Lg;
import X.C35611mD;
import X.C35701mM;
import X.C448425v;
import X.C47612Jr;
import X.C50262Yq;
import X.C52662eE;
import X.C54302hB;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class CatalogMediaCard extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public C19980zJ A02;
    public C14870pt A03;
    public C16040sK A04;
    public C17150uc A05;
    public AnonymousClass1KY A06;
    public AnonymousClass1K9 A07;
    public C17170ue A08;
    public C23081Ak A09;
    public C50262Yq A0A;
    public AnonymousClass5MT A0B;
    public AnonymousClass38Q A0C;
    public AnonymousClass5TL A0D;
    public AnonymousClass013 A0E;
    public C14710pd A0F;
    public UserJid A0G;
    public C23091Al A0H;
    public C448425v A0I;
    public C16320sq A0J;
    public C52662eE A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;

    public CatalogMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CatalogMediaCard(android.content.Context r40, android.util.AttributeSet r41, int r42) {
        /*
            r39 = this;
            r12 = r39
            r38 = r40
            r18 = r41
            r2 = r42
            r1 = r38
            r0 = r18
            r12.<init>(r1, r0, r2)
            boolean r0 = r12.A0M
            if (r0 != 0) goto L_0x0132
            r0 = 1
            r12.A0M = r0
            java.lang.Object r0 = r12.generatedComponent()
            X.0sX r11 = X.C52652eD.A00(r0)
            X.0pd r0 = X.C16150sX.A0k(r11)
            r12.A0F = r0
            X.01J r7 = r11.AB3
            java.lang.Object r0 = r7.get()
            X.0pt r0 = (X.C14870pt) r0
            r12.A03 = r0
            X.01J r6 = r11.ADr
            java.lang.Object r0 = r6.get()
            X.0sK r0 = (X.C16040sK) r0
            r12.A04 = r0
            X.01J r5 = r11.ARB
            java.lang.Object r0 = r5.get()
            X.0sq r0 = (X.C16320sq) r0
            r12.A0J = r0
            X.01J r4 = r11.A0P
            java.lang.Object r0 = r4.get()
            X.0zJ r0 = (X.C19980zJ) r0
            r12.A02 = r0
            X.01J r3 = r11.AMM
            java.lang.Object r0 = r3.get()
            X.1K9 r0 = (X.AnonymousClass1K9) r0
            r12.A07 = r0
            X.013 r0 = X.C16150sX.A0Z(r11)
            r12.A0E = r0
            X.01J r2 = r11.A3d
            java.lang.Object r0 = r2.get()
            X.1KY r0 = (X.AnonymousClass1KY) r0
            r12.A06 = r0
            X.01J r0 = r11.A3Z
            java.lang.Object r0 = r0.get()
            X.1Ak r0 = (X.C23081Ak) r0
            r12.A09 = r0
            X.01J r0 = r11.A34
            r16 = r0
            java.lang.Object r0 = r16.get()
            X.0uc r0 = (X.C17150uc) r0
            r12.A05 = r0
            X.01J r1 = r11.A3W
            java.lang.Object r0 = r1.get()
            X.0ue r0 = (X.C17170ue) r0
            r12.A08 = r0
            java.lang.Object r17 = r7.get()
            r0 = r17
            X.0pt r0 = (X.C14870pt) r0
            r17 = r0
            java.lang.Object r15 = r6.get()
            X.0sK r15 = (X.C16040sK) r15
            java.lang.Object r14 = r5.get()
            X.0sq r14 = (X.C16320sq) r14
            X.0t9 r33 = X.C16150sX.A0m(r11)
            X.1GN r35 = new X.1GN
            r35.<init>()
            java.lang.Object r13 = r4.get()
            X.0zJ r13 = (X.C19980zJ) r13
            X.01J r0 = r11.AMJ
            java.lang.Object r10 = r0.get()
            X.1KE r10 = (X.AnonymousClass1KE) r10
            X.0uW r22 = X.C16150sX.A03(r11)
            java.lang.Object r9 = r3.get()
            X.1K9 r9 = (X.AnonymousClass1K9) r9
            X.01J r0 = r11.AMI
            java.lang.Object r8 = r0.get()
            X.1Lg r8 = (X.C25821Lg) r8
            X.01J r0 = r11.AMT
            java.lang.Object r7 = r0.get()
            X.19m r7 = (X.C228419m) r7
            X.01J r0 = r11.A3a
            java.lang.Object r6 = r0.get()
            X.1KA r6 = (X.AnonymousClass1KA) r6
            java.lang.Object r5 = r2.get()
            X.1KY r5 = (X.AnonymousClass1KY) r5
            java.lang.Object r4 = r1.get()
            X.0ue r4 = (X.C17170ue) r4
            X.01J r0 = r11.A33
            java.lang.Object r3 = r0.get()
            X.1Kz r3 = (X.C25751Kz) r3
            X.01J r0 = r11.A3X
            java.lang.Object r2 = r0.get()
            X.0x1 r2 = (X.C18640x1) r2
            java.lang.Object r1 = r16.get()
            X.0uc r1 = (X.C17150uc) r1
            X.01J r0 = r11.A3e
            java.lang.Object r0 = r0.get()
            X.1KW r0 = (X.AnonymousClass1KW) r0
            X.38Q r16 = new X.38Q
            r27 = r9
            r28 = r2
            r29 = r4
            r30 = r6
            r31 = r10
            r32 = r8
            r34 = r0
            r36 = r14
            r37 = r7
            r23 = r15
            r24 = r3
            r25 = r1
            r26 = r5
            r19 = r16
            r20 = r13
            r21 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = r16
            r12.A0C = r0
            X.01J r0 = r11.A3f
            java.lang.Object r0 = r0.get()
            X.1Al r0 = (X.C23091Al) r0
            r12.A0H = r0
        L_0x0132:
            r3 = 0
            if (r41 == 0) goto L_0x0192
            int[] r2 = X.C53072ew.A05
            r1 = r38
            r0 = r18
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0, r2)
            boolean r0 = r1.getBoolean(r3, r3)
            r1.recycle()
        L_0x0146:
            android.view.LayoutInflater r2 = X.C13680ns.A0G(r12)
            r1 = 2131558583(0x7f0d00b7, float:1.8742486E38)
            if (r0 == 0) goto L_0x0152
            r1 = 2131558584(0x7f0d00b8, float:1.8742488E38)
        L_0x0152:
            r0 = 1
            android.view.View r1 = r2.inflate(r1, r12, r0)
            r0 = 2131365490(0x7f0a0e72, float:1.8350847E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            X.25v r0 = (X.C448425v) r0
            r12.A0I = r0
            r0.setTopShadowVisibility(r3)
            X.25v r4 = r12.A0I
            int r3 = r12.getPaddingLeft()
            int r2 = r12.getPaddingTop()
            int r1 = r12.getPaddingRight()
            int r0 = r12.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
            X.1Ak r2 = r12.A09
            X.1Al r1 = r12.A0H
            X.2Yq r0 = new X.2Yq
            r0.<init>(r2, r1)
            r12.A0A = r0
            X.25v r0 = r12.A0I
            int r1 = r0.getThumbnailPixelSize()
            r12.A01 = r1
            X.1Ak r0 = r12.A09
            r0.A01 = r1
            return
        L_0x0192:
            r0 = 0
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.catalog.view.CatalogMediaCard.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public List A00(UserJid userJid, String str, List list, boolean z2) {
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size() && i2 < 6; i3++) {
            C35701mM r5 = (C35701mM) list.get(i3);
            if (r5.A01() && !r5.A0D.equals(this.A0L)) {
                i2++;
                A0u.add(new C54302hB((Drawable) null, this.A0D.AGY(r5, userJid, z2), new AnonymousClass52P(r5, this), (String) null, str, C47612Jr.A04(AnonymousClass1KX.A00(0, r5.A0D))));
            }
        }
        return A0u;
    }

    public void A01() {
        this.A0A.A00();
        AnonymousClass38Q r4 = this.A0C;
        AnonymousClass5TL[] r2 = {r4.A01, r4.A00};
        int i2 = 0;
        do {
            AnonymousClass5TL r0 = r2[i2];
            if (r0 != null) {
                r0.A69();
            }
            i2++;
        } while (i2 < 2);
        r4.A00 = null;
        r4.A01 = null;
    }

    public void A02(C35611mD r32, UserJid userJid, String str, boolean z2, boolean z3) {
        AnonymousClass3F1 r9;
        UserJid userJid2 = userJid;
        this.A0G = userJid2;
        boolean z4 = z3;
        this.A0N = z4;
        String str2 = str;
        this.A0L = str2;
        AnonymousClass38Q r10 = this.A0C;
        C25751Kz r6 = r10.A06;
        C35611mD r14 = r32;
        if (r6.A01(r14)) {
            AnonymousClass3F1 r92 = r10.A01;
            AnonymousClass3F1 r93 = r92;
            if (r92 == null) {
                C16490t9 r5 = r10.A0F;
                C17090uW r4 = r10.A04;
                AnonymousClass1KE r3 = r10.A0D;
                AnonymousClass3F1 r15 = new AnonymousClass3F1(r4, r6, r10.A09, r3, this, r10.A0E, r5, r10.A0J);
                r10.A01 = r15;
                r93 = r15;
            }
            AnonymousClass00B.A06(r14);
            r93.A00 = r14;
            r9 = r93;
        } else {
            AnonymousClass3F2 r94 = r10.A00;
            AnonymousClass3F2 r95 = r94;
            if (r94 == null) {
                C14870pt r18 = r10.A03;
                C16040sK r16 = r10.A05;
                C19980zJ r152 = r10.A02;
                C16320sq r8 = r10.A0I;
                AnonymousClass1GN r7 = r10.A0H;
                AnonymousClass1KA r62 = r10.A0C;
                C25821Lg r52 = r10.A0E;
                C18640x1 r42 = r10.A0A;
                C17170ue r33 = r10.A0B;
                C17150uc r2 = r10.A07;
                boolean z5 = z4;
                C19980zJ r17 = r152;
                AnonymousClass3F2 r162 = new AnonymousClass3F2(r17, r18, r16, r2, r10.A08, r42, r33, r62, this, r52, r10.A0G, r7, r8, z5);
                r10.A00 = r162;
                r95 = r162;
            }
            r95.A01 = str2;
            r95.A00 = r14;
            r9 = r95;
        }
        this.A0D = r9;
        if (z2 && r9.AHU(userJid2)) {
            this.A0D.ARC(userJid2);
        } else if (this.A0D.AfH()) {
            setVisibility(8);
        } else {
            this.A0D.AIC(userJid2);
            this.A0D.A4g();
            this.A0D.A8x(userJid2, this.A01);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0K;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass5MT getCatalogPreviewItemClickListener() {
        return this.A0B;
    }

    public String getMediaCardViewErrorText() {
        return this.A0I.getError();
    }

    public AnonymousClass5TL getMediaCardViewPresenter() {
        return this.A0D;
    }

    public void setCatalogPreviewItemClickListener(AnonymousClass5MT r1) {
        this.A0B = r1;
    }

    public void setError(int i2) {
        this.A0I.setError(C13700nu.A0H(this, i2));
    }

    public void setupThumbnails(UserJid userJid, int i2, List list) {
        AnonymousClass5TL r1 = this.A0D;
        UserJid userJid2 = this.A0G;
        AnonymousClass00B.A06(userJid2);
        int AFF = r1.AFF(userJid2);
        if (AFF != this.A00) {
            this.A0I.A08(A00(userJid, C13700nu.A0H(this, i2), list, this.A0N), 5);
            this.A00 = AFF;
        }
    }
}
