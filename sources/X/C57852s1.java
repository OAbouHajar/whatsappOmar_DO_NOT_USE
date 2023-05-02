package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: X.2s1  reason: invalid class name and case insensitive filesystem */
public final class C57852s1 extends AnonymousClass3E3 {
    public int A00;
    public int A01;
    public AnonymousClass3AL A02;
    public byte[] A03;

    public C57852s1() {
        super(false);
    }

    public Uri AGo() {
        AnonymousClass3AL r0 = this.A02;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public long AZr(AnonymousClass3AL r7) {
        byte[] bArr;
        A01();
        this.A02 = r7;
        this.A01 = (int) r7.A03;
        Uri uri = r7.A04;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",", -1);
            if (split.length == 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        bArr = Base64.decode(str, 0);
                        this.A03 = bArr;
                    } catch (IllegalArgumentException e2) {
                        throw new AnonymousClass40M(C13680ns.A0h("Error while parsing Base64 encoded string: ", str), e2);
                    }
                } else {
                    bArr = URLDecoder.decode(str, AnonymousClass4BH.A01.name()).getBytes(AnonymousClass4BH.A05);
                    this.A03 = bArr;
                }
                long j2 = r7.A02;
                int length = j2 != -1 ? ((int) j2) + this.A01 : bArr.length;
                this.A00 = length;
                if (length > bArr.length || this.A01 > length) {
                    this.A03 = null;
                    throw new AnonymousClass40F();
                }
                A03(r7);
                return ((long) this.A00) - ((long) this.A01);
            }
            throw new AnonymousClass40M(AnonymousClass000.A0g("Unexpected URI format: ", uri));
        }
        throw new AnonymousClass40M(C13680ns.A0h("Unsupported scheme: ", scheme));
    }

    public void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A00();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = i4 - i5;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i3, i6);
        System.arraycopy(this.A03, i5, bArr, i2, min);
        this.A01 += min;
        A02(min);
        return min;
    }
}
