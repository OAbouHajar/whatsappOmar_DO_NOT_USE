package X;

import java.io.File;
import java.util.List;

/* renamed from: X.3yw  reason: invalid class name and case insensitive filesystem */
public final class C78943yw extends C16690tT {
    public final C16760tb A00;
    public final AnonymousClass1XP A01;
    public final C38701rH A02;
    public final File A03;

    public C78943yw(C16760tb r1, AnonymousClass1XP r2, C38701rH r3, File file) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = file;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C38701rH r5 = this.A02;
        File file = this.A03;
        if (!file.exists()) {
            return null;
        }
        List A022 = AnonymousClass1ZO.A02(file, 64);
        file.delete();
        int size = A022.size();
        if (size != 64) {
            return null;
        }
        byte[] bArr = new byte[size];
        int i2 = 0;
        do {
            bArr[i2] = ((Number) A022.get(i2)).byteValue();
            i2++;
        } while (i2 < size);
        r5.A19(new C42661yC(bArr, 0));
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A00.A0L(this.A01, this.A02);
    }
}
