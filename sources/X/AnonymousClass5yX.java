package X;

import android.os.Handler;

/* renamed from: X.5yX  reason: invalid class name */
public class AnonymousClass5yX implements Handler.Callback {
    public static void A00(C119235wl r7) {
        if (r7 != null) {
            int A0D = AnonymousClass000.A0D(r7.A00(C119235wl.A0D));
            int A0D2 = AnonymousClass000.A0D(r7.A00(C119235wl.A0C));
            String str = (String) r7.A01(C119235wl.A0G);
            int A0D3 = AnonymousClass000.A0D(r7.A00(C119235wl.A0E));
            int A0D4 = AnonymousClass000.A0D(r7.A00(C119235wl.A0B));
            int i2 = 0;
            if (A0D4 != 0) {
                i2 = 1;
                if (1 != A0D4) {
                    throw AnonymousClass000.A0a(C13680ns.A0c(A0D4, "Could not convert camera facing from optic: "));
                }
            }
            if (AnonymousClass000.A1X(r7.A01(C119235wl.A0H))) {
                ((Number) r7.A01(C119235wl.A0F)).intValue();
            }
            ((Number) r7.A01(C119235wl.A0L)).intValue();
            new C118765vD(str, A0D, A0D2, A0D3, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        r1.AO0(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            int r0 = r13.what
            r6 = 2
            r4 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0169;
                case 2: goto L_0x013b;
                case 3: goto L_0x0106;
                case 4: goto L_0x00db;
                case 5: goto L_0x01e9;
                case 6: goto L_0x018c;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00ab;
                case 9: goto L_0x0180;
                case 10: goto L_0x0097;
                case 11: goto L_0x007b;
                case 12: goto L_0x0064;
                case 13: goto L_0x0051;
                case 14: goto L_0x0051;
                case 15: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r2
        L_0x0009:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r3 = r1[r2]
            X.5yh r3 = (X.C119575yh) r3
            r4 = r1[r4]
            X.5sE r4 = (X.C116965sE) r4
            r0 = r1[r6]
            int r7 = X.AnonymousClass000.A0D(r0)
            r0 = 3
            r0 = r1[r0]
            int r8 = X.AnonymousClass000.A0D(r0)
            if (r7 <= 0) goto L_0x0008
            if (r8 <= 0) goto L_0x0008
            X.5wI r1 = r4.A02
            X.5qO r0 = X.AnonymousClass5wI.A0m
            java.lang.Object r0 = r1.A05(r0)
            X.5vQ r0 = (X.AnonymousClass5vQ) r0
            if (r0 == 0) goto L_0x0008
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            X.69e r5 = r3.A0N
            int r9 = r0.A02
            int r10 = r0.A01
            boolean r11 = r3.A0C
            r5.Af7(r6, r7, r8, r9, r10, r11)
            int r0 = r4.A00
            r5.AIG(r6, r7, r8, r0)
            boolean r0 = X.AnonymousClass5zQ.A0C
            if (r0 != 0) goto L_0x0008
            android.view.TextureView r0 = r3.A0J
            r0.setTransform(r6)
            return r2
        L_0x0051:
            java.lang.Object r0 = r13.obj
            X.5qg r0 = (X.C116015qg) r0
            com.obwhatsapp.camera.litecamera.LiteCameraView r3 = r0.A00
            X.5yh r1 = r3.A0D
            r0 = 0
            r1.A0B = r0
            X.2V3 r0 = r3.A00
            if (r0 == 0) goto L_0x0008
            r0.AN1(r2)
            return r2
        L_0x0064:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r0 = r0[r2]
            X.5qg r0 = (X.C116015qg) r0
            com.obwhatsapp.camera.litecamera.LiteCameraView r3 = r0.A00
            X.5yh r1 = r3.A0D
            r0 = 0
            r1.A0B = r0
            X.2V3 r0 = r3.A00
            if (r0 == 0) goto L_0x0008
            r0.AN1(r4)
            return r2
        L_0x007b:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.5qg r0 = (X.C116015qg) r0
            r4 = r1[r4]
            android.graphics.Point r4 = (android.graphics.Point) r4
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            X.2V3 r3 = r0.A00
            if (r3 == 0) goto L_0x0008
            int r0 = r4.x
            float r1 = (float) r0
            int r0 = r4.y
            float r0 = (float) r0
            r3.AN0(r1, r0)
            return r2
        L_0x0097:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.5qf r0 = (X.C116005qf) r0
            r3 = r1[r4]
            java.lang.Exception r3 = (java.lang.Exception) r3
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            X.2V3 r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 4
            goto L_0x00d7
        L_0x00ab:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r2]
            X.5qf r1 = (X.C116005qf) r1
            r0 = r0[r4]
            X.5wl r0 = (X.C119235wl) r0
            A00(r0)
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r1.A00
            X.2V3 r0 = r0.A00
            if (r0 == 0) goto L_0x0008
            r0.AZX()
            return r2
        L_0x00c4:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.5rb r0 = (X.C116575rb) r0
            r3 = r1[r4]
            java.lang.Exception r3 = (java.lang.Exception) r3
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r0.A01
            X.2V3 r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 3
        L_0x00d7:
            r1.AO0(r3, r0)
            return r2
        L_0x00db:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6 = r0[r2]
            java.util.List r6 = (java.util.List) r6
            r5 = 0
        L_0x00e4:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x0008
            java.lang.Object r0 = r6.get(r5)
            X.5ti r0 = (X.C117885ti) r0
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            r0.A0J = r2
            X.2V3 r4 = r0.A00
            if (r4 == 0) goto L_0x0103
            r3 = 2
            java.lang.String r1 = "CameraCustomException: Camera error evicted"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r4.AO0(r0, r3)
        L_0x0103:
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x0106:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6 = r0[r2]
            java.util.List r6 = (java.util.List) r6
            r5 = r0[r4]
            java.lang.Exception r5 = (java.lang.Exception) r5
            r4 = 0
        L_0x0113:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x0008
            java.lang.Object r0 = r6.get(r4)
            X.5ti r0 = (X.C117885ti) r0
            com.obwhatsapp.camera.litecamera.LiteCameraView r3 = r0.A00
            r3.A0J = r2
            boolean r0 = r3.A07
            r1 = 1
            if (r0 != 0) goto L_0x0133
            r3.A07 = r1
            r3.pause()
            r3.Acc()
        L_0x0130:
            int r4 = r4 + 1
            goto L_0x0113
        L_0x0133:
            X.2V3 r0 = r3.A00
            if (r0 == 0) goto L_0x0130
            r0.AO0(r5, r1)
            goto L_0x0130
        L_0x013b:
            java.lang.Object r5 = r13.obj
            java.util.List r5 = (java.util.List) r5
            r4 = 0
        L_0x0140:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x0008
            java.lang.Object r0 = r5.get(r4)
            X.5ti r0 = (X.C117885ti) r0
            com.obwhatsapp.camera.litecamera.LiteCameraView r1 = r0.A00
            X.5yh r0 = r1.A0D
            int r3 = r0.A00
            android.content.SharedPreferences r0 = r1.A0B
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "camera_facing"
            X.C13680ns.A0w(r1, r0, r3)
            java.lang.Object r0 = r5.get(r4)
            X.5ti r0 = (X.C117885ti) r0
            r0.A00()
            int r4 = r4 + 1
            goto L_0x0140
        L_0x0169:
            java.lang.Object r3 = r13.obj
            java.util.List r3 = (java.util.List) r3
            r1 = 0
        L_0x016e:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r3.get(r1)
            X.5ti r0 = (X.C117885ti) r0
            r0.A00()
            int r1 = r1 + 1
            goto L_0x016e
        L_0x0180:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r0 = r0[r4]
            X.5wl r0 = (X.C119235wl) r0
            A00(r0)
            return r2
        L_0x018c:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r5 = r0[r2]
            X.5rb r5 = (X.C116575rb) r5
            r4 = r0[r4]
            byte[] r4 = (byte[]) r4
            r3 = r0[r6]
            X.5wg r3 = (X.C119185wg) r3
            if (r3 == 0) goto L_0x01dd
            X.5qS r0 = X.C119185wg.A0L
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            if (r1 == 0) goto L_0x01ba
            r0 = 1
            if (r0 == r1) goto L_0x01ba
            java.lang.String r0 = "Could not convert camera facing from optic: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x01ba:
            X.5qT r0 = X.C119185wg.A0U
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0b
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0P
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0W
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0Q
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0X
            r3.A00(r0)
            X.5qT r0 = X.C119185wg.A0S
            r3.A00(r0)
        L_0x01dd:
            X.2VC r1 = r5.A00
            com.obwhatsapp.camera.litecamera.LiteCameraView r0 = r5.A01
            boolean r0 = r0.AIs()
            r1.A01(r4, r0)
            return r2
        L_0x01e9:
            java.lang.Object r0 = r13.obj
            X.5rb r0 = (X.C116575rb) r0
            X.2VC r0 = r0.A00
            r0.A00()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5yX.handleMessage(android.os.Message):boolean");
    }
}
