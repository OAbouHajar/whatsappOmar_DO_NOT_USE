package X;

import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Fs  reason: invalid class name and case insensitive filesystem */
public class C62993Fs implements C109325Rp {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ String A01;

    public C62993Fs(AcceptInviteLinkActivity acceptInviteLinkActivity, String str) {
        this.A00 = acceptInviteLinkActivity;
        this.A01 = str;
    }

    public void AQR(int i2) {
        this.A00.A05.A0K(new RunnableRunnableShape1S0101000_I1((Object) this, i2, 1));
    }

    public void AY1(C16050sL r21, UserJid userJid, C30371cF r23, String str, Map map, int i2, int i3, int i4, long j2, long j3, boolean z2) {
        int i5;
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        Map map2 = map;
        List A0B = acceptInviteLinkActivity.A0F.A0B(map2);
        C16050sL r8 = r21;
        C30361cE r5 = new C30361cE(r8);
        Iterator A0y = AnonymousClass000.A0y(map2);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            String str2 = ((AnonymousClass2Bb) A0z.getValue()).A03;
            boolean equals = "admin".equals(str2);
            boolean equals2 = "superadmin".equals(str2);
            if (equals) {
                i5 = 1;
            } else if (equals2) {
                i5 = 2;
            }
            r5.A07((UserJid) A0z.getKey(), acceptInviteLinkActivity.A0C.A0D((UserJid) A0z.getKey()), i5, false, true);
        }
        AnonymousClass1BX r0 = acceptInviteLinkActivity.A0B;
        r0.A03.put(acceptInviteLinkActivity.A0I, r5);
        acceptInviteLinkActivity.A05.A0K(new RunnableRunnableShape1S1200000_I1(this, this.A01, new C85534Ov(r8, userJid, r23, str, (String) null, A0B, i2, 0, 0, j2), 3));
    }
}
