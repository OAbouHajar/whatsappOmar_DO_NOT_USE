package X;

import android.os.Bundle;
import com.obwhatsapp.gallery.GalleryRecentsFragment;

/* renamed from: X.5ES  reason: invalid class name */
public final class AnonymousClass5ES extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C54372hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ES(C54372hK r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        GalleryRecentsFragment galleryRecentsFragment = new GalleryRecentsFragment();
        C54372hK r3 = this.this$0;
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("include", r3.A00);
        galleryRecentsFragment.A0T(A0D);
        galleryRecentsFragment.A02 = r3.A03;
        galleryRecentsFragment.A01 = r3.A02;
        return galleryRecentsFragment;
    }
}
