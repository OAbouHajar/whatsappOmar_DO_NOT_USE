package X;

import java.util.Arrays;

/* renamed from: X.4UH  reason: invalid class name */
public class AnonymousClass4UH {
    public final int A00;
    public final C34651kc A01;
    public final boolean A02;

    public AnonymousClass4UH(C34651kc r1, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = z2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4UH r5 = (AnonymousClass4UH) obj;
            if (!C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(Boolean.valueOf(this.A02), Boolean.valueOf(r5.A02)) || !C34901l3.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        objArr[1] = Boolean.valueOf(this.A02);
        AnonymousClass3K2.A1W(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }
}
