package X;

import android.view.LayoutInflater;
import com.obwhatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.2hI  reason: invalid class name and case insensitive filesystem */
public final class C54352hI extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54352hI(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LayoutInflater from = LayoutInflater.from(this.this$0.A02());
        C18450wi.A0B(from);
        return new C54362hJ(from, (AnonymousClass2OM) this.this$0.A0D.getValue());
    }
}
