package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5vH  reason: invalid class name and case insensitive filesystem */
public class C118805vH {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C14710pd A02;
    public final C17190ug A03;
    public final AnonymousClass60V A04;
    public final AnonymousClass175 A05;
    public final C18340wX A06;
    public final C18290wS A07;
    public final AnonymousClass61W A08;
    public final C112715ix A09;

    public C118805vH(C14870pt r1, C16040sK r2, C14710pd r3, C17190ug r4, AnonymousClass60V r5, AnonymousClass175 r6, C18340wX r7, C18290wS r8, AnonymousClass61W r9, C112715ix r10) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
    }

    public void A00(Context context, UserJid userJid, AnonymousClass4XO r19, C1222668x r20, Boolean bool) {
        UserJid userJid2 = userJid;
        Log.i(AnonymousClass000.A0g("PAY: sendGetContactInfoForJid: ", userJid2));
        this.A08.AgB();
        Integer A022 = this.A09.A02("upi-get-vpa");
        AnonymousClass4XO r4 = r19;
        if (r19 != null) {
            r4.A04("upi-get-vpa");
        }
        String str = null;
        if (bool != null && this.A05.A0C() && this.A02.A0C(1450)) {
            str = bool.booleanValue() ? "true" : "false";
        }
        C17190ug r9 = this.A03;
        String A023 = r9.A02();
        AnonymousClass5w9 r7 = new AnonymousClass5w9(userJid2, new AnonymousClass2BJ(A023), str);
        r9.A0A(new C112465iX(context, this.A00, this.A06, r4, r20, this, r7, A022), r7.A00, A023, 204, 0);
    }

    public void A01(Context context, AnonymousClass4XO r9, C1222668x r10) {
        C16040sK r0 = this.A01;
        r0.A0B();
        A00(context, r0.A05, r9, new AnonymousClass613(r10, this), (Boolean) null);
    }
}
