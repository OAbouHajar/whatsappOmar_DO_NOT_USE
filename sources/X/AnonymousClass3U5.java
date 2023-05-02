package X;

import java.io.FileInputStream;

/* renamed from: X.3U5  reason: invalid class name */
public final class AnonymousClass3U5 extends C31521eK {
    public int A00;
    public final /* synthetic */ C31491eH A01;

    public AnonymousClass3U5(C31491eH r1) {
        this.A01 = r1;
    }

    public C31541eM A00() {
        AnonymousClass3U3[] r2 = this.A01.A00;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        AnonymousClass3U3 r22 = r2[i2];
        FileInputStream fileInputStream = new FileInputStream(r22.A00);
        try {
            return new C31541eM(r22, fileInputStream);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public boolean A01() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01.A00.length);
    }
}
