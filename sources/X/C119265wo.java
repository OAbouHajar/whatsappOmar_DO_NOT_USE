package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.Arrays;

/* renamed from: X.5wo  reason: invalid class name and case insensitive filesystem */
public class C119265wo {
    public int A00;
    public final String A01;

    public C119265wo(int i2) {
        this.A00 = i2;
        this.A01 = null;
    }

    public C119265wo(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public int A00() {
        return this.A00;
    }

    public String A01(Context context) {
        String str = this.A01;
        return str == null ? context.getString(this.A00) : str;
    }

    public void A02() {
        this.A00 = R.string.str1031;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C119265wo)) {
            return false;
        }
        C119265wo r4 = (C119265wo) obj;
        return this.A00 == r4.A00 && C34901l3.A00(this.A01, r4.A01);
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = Integer.valueOf(this.A00);
        A1Z[1] = this.A01;
        return Arrays.hashCode(A1Z);
    }
}
