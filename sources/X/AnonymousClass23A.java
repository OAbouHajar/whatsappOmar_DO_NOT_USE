package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.23A  reason: invalid class name */
public class AnonymousClass23A implements C19550yc {
    public AnonymousClass1U3 A00;
    public final int A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C16300so A03;
    public final C17150uc A04;
    public final AnonymousClass13V A05;
    public final UserJid A06;
    public final C17190ug A07;
    public final C18630x0 A08;
    public final String A09;

    public AnonymousClass23A(C16300so r3, C17150uc r4, AnonymousClass13V r5, UserJid userJid, C17190ug r7, C18630x0 r8, String str, int i2) {
        this.A01 = i2;
        this.A06 = userJid;
        this.A09 = str;
        this.A03 = r3;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
    }

    public void A00(AnonymousClass1U3 r17) {
        C35081lL[] r5;
        UserJid userJid;
        this.A00 = r17;
        C17190ug r9 = this.A07;
        String A022 = r9.A02();
        this.A08.A02("profile_view_tag");
        String str = this.A09;
        if (str != null) {
            userJid = this.A06;
            r5 = new C35081lL[]{new C35081lL((Jid) userJid, "jid"), new C35081lL("tag", str)};
        } else {
            userJid = this.A06;
            r5 = new C35081lL[]{new C35081lL((Jid) userJid, "jid")};
        }
        r9.A0A(this, new C28371Vv(new C28371Vv(new C28371Vv("profile", r5), "business_profile", new C35081lL[]{new C35081lL("v", this.A01)}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:biz"), new C35081lL("type", "get")}), A022, 132, 32000);
        StringBuilder sb = new StringBuilder("sendGetBusinessProfile jid=");
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public void APb(String str) {
        this.A08.A01("profile_view_tag");
        Log.i("sendGetBusinessProfile/delivery-error");
        this.A02.post(new RunnableRunnableShape0S1100000_I0(14, str, this));
    }

    public void AQe(C28371Vv r4, String str) {
        this.A08.A01("profile_view_tag");
        Log.i("sendGetBusinessProfile/response-error");
        this.A02.post(new RunnableRunnableShape0S1200000_I0(r4, str, this, 9));
    }

    public void AYG(C28371Vv r5, String str) {
        C16300so r1;
        String str2;
        this.A08.A01("profile_view_tag");
        C28371Vv A0J = r5.A0J("business_profile");
        if (A0J == null) {
            r1 = this.A03;
            str2 = "payload businessProfileNode doesn't match server";
        } else {
            C28371Vv A0J2 = A0J.A0J("profile");
            if (A0J2 == null) {
                r1 = this.A03;
                str2 = "payload profileNode doesn't match server";
            } else {
                UserJid userJid = this.A06;
                C35611mD A002 = AnonymousClass27m.A00(userJid, A0J2);
                this.A04.A06(A002, userJid);
                this.A02.post(new RunnableRunnableShape3S0200000_I0_1(this, 11, A002));
                return;
            }
        }
        r1.AcB("smb-reg-business-profile-fetch-failed", str2, false);
        AQe(r5, str);
    }
}
