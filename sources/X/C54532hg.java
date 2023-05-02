package X;

import com.obwhatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2hg  reason: invalid class name and case insensitive filesystem */
public class C54532hg extends C16690tT {
    public final AnonymousClass2BC A00;
    public final C54582hn A01;

    public C54532hg(C001300o r2, AnonymousClass2BC r3, C54582hn r4) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2 = 0;
        while (true) {
            AnonymousClass2BC r1 = this.A00;
            if (i2 >= r1.getCount()) {
                return null;
            }
            r1.ADR(i2);
            i2++;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01.A00;
        mediaGalleryFragmentBase.A0O = true;
        AnonymousClass2BC r0 = mediaGalleryFragmentBase.A0H;
        if (r0 != null) {
            mediaGalleryFragmentBase.A00 = r0.getCount();
        }
        mediaGalleryFragmentBase.A06.A01();
    }
}
