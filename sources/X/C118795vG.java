package X;

import android.content.Context;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0;
import java.util.Calendar;

/* renamed from: X.5vG  reason: invalid class name and case insensitive filesystem */
public class C118795vG {
    public String A00 = "PENDING";
    public final C14870pt A01;
    public final C18260wP A02;
    public final C16980tz A03;
    public final C18340wX A04;
    public final C18310wU A05;
    public final C117045sM A06;
    public final AnonymousClass1Vo A07 = C110105dW.A0Q("PaymentsComplianceManager", "infra");

    public C118795vG(C14870pt r3, C18260wP r4, C16980tz r5, C18340wX r6, C18310wU r7, C117045sM r8) {
        this.A03 = r5;
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
    }

    public void A00(AnonymousClass695 r19, String str, int i2, int i3, int i4) {
        C28371Vv r1;
        AnonymousClass695 r3 = r19;
        if (this.A00.equals("UNSUPPORTED")) {
            r3.APy(true);
            return;
        }
        C117555tB r11 = new C117555tB(this.A03.A00, this.A01, this.A02, this.A04, this.A05, this.A06);
        C116695rn r12 = new C116695rn(r3, this);
        C35081lL[] r32 = new C35081lL[2];
        C110115dX.A14("action", "check-account-eligibility", r32);
        r32[1] = new C35081lL("action-type", str);
        C117045sM r7 = r11.A05;
        C116095qo r13 = r7.A00;
        int i5 = i3;
        if (i3 < 0 || i5 > 11) {
            throw AnonymousClass000.A0T(C13680ns.A0c(i5, "Months are 0 indexed, invalid month: "));
        }
        Calendar instance = Calendar.getInstance();
        int i6 = i2;
        int i7 = i4;
        instance.set(i6, i5, i7);
        instance.setLenient(false);
        try {
            instance.getTime();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(r13.A00.A00());
            int i8 = instance2.get(1) - instance.get(1);
            int i9 = instance.get(2);
            int i10 = instance2.get(2);
            if (i9 > i10 || (i9 == i10 && instance.get(5) > instance2.get(5))) {
                i8--;
            }
            int i11 = 13;
            if (r7.A02.A04()) {
                i11 = 16;
            }
            String str2 = i8 < i11 ? "2" : i8 < 18 ? "1" : "0";
            if (str2.equals("0")) {
                C35081lL[] r72 = new C35081lL[4];
                C35081lL.A02("state", "0", r72, 0);
                r72[1] = new C35081lL("day", i7);
                r72[2] = new C35081lL("month", i3 + 1);
                r72[3] = new C35081lL("year", i6);
                r1 = new C28371Vv("dob", r72);
            } else {
                C35081lL[] r0 = new C35081lL[1];
                C35081lL.A02("state", str2, r0, 0);
                r1 = new C28371Vv("dob", r0);
            }
            r11.A04.A0H(new IDxRCallbackShape19S0200000_3_I0(r11.A00, r11.A03, r11.A01, r11, r12, 5), new C28371Vv(r1, "account", r32), "get", 0);
        } catch (Exception unused) {
            StringBuilder A0r = AnonymousClass000.A0r("Date format invalid. Year: ");
            A0r.append(i6);
            A0r.append(" Month: ");
            A0r.append(i5);
            A0r.append(" Day: ");
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(A0r, i7));
        }
    }

    public void A01(AnonymousClass696 r16, String str, String str2) {
        AnonymousClass696 r1 = r16;
        if (this.A00.equals("UNSUPPORTED")) {
            r1.ATr(true);
            return;
        }
        Context context = this.A03.A00;
        C14870pt r8 = this.A01;
        C117045sM r12 = this.A06;
        C117555tB r6 = new C117555tB(context, r8, this.A02, this.A04, this.A05, r12);
        C116685rm r7 = new C116685rm(r1, this);
        String str3 = str;
        AnonymousClass00B.A05(str3);
        C35081lL[] r4 = new C35081lL[2];
        boolean A032 = C35081lL.A03("action", "check-account-eligibility", r4);
        r4[1] = new C35081lL("action-type", str2);
        C35081lL[] r2 = new C35081lL[1];
        C35081lL.A02("full", str3, r2, A032 ? 1 : 0);
        C28371Vv r11 = new C28371Vv(new C28371Vv(FacebookFacade.RequestParameter.NAME, r2), "account", r4);
        r6.A04.A0H(new IDxRCallbackShape19S0200000_3_I0(r6.A00, r6.A03, r6.A01, r6, r7, 4), r11, "get", 0);
    }
}
