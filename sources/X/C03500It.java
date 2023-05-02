package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0It  reason: invalid class name and case insensitive filesystem */
public final class C03500It extends AnonymousClass0QT {
    public int A00;
    public final ArrayList A01 = new ArrayList(32);

    public String A02(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return (String) this.A01.get(i2 << 1);
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    public void A03(AnonymousClass0QT r1, String str) {
        A04(str);
        r1.A00();
        A05(str, r1);
        r1.A00();
        r1.A00 = this;
    }

    public final void A04(String str) {
        if (!this.A03) {
            throw AnonymousClass000.A0V("Expected object to be mutable");
        } else if (TextUtils.isEmpty(str)) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(str, AnonymousClass000.A0r("key=")));
        }
    }

    public final void A05(String str, Object obj) {
        A04(str);
        ArrayList arrayList = this.A01;
        arrayList.add(str);
        arrayList.add(obj);
        this.A00++;
    }
}
