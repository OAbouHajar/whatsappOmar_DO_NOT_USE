package X;

import android.graphics.Bitmap;

/* renamed from: X.1km  reason: invalid class name and case insensitive filesystem */
public class C34731km extends AnonymousClass03L {
    public C37681pY A00;
    public final /* synthetic */ C34711kk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34731km(C34711kk r1, int i2) {
        super(i2);
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ int A00(Object obj, Object obj2) {
        C34711kk r0 = this.A01;
        Object obj3 = ((C447125f) obj2).A01;
        if (r0 instanceof C34701kj) {
            return ((Bitmap) obj3).getByteCount() >> 10;
        }
        return 1;
    }

    public void A07(Object obj, Object obj2, Object obj3, boolean z2) {
        C37681pY r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.AQO(obj, obj2, obj3, z2);
        }
    }
}
