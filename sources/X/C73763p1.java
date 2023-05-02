package X;

import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import java.util.Map;

/* renamed from: X.3p1  reason: invalid class name and case insensitive filesystem */
public final class C73763p1 extends C101544xU {
    public final StorageUsageGalleryActivity A00;
    public final C73773p2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73763p1(AnonymousClass2SQ r4, StorageUsageGalleryActivity storageUsageGalleryActivity, C73773p2 r6) {
        super(r4.A00(storageUsageGalleryActivity));
        C18450wi.A0H(r4, 1);
        this.A00 = storageUsageGalleryActivity;
        this.A01 = r6;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        return i2 == 20 ? this.A01.A00.A02(this.A00, map) : super.A8o(map, i2);
    }
}
