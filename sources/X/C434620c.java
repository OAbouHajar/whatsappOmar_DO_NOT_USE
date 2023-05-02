package X;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.20c  reason: invalid class name and case insensitive filesystem */
public class C434620c {
    public final Map A00 = new HashMap();

    public Bitmap A00(C434720d r5, boolean z2) {
        Bitmap bitmap;
        Map map = this.A00;
        synchronized (map) {
            SoftReference softReference = (SoftReference) map.get(new C435520m(r5, z2));
            if (softReference == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) softReference.get();
                if (bitmap == null) {
                    C43041zF.A02(new AnonymousClass20n(), map.entrySet());
                }
            }
        }
        return bitmap;
    }

    public void A01(Bitmap bitmap, C434720d r5, boolean z2) {
        Map map = this.A00;
        synchronized (map) {
            map.put(new C435520m(r5, z2), new SoftReference(bitmap));
        }
    }
}
