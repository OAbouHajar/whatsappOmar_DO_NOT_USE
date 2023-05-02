package X;

import android.os.Bundle;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.5ER  reason: invalid class name */
public final class AnonymousClass5ER extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C54372hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ER(C54372hK r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
        C54372hK r0 = this.this$0;
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("include", r0.A00);
        galleryPickerFragment.A0T(A0D);
        return galleryPickerFragment;
    }
}
