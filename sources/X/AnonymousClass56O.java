package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.56O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56O implements Runnable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ C16750ta A01;
    public final /* synthetic */ AnonymousClass37L A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ AnonymousClass56O(C16750ta r1, AnonymousClass37L r2, String str, String str2, List list, byte[] bArr, byte b2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = b2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = list;
        this.A06 = bArr;
    }

    public final void run() {
        AnonymousClass37L r0 = this.A02;
        C16750ta r8 = this.A01;
        byte b2 = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        List list = this.A05;
        byte[] bArr = this.A06;
        C16760tb r2 = r0.A07;
        C18210wK r6 = r0.A0H;
        List list2 = r0.A0R;
        if (r0.A0Z) {
            byte b3 = b2;
            b2 = 42;
            if (b3 == 3) {
                b2 = 43;
            }
        }
        int A0B = r0.A0B(r0.A00);
        r2.A07(r6.A00((Uri) null, r8, r0.A0B, r0.A0L, str, list2, C39501sa.A01(str2), list, b2, A0B, 0, r0.A0T), bArr, r0.A0V, r0.A0X);
    }
}
