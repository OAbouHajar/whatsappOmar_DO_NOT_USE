package X;

import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1;

/* renamed from: X.3Fh  reason: invalid class name and case insensitive filesystem */
public class C62883Fh implements C16710tV {
    public final /* synthetic */ AnonymousClass2Z2 A00;

    public C62883Fh(AnonymousClass2Z2 r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        AnonymousClass3FG r0 = this.A00.A0A;
        if (r0 != null) {
            r0.A02.A09(new AnonymousClass4WI("unknown", 3));
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        AnonymousClass4WH r10 = (AnonymousClass4WH) obj;
        AnonymousClass3FG r3 = this.A00.A0A;
        if (r3 != null) {
            C18450wi.A0H(r10, 0);
            AnonymousClass4WI r2 = new AnonymousClass4WI(r10.A01, 2);
            List list = r10.A02;
            if (!list.isEmpty()) {
                AnonymousClass22K r4 = new AnonymousClass22K(new IDxLambdaShape58S0000000_2_I1(1), new C441122u(list), true);
                r3.A01.addAll(AnonymousClass1JA.A0Q(C11490ir.A02(r4)));
                List A02 = C11490ir.A02(new AnonymousClass22w(new IDxLambdaShape58S0000000_2_I1(2), r4));
                C18450wi.A0H(A02, 0);
                r2.A00 = A02;
                if (r3.A03.A05()) {
                    String str = r10.A00;
                    if (!TextUtils.isEmpty(str) && (!list.isEmpty())) {
                        C85894Qk r0 = r3.A04;
                        C18450wi.A0F(str);
                        r0.A00(str);
                    }
                }
            }
            List list2 = r10.A03;
            if (!list2.isEmpty()) {
                r2.A01 = list2;
            }
            r3.A02.A09(r2);
        }
    }
}
