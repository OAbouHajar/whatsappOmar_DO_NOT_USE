package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.14p  reason: invalid class name and case insensitive filesystem */
public class C215714p {
    public final C215614o A00;

    public C215714p(C215614o r1) {
        this.A00 = r1;
    }

    public boolean A00(File file, int i2, boolean z2) {
        AnonymousClass044 r4 = new AnonymousClass044(new C38021q7(new BufferedInputStream(new FileInputStream(file)), (long) i2), C17970vw.A04);
        try {
            C215614o r1 = this.A00;
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z3 = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(r4, (Rect) null, options);
            int i3 = r1.A01(z2).A00;
            if (options.outHeight <= i3 && options.outWidth <= i3) {
                z3 = false;
            }
            r4.close();
            return z3;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
