package X;

import com.obwhatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.2V9  reason: invalid class name */
public final class AnonymousClass2V9 {
    public final C54792iF A00;
    public final CameraModeTabLayout A01;
    public final boolean A02;

    public AnonymousClass2V9(C54792iF r2, CameraModeTabLayout cameraModeTabLayout, boolean z2) {
        C18450wi.A0H(cameraModeTabLayout, 2);
        this.A00 = r2;
        this.A01 = cameraModeTabLayout;
        this.A02 = z2;
        if (z2) {
            cameraModeTabLayout.A00 = r2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r3.getWhatsAppLocale().A0T() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ((!r3.getWhatsAppLocale().A0T()) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(float r8) {
        /*
            r7 = this;
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0052
            com.obwhatsapp.camera.mode.CameraModeTabLayout r3 = r7.A01
            int r6 = r3.getSelectedTabPosition()
            r1 = 0
            r5 = 0
            r4 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001e
            X.013 r0 = r3.getWhatsAppLocale()
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            r2 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            X.013 r0 = r3.getWhatsAppLocale()
            boolean r1 = r0.A0T()
            r0 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r2 != 0) goto L_0x0035
            int r2 = r6 + -1
            if (r0 == 0) goto L_0x0037
        L_0x0035:
            int r2 = r6 + 1
        L_0x0037:
            r1 = 0
            if (r2 >= 0) goto L_0x003b
            r1 = 1
        L_0x003b:
            java.util.ArrayList r0 = r3.A0c
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r2 <= r0) goto L_0x0045
            r5 = 1
        L_0x0045:
            r1 = r1 | r5
            if (r1 != 0) goto L_0x0052
            X.2Kr r0 = r3.A04(r2)
            X.C18450wi.A0F(r0)
            r0.A01()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V9.A00(float):void");
    }

    public final void A01(int i2) {
        if (this.A02) {
            this.A01.setVisibility(i2);
        }
    }
}
