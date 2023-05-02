package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.1ku  reason: invalid class name and case insensitive filesystem */
public class C34811ku extends C16010sH {
    public static String A02;
    public final C16980tz A00;
    public final AnonymousClass1D2 A01;

    public C34811ku(C16980tz r4, AnonymousClass013 r5) {
        super(C34801kt.A00);
        C34851ky r2 = new C34851ky();
        this.A01 = r2;
        this.A00 = r4;
        this.A06 = 3;
        this.A08 = -2;
        r5.A0B.add(r2);
    }

    public static String A05(Context context, int i2) {
        Object[] objArr = new Object[1];
        String str = A02;
        if (str == null) {
            str = context.getString(R.string.str1b3c);
            A02 = str;
        }
        objArr[0] = str;
        return context.getString(i2, objArr);
    }
}
