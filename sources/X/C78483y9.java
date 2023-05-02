package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.3y9  reason: invalid class name and case insensitive filesystem */
public class C78483y9 extends AnonymousClass2Wj {
    public final int A00;
    public final Object[] A01;

    public C78483y9(Object[] objArr, int i2) {
        this.A00 = i2;
        this.A01 = objArr;
    }

    public String A00(Context context) {
        Object[] objArr = this.A01;
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
        return context.getString(this.A00, objArr2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C78483y9 r5 = (C78483y9) obj;
            if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((217 + this.A00) * 31) + Arrays.hashCode(this.A01);
    }
}
