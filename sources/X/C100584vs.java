package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100584vs implements C108555Ol {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4N4 A01;
    public final /* synthetic */ C71613ki A02;

    public /* synthetic */ C100584vs(AnonymousClass4N4 r1, C71613ki r2, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void AOg(View view, C84744Ls r11) {
        C71613ki r1 = this.A02;
        AnonymousClass4N4 r0 = this.A01;
        int i2 = this.A00;
        C57242qY r2 = r1.A00;
        boolean z2 = r0.A04;
        UserJid userJid = r2.A0M;
        String str = r0.A01;
        r2.A06.A0B(z2 ? new AnonymousClass2W5(userJid, str, r0.A02) : new AnonymousClass2W3(userJid, str));
        r2.A0E.A01(userJid, str, 1, 1, i2, z2);
    }
}
