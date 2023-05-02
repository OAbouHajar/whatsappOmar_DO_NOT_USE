package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4xY  reason: invalid class name and case insensitive filesystem */
public class C101584xY implements AnonymousClass5SV {
    public AnonymousClass4N6 A00;
    public final C18260wP A01;
    public final C79073z9 A02;
    public final C16320sq A03;

    public C101584xY(AnonymousClass4N6 r2, C18260wP r3, C23181Au r4, UserJid userJid, C17190ug r6, C16320sq r7) {
        this.A00 = r2;
        this.A03 = r7;
        this.A01 = r3;
        this.A02 = new C79073z9(r4, this, userJid, r6);
    }

    public final void A00(AnonymousClass284 r6) {
        AnonymousClass4N6 r4 = this.A00;
        if (r4 != null) {
            r4.A01.A03(r4.A00, r4.A03, r6, r4.A04);
            AnonymousClass5P4 r0 = r4.A02;
            if (r0 != null) {
                r0.ANo(r6);
            }
        }
    }

    public void AVZ() {
        A00((AnonymousClass284) null);
    }

    public void AYb(AnonymousClass284 r5) {
        if (r5 == null) {
            r5 = null;
        } else {
            int i2 = r5.A00;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                AnonymousClass4N6 r0 = this.A00;
                if (r0 != null) {
                    C19860z7 r3 = r0.A01;
                    r3.A01();
                    r3.A04(r0.A00, r0.A03, r0.A04);
                    return;
                }
                return;
            }
        }
        A00(r5);
    }

    public void AYc() {
    }
}
