package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.3yA  reason: invalid class name and case insensitive filesystem */
public class C78493yA extends AnonymousClass2Wj {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public C78493yA(Object[] objArr, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = objArr;
    }

    public String A00(Context context) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof AnonymousClass2Wj) {
                objArr2[i2] = ((AnonymousClass2Wj) obj).A00(context);
            } else {
                objArr2[i2] = obj;
            }
        }
        return context.getResources().getQuantityString(this.A01, this.A00, objArr2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C78493yA)) {
            return false;
        }
        C78493yA r4 = (C78493yA) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && Arrays.equals(this.A02, r4.A02);
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, this.A01);
        return (AnonymousClass3K2.A08(Integer.valueOf(this.A00), A1Z) * 31) + Arrays.hashCode(this.A02);
    }
}
