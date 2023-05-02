package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.4Wh  reason: invalid class name and case insensitive filesystem */
public class C87324Wh {
    public final Context A00;
    public final C14600pS A01;
    public final C14870pt A02;
    public final C18290wS A03;
    public final AnonymousClass3Q5 A04;
    public final Runnable A05;
    public final Runnable A06;
    public final boolean A07;

    public C87324Wh(Context context, C14600pS r2, C14870pt r3, C18290wS r4, AnonymousClass3Q5 r5, Runnable runnable, Runnable runnable2, boolean z2) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = context;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = runnable;
        this.A05 = runnable2;
        this.A07 = z2;
    }

    public final void A00(UserJid userJid, C47372Ir r6, String str, boolean z2) {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(userJid);
        AnonymousClass3Q5 r1 = this.A04;
        r1.A05(0);
        DialogFragment AEe = r6.AEe(str, A0u, z2, this.A07);
        this.A01.Afc(AEe);
        r1.A00.A0A(AEe, new IDxObserverShape37S0200000_2_I1(AEe, 6, this));
    }

    public void A01(UserJid userJid, AnonymousClass5S3 r11, String str) {
        AnonymousClass00B.A0F(A02());
        C18290wS r1 = this.A03;
        C47372Ir AEf = r1.A03().AEf();
        AnonymousClass00B.A06(AEf);
        C42511xv A012 = r1.A01();
        AnonymousClass4NP r3 = new AnonymousClass4NP(userJid, AEf, r11, this, str);
        C13680ns.A1U(new C78843ym(A012.A01, userJid, r3), A012.A03);
    }

    public boolean A02() {
        C47372Ir AEf = this.A03.A03().AEf();
        if (AEf == null) {
            return false;
        }
        return AEf.A5w();
    }
}
