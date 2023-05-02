package X;

import com.facebook.redex.IDxNFunctionShape137S0100000_2_I1;
import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.3AZ  reason: invalid class name */
public final class AnonymousClass3AZ {
    public static final ArrayList A0H = C13680ns.A0n(Arrays.asList(new String[]{"0", "1"}));
    public static final ArrayList A0I = C13680ns.A0n(Arrays.asList(new String[]{"ACTIVE", "ARCHIVED", "INACTIVE"}));
    public final C28371Vv A00;
    public final AnonymousClass4Tb A01;
    public final C86774Uc A02;
    public final C86904Up A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
    public final Long A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public AnonymousClass3AZ(C16300so r30, C28371Vv r31, C53392fd r32) {
        C28371Vv r5 = r31;
        C28371Vv.A06(r5, "iq");
        C28371Vv r8 = r32.A00;
        Class<String> cls = String.class;
        Object A012 = C32271fx.A01((C16300so) null, r8, cls, -9007199254740991L, 9007199254740991L, (Object) null, C13690nt.A1b("account", "action", 2), false);
        this.A0A = (String) C32271fx.A01((C16300so) null, r5, cls, -9007199254740991L, 9007199254740991L, A012, new String[]{"account", "action"}, true);
        Class<Long> cls2 = Long.class;
        C28371Vv r18 = r5;
        this.A06 = (Long) C32271fx.A01((C16300so) null, r18, cls2, 1L, 9007199254740991, (Object) null, new String[]{"account", "offer", "id"}, false);
        String[] A1b = C13690nt.A1b("account", "offer", 3);
        A1b[2] = "title";
        C28371Vv r22 = r5;
        Class<String> cls3 = cls;
        this.A0G = (String) C32271fx.A01((C16300so) null, r22, cls3, 1, 9007199254740991, (Object) null, A1b, false);
        String[] A1b2 = C13690nt.A1b("account", "offer", 3);
        A1b2[2] = FacebookFacade.RequestParameter.DESCRIPTION;
        this.A0B = (String) C32271fx.A01((C16300so) null, r22, cls3, 1, 9007199254740991, (Object) null, A1b2, false);
        String[] A1b3 = C13690nt.A1b("account", "offer", 3);
        A1b3[2] = "fine_print_url";
        this.A0D = (String) C32271fx.A01((C16300so) null, r22, cls3, 1, 9007199254740991, (Object) null, A1b3, false);
        String[] A1b4 = C13690nt.A1b("account", "offer", 3);
        A1b4[2] = "terms_url";
        this.A0F = (String) C32271fx.A01((C16300so) null, r22, cls3, 1, 9007199254740991, (Object) null, A1b4, false);
        String[] A1b5 = C13690nt.A1b("account", "offer", 3);
        A1b5[2] = "redeem_limit";
        this.A07 = (Long) C32271fx.A01((C16300so) null, r18, cls2, 1L, 9007199254740991, (Object) null, A1b5, false);
        String[] A1b6 = C13690nt.A1b("account", "offer", 3);
        A1b6[2] = "start_ts";
        this.A08 = (Long) C32271fx.A01((C16300so) null, r18, cls2, 1L, 9007199254740991, (Object) null, A1b6, false);
        String[] A1b7 = C13690nt.A1b("account", "offer", 3);
        A1b7[2] = "end_ts";
        this.A05 = (Long) C32271fx.A01((C16300so) null, r18, cls2, 1L, 9007199254740991, (Object) null, A1b7, false);
        String[] A1b8 = C13690nt.A1b("account", "offer", 3);
        A1b8[2] = "version";
        this.A09 = (Long) C32271fx.A01((C16300so) null, r18, cls2, 1L, 9007199254740991, (Object) null, A1b8, false);
        String[] A1b9 = C13690nt.A1b("account", "offer", 5);
        A1b9[2] = "eligibility";
        A1b9[3] = "receiver";
        A1b9[4] = "max_from_sender";
        this.A04 = (Long) C32271fx.A00((C16300so) null, r18, cls2, 0L, 9007199254740991, (Object) null, A1b9, false);
        ArrayList arrayList = A0I;
        String[] A1b10 = C13690nt.A1b("account", "offer", 3);
        A1b10[2] = "state";
        this.A0E = C32271fx.A06(r5, arrayList, A1b10);
        ArrayList arrayList2 = A0H;
        String[] A1b11 = C13690nt.A1b("account", "offer", 5);
        A1b11[2] = "eligibility";
        A1b11[3] = "receiver";
        A1b11[4] = "usync_pay_eligible_offers_includes_current_offer_id";
        this.A0C = C32271fx.A05(r5, arrayList2, A1b11);
        C16300so r10 = r30;
        IDxNFunctionShape137S0100000_2_I1 iDxNFunctionShape137S0100000_2_I1 = new IDxNFunctionShape137S0100000_2_I1(r10, 0);
        String[] A1b12 = C13690nt.A1b("account", "offer", 3);
        A1b12[2] = "offer_amount";
        this.A03 = (C86904Up) C32271fx.A03(r5, iDxNFunctionShape137S0100000_2_I1, A1b12);
        this.A02 = (C86774Uc) C32271fx.A03(r5, new IDxNFunctionShape43S0200000_2_I1(r10, r8, 0), new String[0]);
        String[] A1b13 = C13690nt.A1b("account", "offer", 5);
        A1b13[2] = "eligibility";
        A1b13[3] = "payment";
        A1b13[4] = "min_amount";
        this.A01 = (AnonymousClass4Tb) C32271fx.A02(r5, new IDxNFunctionShape137S0100000_2_I1(r10, 1), A1b13);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3AZ.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3AZ r5 = (AnonymousClass3AZ) obj;
            if (!this.A0E.equals(r5.A0E) || !C34901l3.A00(this.A0C, r5.A0C) || !this.A0A.equals(r5.A0A) || !this.A06.equals(r5.A06) || !this.A0G.equals(r5.A0G) || !this.A0B.equals(r5.A0B) || !this.A0D.equals(r5.A0D) || !this.A0F.equals(r5.A0F) || !this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A05.equals(r5.A05) || !this.A09.equals(r5.A09) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A01, r5.A01) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0E;
        objArr[1] = this.A0C;
        objArr[2] = this.A0A;
        objArr[3] = this.A06;
        objArr[4] = this.A0G;
        objArr[5] = this.A0B;
        objArr[6] = this.A0D;
        objArr[7] = this.A0F;
        objArr[8] = this.A07;
        objArr[9] = this.A08;
        objArr[10] = this.A05;
        objArr[11] = this.A09;
        objArr[12] = this.A04;
        objArr[13] = this.A01;
        objArr[14] = this.A03;
        return AnonymousClass000.A0F(this.A02, objArr, 15);
    }
}
