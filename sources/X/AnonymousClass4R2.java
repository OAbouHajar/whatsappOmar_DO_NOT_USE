package X;

import org.apache.commons.io.FilenameUtils;

/* renamed from: X.4R2  reason: invalid class name */
public final class AnonymousClass4R2 {
    public final int A00;
    public final byte[] A01;

    public AnonymousClass4R2(byte[] bArr, int i2) {
        this.A01 = bArr;
        this.A00 = i2;
    }

    public String toString() {
        byte[] bArr = this.A01;
        int i2 = this.A00;
        byte b2 = bArr[i2];
        StringBuilder A0g = C13690nt.A0g(b2 << 1);
        for (int i3 = 0; i3 < b2; i3++) {
            byte b3 = bArr[(i3 << 1) + i2 + 1];
            char c2 = '[';
            if (b3 != 0) {
                c2 = FilenameUtils.EXTENSION_SEPARATOR;
                if (b3 != 1) {
                    c2 = '*';
                    if (b3 == 2) {
                        continue;
                    } else if (b3 == 3) {
                        A0g.append(bArr[(i3 << 1) + i2 + 2]);
                        c2 = ';';
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    continue;
                }
            }
            A0g.append(c2);
        }
        return A0g.toString();
    }
}
