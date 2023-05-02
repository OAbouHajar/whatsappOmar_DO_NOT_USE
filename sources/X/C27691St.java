package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.jid.UserJid;
import java.util.Random;

/* renamed from: X.1St  reason: invalid class name and case insensitive filesystem */
public final class C27691St {
    public final C16000sG A00;
    public final C14710pd A01;
    public final C16490t9 A02;

    public C27691St(C16000sG r2, C14710pd r3, C16490t9 r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public static final int A00(int i2) {
        switch (i2) {
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            default:
                return 1;
        }
    }

    public final AnonymousClass2TW A01(UserJid userJid, Boolean bool, Boolean bool2, Integer num, Long l2, String str) {
        C16010sH A08;
        C16010sH A082;
        AnonymousClass2TW r2 = new AnonymousClass2TW();
        if (l2 == null) {
            l2 = Long.valueOf(new Random().nextLong());
        }
        r2.A06 = l2;
        r2.A00 = bool;
        r2.A01 = bool2;
        r2.A07 = str;
        r2.A04 = num;
        Boolean bool3 = null;
        if (!(userJid == null || (A082 = this.A00.A08(userJid)) == null)) {
            bool3 = Boolean.valueOf(A082.A0H());
        }
        r2.A02 = bool3;
        Boolean bool4 = null;
        if (!(userJid == null || (A08 = this.A00.A08(userJid)) == null)) {
            bool4 = Boolean.valueOf(A08.A0G());
        }
        r2.A03 = bool4;
        if (userJid != null) {
            r2.A08 = userJid.toString();
        }
        return r2;
    }

    public final C75793sj A02(UserJid userJid, Boolean bool, Boolean bool2, Integer num, Long l2, String str) {
        C16010sH A08;
        C16010sH A082;
        C75793sj r2 = new C75793sj();
        r2.A07 = l2;
        r2.A00 = bool;
        r2.A01 = bool2;
        r2.A08 = str;
        r2.A05 = num;
        Boolean bool3 = null;
        if (!(userJid == null || (A082 = this.A00.A08(userJid)) == null)) {
            bool3 = Boolean.valueOf(A082.A0H());
        }
        r2.A02 = bool3;
        Boolean bool4 = null;
        if (!(userJid == null || (A08 = this.A00.A08(userJid)) == null)) {
            bool4 = Boolean.valueOf(A08.A0G());
        }
        r2.A03 = bool4;
        r2.A09 = String.valueOf(userJid);
        return r2;
    }

    public final void A03(C16470t7 r4, C16740tZ r5) {
        boolean z2 = false;
        if (r5 != null && r5.A10(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START)) {
            z2 = true;
        }
        C16490t9 r0 = this.A02;
        if (z2) {
            r0.A04(r4);
        } else {
            r0.A06(r4);
        }
    }

    public final boolean A04(C16740tZ r4) {
        C14710pd r2 = this.A01;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 2817) ? r4 != null && r4.A10(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) : r2.A0E(r1, 2062);
    }
}
