package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.obwhatsapp.WaImageView;
import java.io.File;

/* renamed from: X.37f  reason: invalid class name and case insensitive filesystem */
public class C610737f extends AnonymousClass29D {
    public Bitmap A00;
    public final AnonymousClass0Aj A01;
    public final WaImageView A02;
    public final C41911wr A03;

    public C610737f(Context context, File file) {
        C41911wr A012 = C41911wr.A01(ParcelFileDescriptor.open(file, 268435456), false);
        this.A03 = A012;
        AnonymousClass0Aj A06 = A012.A06(context);
        this.A01 = A06;
        WaImageView waImageView = new WaImageView(context);
        this.A02 = waImageView;
        waImageView.setImageDrawable(A06);
    }
}
