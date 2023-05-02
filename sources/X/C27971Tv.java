package X;

import android.os.Bundle;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S0311000_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1Tv  reason: invalid class name and case insensitive filesystem */
public class C27971Tv implements C19420yP {
    public final C16440t3 A00;
    public final C16980tz A01;
    public final C16460t6 A02;
    public final C14710pd A03;
    public final C18080w7 A04;
    public final C222517f A05;
    public final AnonymousClass124 A06;
    public final C207811o A07;
    public final AnonymousClass1HS A08;
    public final C18300wT A09;
    public final AnonymousClass12K A0A;
    public final C18090w8 A0B;
    public final C18290wS A0C;
    public final AnonymousClass13O A0D;
    public final AnonymousClass1Vo A0E = AnonymousClass1Vo.A00("PaymentsXmppMessageHandler", "notification", "COMMON");
    public final AnonymousClass1GO A0F;
    public final AnonymousClass122 A0G;
    public final C16320sq A0H;

    public C27971Tv(C16440t3 r4, C16980tz r5, C16460t6 r6, C14710pd r7, C18080w7 r8, C222517f r9, AnonymousClass124 r10, C207811o r11, AnonymousClass1HS r12, C18300wT r13, AnonymousClass12K r14, C18090w8 r15, C18290wS r16, AnonymousClass13O r17, AnonymousClass1GO r18, AnonymousClass122 r19, C16320sq r20) {
        this.A00 = r4;
        this.A03 = r7;
        this.A01 = r5;
        this.A0H = r20;
        this.A06 = r10;
        this.A04 = r8;
        this.A05 = r9;
        this.A0C = r16;
        this.A02 = r6;
        this.A09 = r13;
        this.A07 = r11;
        this.A0G = r19;
        this.A0B = r15;
        this.A0D = r17;
        this.A0F = r18;
        this.A0A = r14;
        this.A08 = r12;
    }

    public static /* synthetic */ void A00(Bundle bundle, UserJid userJid, C27971Tv r9, C30641ci r10) {
        UserJid userJid2 = userJid;
        AnonymousClass00B.A06(userJid);
        boolean z2 = bundle.getBoolean("isMerchant");
        String string = bundle.getString("dataHash");
        r9.A0E.A06("onPaymentMerchantStatusUpdate");
        C18290wS r0 = r9.A0C;
        r0.A06();
        AnonymousClass160 r3 = r0.A09;
        Boolean valueOf = Boolean.valueOf(z2);
        synchronized (r3) {
            r3.A0J(userJid2, valueOf, string, (HashMap) null, (HashMap) null);
        }
        r9.A05.A03.A0E(r10);
    }

    public int[] ACW() {
        return new int[]{133, 211, 217, 219, HideMedia.IMAGES};
    }

    public boolean AHS(Message message, int i2) {
        C16320sq r2;
        int i3;
        Bundle data = message.getData();
        C30641ci r8 = (C30641ci) data.getParcelable("stanzaKey");
        C30831d2 A002 = this.A07.A00(2, r8.A00);
        if (A002 != null) {
            A002.A00(3);
        }
        int i4 = i2;
        if (i4 == 133) {
            r2 = this.A0H;
            i3 = 33;
        } else if (i4 == 211) {
            this.A0H.Acl(new RunnableRunnableShape0S0400000_I0(this, r8, data, AnonymousClass2RS.A00(data, "jid"), 31));
            return true;
        } else if (i4 == 217) {
            r2 = this.A0H;
            i3 = 34;
        } else if (i4 != 219) {
            if (i4 == 222) {
                C14710pd r22 = this.A03;
                C16620tM r1 = C16620tM.A02;
                if (r22.A0E(r1, 423) || r22.A0E(r1, 544)) {
                    this.A0H.Acl(new RunnableRunnableShape0S0311000_I0((Object) this, (Object) r8, (Object) AnonymousClass2RS.A00(data, "jid"), data.getInt("service"), 3, data.getBoolean("inviteUsed")));
                    return true;
                }
            }
            return false;
        } else {
            r2 = this.A0H;
            i3 = 32;
        }
        r2.Acl(new RunnableRunnableShape1S0300000_I0_1(this, r8, data, i3));
        return true;
    }
}
