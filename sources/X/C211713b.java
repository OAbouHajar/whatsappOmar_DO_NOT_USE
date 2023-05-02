package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.13b  reason: invalid class name and case insensitive filesystem */
public final class C211713b implements C211813c {
    public boolean A00;
    public final C211613a A01;
    public final AnonymousClass01J A02;

    public C211713b(C211613a r2, AnonymousClass01J r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AN2() {
        this.A01.A02(8);
    }

    public void AN3() {
        boolean A012 = ((C26141Mm) this.A02.get()).A01();
        C211613a r2 = this.A01;
        r2.A03((Integer) null, (String) null, 5, A012);
        if (this.A00) {
            this.A00 = false;
            r2.A02(21);
        }
    }

    public void AN4(String str) {
        if (C18450wi.A0R(str, "will_delete")) {
            this.A01.A02(25);
        } else {
            Log.e(C18450wi.A06("AvatarEditorLoggingEvents/onAvatarEditorEvent received unhandled event = ", str));
        }
    }

    public void AN5(String str, Map map) {
        C211613a r1;
        int i2;
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1147774587:
                    if (str.equals("notice_screen_shown")) {
                        this.A00 = true;
                        r1 = this.A01;
                        i2 = 20;
                        break;
                    }
                    break;
                case 871004653:
                    if (str.equals("user_confirmation_success")) {
                        this.A00 = false;
                        r1 = this.A01;
                        i2 = 23;
                        break;
                    }
                    break;
                case 1038955126:
                    str2 = "editor_navigation_failed";
                    break;
                case 1161655571:
                    str2 = "user_confirmation_failed";
                    break;
                case 1182156104:
                    if (str.equals("notice_screen_next_click")) {
                        r1 = this.A01;
                        i2 = 22;
                        break;
                    }
                    break;
            }
            if (str.equals(str2)) {
                this.A00 = true;
                r1 = this.A01;
                i2 = 24;
                r1.A02(i2);
                return;
            }
        }
        Log.e(C18450wi.A06("AvatarEditorLoggingEvents/onAvatarNoticeEvent received unhandled event = ", str));
    }

    public void AN6(boolean z2) {
        C211613a r1 = this.A01;
        int i2 = 7;
        if (z2) {
            i2 = 3;
        }
        r1.A02(i2);
    }
}
