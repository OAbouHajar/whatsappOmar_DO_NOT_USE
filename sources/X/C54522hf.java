package X;

import android.content.Context;
import android.graphics.Point;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2hf  reason: invalid class name and case insensitive filesystem */
public class C54522hf extends C16690tT {
    public final C54652hv A00;
    public final C54552hi A01;
    public final boolean A02;

    public C54522hf(C001300o r2, C54652hv r3, C54552hi r4, boolean z2) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass2BC A7S = this.A01.A7S(!this.A02);
        A7S.getCount();
        return A7S;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass2BC r15 = (AnonymousClass2BC) obj;
        C54652hv r0 = this.A00;
        boolean z2 = this.A02;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = r0.A00;
        C001000l A0C = mediaGalleryFragmentBase.A0C();
        if (A0C != null) {
            mediaGalleryFragmentBase.A0H = r15;
            r15.registerContentObserver(mediaGalleryFragmentBase.A0Q);
            mediaGalleryFragmentBase.A1D();
            Point point = new Point();
            A0C.getWindowManager().getDefaultDisplay().getSize(point);
            int i2 = mediaGalleryFragmentBase.A02;
            boolean z3 = true;
            if (!(i2 == 0 || i2 == 1)) {
                z3 = false;
            }
            if (z3) {
                int i3 = point.y;
                int i4 = point.x;
                int dimensionPixelSize = mediaGalleryFragmentBase.A03().getDimensionPixelSize(R.dimen.dimen03f9);
                int i5 = ((i3 * i4) / (dimensionPixelSize * dimensionPixelSize)) + 1;
                C54552hi A1C = mediaGalleryFragmentBase.A1C();
                if (A1C != null) {
                    AnonymousClass2TI r8 = new AnonymousClass2TI(mediaGalleryFragmentBase);
                    Context context = mediaGalleryFragmentBase.A0B.A00;
                    C14870pt r6 = mediaGalleryFragmentBase.A07;
                    AnonymousClass013 r7 = mediaGalleryFragmentBase.A0E;
                    AnonymousClass2TH r3 = new AnonymousClass2TH(context, mediaGalleryFragmentBase, r6, r7, r8, A1C, new C56122l0(context, r7), mediaGalleryFragmentBase.A0S, i5, z2);
                    mediaGalleryFragmentBase.A0J = r3;
                    mediaGalleryFragmentBase.A0N.Ack(r3, new Void[0]);
                }
            } else {
                mediaGalleryFragmentBase.A00 = r15.getCount();
                mediaGalleryFragmentBase.A06.A01();
                mediaGalleryFragmentBase.A1J(false);
            }
            mediaGalleryFragmentBase.A1F();
        }
    }
}
