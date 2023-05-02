package X;

import android.app.Application;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2Sb  reason: invalid class name and case insensitive filesystem */
public class C49272Sb extends AnonymousClass02H {
    public final AnonymousClass026 A00;
    public final AnonymousClass026 A01;
    public final AnonymousClass027 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass1TC A04;
    public final C55222j6 A05;
    public final C49992Xb A06;
    public final C18260wP A07;
    public final UserJid A08;
    public final AnonymousClass1KS A09;

    public C49272Sb(Application application, AnonymousClass1TC r12, C49992Xb r13, C18260wP r14, UserJid userJid, AnonymousClass1KS r16, C35171lU r17) {
        super(application);
        AnonymousClass027 r8 = new AnonymousClass027();
        this.A02 = r8;
        AnonymousClass026 r5 = new AnonymousClass026();
        this.A01 = r5;
        AnonymousClass026 r4 = new AnonymousClass026();
        this.A00 = r4;
        AnonymousClass027 r3 = new AnonymousClass027();
        this.A03 = r3;
        this.A08 = userJid;
        this.A04 = r12;
        this.A06 = r13;
        this.A07 = r14;
        this.A09 = r16;
        String valueOf = String.valueOf((int) this.A00.getResources().getDimension(R.dimen.dimen0529));
        ArrayList arrayList = new ArrayList();
        C35171lU r6 = r17;
        for (C35141lR r0 : r6.A02) {
            for (C35161lT r02 : r0.A01) {
                arrayList.add(r02.A00);
            }
        }
        C55222j6 r2 = new C55222j6(userJid, valueOf, valueOf, arrayList);
        this.A05 = r2;
        r13.A00 = r8;
        r4.A0D(r3, new IDxObserverShape115S0100000_2_I0((Object) this, 48));
        r5.A0D(r3, new C62313Db(r12, this, r6));
        r12.A00(r3, r2);
    }

    public void A05() {
        boolean A0A = this.A07.A0A();
        AnonymousClass1TC r0 = this.A04;
        C55222j6 r1 = this.A05;
        if (A0A) {
            r0.A01(r1);
            return;
        }
        AnonymousClass39J r02 = (AnonymousClass39J) r0.A06.get(r1);
        if (r02 != null && r02.A00 < r02.A07.size()) {
            this.A00.A0B(5);
        }
    }

    public void A06() {
        boolean A0A = this.A07.A0A();
        AnonymousClass1TC r4 = this.A04;
        if (A0A) {
            r4.A02.A0E(this.A08, 0);
            C55222j6 r3 = this.A05;
            r4.A06.remove(r3);
            AnonymousClass027 r2 = this.A03;
            r2.A09(new C49822Vz(4));
            r4.A00(r2, r3);
            r4.A01(r3);
            return;
        }
        AnonymousClass39J r0 = (AnonymousClass39J) r4.A06.get(this.A05);
        if (r0 != null && r0.A00 < r0.A07.size()) {
            this.A00.A0B(5);
        }
    }
}
