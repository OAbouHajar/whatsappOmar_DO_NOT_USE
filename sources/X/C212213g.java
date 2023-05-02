package X;

import android.graphics.Bitmap;
import java.io.InputStream;

/* renamed from: X.13g  reason: invalid class name and case insensitive filesystem */
public final class C212213g {
    public final C17130ua A00;
    public final C19950zG A01;
    public final AnonymousClass4QQ A02;

    public C212213g(C17130ua r2, C16980tz r3, C19950zG r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r4, 3);
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = new AnonymousClass4QQ(r3);
    }

    public final Bitmap A00(String str) {
        InputStream A9k = this.A01.AFY(str).A9k(this.A00, (Integer) null, 30);
        C18450wi.A0B(A9k);
        AnonymousClass4QQ r2 = this.A02;
        String A022 = C004101u.A02(str);
        AnonymousClass00B.A06(A022);
        C18450wi.A0B(A022);
        ((C43201zV) r2.A00.getValue()).A02(A9k, A022);
        return r2.A00(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0019 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0010
            X.4QQ r0 = r6.A02
            X.0qW r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.1zV r1 = (X.C43201zV) r1
            r0 = 1
            r1.A03(r0)
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r7.iterator()
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r2 = r5.next()
            X.4j7 r2 = (X.C93394j7) r2
            r3 = 0
            if (r8 == 0) goto L_0x0038
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0052 }
            android.graphics.Bitmap r1 = r6.A00(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0052 }
            X.4Vq r2 = new X.4Vq     // Catch:{ all -> 0x0052 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0058
        L_0x0038:
            X.4QQ r1 = r6.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0052 }
            android.graphics.Bitmap r1 = r1.A00(r0)     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0046
            android.graphics.Bitmap r1 = r6.A00(r0)     // Catch:{ all -> 0x0052 }
        L_0x0046:
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0052 }
            X.4Vq r2 = new X.4Vq     // Catch:{ all -> 0x0052 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0058
        L_0x0050:
            r2 = r3
            goto L_0x0058
        L_0x0052:
            r0 = move-exception
            X.1vQ r2 = new X.1vQ
            r2.<init>(r0)
        L_0x0058:
            java.lang.Throwable r1 = X.C41201vP.A00(r2)
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "AvatarProfilePhotoPosesFetcher/fetchPoses"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            boolean r0 = r2 instanceof X.C41211vQ
            if (r0 != 0) goto L_0x0068
            r3 = r2
        L_0x0068:
            if (r3 == 0) goto L_0x0019
            r4.add(r3)
            goto L_0x0019
        L_0x006e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212213g.A01(java.util.List, boolean):java.util.List");
    }
}
