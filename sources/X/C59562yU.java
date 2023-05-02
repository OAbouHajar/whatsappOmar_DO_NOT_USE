package X;

import android.text.TextUtils;
import com.facebook.redex.IDxPCallbackShape291S0100000_2_I1;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2yU  reason: invalid class name and case insensitive filesystem */
public abstract class C59562yU extends AnonymousClass26X {
    public final UserJid A00;

    public C59562yU(C17150uc r1, UserJid userJid) {
        super(r1);
        this.A00 = userJid;
    }

    public void A02() {
        C17150uc r3 = this.A01;
        UserJid userJid = this.A00;
        AnonymousClass16N r1 = r3.A07;
        if (r1.A01(userJid) == null || r1.A06(userJid)) {
            r3.A03(new IDxPCallbackShape291S0100000_2_I1(this, 1), userJid);
        } else {
            A03();
        }
    }

    public void A03() {
        C31081dR r1;
        C31081dR r12;
        if (this instanceof C59522yQ) {
            C59522yQ r6 = (C59522yQ) this;
            String A02 = r6.A06.A02();
            r6.A07.A02("view_product_tag");
            C18720x9 r4 = r6.A05;
            AnonymousClass26S r9 = r6.A04;
            C17150uc r0 = r6.A01;
            UserJid userJid = r9.A00;
            String A01 = r0.A07.A01(userJid);
            String str = r9.A03;
            AnonymousClass00B.A0C("catalog productId cannot be null or empty", !TextUtils.isEmpty(str));
            ArrayList A0u = AnonymousClass000.A0u();
            AnonymousClass26X.A00("product_id", str, A0u);
            Integer num = r9.A02;
            if (num != null) {
                AnonymousClass26X.A00("width", num.toString(), A0u);
            }
            Integer num2 = r9.A01;
            if (num2 != null) {
                AnonymousClass26X.A00("height", num2.toString(), A0u);
            }
            AnonymousClass26X.A00("catalog_session_id", r9.A04, A0u);
            if (r9.A05) {
                AnonymousClass26X.A00("fetch_compliance_info", "true", A0u);
            }
            if (!TextUtils.isEmpty(A01)) {
                AnonymousClass26X.A00("direct_connection_encrypted_info", A01, A0u);
            }
            C28371Vv r7 = new C28371Vv("product", new C35081lL[]{new C35081lL((Jid) userJid, "jid")}, (C28371Vv[]) A0u.toArray(new C28371Vv[0]));
            C35081lL[] r3 = new C35081lL[4];
            C35081lL.A02("id", A02, r3, 0);
            C35081lL.A02("xmlns", "w:biz:catalog", r3, 1);
            C35081lL.A02("type", "get", r3, 2);
            r4.A02(r6, C28371Vv.A03(C34791ks.A00, r7, r3, 3), A02, 196);
        } else if (this instanceof C59552yT) {
            C59552yT r42 = (C59552yT) this;
            String A022 = r42.A05.A02();
            AnonymousClass4O7 r2 = r42.A01;
            String str2 = r2.A05;
            if (str2 == null && (r12 = (C31081dR) r42.A06.A02.get("catalog_collections_view_tag")) != null) {
                r12.A08("datasource_collections");
            }
            C18750xC r02 = r42.A07;
            UserJid userJid2 = r2.A04;
            r02.A00(userJid2, A022, 271);
            C18720x9 r62 = r42.A04;
            ArrayList A0u2 = AnonymousClass000.A0u();
            AnonymousClass26X.A00("width", Integer.toString(r2.A02), A0u2);
            AnonymousClass26X.A00("height", Integer.toString(r2.A01), A0u2);
            if (str2 != null) {
                AnonymousClass26X.A00("after", str2, A0u2);
            }
            String str3 = r2.A06;
            if (str3 != null) {
                AnonymousClass26X.A00("catalog_session_id", str3, A0u2);
            }
            AnonymousClass26X.A00("collection_limit", Integer.toString(r2.A00), A0u2);
            AnonymousClass26X.A00("item_limit", Integer.toString(3), A0u2);
            String A012 = r42.A01.A07.A01(userJid2);
            if (A012 != null) {
                AnonymousClass26X.A00("direct_connection_encrypted_info", A012, A0u2);
            }
            C28371Vv r8 = new C28371Vv("collections", new C35081lL[]{new C35081lL((Jid) userJid2, "biz_jid")}, (C28371Vv[]) A0u2.toArray(new C28371Vv[0]));
            C35081lL[] r5 = new C35081lL[5];
            r5[0] = new C35081lL((Jid) r2.A03, "to");
            C35081lL.A02("id", A022, r5, 1);
            C35081lL.A02("smax_id", "35", r5, 2);
            C35081lL.A02("xmlns", "w:biz:catalog", r5, 3);
            C35081lL.A02("type", "get", r5, 4);
            r62.A02(r42, C28371Vv.A04(r8, r5), A022, 271);
        } else if (this instanceof C59512yP) {
            C59512yP r63 = (C59512yP) this;
            r63.A02.A01(new C49822Vz(0));
            String A023 = r63.A05.A02();
            C17150uc r03 = r63.A01;
            UserJid userJid3 = r63.A00;
            String A013 = r03.A07.A01(userJid3);
            r63.A06.A02("plm_details_view_tag");
            C18720x9 r32 = r63.A04;
            List list = r63.A09;
            String str4 = r63.A08;
            String str5 = r63.A07;
            ArrayList A0u3 = AnonymousClass000.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0u3.add(new C28371Vv(new C28371Vv("id", AnonymousClass000.A0m(it), (C35081lL[]) null), "product", (C35081lL[]) null));
            }
            AnonymousClass26X.A00("width", str4, A0u3);
            AnonymousClass26X.A00("height", str5, A0u3);
            if (A013 != null) {
                AnonymousClass26X.A00("direct_connection_encrypted_info", A013, A0u3);
            }
            C28371Vv r82 = new C28371Vv("product_list", new C35081lL[]{new C35081lL((Jid) userJid3, "jid")}, (C28371Vv[]) A0u3.toArray(new C28371Vv[0]));
            C35081lL[] r72 = new C35081lL[5];
            C35081lL.A02("id", A023, r72, 0);
            C35081lL.A02("xmlns", "w:biz:catalog", r72, 1);
            C35081lL.A02("type", "get", r72, 2);
            C35081lL.A02("smax_id", "21", r72, 3);
            r32.A02(r63, C28371Vv.A03(C34791ks.A00, r82, r72, 4), A023, 164);
            Log.i(AnonymousClass000.A0g("RequestBizProductListProtocolHelper/doSendRequest/jid=", userJid3));
        } else if (this instanceof C59542yS) {
            C59542yS r52 = (C59542yS) this;
            String A024 = r52.A06.A02();
            AnonymousClass26O r22 = r52.A04;
            String str6 = r22.A06;
            if (str6 == null && (r1 = (C31081dR) r52.A07.A02.get("catalog_collections_view_tag")) != null) {
                r1.A08("datasource_catalog");
            }
            C18720x9 r64 = r52.A05;
            C17150uc r04 = r52.A01;
            UserJid userJid4 = r22.A05;
            String A014 = r04.A07.A01(userJid4);
            ArrayList A0u4 = AnonymousClass000.A0u();
            AnonymousClass26X.A00("limit", Integer.toString(r22.A02), A0u4);
            AnonymousClass26X.A00("width", Integer.toString(r22.A04), A0u4);
            AnonymousClass26X.A00("height", Integer.toString(r22.A03), A0u4);
            if (str6 != null) {
                AnonymousClass26X.A00("after", str6, A0u4);
            }
            String str7 = r22.A07;
            if (str7 != null) {
                AnonymousClass26X.A00("catalog_session_id", str7, A0u4);
            }
            if (A014 != null) {
                AnonymousClass26X.A00("direct_connection_encrypted_info", A014, A0u4);
            }
            ArrayList A0u5 = AnonymousClass000.A0u();
            A0u5.add(new C35081lL((Jid) userJid4, "jid"));
            Boolean bool = Boolean.TRUE;
            if (bool == r22.A01) {
                A0u5.add(new C35081lL("allow_shop_source", bool.toString()));
            }
            C28371Vv r73 = new C28371Vv("product_catalog", (C35081lL[]) A0u5.toArray(new C35081lL[A0u5.size()]), (C28371Vv[]) A0u4.toArray(new C28371Vv[0]));
            C35081lL[] r33 = new C35081lL[4];
            C35081lL.A02("id", A024, r33, 0);
            C35081lL.A02("xmlns", "w:biz:catalog", r33, 1);
            C35081lL.A02("type", "get", r33, 2);
            r64.A02(r52, C28371Vv.A03(C34791ks.A00, r73, r33, 3), A024, 164);
        } else {
            C59532yR r83 = (C59532yR) this;
            C17190ug r74 = r83.A04;
            String A025 = r74.A02();
            C17150uc r05 = r83.A00;
            UserJid userJid5 = r83.A00;
            String A015 = r05.A07.A01(userJid5);
            if (A015 != null) {
                C28371Vv r53 = new C28371Vv(new C28371Vv("direct_connection_encrypted_info", A015, (C35081lL[]) null), "verify_postcode", new C35081lL[]{new C35081lL((Jid) userJid5, "biz_jid")});
                C35081lL[] r43 = new C35081lL[5];
                C35081lL.A02("id", A025, r43, 0);
                C35081lL.A02("xmlns", "w:biz:catalog", r43, 1);
                C35081lL.A01("type", "get", r43);
                r43[3] = new C35081lL("smax_id", "70");
                r43[4] = C35081lL.A00();
                C28371Vv A04 = C28371Vv.A04(r53, r43);
                r83.A05.A00(userJid5, A025, 317);
                r74.A0B(r83, A04, A025, 317, 32000);
                return;
            }
            r83.A03.AV3("error");
        }
    }

    public void A04(C35611mD r4) {
        if (r4 == null || !r4.A0K) {
            A03();
            return;
        }
        String str = r4.A09;
        if (str != null) {
            this.A01.A07(this.A00, str);
        }
        C17150uc r0 = this.A01;
        r0.A07.A02(this, this.A00, false);
    }

    public void A05(UserJid userJid, String str, int i2) {
        C16300so r3;
        String A0c;
        String str2;
        if (this instanceof C59522yQ) {
            C59522yQ r2 = (C59522yQ) this;
            Log.e(C13680ns.A0c(i2, "ProductRequestProtocolHelper/onError/error - "));
            r2.A07.A01("view_product_tag");
            r2.A01.A00(r2.A04, i2);
        } else if (this instanceof C59552yT) {
            C59552yT r1 = (C59552yT) this;
            r1.A07();
            if (str != null) {
                r1.A07.A01(str);
            }
            Log.e(C13680ns.A0c(i2, "GetCollectionsProtocol/onError/error - "));
            r1.A00.A00(i2);
        } else {
            if (this instanceof C59512yP) {
                C59512yP r32 = (C59512yP) this;
                r32.A06.A01("plm_details_view_tag");
                Log.e(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("RequestBizProductListProtocolHelper/onError/response-error, jid = ")));
                r32.A02.A01(new C49822Vz(2));
                r3 = r32.A00;
                A0c = C13680ns.A0c(i2, "error_code=");
                str2 = "RequestBizProductListProtocolHelper/get product list error";
            } else if (this instanceof C59542yS) {
                C59542yS r22 = (C59542yS) this;
                r22.A06();
                Log.e(AnonymousClass000.A0g("sendGetBizProductCatalog/response-error/jid=", userJid));
                r22.A01.AQt(r22.A04, i2);
                r3 = r22.A00;
                A0c = C13680ns.A0c(i2, "error_code=");
                str2 = "RequestBizProductCatalogProtocolHelper/get product catalog error";
            } else {
                C59532yR r12 = (C59532yR) this;
                if (str != null) {
                    r12.A05.A01(str);
                }
                r12.A07("error");
                return;
            }
            r3.AcB(str2, A0c, true);
        }
    }

    public final void APn(UserJid userJid) {
        Log.e(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("DirectConnectionProtocolHelperEntryPoint/onDirectConnectionError, jid = ")));
        A05(userJid, (String) null, 422);
    }

    public final void APo(UserJid userJid) {
        Log.i(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("DirectConnectionProtocolHelperEntryPoint/onDirectConnectionSucceeded, jid = ")));
        A03();
    }

    public final void AQe(C28371Vv r4, String str) {
        String str2;
        StringBuilder A0r;
        UserJid userJid;
        int A002 = C34451kH.A00(r4);
        if (A002 != 421 || this.A00) {
            A05(this.A00, str, A002);
            return;
        }
        if (this instanceof C59522yQ) {
            Log.i("ProductRequestProtocolHelper/onDirectConnectionRevokeKey");
            ((C59522yQ) this).A07.A01("view_product_tag");
        } else {
            if (this instanceof C59552yT) {
                C59552yT r2 = (C59552yT) this;
                r2.A07();
                A0r = AnonymousClass000.A0r("GetCollectionsProtocol/onDirectConnectionRevokeKey/jid - ");
                userJid = r2.A01.A04;
            } else {
                if (this instanceof C59512yP) {
                    C59512yP r22 = (C59512yP) this;
                    r22.A06.A01("plm_details_view_tag");
                    str2 = AnonymousClass000.A0h(r22.A00.getRawString(), AnonymousClass000.A0r("RequestBizProductListProtocolHelper/onDirectConnectionRevokeKey, jid = "));
                } else if (this instanceof C59542yS) {
                    C59542yS r23 = (C59542yS) this;
                    r23.A06();
                    A0r = AnonymousClass000.A0r("sendGetBizProductCatalog/onDirectConnectionRevokeKey/jid=");
                    userJid = r23.A00;
                } else {
                    str2 = "DCPostcodeVerificationProtocolHelper/onDirectConnectionRevokeKey";
                }
                Log.i(str2);
            }
            A0r.append(userJid);
            C13680ns.A1V(A0r);
        }
        this.A00 = true;
        C17150uc r0 = this.A01;
        r0.A07.A02(this, this.A00, true);
    }
}
