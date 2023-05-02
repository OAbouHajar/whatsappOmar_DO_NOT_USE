package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3DT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DT implements AnonymousClass025 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42481xs A01;
    public final /* synthetic */ C34861kz A02;
    public final /* synthetic */ C451027b A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass3DT(C42481xs r1, C34861kz r2, C451027b r3, Collection collection, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
        this.A04 = collection;
        this.A03 = r3;
        this.A05 = z2;
    }

    public final Object apply(Object obj) {
        C42481xs r8 = this.A01;
        C34861kz r10 = this.A02;
        int i2 = this.A00;
        Collection collection = this.A04;
        C451027b r6 = this.A03;
        boolean z2 = this.A05;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList A0u = AnonymousClass000.A0u();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C16010sH A0U = C13680ns.A0U(it);
                if (!AnonymousClass288.A04(A0U.A0E)) {
                    C19810z2 r1 = r8.A0G;
                    boolean A08 = r8.A0J.A08();
                    C38531qw r11 = new C38531qw(A0U);
                    r11.A0I = true;
                    r11.A0G = r8.A0L.A05();
                    r11.A08 = true;
                    r11.A0D = true;
                    r11.A0H = true;
                    r11.A0B = true;
                    r11.A00 = C16010sH.A00(A0U, r10);
                    r11.A0F = A08;
                    r11.A0C = true;
                    r11.A0E = z2;
                    UserJid userJid = r11.A0K;
                    r11.A01 = C19810z2.A00(r11, r1, userJid);
                    if (A08) {
                        C18290wS.A00(r8, r11, userJid);
                    }
                    C38531qw.A00(r8, r11, userJid, r8.A0M);
                    C38531qw.A01(r11, A0u);
                }
            }
        }
        A0u.size();
        if (C451027b.A00(r6, A0u)) {
            return AnonymousClass284.A08;
        }
        if (!r8.A03(r6, str, AnonymousClass283.A03(r10, r8.A01(), "sync_sid_sidelist", A0u, i2))) {
            return AnonymousClass284.A03;
        }
        AnonymousClass167.A00(r8, r6, A0u, elapsedRealtime);
        return AnonymousClass284.A06;
    }
}
