package X;

import android.content.Context;
import android.util.LongSparseArray;
import com.obwhatsapp.R;

/* renamed from: X.38i  reason: invalid class name and case insensitive filesystem */
public final class C612938i {
    public final int A00;
    public final LongSparseArray A01;
    public final LongSparseArray A02;
    public final C86794Ue A03;

    public C612938i(C86794Ue r5, C31201dg r6) {
        this.A03 = r5;
        int i2 = r6.A00;
        this.A00 = i2;
        LongSparseArray longSparseArray = new LongSparseArray(r6.A0L().size());
        long j2 = (long) i2;
        r5.A00().A01.A00.A09(j2, longSparseArray);
        this.A01 = longSparseArray;
        AnonymousClass4G0 r0 = r5.A00().A00;
        this.A02 = (LongSparseArray) (r0 == null ? null : r0.A00.A04(j2, (Object) null));
    }

    public final C83364Gj A00(C31201dg r15, int i2, int i3) {
        LongSparseArray longSparseArray;
        C18450wi.A0H(r15, 0);
        long j2 = (long) r15.A00;
        LongSparseArray longSparseArray2 = this.A01;
        C83364Gj r2 = (C83364Gj) longSparseArray2.get(j2);
        C89994dK r8 = null;
        if (!(r2 == null && ((longSparseArray = this.A02) == null || (r2 = (C83364Gj) longSparseArray.get(j2)) == null))) {
            C613538o r3 = r2.A00;
            r8 = r3.A03.isDone() ? r3.A00() : r3.A05;
        }
        C86794Ue r4 = this.A03;
        Context context = r4.A02;
        C95834nM r9 = new C95834nM(r15);
        Object obj = r4.A03;
        C14990q7 r22 = (C14990q7) obj;
        if (r22 != null) {
            r22.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        }
        C83364Gj r23 = new C83364Gj(new C613538o(context, r8, r9, obj, r4.A01, i2, i3), r15);
        longSparseArray2.put(j2, r23);
        return r23;
    }
}
