package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5y7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C47222Ic A03;
    public final /* synthetic */ C1223769i A04;
    public final /* synthetic */ AnonymousClass5xV A05;

    public /* synthetic */ AnonymousClass5y7(C28401Vy r1, C15830rv r2, UserJid userJid, C47222Ic r4, C1223769i r5, AnonymousClass5xV r6) {
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5xV r9 = this.A05;
        C1223769i r8 = this.A04;
        C15830rv r7 = this.A01;
        UserJid userJid = this.A02;
        C28401Vy r5 = this.A00;
        C47222Ic r4 = this.A03;
        r8.Abv();
        C38641rB r2 = r4.A03;
        AnonymousClass00B.A06(r2);
        C18310wU r1 = r9.A04;
        if (!C16030sJ.A0L(r7)) {
            userJid = UserJid.of(r7);
        }
        r1.A0K(r5, (C35361lo) null, userJid, r2);
        r9.A00.A0K(new C1216666j(r4, r8, r9, r2));
    }
}
