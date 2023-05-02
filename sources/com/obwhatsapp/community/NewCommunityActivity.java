package com.obwhatsapp.community;

import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16010sH;
import X.C16150sX;
import X.C17240ul;
import X.C34721kl;
import X.C49132Rg;
import X.C49362Sq;
import android.os.Bundle;

public class NewCommunityActivity extends C49362Sq {
    public C16010sH A00;
    public C17240ul A01;
    public boolean A02;

    public NewCommunityActivity() {
        this(0);
    }

    public NewCommunityActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 41);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0h(r1, this);
            this.A01 = C16150sX.A0o(r1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            r11 = this;
            r0 = 64206(0xface, float:8.9972E-41)
            java.lang.String r3 = "newcommunity/photopicked"
            r2 = -1
            r10 = 16436755(0xface13, float:2.30328E-38)
            r1 = 0
            r7 = r11
            r6 = r14
            if (r12 == r0) goto L_0x0032
            if (r12 == r10) goto L_0x001b
            r0 = 16436756(0xface14, float:2.3032801E-38)
            if (r12 != r0) goto L_0x00c7
            if (r13 != r2) goto L_0x00c7
            r11.finish()
        L_0x001a:
            return
        L_0x001b:
            X.121 r1 = r11.A09
            X.0sH r0 = r11.A00
            java.io.File r0 = r1.A02(r0)
            r0.delete()
            if (r13 == r2) goto L_0x008c
            if (r13 != 0) goto L_0x001a
            if (r14 == 0) goto L_0x001a
            X.121 r0 = r11.A09
            r0.A03(r14, r11)
            return
        L_0x0032:
            if (r13 != r2) goto L_0x001a
            if (r14 == 0) goto L_0x00cb
            java.lang.String r0 = "is_reset"
            boolean r0 = r14.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "newcommunity/resetphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.120 r1 = r11.A05
            X.0sH r0 = r11.A00
            java.io.File r0 = r1.A00(r0)
            X.AnonymousClass00B.A06(r0)
            r0.delete()
            X.120 r1 = r11.A05
            X.0sH r0 = r11.A00
            java.io.File r0 = r1.A01(r0)
            X.AnonymousClass00B.A06(r0)
            r0.delete()
            android.widget.ImageView r6 = r11.A00
            X.15n r4 = r11.A07
            android.content.res.Resources r3 = r11.getResources()
            r2 = 2131230916(0x7f0800c4, float:1.8077898E38)
            android.content.res.Resources$Theme r1 = r11.getTheme()
            X.2Vp r0 = X.C49752Vp.A00
            android.graphics.drawable.Drawable r0 = r4.A00(r1, r3, r0, r2)
        L_0x0074:
            r6.setImageDrawable(r0)
            return
        L_0x0078:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r14.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00cb
            X.121 r1 = r11.A09
            X.0sH r0 = r11.A00
            java.io.File r0 = r1.A02(r0)
            r0.delete()
        L_0x008c:
            com.whatsapp.util.Log.i((java.lang.String) r3)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131166868(0x7f070694, float:1.7947994E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.152 r2 = r11.A06
            X.0sH r1 = r11.A00
            r0 = 0
            android.graphics.Bitmap r5 = r2.A00(r11, r1, r0, r3)
            if (r5 == 0) goto L_0x001a
            android.widget.ImageView r6 = r11.A00
            X.15n r0 = r11.A07
            android.content.res.Resources r4 = r11.getResources()
            X.2Vp r3 = X.C49752Vp.A00
            X.0pd r2 = r0.A00
            r1 = 1257(0x4e9, float:1.761E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00c1
            X.2Vr r0 = new X.2Vr
            r0.<init>(r4, r5, r3)
            goto L_0x0074
        L_0x00c1:
            X.2Vs r0 = new X.2Vs
            r0.<init>(r4, r5, r3)
            goto L_0x0074
        L_0x00c7:
            super.onActivityResult(r12, r13, r14)
            return
        L_0x00cb:
            java.lang.String r0 = "newcommunity/cropphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.121 r5 = r11.A09
            X.0sH r9 = r11.A00
            r8 = r11
            r5.A05(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.NewCommunityActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r0 > 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        if (r0 > 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (r6 > 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r7.A04.A01(6, 5, X.C13690nt.A0W(r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r3 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r7.A03.A03 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r3.A01(8, java.lang.Integer.valueOf(r5), (java.lang.Long) null, r4);
        super.onBackPressed();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r7 = this;
            X.1L4 r0 = r7.A03
            java.lang.String r4 = r0.A00()
            X.1L4 r0 = r7.A03
            int r6 = r0.A00
            int r0 = r0.A01
            r5 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            if (r6 > 0) goto L_0x0049
            if (r0 <= 0) goto L_0x002e
        L_0x0015:
            X.0va r1 = r7.A04
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r1.A01(r3, r3, r0, r4)
            if (r6 <= 0) goto L_0x002e
        L_0x0020:
            X.0va r2 = r7.A04
            r0 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = X.C13690nt.A0W(r6)
            r2.A01(r1, r3, r0, r4)
        L_0x002e:
            X.0va r3 = r7.A04
            r0 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1L4 r0 = r7.A03
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x003d
            r5 = 4
        L_0x003d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 0
            r3.A01(r2, r1, r0, r4)
            super.onBackPressed()
            return
        L_0x0049:
            if (r0 <= 0) goto L_0x0020
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.NewCommunityActivity.onBackPressed():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new C34721kl(this.A01.A07().getRawString());
    }
}
