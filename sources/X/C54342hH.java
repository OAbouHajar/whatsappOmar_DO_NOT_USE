package X;

import com.obwhatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.2hH  reason: invalid class name and case insensitive filesystem */
public final class C54342hH extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54342hH(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        C23651Cv r4 = galleryTabHostFragment.A06;
        if (r4 != null) {
            return new AnonymousClass2OM(galleryTabHostFragment.A1D().A00.getContentResolver(), this.this$0.A0C, r4, "tabbed-gallery-ui");
        }
        C18450wi.A0O("caches");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
