package X;

import android.app.Activity;
import com.facebook.redex.IDxNConsumerShape18S0300000_2_I1;
import java.util.Map;

/* renamed from: X.31Z  reason: invalid class name */
public final class AnonymousClass31Z extends C101544xU {
    public final C42821yj A00;
    public final C25761La A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass31Z(AnonymousClass2SQ r4, C42821yj r5, C25761La r6) {
        super(r4.A00((C14550pN) r5.A22));
        C18450wi.A0I(r4, 1, r6);
        this.A00 = r5;
        this.A01 = r6;
    }

    public boolean A8o(Map map, int i2) {
        Map map2 = map;
        C18450wi.A0H(map2, 1);
        int i3 = i2;
        if (i2 == 0) {
            AnonymousClass1LG r3 = this.A01.A02;
            C16740tZ r2 = (C16740tZ) C810246n.A00(map2);
            C42821yj r1 = this.A00;
            C18450wi.A0H(r2, 0);
            if (r1.A2A.A07()) {
                r3.A02((Activity) r1.A22, r2);
                return true;
            }
            r1.A2C.A0J(r2);
            return true;
        } else if (i3 == 8) {
            AnonymousClass1LE r12 = this.A01.A00;
            C16740tZ r14 = (C16740tZ) C810246n.A00(map2);
            Activity activity = (Activity) this.A00.A22;
            C18450wi.A0H(r14, 0);
            if (!(r14 instanceof C30581cc)) {
                return false;
            }
            C16440t3 r6 = r12.A03;
            C14710pd r122 = r12.A09;
            C23061Ai r15 = r12.A0C;
            C17250um r10 = r12.A07;
            C16760tb r4 = r12.A01;
            C206711d r9 = r12.A06;
            AnonymousClass01V r5 = r12.A02;
            AnonymousClass013 r8 = r12.A05;
            AnonymousClass1BQ r11 = r12.A08;
            new C59172uy(activity, r12.A00, r4, r5, r6, r12.A04, r8, r9, r10, r11, r122, r12.A0B, (C30581cc) r14, r15).show();
            return true;
        } else if (i3 == 11) {
            return this.A01.A01.A02((Activity) this.A00.A22, (C16740tZ) C810246n.A00(map2));
        } else if (i3 != 14) {
            return super.A8o(map2, i3);
        } else {
            AnonymousClass1LI r13 = this.A01.A03;
            C16740tZ r52 = (C16740tZ) C810246n.A00(map2);
            C42821yj r42 = this.A00;
            C18450wi.A0H(r52, 0);
            C15830rv r32 = r52.A11.A00;
            if (r32 == null) {
                return false;
            }
            r13.A00.A04().A00(new IDxNConsumerShape18S0300000_2_I1(r42, r32, r52, 0));
            return true;
        }
    }
}
