package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3E6  reason: invalid class name */
public final class AnonymousClass3E6 implements C48612Oe {
    public C48612Oe A00;
    public C48612Oe A01;
    public C48612Oe A02;
    public C48612Oe A03;
    public C48612Oe A04;
    public C48612Oe A05;
    public C48612Oe A06;
    public C48612Oe A07;
    public final Context A08;
    public final C48612Oe A09;
    public final List A0A = AnonymousClass000.A0u();

    public AnonymousClass3E6(Context context, C48612Oe r3) {
        this.A08 = context.getApplicationContext();
        this.A09 = r3;
    }

    public final void A00(C48612Oe r4) {
        int i2 = 0;
        while (true) {
            List list = this.A0A;
            if (i2 < list.size()) {
                r4.A4k((AnonymousClass5LZ) list.get(i2));
                i2++;
            } else {
                return;
            }
        }
    }

    public void A4k(AnonymousClass5LZ r2) {
        this.A09.A4k(r2);
        this.A0A.add(r2);
        C48612Oe r0 = this.A04;
        if (r0 != null) {
            r0.A4k(r2);
        }
        C48612Oe r02 = this.A00;
        if (r02 != null) {
            r02.A4k(r2);
        }
        C48612Oe r03 = this.A01;
        if (r03 != null) {
            r03.A4k(r2);
        }
        C48612Oe r04 = this.A06;
        if (r04 != null) {
            r04.A4k(r2);
        }
        C48612Oe r05 = this.A07;
        if (r05 != null) {
            r05.A4k(r2);
        }
        C48612Oe r06 = this.A02;
        if (r06 != null) {
            r06.A4k(r2);
        }
        C48612Oe r07 = this.A05;
        if (r07 != null) {
            r07.A4k(r2);
        }
    }

    public Map AFZ() {
        C48612Oe r0 = this.A03;
        return r0 == null ? Collections.emptyMap() : r0.AFZ();
    }

    public Uri AGo() {
        C48612Oe r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.AGo();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AZr(X.AnonymousClass3AL r5) {
        /*
            r4 = this;
            X.2Oe r0 = r4.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C90524eJ.A04(r0)
            android.net.Uri r3 = r5.A04
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.2Oe r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.2s4 r0 = new X.2s4
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.2Oe r0 = r4.A01
        L_0x0043:
            r4.A03 = r0
            long r0 = r0.AZr(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0082
            X.2Oe r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            X.2Oe r0 = (X.C48612Oe) r0     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            r4.A06 = r0     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0111 }
            goto L_0x0079
        L_0x0072:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r1, r0)
        L_0x0079:
            X.2Oe r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            X.2Oe r0 = r4.A09
            r4.A06 = r0
            goto L_0x0043
        L_0x0082:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009c
            X.2Oe r0 = r4.A07
            if (r0 != 0) goto L_0x0099
            X.3Vk r0 = new X.3Vk
            r0.<init>()
            r4.A07 = r0
            r4.A00(r0)
        L_0x0099:
            X.2Oe r0 = r4.A07
            goto L_0x0043
        L_0x009c:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            X.2Oe r0 = r4.A02
            if (r0 != 0) goto L_0x00b2
            X.2s1 r0 = new X.2s1
            r0.<init>()
            r4.A02 = r0
            r4.A00(r0)
        L_0x00b2:
            X.2Oe r0 = r4.A02
            goto L_0x0043
        L_0x00b5:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c9
            X.2Oe r0 = r4.A09
            goto L_0x0043
        L_0x00c9:
            X.2Oe r0 = r4.A05
            if (r0 != 0) goto L_0x00d9
            android.content.Context r1 = r4.A08
            com.google.android.exoplayer2.upstream.RawResourceDataSource r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource
            r0.<init>(r1)
            r4.A05 = r0
            r4.A00(r0)
        L_0x00d9:
            X.2Oe r0 = r4.A05
            goto L_0x0043
        L_0x00dd:
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L_0x00ff
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00ff
        L_0x00eb:
            X.2Oe r0 = r4.A00
            if (r0 != 0) goto L_0x00fb
            android.content.Context r1 = r4.A08
            X.2s3 r0 = new X.2s3
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00fb:
            X.2Oe r0 = r4.A00
            goto L_0x0043
        L_0x00ff:
            X.2Oe r0 = r4.A04
            if (r0 != 0) goto L_0x010d
            X.2s2 r0 = new X.2s2
            r0.<init>()
            r4.A04 = r0
            r4.A00(r0)
        L_0x010d:
            X.2Oe r0 = r4.A04
            goto L_0x0043
        L_0x0111:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E6.AZr(X.3AL):long");
    }

    public void close() {
        C48612Oe r0 = this.A03;
        if (r0 != null) {
            try {
                r0.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        return this.A03.read(bArr, i2, i3);
    }
}
