package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

/* renamed from: X.26A  reason: invalid class name */
public class AnonymousClass26A extends AnonymousClass028 {
    public int A00 = 0;
    public AnonymousClass26B A01;
    public final Handler A02 = new Handler();
    public final C25511Kb A03;
    public final C25641Ko A04;
    public final C18170wG A05;
    public final C29131a5 A06;
    public final C16260sj A07;
    public final C16320sq A08;
    public final Runnable A09 = new RunnableRunnableShape4S0100000_I0_3(this, 31);

    public AnonymousClass26A(C25511Kb r3, C25641Ko r4, C18170wG r5, C29131a5 r6, C16260sj r7, C16320sq r8) {
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        r8.Acl(new RunnableRunnableShape4S0100000_I0_3(this, 32));
    }

    public final C31301dt A0C() {
        switch (this.A00) {
            case 0:
                return new C71943lJ(new ViewOnClickCListenerShape0S0100000_I0(this, 25));
            case 1:
                return new C71913lG();
            case 2:
                AnonymousClass26B r2 = this.A01;
                if (r2 != null) {
                    return new C72063lV(r2, new ViewOnClickCListenerShape0S0100000_I0(this, 27));
                }
                break;
            case 4:
                break;
            case 7:
                String str = this.A01.A07;
                AnonymousClass00B.A06(str);
                return new C71973lM(new ViewOnClickCListenerShape0S0100000_I0(this, 26), str);
            default:
                return new C71903lF();
        }
        AnonymousClass26B r0 = this.A01;
        return new C72043lT(new ViewOnClickCListenerShape0S0100000_I0(this, 28), r0 == null ? null : r0.A07);
    }

    public final void A0D(AnonymousClass26B r7) {
        boolean A022;
        int i2;
        if (r7.A08.equals("country_default")) {
            A022 = this.A05.A02((LatLng) null);
            i2 = 7;
        } else {
            C18170wG r5 = this.A05;
            Double d2 = r7.A03;
            AnonymousClass00B.A06(d2);
            double doubleValue = d2.doubleValue();
            Double d3 = r7.A04;
            AnonymousClass00B.A06(d3);
            A022 = r5.A02(new LatLng(doubleValue, d3.doubleValue()));
            i2 = 2;
        }
        if (!A022) {
            i2 = 4;
        }
        this.A00 = i2;
        this.A01 = r7;
    }
}
