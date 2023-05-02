package X;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: X.4Lb  reason: invalid class name and case insensitive filesystem */
public class C84574Lb {
    public AnonymousClass43D A00;
    public boolean A01 = false;
    public final C66373Zc A02;
    public final /* synthetic */ C88354aM A03;

    public C84574Lb(C88354aM r6, byte[] bArr) {
        this.A03 = r6;
        this.A00 = r6.A00;
        C66373Zc r4 = new C66373Zc();
        this.A02 = r4;
        r4.A08 = C90364e1.A00(r6.A02);
        long currentTimeMillis = System.currentTimeMillis();
        r4.A01 = currentTimeMillis;
        r4.A02 = SystemClock.elapsedRealtime();
        r4.A03 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
        r4.A0A = bArr;
    }
}
