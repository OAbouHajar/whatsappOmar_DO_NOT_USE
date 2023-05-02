package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1FW  reason: invalid class name */
public class AnonymousClass1FW implements C19400yN {
    public final C16040sK A00;
    public final AnonymousClass1DP A01;
    public final AnonymousClass1CY A02;
    public final AnonymousClass11U A03;
    public final C18930xU A04;
    public final C19360yJ A05;
    public final AnonymousClass1D1 A06;
    public final AnonymousClass013 A07;

    public AnonymousClass1FW(C16040sK r1, AnonymousClass1DP r2, AnonymousClass1CY r3, AnonymousClass11U r4, C18930xU r5, C19360yJ r6, AnonymousClass1D1 r7, AnonymousClass013 r8) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String AGT() {
        return "CompanionInitAsync";
    }

    public void AMc() {
        Object A022;
        AnonymousClass1DP r1 = this.A01;
        if (r1.A01.A0A() && !r1.A03.A01.A1d()) {
            Log.i("MDOptInInitializer/Force_If_Required");
            r1.A00();
        }
        if (this.A00.A0G()) {
            this.A03.A01();
        }
        AnonymousClass1CY r12 = this.A02;
        if (r12.A0B.A00() != null) {
            r12.A02.A02();
        }
        C18930xU r6 = this.A04;
        r6.A0M();
        if (r6.A0X()) {
            this.A05.A01();
        }
        r6.A0L();
        AnonymousClass013 r0 = this.A07;
        AnonymousClass1D1 r5 = this.A06;
        r0.A0B.add(r5);
        Locale locale = Locale.getDefault();
        if (!r6.A07.A0G() && (A022 = r6.A0T.A02("setting_locale")) != null) {
            r6.A0n.Acl(new RunnableRunnableShape0S0300000_I0(r6, A022, locale, 29));
        }
        r5.A00();
    }
}
