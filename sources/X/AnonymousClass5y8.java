package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5y8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C15830rv A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C1223769i A04;
    public final /* synthetic */ AnonymousClass5xV A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ AnonymousClass5y8(C28401Vy r1, C15830rv r2, UserJid userJid, C1223769i r4, AnonymousClass5xV r5, String str, List list, long j2) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j2;
        this.A01 = r1;
        this.A04 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5xV r6 = this.A05;
        String str = this.A06;
        List list = this.A07;
        C15830rv r4 = this.A02;
        UserJid userJid = this.A03;
        long j2 = this.A00;
        C28401Vy r3 = this.A01;
        C1223769i r1 = this.A04;
        r6.A06.Acl(new C1217466r(r3, r4, userJid, r6, str, list, j2));
        r1.A95();
    }
}
