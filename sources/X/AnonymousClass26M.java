package X;

import com.whatsapp.util.Log;

/* renamed from: X.26M  reason: invalid class name */
public abstract class AnonymousClass26M extends AnonymousClass26N {
    public final C18650x2 A00;

    public AnonymousClass26M(C18650x2 r1) {
        this.A00 = r1;
    }

    public void A00(C32121fg r9, int i2) {
        int i3 = i2;
        if (this instanceof C55242j8) {
            C55242j8 r3 = (C55242j8) this;
            r3.A05();
            Log.e("GetSingleCollectionGraphQLService/sendRequest/onErrorResponse");
            if (!r3.A04(r3.A02.A03, r9.A01, true)) {
                r3.A00.A00(i2);
            }
        } else if (this instanceof AnonymousClass2j5) {
            ((AnonymousClass2j5) this).A05(new C49822Vz(2), (Exception) null, "/onErrorResponse", i3, r9.A01, true);
        } else if (this instanceof AnonymousClass26R) {
            ((AnonymousClass26R) this).A05((Exception) null, "/onErrorResponse", i3, r9.A01, true);
        } else if (this instanceof AnonymousClass26K) {
            ((AnonymousClass26K) this).A06((Exception) null, "/onErrorResponse", r9.A01, i3, true, false);
        } else if (this instanceof C59642yd) {
            C59642yd r32 = (C59642yd) this;
            r32.A05();
            StringBuilder sb = new StringBuilder("GetCollectionsGraphQLService/onErrorResponse/error - ");
            sb.append(i2);
            Log.e(sb.toString());
            if (!r32.A04(r32.A02.A04, r9.A01, true)) {
                r32.A00.A00(i2);
            }
        } else {
            C59632yc r33 = (C59632yc) this;
            try {
                if (!r33.A04(r33.A02.A02, r9.A01, true)) {
                    r33.A05(i2);
                }
            } catch (Exception unused) {
                r33.A05(i2);
            }
        }
    }
}
