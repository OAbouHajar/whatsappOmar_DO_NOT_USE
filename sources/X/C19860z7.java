package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public class C19860z7 {
    public int A00;
    public C005702l A01;
    public C16300so A02;
    public C17210ui A03;
    public C19850z6 A04;
    public C101584xY A05;
    public C16000sG A06;
    public C16440t3 A07;
    public C19820z3 A08;
    public String A09;

    public C19860z7(C16300so r1, C17210ui r2, C19850z6 r3, C16000sG r4, C16440t3 r5, C19820z3 r6) {
        this.A07 = r5;
        this.A02 = r1;
        this.A06 = r4;
        this.A04 = r3;
        this.A08 = r6;
        this.A03 = r2;
    }

    public void A00() {
        A01();
        C101584xY r0 = this.A05;
        if (r0 != null) {
            r0.A02.A06(true);
            this.A05.A00 = null;
        }
    }

    public final void A01() {
        C005702l r0 = this.A01;
        if (r0 != null && !C19980zJ.A00(r0.getContext()).isFinishing()) {
            this.A01.cancel();
        }
    }

    public void A02(View view, AnonymousClass5P4 r11, AnonymousClass5T6 r12, String str) {
        View view2 = view;
        AnonymousClass5P4 r6 = r11;
        AnonymousClass5T6 r7 = r12;
        String str2 = str;
        try {
            C16000sG r1 = this.A06;
            C15830rv A012 = C15830rv.A01(str);
            AnonymousClass00B.A06(A012);
            C16010sH A082 = r1.A08(A012);
            if (A082 == null || !A082.A0d) {
                A01();
                View inflate = C19980zJ.A00(view.getContext()).getLayoutInflater().inflate(R.layout.layout00b0, (ViewGroup) null);
                C32241fu r2 = new C32241fu(view.getContext());
                r2.A03(new IDxCListenerShape161S0100000_2_I0(this, 4));
                r2.setView(inflate);
                C005702l create = r2.create();
                this.A01 = create;
                create.show();
                C19850z6 r13 = this.A04;
                UserJid nullable = UserJid.getNullable(str);
                AnonymousClass00B.A06(nullable);
                C101584xY A77 = r13.A77(new AnonymousClass4N6(view2, this, r6, r7, str2), nullable);
                this.A05 = A77;
                if (!A77.A01.A0A()) {
                    A77.A00(AnonymousClass284.A04);
                }
                A77.A03.Ack(A77.A02, new Void[0]);
                return;
            }
            A04(view, r12, str);
        } catch (AnonymousClass1W4 unused) {
            AnonymousClass284 r0 = AnonymousClass284.A02;
            A03(view, r12, r0, str);
            if (r11 != null) {
                r11.ANo(r0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View r6, X.AnonymousClass5T6 r7, X.AnonymousClass284 r8, java.lang.String r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0009
            int r0 = r8.A00
            r4 = 2131886532(0x7f1201c4, float:1.9407646E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r4 = 2131886519(0x7f1201b7, float:1.940762E38)
        L_0x000c:
            r5.A01()
            android.content.Context r0 = r6.getContext()
            android.app.Activity r3 = X.C19980zJ.A00(r0)
            android.content.Context r0 = r6.getContext()
            X.1fu r2 = new X.1fu
            r2.<init>(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r1 = r3.getString(r0)
            X.00n r3 = (X.C001200n) r3
            X.4mA r0 = new X.4mA
            r0.<init>(r6, r5, r7, r9)
            r2.A0H(r3, r0, r1)
            r0 = 2131886616(0x7f120218, float:1.9407816E38)
            r2.A02(r0)
            r2.A01(r4)
            X.02l r0 = r2.create()
            r5.A01 = r0
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19860z7.A03(android.view.View, X.5T6, X.284, java.lang.String):void");
    }

    public final void A04(View view, AnonymousClass5T6 r17, String str) {
        int i2;
        double d2;
        Double d3;
        String str2;
        int i3;
        C17210ui r0 = this.A03;
        String str3 = null;
        if (r0.A01 == null) {
            this.A02.AcB("directorySessionIdIsNull", (String) null, false);
        }
        if (r17 != null) {
            i2 = r17.AbK();
            d2 = r17.Aaw();
            d3 = r17.Aaj();
            str2 = r17.Ad9();
            str3 = r17.AbL();
            i3 = r17.A8X();
        } else {
            i2 = 0;
            d2 = 0.0d;
            d3 = null;
            str2 = null;
            i3 = 0;
        }
        C35661mI r4 = new C35661mI(d3, 0, str2, str3, this.A09, r0.A01, d2, i2, i3);
        C15830rv A022 = C15830rv.A02(str);
        AnonymousClass00B.A06(A022);
        C16010sH r2 = new C16010sH(A022);
        Activity A002 = C19980zJ.A00(view.getContext());
        A002.startActivity(new C14750ph().A0u(A002, r2).putExtra("user_actions_on_business_profile_common_fields", r4));
        UserJid nullable = UserJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        this.A08.A00(new C41261vV(new C41271vW(nullable, "directory", "whatsapp", System.currentTimeMillis(), System.currentTimeMillis())));
        Integer valueOf = Integer.valueOf(this.A00);
        C29151a7 r22 = new C29151a7();
        r22.A0B = 51;
        r22.A06 = valueOf;
        r0.A06(r22);
    }
}
