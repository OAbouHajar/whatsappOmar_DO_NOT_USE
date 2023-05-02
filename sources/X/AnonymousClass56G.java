package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.56G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56G implements Runnable {
    public final /* synthetic */ AnonymousClass2Rv A00;
    public final /* synthetic */ C84404Kk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ AnonymousClass56G(AnonymousClass2Rv r1, C84404Kk r2, String str, String str2, String str3, List list) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = list;
        this.A00 = r1;
    }

    public final void run() {
        String str;
        String str2;
        List<AnonymousClass4FY> list;
        C84404Kk r4 = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        String str5 = this.A04;
        List<AnonymousClass4WM> list2 = this.A05;
        AnonymousClass2Rv r1 = this.A00;
        AnonymousClass4EN r0 = r4.A01;
        C85964Qr r8 = new C85964Qr(r1, r4);
        C17190ug r14 = r0.A00;
        String A022 = r14.A02();
        C18450wi.A0B(A022);
        AnonymousClass4FX r42 = str5 == null ? null : new AnonymousClass4FX(str5);
        if (list2.isEmpty()) {
            list = C440222l.A00;
        } else {
            ArrayList A0u = AnonymousClass000.A0u();
            for (AnonymousClass4WM r02 : list2) {
                String str6 = r02.A03;
                if (!(str6 == null || (str = r02.A02) == null || (str2 = r02.A01) == null)) {
                    A0u.add(new AnonymousClass4FY(str, str2, str6));
                }
            }
            list = A0u;
        }
        C51812cK r3 = new C51812cK(A022);
        C32461gQ A0S = AnonymousClass3K4.A0S("iq");
        A0S.A02(C35081lL.A00());
        A0S.A05(r3.A00, AnonymousClass000.A0u());
        C28371Vv A012 = A0S.A01();
        C32461gQ A0S2 = AnonymousClass3K4.A0S("iq");
        C32461gQ.A00(A0S2, "xmlns", "fb:thrift_iq");
        A0S2.A02(new C35081lL("smax_id", 105));
        if (r42 != null) {
            A0S2.A03(r42.A00);
        }
        if (C32271fx.A0E(list, 0, 10)) {
            for (AnonymousClass4FY r03 : list) {
                A0S2.A03(r03.A00);
            }
        }
        C32461gQ A0S3 = AnonymousClass3K4.A0S(FacebookFacade.RequestParameter.DESCRIPTION);
        if (C32271fx.A0D(str3, 1, 10000, false)) {
            A0S3.A08(str3);
        }
        AnonymousClass3K4.A0s(A0S3, A0S2);
        C32461gQ A0S4 = AnonymousClass3K4.A0S("debug_information_json");
        if (C32271fx.A0D(str4, 1, 10000, false)) {
            A0S4.A08(str4);
        }
        AnonymousClass3K4.A0s(A0S4, A0S2);
        A0S2.A05(A012, AnonymousClass000.A0u());
        List list3 = Collections.EMPTY_LIST;
        A0S2.A07(A012, list3, AnonymousClass000.A0u());
        ArrayList A0n = C13680ns.A0n(Arrays.asList(new String[0]));
        A0n.addAll(0, list3);
        r3.A00(A0S2, A0n);
        r14.A0G(new AnonymousClass51B(r8), A0S2.A01(), A022, 350, 32000);
    }
}
