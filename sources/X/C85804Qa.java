package X;

/* renamed from: X.4Qa  reason: invalid class name and case insensitive filesystem */
public class C85804Qa {
    public int A00;
    public int A01;

    public void A00(int i2) {
        int i3;
        int i4 = this.A01;
        if (i4 < i2 || (i3 = this.A00) <= 0) {
            Object[] objArr = new Object[3];
            AnonymousClass000.A1M(objArr, i2, 0);
            AnonymousClass000.A1M(objArr, i4, 1);
            AnonymousClass000.A1M(objArr, this.A00, 2);
            AnonymousClass0X1.A04("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", objArr);
            return;
        }
        this.A00 = i3 - 1;
        this.A01 = i4 - i2;
    }
}
