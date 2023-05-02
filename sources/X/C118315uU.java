package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5uU  reason: invalid class name and case insensitive filesystem */
public class C118315uU {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16980tz A02;
    public final C17190ug A03;
    public final C18340wX A04;

    public C118315uU(C16300so r1, C14870pt r2, C16980tz r3, C17190ug r4, C18340wX r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void A00(UserJid userJid, AnonymousClass691 r13) {
        C17190ug r3 = this.A03;
        String A022 = r3.A02();
        C116465rQ r10 = new C116465rQ(userJid, new C118015tv(A022));
        C28371Vv r1 = r10.A00;
        Context context = this.A02.A00;
        C14870pt r9 = this.A01;
        C110105dW.A1H(r3, new C112045hr(context, this.A04, r13, this, r9, r10), r1, A022);
    }
}
