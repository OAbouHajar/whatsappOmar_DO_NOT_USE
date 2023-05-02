package X;

import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.community.AddGroupsToCommunityActivity;
import com.whatsapp.jid.GroupJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Fq  reason: invalid class name and case insensitive filesystem */
public class C62973Fq implements AnonymousClass2NY {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass3AE A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ Set A03;

    public C62973Fq(Uri uri, AnonymousClass3AE r2, Set set, Set set2) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = set;
        this.A02 = set2;
    }

    public void AQR(int i2) {
        C55292jF r0 = this.A01.A01;
        if (r0 != null) {
            AddGroupsToCommunityActivity addGroupsToCommunityActivity = r0.A00;
            addGroupsToCommunityActivity.Ac1();
            addGroupsToCommunityActivity.A37();
        }
    }

    public void AYI(AnonymousClass4MJ r25, C16050sL r26) {
        AnonymousClass3AE r3 = this.A01;
        C16050sL r2 = r26;
        r3.A02 = r2;
        Uri uri = this.A00;
        if (uri != null) {
            File A0D = C13700nu.A0D(uri.getPath());
            if (A0D.exists()) {
                r3.A0E.A0B(r3.A07.A0A(r2), A0D, (byte[]) null, false);
            }
        }
        C55292jF r5 = r3.A01;
        if (r5 != null) {
            AddGroupsToCommunityActivity addGroupsToCommunityActivity = r5.A00;
            addGroupsToCommunityActivity.A0T.set(r2);
            addGroupsToCommunityActivity.A05.A0L(new RunnableRunnableShape5S0100000_I0_4((Object) r5, 28), 10000);
        }
        Set set = this.A03;
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            GroupJid of = GroupJid.of(C13680ns.A0U(it).A0E);
            if (of != null) {
                A0u.add(of);
            }
        }
        Set set2 = this.A02;
        int size = set2.size() + (A0u.isEmpty() ^ true ? 1 : 0);
        if (size == 0) {
            AnonymousClass3AE.A00(r3, size);
            return;
        }
        r3.A0H.set(size);
        if (!set2.isEmpty()) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                C16010sH A0U = C13680ns.A0U(it2);
                C15830rv r4 = A0U.A0E;
                AnonymousClass1WP r42 = r4 instanceof AnonymousClass1WP ? (AnonymousClass1WP) r4 : null;
                AnonymousClass00B.A06(r42);
                AnonymousClass4OC r16 = new AnonymousClass4OC(r2, r42, A0U.A09(), (String) null, AnonymousClass000.A0u(), A0U.A01, false);
                r3.A0G.put(r42, A0U.A09());
                new C63153Gi(r3.A04, r3.A06, r3.A09, r3.A0A, r3.A0B, new C62963Fp(r3, A0U, r42), r16, r3.A0D).A00();
            }
        }
        if (!A0u.isEmpty()) {
            Iterator it3 = A0u.iterator();
            while (it3.hasNext()) {
                C15830rv A0B = C13700nu.A0B(it3);
                r3.A0G.put(A0B, r3.A07.A0A(A0B).A09());
            }
            C16300so r6 = r3.A04;
            C17190ug r11 = r3.A0D;
            C62983Fr r52 = new C62983Fr(r3);
            String A022 = r11.A02();
            int size2 = A0u.size();
            C28371Vv[] r8 = new C28371Vv[size2];
            for (int i2 = 0; i2 < size2; i2 = C28371Vv.A01(A0u.get(i2), new C35081lL[1], r8, i2)) {
            }
            C35081lL[] r7 = new C35081lL[1];
            C35081lL.A02("link_type", "sub_group", r7, 0);
            r11.A0A(new AnonymousClass3GP(r6, r52), C28371Vv.A02(r2, new C28371Vv(new C28371Vv(FacebookFacade.RequestParameter.LINK, r7, r8), "links", (C35081lL[]) null), A022), A022, 301, 32000);
        }
    }

    public void AYu() {
        C55292jF r0 = this.A01.A01;
        if (r0 != null) {
            AddGroupsToCommunityActivity addGroupsToCommunityActivity = r0.A00;
            addGroupsToCommunityActivity.Ac1();
            addGroupsToCommunityActivity.A37();
        }
    }
}
