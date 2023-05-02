package X;

import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.27B  reason: invalid class name */
public class AnonymousClass27B implements C19550yc {
    public boolean A00;
    public final C15830rv A01;
    public final C17190ug A02;
    public final AnonymousClass27A A03;

    public AnonymousClass27B(C15830rv r1, C17190ug r2, AnonymousClass27A r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r6, String str) {
        C14870pt r2;
        int i2;
        AnonymousClass27A r4 = this.A03;
        int A002 = C34451kH.A00(r6);
        StringBuilder sb = new StringBuilder("profilephotohandler/request failed : ");
        sb.append(A002);
        sb.append(" | ");
        C15830rv r22 = r4.A0I;
        sb.append(r22);
        Log.i(sb.toString());
        r4.A01(3);
        r4.A03 = true;
        r4.A01.cancel();
        AnonymousClass27A.A0N.remove(r4.A02.toString());
        if (!r4.A04) {
            C16010sH A0A = r4.A09.A0A(r22);
            if (A002 != 401 || !A0A.A0J() || r4.A0F.A09((GroupJid) A0A.A08(GroupJid.class))) {
                r2 = r4.A07;
                i2 = 23;
            } else {
                r2 = r4.A07;
                i2 = 24;
            }
            r2.A0K(new RunnableRunnableShape0S0101000_I0(r4, A002, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r7 != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0052
            r0 = 0
            X.1Vv r2 = r12.A0I(r0)
            java.lang.String r0 = "picture"
            X.C28371Vv.A06(r2, r0)
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r2 = r2.A0N(r1, r0)
        L_0x0015:
            X.27A r3 = r11.A03
            java.lang.String r0 = "profilephotohandler/request success : "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.0rv r8 = r3.A0I
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 1
            r3.A03 = r7
            X.5CT r0 = r3.A01
            r0.cancel()
            java.util.HashMap r1 = X.AnonymousClass27A.A0N
            java.lang.Long r0 = r3.A02
            java.lang.String r0 = r0.toString()
            r1.remove(r0)
            r3.A01(r7)
            X.0sG r0 = r3.A09
            X.0sH r4 = r0.A0A(r8)
            r10 = -1
            if (r2 == 0) goto L_0x0058
            goto L_0x0054
        L_0x0052:
            r2 = 0
            goto L_0x0015
        L_0x0054:
            int r10 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005d }
        L_0x0058:
            X.12A r0 = r3.A0C     // Catch:{ NumberFormatException -> 0x005d }
            r0.A01(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x005d }
        L_0x005d:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0109
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x00eb
            X.120 r0 = r3.A0B
            java.io.File r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x0081
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0081
            com.obwhatsapp.data.ProfilePhotoChange r9 = new com.obwhatsapp.data.ProfilePhotoChange
            r9.<init>()
            byte[] r0 = X.C29301aP.A00(r1)     // Catch:{ IOException -> 0x0083 }
            r9.oldPhoto = r0     // Catch:{ IOException -> 0x0083 }
            goto L_0x0089
        L_0x0081:
            r9 = 0
            goto L_0x008f
        L_0x0083:
            r1 = move-exception
            java.lang.String r0 = "profilephotohandler/"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0089:
            byte[] r0 = r3.A06
            r9.newPhoto = r0
            r9.newPhotoId = r10
        L_0x008f:
            X.122 r6 = r3.A0L
            X.0t3 r0 = r3.A0D
            long r0 = r0.A00()
            X.0sK r2 = r3.A08
            r2.A0B()
            X.1ZT r5 = r2.A05
            X.AnonymousClass00B.A06(r5)
            X.18b r2 = r6.A03
            X.1Vw r2 = r2.A02(r8, r7)
            X.1sH r6 = new X.1sH
            r6.<init>(r2, r0)
            r0 = -1
            if (r10 != r0) goto L_0x0114
            r0 = 0
        L_0x00b0:
            r6.A0k(r0)
            r6.A0b(r5)
            r6.A00 = r9
            X.0yz r0 = r3.A0G
            X.0tZ r5 = r0.A01(r8)
            boolean r0 = r5 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x00e6
            X.1WU r5 = (X.AnonymousClass1WU) r5
            int r1 = r5.A00
            r0 = 11
            r2 = 0
            if (r1 != r0) goto L_0x00cc
            r2 = 1
        L_0x00cc:
            X.0rv r1 = r6.A0B()
            if (r1 == 0) goto L_0x0112
            boolean r0 = r5.A12()
            if (r0 == 0) goto L_0x0112
            X.0rv r0 = r5.A0B()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0112
        L_0x00e2:
            if (r2 == 0) goto L_0x00e6
            if (r7 != 0) goto L_0x00eb
        L_0x00e6:
            X.0t6 r0 = r3.A0E
            r0.A0W(r6)
        L_0x00eb:
            byte[] r2 = r3.A05
            if (r2 != 0) goto L_0x010a
            byte[] r0 = r3.A06
            if (r0 != 0) goto L_0x010a
            X.12A r1 = r3.A0C
            r1.A00(r4)
        L_0x00f8:
            X.120 r0 = r1.A05
            r0.A04(r4)
            X.0pt r2 = r3.A07
            r1 = 28
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0K(r0)
        L_0x0109:
            return
        L_0x010a:
            X.12A r1 = r3.A0C
            byte[] r0 = r3.A06
            r1.A02(r4, r2, r0)
            goto L_0x00f8
        L_0x0112:
            r7 = 0
            goto L_0x00e2
        L_0x0114:
            java.lang.String r0 = java.lang.Integer.toString(r10)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27B.AYG(X.1Vv, java.lang.String):void");
    }
}
