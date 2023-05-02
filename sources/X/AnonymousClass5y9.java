package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5y9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C35361lo A02;
    public final /* synthetic */ C15830rv A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ C1223769i A05;
    public final /* synthetic */ AnonymousClass5xV A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public /* synthetic */ AnonymousClass5y9(C28401Vy r1, C35361lo r2, C15830rv r3, UserJid userJid, C1223769i r5, AnonymousClass5xV r6, String str, List list, long j2) {
        this.A06 = r6;
        this.A07 = str;
        this.A08 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j2;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = r5;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5xV r7 = this.A06;
        String str = this.A07;
        List list = this.A08;
        C15830rv r5 = this.A03;
        UserJid userJid = this.A04;
        long j2 = this.A00;
        C28401Vy r3 = this.A01;
        C35361lo r4 = this.A02;
        C1223769i r1 = this.A05;
        r7.A06.Acl(new C1217666t(r3, r4, r5, userJid, r7, str, list, j2));
        r1.A95();
    }
}
