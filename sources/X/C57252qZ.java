package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2qZ  reason: invalid class name and case insensitive filesystem */
public final class C57252qZ extends AnonymousClass02H implements C108645Ou {
    public String A00;
    public boolean A01;
    public final AnonymousClass026 A02;
    public final C25501Ka A03;
    public final C73553oL A04;
    public final C18150wE A05;
    public final AnonymousClass4KD A06;
    public final C30801cy A07 = C30801cy.A01();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57252qZ(Application application, C25501Ka r5, C73553oL r6, C18150wE r7, AnonymousClass4KD r8) {
        super(application);
        C18450wi.A0H(application, 1);
        C18450wi.A0H(r5, 4);
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        AnonymousClass026 r2 = new AnonymousClass026();
        this.A02 = r2;
        r7.A00 = r8;
        C13700nu.A0U(r8.A00, r2, this, 4);
    }

    public void A04() {
        this.A05.A00 = null;
    }

    public final void A05(int i2) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A03.A00(1, -1, -1);
        AnonymousClass026 r4 = this.A02;
        List A0k = C13690nt.A0k(r4);
        if (A0k != null) {
            if (((C86344Sg) C003101j.A04(A0k)).A00.intValue() == 10) {
                A0u.addAll(A0k.subList(0, A0k.size() - 1));
            }
            A0u.add(new C71803l4(this, i2));
        }
        r4.A09(A0u);
    }

    public final void A06(C73553oL r5) {
        AnonymousClass4VT r2;
        C88194a6 r0 = (C88194a6) this.A06.A00.A01();
        if (r0 == null || (r2 = r0.A03) == null) {
            this.A02.A09(AnonymousClass3Bv.newArrayList((Object[]) new C86344Sg[]{new C71763l0()}));
            this.A05.A01(r5, (AnonymousClass4VT) null);
            if (!this.A01) {
                return;
            }
        } else {
            String str = r2.A00;
            if (str == null) {
                return;
            }
            if (this.A01) {
                this.A05.A01(r5, new AnonymousClass4VT(this.A00));
            } else if (!str.equals(this.A00)) {
                this.A05.A01(r5, r2);
                this.A00 = str;
                return;
            } else {
                return;
            }
        }
        this.A01 = false;
    }

    public /* bridge */ /* synthetic */ void AWZ(C71823l6 r6) {
        this.A01 = true;
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass026 r3 = this.A02;
        List A0k = C13690nt.A0k(r3);
        if (A0k != null) {
            A0u.addAll(A0k.subList(0, C13700nu.A00(A0k, 1)));
        }
        A0u.add(new C86344Sg(10));
        r3.A09(A0u);
        A06(this.A04);
    }
}
