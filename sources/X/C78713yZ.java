package X;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3yZ  reason: invalid class name and case insensitive filesystem */
public class C78713yZ extends C16690tT {
    public final WeakReference A00;

    public C78713yZ(AnonymousClass04N r2) {
        this.A00 = C13690nt.A0h(r2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C84024Iy r1 = ((C84024Iy[]) objArr)[0];
        if (r1 != null) {
            File file = r1.A01;
            int i2 = r1.A00;
            if (file != null) {
                List A01 = AnonymousClass1ZO.A01(file);
                if (i2 == -1) {
                    return A01;
                }
                ArrayList A0i = C13690nt.A0i(i2);
                C809246c.A00(A01, A0i, i2);
                return A0i;
            }
        }
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass04N r0 = (AnonymousClass04N) this.A00.get();
        if (r0 != null) {
            r0.accept(obj);
        }
    }
}
