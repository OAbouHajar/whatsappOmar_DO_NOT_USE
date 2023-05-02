package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Fz  reason: invalid class name and case insensitive filesystem */
public class C63063Fz implements C109975Un {
    public final int A00;
    public final C25841Li A01;
    public final AnonymousClass1XQ A02;
    public final C613838r A03;
    public final String A04;

    public C63063Fz(C25841Li r1, AnonymousClass1XQ r2, C613838r r3, String str, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A00 = i2;
        this.A03 = r3;
    }

    public void run() {
        File file;
        File file2;
        C25841Li r0 = this.A01;
        String str = this.A04;
        int i2 = this.A00;
        AnonymousClass00B.A00();
        C37661pW A002 = r0.A00();
        C76263td r8 = new C76263td(r0.A03, r0.A05, r0.A07, r0.A08, r0.A09, r0.A0A, A002, C25841Li.A0H, str);
        C86054Ra A0B = r8.A0B();
        AnonymousClass20R r6 = r8.A05;
        String str2 = r8.A07;
        byte[] bArr = null;
        if (A0B == null) {
            file = null;
        } else {
            file = A0B.A02;
            bArr = A0B.A03;
        }
        r6.ARL(file, str2, bArr);
        AnonymousClass20S A9Y = A002.A9Y(str);
        if (A9Y != null) {
            file2 = C13700nu.A0D(A9Y.A00);
        } else {
            file2 = null;
            StringBuilder A0r = AnonymousClass000.A0r("MediaLoadGifJob/failed to load, name: ");
            A0r.append(str);
            Log.e(C13680ns.A0i(", attribution:", A0r, i2));
        }
        this.A03.A00(file2, true);
    }
}
