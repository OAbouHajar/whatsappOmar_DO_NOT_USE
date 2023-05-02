package X;

import android.app.Application;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2qY  reason: invalid class name and case insensitive filesystem */
public class C57242qY extends AnonymousClass02H {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass027 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07 = C13690nt.A0O();
    public final AnonymousClass027 A08;
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A;
    public final C16040sK A0B;
    public final C18640x1 A0C;
    public final AnonymousClass4H0 A0D;
    public final AnonymousClass1KV A0E;
    public final C17170ue A0F;
    public final AnonymousClass1KA A0G;
    public final C49992Xb A0H;
    public final AnonymousClass1KU A0I;
    public final C16440t3 A0J;
    public final C15860rz A0K;
    public final C14710pd A0L;
    public final UserJid A0M;
    public final AnonymousClass1KS A0N;
    public final C18630x0 A0O;
    public final AnonymousClass1BW A0P;
    public final C30801cy A0Q;

    public C57242qY(Application application, C16040sK r5, C18640x1 r6, AnonymousClass4H0 r7, AnonymousClass1KV r8, C17170ue r9, AnonymousClass1KA r10, C49992Xb r11, AnonymousClass1KU r12, C16440t3 r13, C15860rz r14, C14710pd r15, UserJid userJid, AnonymousClass1KS r17, C18630x0 r18, AnonymousClass1BW r19) {
        super(application);
        AnonymousClass027 A0O2 = C13690nt.A0O();
        this.A05 = A0O2;
        this.A0A = C13690nt.A0O();
        this.A09 = C13690nt.A0O();
        this.A0Q = C30801cy.A01();
        this.A08 = C13690nt.A0O();
        this.A06 = C13690nt.A0O();
        this.A0J = r13;
        this.A0L = r15;
        this.A0M = userJid;
        this.A0B = r5;
        this.A0H = r11;
        this.A0O = r18;
        this.A0G = r10;
        this.A0C = r6;
        this.A0I = r12;
        this.A0F = r9;
        this.A0E = r8;
        this.A0P = r19;
        this.A0K = r14;
        this.A0D = r7;
        this.A0N = r17;
        this.A04 = application.getResources().getDimensionPixelSize(R.dimen.dimen063f);
        this.A03 = application.getResources().getDimensionPixelSize(R.dimen.dimen017a);
        r11.A00 = A0O2;
    }

    public void A05(UserJid userJid) {
        boolean A0I2 = this.A0B.A0I(userJid);
        C14710pd r2 = this.A0L;
        int i2 = 582;
        if (A0I2) {
            i2 = 451;
        }
        if (r2.A0E(C16620tM.A02, i2)) {
            AnonymousClass1KA r7 = this.A0G;
            int i3 = this.A04;
            int A002 = C13690nt.A00(r7.A07.A0I(userJid) ? 1 : 0) << 2;
            C18640x1 r4 = r7.A0B;
            synchronized (r4) {
                AnonymousClass2GD r3 = (AnonymousClass2GD) r4.A01.get(userJid);
                if (r3 != null) {
                    r3.A00 = new AnonymousClass2GH((String) null, true);
                    List list = r3.A03;
                    int size = list.size();
                    if (size > A002) {
                        for (int i4 = A002; i4 < size; i4++) {
                            list.remove(list.size() - 1);
                        }
                    }
                }
            }
            List A072 = r4.A07(userJid);
            if (!A072.isEmpty()) {
                r7.A03.A09(new C71423kM(new AnonymousClass4K7(A072, true, true), userJid));
                A002 <<= 1;
            }
            r7.A05(userJid, i3, A002, true);
        }
    }

    public void A06(UserJid userJid) {
        boolean A0I2 = this.A0B.A0I(userJid);
        C14710pd r2 = this.A0L;
        int i2 = 582;
        if (A0I2) {
            i2 = 451;
        }
        if (r2.A0E(C16620tM.A02, i2)) {
            A05(userJid);
        }
        this.A0G.A04(userJid, this.A04);
    }

    public void A07(UserJid userJid) {
        AnonymousClass4H0 r6 = this.A0D;
        C14710pd r5 = r6.A01;
        C16620tM r1 = C16620tM.A02;
        if (r5.A0E(r1, 1514)) {
            AnonymousClass1KU r3 = this.A0I;
            if (r3.A03(userJid, "catalog_category_dummy_root_id")) {
                this.A08.A0B(r3.A01(userJid, "catalog_category_dummy_root_id"));
                return;
            }
            AnonymousClass4D7 r2 = new AnonymousClass4D7(this);
            if (r5.A0E(r1, 1514)) {
                C17150uc r12 = r6.A00;
                if (r12.A09()) {
                    r12.A03(new C100224vI(r6, r2, userJid), userJid);
                }
            }
        }
    }
}
