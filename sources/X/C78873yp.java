package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.3yp  reason: invalid class name and case insensitive filesystem */
public class C78873yp extends C16690tT {
    public final AnonymousClass013 A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public C78873yp(Context context, AnonymousClass013 r3, AnonymousClass2VF r4) {
        this.A00 = r3;
        this.A01 = C13690nt.A0h(context);
        this.A02 = C13690nt.A0h(r4);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass2V1[] r5 = (AnonymousClass2V1[]) objArr;
        AnonymousClass00B.A06(r5);
        boolean z2 = true;
        if (r5.length != 1) {
            z2 = false;
        }
        AnonymousClass00B.A0F(z2);
        AnonymousClass2V1 r2 = r5[0];
        AnonymousClass00B.A06(r2);
        Context context = (Context) this.A01.get();
        if (context == null) {
            return null;
        }
        return r2.A7b(context, this.A00, false);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C455829l r2 = (C455829l) obj;
        AnonymousClass2VF r0 = (AnonymousClass2VF) this.A02.get();
        if (r2 != null && r0 != null) {
            r0.A0J(r2);
        }
    }
}
