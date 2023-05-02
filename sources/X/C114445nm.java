package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5nm  reason: invalid class name and case insensitive filesystem */
public class C114445nm extends C16690tT {
    public final int A00;
    public final C221116r A01;
    public final WeakReference A02;

    public C114445nm(C221116r r2, C110735ek r3, int i2) {
        this.A01 = r2;
        this.A02 = new WeakReference(r3);
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A01.A0V((C15830rv) null, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String A0J;
        C35301lh A0E;
        List<AnonymousClass1Vt> list = (List) obj;
        WeakReference weakReference = this.A02;
        if (weakReference.get() != null) {
            HashMap hashMap = ((C110735ek) weakReference.get()).A09;
            hashMap.clear();
            for (AnonymousClass1Vt r0 : list) {
                AnonymousClass1W2 r3 = r0.A0A;
                if (r3 != null) {
                    int i2 = r0.A02;
                    if (i2 == 405) {
                        A0J = r3.A0I();
                        A0E = r3.A0D();
                    } else if (i2 == 106 || i2 == 12) {
                        A0J = r3.A0J();
                        A0E = r3.A0E();
                    }
                    if (!TextUtils.isEmpty(A0J)) {
                        hashMap.put(A0J, !C39841t9.A03(A0E) ? C110105dW.A0d(A0E) : A0J);
                    }
                }
            }
        }
    }
}
