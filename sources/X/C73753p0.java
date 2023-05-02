package X;

import com.obwhatsapp.status.playback.MyStatusesActivity;
import java.util.Map;

/* renamed from: X.3p0  reason: invalid class name and case insensitive filesystem */
public final class C73753p0 extends C101544xU {
    public final MyStatusesActivity A00;
    public final AnonymousClass2ZI A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73753p0(AnonymousClass2SQ r4, MyStatusesActivity myStatusesActivity, AnonymousClass2ZI r6) {
        super(r4.A00(myStatusesActivity));
        C18450wi.A0H(r4, 1);
        this.A00 = myStatusesActivity;
        this.A01 = r6;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        if (i2 == 12) {
            this.A00.A39(C13680ns.A0n(map.values()), true);
            return false;
        } else if (i2 != 13) {
            return i2 != 20 ? super.A8o(map, i2) : this.A01.A00.A02(this.A00, map);
        } else {
            this.A00.A39(C13680ns.A0n(map.values()), false);
            return true;
        }
    }
}
