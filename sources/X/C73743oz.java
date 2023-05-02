package X;

import com.obwhatsapp.gallery.MediaGalleryActivity;
import java.util.Map;

/* renamed from: X.3oz  reason: invalid class name and case insensitive filesystem */
public final class C73743oz extends C101544xU {
    public final MediaGalleryActivity A00;
    public final AnonymousClass2ZD A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73743oz(AnonymousClass2SQ r4, MediaGalleryActivity mediaGalleryActivity, AnonymousClass2ZD r6) {
        super(r4.A00(mediaGalleryActivity));
        C18450wi.A0H(r4, 1);
        this.A00 = mediaGalleryActivity;
        this.A01 = r6;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        if (i2 == 18) {
            return this.A01.A00.A03(this.A00, (C16740tZ) C810246n.A00(map));
        } else if (i2 != 19) {
            return super.A8o(map, i2);
        } else {
            return this.A01.A01.A03(this.A00, (C16740tZ) C810246n.A00(map));
        }
    }
}
