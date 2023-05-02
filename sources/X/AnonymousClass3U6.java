package X;

import java.io.InputStream;

/* renamed from: X.3U6  reason: invalid class name */
public final class AnonymousClass3U6 extends C31521eK {
    public int A00;
    public final /* synthetic */ C31551eN A01;

    public AnonymousClass3U6(C31551eN r1) {
        this.A01 = r1;
    }

    public C31541eM A00() {
        C31551eN r3 = this.A01;
        r3.A00();
        AnonymousClass3U4[] r2 = r3.A00;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        AnonymousClass3U4 r22 = r2[i2];
        InputStream inputStream = r3.A03.getInputStream(r22.A01);
        try {
            return new C31541eM(r22, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public boolean A01() {
        C31551eN r0 = this.A01;
        r0.A00();
        return AnonymousClass3K3.A1Q(this.A00, r0.A00.length);
    }
}
