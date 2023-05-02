package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;

/* renamed from: X.4pm  reason: invalid class name and case insensitive filesystem */
public final class C97334pm implements AnonymousClass5LL {
    public final SparseArray A00;
    public final C108355Nq A01;
    public final int[] A02;

    public C97334pm(C108255Ng r8, C108355Nq r9) {
        this.A01 = r9;
        Class<C108355Nq> cls = C108355Nq.class;
        Class<AnonymousClass5LL> cls2 = AnonymousClass5LL.class;
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (AnonymousClass5LL) AnonymousClass3K4.A0W(r9, AnonymousClass3K4.A0c(DashMediaSource$Factory.class.asSubclass(cls2), cls, new Class[1], 0), new Object[1], 0));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (AnonymousClass5LL) AnonymousClass3K4.A0W(r9, AnonymousClass3K4.A0c(SsMediaSource$Factory.class.asSubclass(cls2), cls, new Class[1], 0), new Object[1], 0));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (AnonymousClass5LL) AnonymousClass3K4.A0W(r9, AnonymousClass3K4.A0c(HlsMediaSource$Factory.class.asSubclass(cls2), cls, new Class[1], 0), new Object[1], 0));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new C97324pl(r8, r9));
        this.A00 = sparseArray;
        this.A02 = new int[sparseArray.size()];
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = this.A00;
            if (i2 < sparseArray2.size()) {
                this.A02[i2] = sparseArray2.keyAt(i2);
                i2++;
            } else {
                return;
            }
        }
    }
}
