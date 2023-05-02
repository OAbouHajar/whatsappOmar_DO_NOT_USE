package X;

import com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.56Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56Y implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass2VT A02;
    public final /* synthetic */ C15830rv A03;
    public final /* synthetic */ C16050sL A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ AnonymousClass56Y(AnonymousClass2VT r1, C15830rv r2, C16050sL r3, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = r1;
        this.A04 = r3;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A00 = i2;
        this.A0A = z7;
        this.A01 = i3;
        this.A03 = r2;
    }

    public final void run() {
        C16050sL r2;
        AnonymousClass2VT r8 = this.A02;
        C16050sL r10 = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        boolean z5 = this.A08;
        boolean z6 = this.A09;
        int i2 = this.A00;
        boolean z7 = this.A0A;
        int i3 = this.A01;
        C15830rv r9 = this.A03;
        C16010sH r16 = null;
        if (r10 != null) {
            r2 = r8.A06.A02(r10);
            if (r2 != null) {
                r16 = r8.A07.A0A(r2);
            }
        } else {
            r2 = null;
        }
        int A012 = z2 ? r8.A0F.A01(r10) : 0;
        AnonymousClass027 r1 = r8.A02;
        C16010sH r15 = r8.A00;
        boolean z8 = r15.A0a;
        CountryGatingViewModel countryGatingViewModel = r8.A0C;
        UserJid of = UserJid.of(r8.A01);
        C16050sL r17 = r2;
        r1.A09(new AnonymousClass2Qb(r15, r16, r17, r8.A0A.A00(r9), i2, i3, A012, z3, z8, countryGatingViewModel.A05(of), r8.A0R.A05(of), z4, r8.A07(), z5, z6, z7));
    }
}
