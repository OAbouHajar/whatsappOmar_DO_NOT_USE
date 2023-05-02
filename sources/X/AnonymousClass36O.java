package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.36O  reason: invalid class name */
public class AnonymousClass36O extends C16690tT {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final AnonymousClass1A9 A03;
    public final WeakReference A04;

    public AnonymousClass36O(Uri uri, AnonymousClass342 r3, AnonymousClass1A9 r4, int i2, int i3) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int max = Math.max(this.A01, this.A00);
        try {
            return this.A03.A0W(this.A02, max, max);
        } catch (AnonymousClass20M | IOException e2) {
            Log.e("BaseQrActivity/loadImageRunnable Failed to load image", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass342 r5 = (AnonymousClass342) this.A04.get();
        if (r5 != null && !r5.AIm()) {
            ImageView imageView = r5.A01;
            int i2 = 0;
            if (bitmap == null) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            r5.A01.setImageBitmap(bitmap);
            if (bitmap == null) {
                r5.A05.A09(R.string.str0848, 0);
                r5.A0Z = false;
                r5.Ac1();
                return;
            }
            C16320sq r4 = r5.A05;
            AnonymousClass1A9 r3 = r5.A0U;
            C13700nu.A0W(new AnonymousClass37O(r5.A00, r5.A0b, r3), r4);
        }
    }
}
