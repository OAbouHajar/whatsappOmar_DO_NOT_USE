package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vV  reason: invalid class name and case insensitive filesystem */
public class C100354vV implements C449926n {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C14870pt A02;
    public final /* synthetic */ AnonymousClass1WD A03;
    public final /* synthetic */ AnonymousClass1KA A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C100354vV(Context context, Intent intent, C14870pt r3, AnonymousClass1WD r4, AnonymousClass1KA r5, UserJid userJid, String str, boolean z2) {
        this.A06 = str;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = userJid;
        this.A07 = z2;
        this.A00 = context;
        this.A01 = intent;
        this.A03 = r4;
    }

    public void ARA(String str, int i2) {
        if (this.A06.equals(str)) {
            C14870pt r3 = this.A02;
            r3.A02.post(new RunnableRunnableShape13S0200000_I1_1(this, 1, this.A04));
            this.A03.accept(Boolean.FALSE);
        }
    }

    public void ARB(AnonymousClass26S r9, String str) {
        String str2 = this.A06;
        if (str2.equals(str)) {
            C14870pt r3 = this.A02;
            r3.A02.post(new RunnableRunnableShape13S0200000_I1_1(this, 2, this.A04));
            C61843Ap.A00(this.A00, this.A01, this.A05, (Integer) null, (Integer) null, str2, 6, this.A07);
            this.A03.accept(Boolean.TRUE);
        }
    }
}
