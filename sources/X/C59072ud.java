package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxSupplierShape104S0200000_2_I1;
import com.obwhatsapp.WaImageView;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
public class C59072ud extends C65253Tx {
    public final /* synthetic */ C31201dg A00;
    public final /* synthetic */ AnonymousClass1JW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59072ud(C14990q7 r1, C31201dg r2, C31201dg r3, AnonymousClass1JW r4) {
        super(r1, r2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r13, C31201dg r14, Object obj) {
        ImageView.ScaleType A0A;
        ImageView imageView = (ImageView) view;
        C31201dg r1 = this.A00;
        String A0J = r1.A0J(42);
        if (A0J == null) {
            A0A = ImageView.ScaleType.CENTER_CROP;
        } else {
            try {
                A0A = C62163Bx.A0A(A0J);
            } catch (AnonymousClass40K e2) {
                throw new RuntimeException(e2);
            }
        }
        imageView.setScaleType(A0A);
        C31201dg A0G = r1.A0G(44);
        C14990q7 r6 = r13;
        if (A0G != null) {
            imageView.setColorFilter(C87564Xk.A01(r13, A0G, 0));
        }
        IDxSupplierShape104S0200000_2_I1 iDxSupplierShape104S0200000_2_I1 = new IDxSupplierShape104S0200000_2_I1(r13, 1, A0G);
        this.A01.A5Y(imageView, new C95024lr(r13), iDxSupplierShape104S0200000_2_I1, r6, r1.A0J(38), r1.A0J(41), r1.A0J(35), r1.A0J(36));
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r3, C31201dg r4, Object obj) {
        ImageView imageView = (ImageView) view;
        imageView.setImageBitmap((Bitmap) null);
        imageView.setImageDrawable((Drawable) null);
        imageView.setColorFilter((ColorFilter) null);
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new WaImageView(context);
    }
}
