package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.redex.IDxRCallbackShape447S0100000_3_I1;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5np  reason: invalid class name and case insensitive filesystem */
public class C114475np extends C16690tT {
    public final Activity A00;
    public final AnonymousClass1Vt A01;
    public final AnonymousClass5Q3 A02;
    public final /* synthetic */ C1200260a A03;

    public C114475np(Activity activity, AnonymousClass1Vt r2, C1200260a r3, AnonymousClass5Q3 r4) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = activity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A032 = C30671cl.A03(C30681cm.A0E, C110105dW.A0i(this.A03.A0A));
        if (A032.size() > 0) {
            return C13690nt.A0Z(A032);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C116495rT r2;
        AnonymousClass5Q3 r1;
        C30671cl r9 = (C30671cl) obj;
        if (r9 == null && (r1 = this.A02) != null) {
            r1.AVy(C110115dX.A0N());
        }
        C1200260a r12 = this.A03;
        Context context = r12.A01.A00;
        C14710pd r7 = r12.A04;
        C14870pt r6 = r12.A00;
        C17190ug r5 = r12.A05;
        C18280wR r4 = r12.A0C;
        Context context2 = context;
        C14870pt r13 = r6;
        C14710pd r14 = r7;
        C112345iL r11 = new C112345iL(context2, r13, r14, r5, r12.A07, r12.A08, r12.A09, r4);
        IDxRCallbackShape447S0100000_3_I1 iDxRCallbackShape447S0100000_3_I1 = new IDxRCallbackShape447S0100000_3_I1(this, 0);
        AnonymousClass1Vt r3 = this.A01;
        C111855hW A0K = C110115dX.A0K(r3);
        C39901tF r0 = r9.A08;
        AnonymousClass00B.A06(r0);
        C111805hR r02 = (C111805hR) r0;
        String str = r3.A0K;
        C28401Vy r32 = r3.A08;
        if (r32 == null) {
            r32 = null;
        }
        String str2 = A0K.A0L;
        String str3 = A0K.A0M;
        String str4 = A0K.A0J;
        C35301lh r22 = r02.A06;
        Log.i("PAY: rejectCollect called");
        C17190ug r24 = r11.A03;
        String A022 = r24.A02();
        String A012 = r11.A05.A01();
        String str5 = (String) C110105dW.A0d(r22);
        if (r32 != null) {
            C35431lv A002 = r11.A01.A00(C35481m0.A05, r32);
            r2 = new C116495rT(new C118025tw(String.valueOf(A002.A00()), String.valueOf(A002.A00), ((C35491m1) A002.A01).A04));
        } else {
            r2 = null;
        }
        C51812cK r72 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-reject-collect");
        if (C110105dW.A1W(str, 1, false)) {
            C32461gQ.A00(A0Y, "id", str);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C32271fx.A0D(str2, 1, 100, false)) {
            C32461gQ.A00(A0Y, "sender-vpa", str2);
        }
        if (str3 != null && C32271fx.A0D(str3, 1, 100, true)) {
            C32461gQ.A00(A0Y, "sender-vpa-id", str3);
        }
        if (str5 != null && C110115dX.A1D(str5, true)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str5);
        }
        if (C32271fx.A0D(str4, 1, 100, false)) {
            C32461gQ.A00(A0Y, "receiver-vpa", str4);
        }
        if (r2 != null) {
            A0Y.A03(r2.A00);
        }
        C28371Vv A0T = C110105dW.A0T(A0Y, A0X, r72);
        r24.A0G(new IDxNCallbackShape21S0200000_3_I1(r11.A00, r11.A01, (AnonymousClass5Q3) iDxRCallbackShape447S0100000_3_I1, r11.A04, C116635rh.A02(r11, "upi-reject-collect"), r11), A0T, A022, 204, 0);
    }
}
