package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.38n  reason: invalid class name and case insensitive filesystem */
public class C613438n {
    public final C19980zJ A00;
    public final C16000sG A01;
    public final C19230xz A02;
    public final C16440t3 A03;
    public final C19820z3 A04;

    public C613438n(C19980zJ r1, C16000sG r2, C19230xz r3, C16440t3 r4, C19820z3 r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void A00(Context context, AnonymousClass1US r15) {
        C16000sG r3 = this.A01;
        String str = r15.A0B;
        C16010sH A002 = C16000sG.A00(r3, C15830rv.A02(str));
        UserJid nullable = UserJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        this.A04.A00(new C41261vV(new C41271vW(nullable, "biz_search", "whatsapp", System.currentTimeMillis(), System.currentTimeMillis())));
        this.A02.A09(C16000sG.A00(r3, C15830rv.A02(str)));
        this.A00.A07(context, C14750ph.A0q().A0v(context, A002));
    }
}
