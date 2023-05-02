package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2yO  reason: invalid class name and case insensitive filesystem */
public class C59502yO extends AnonymousClass26X {
    public final AnonymousClass394 A00;
    public final C55252j9 A01;
    public final C53812gL A02;
    public final C18260wP A03;
    public final C18720x9 A04;
    public final C17190ug A05;
    public final C18630x0 A06;
    public final C18750xC A07;

    public C59502yO(C17150uc r1, AnonymousClass394 r2, C55252j9 r3, C53812gL r4, C18260wP r5, C18720x9 r6, C17190ug r7, C18630x0 r8, C18750xC r9) {
        super(r1);
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A07 = r9;
    }

    public void A02() {
        if (!this.A03.A0A()) {
            this.A00.A00(-1);
            return;
        }
        String A022 = this.A05.A02();
        C18750xC r0 = this.A07;
        C55252j9 r2 = this.A01;
        UserJid userJid = r2.A03;
        r0.A00(userJid, A022, 270);
        String str = r2.A04;
        if (str == null) {
            this.A06.A02("view_collection_details_tag");
        }
        C18720x9 r7 = this.A04;
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass26X.A00("limit", Integer.toString(r2.A01), A0u);
        AnonymousClass26X.A00("width", Integer.toString(r2.A02), A0u);
        AnonymousClass26X.A00("height", Integer.toString(r2.A00), A0u);
        AnonymousClass26X.A00("is_category", Boolean.toString(r2.A07), A0u);
        String str2 = r2.A06;
        if (str2 != null) {
            AnonymousClass26X.A00("catalog_session_id", str2, A0u);
        }
        if (str != null) {
            AnonymousClass26X.A00("after", str, A0u);
        }
        String A012 = this.A01.A07.A01(userJid);
        if (A012 != null) {
            AnonymousClass26X.A00("direct_connection_encrypted_info", A012, A0u);
        }
        C35081lL[] r6 = new C35081lL[2];
        int A032 = C35081lL.A03("id", r2.A05, r6);
        r6[1] = new C35081lL((Jid) userJid, "biz_jid");
        C28371Vv r8 = new C28371Vv("collection", r6, (C28371Vv[]) A0u.toArray(new C28371Vv[A032]));
        C35081lL[] r62 = new C35081lL[5];
        r62[A032] = C35081lL.A00();
        C35081lL.A02("id", A022, r62, 1);
        C35081lL.A02("smax_id", "30", r62, 2);
        C35081lL.A02("xmlns", "w:biz:catalog", r62, 3);
        C35081lL.A02("type", "get", r62, 4);
        r7.A02(this, C28371Vv.A04(r8, r62), A022, 270);
        StringBuilder A0r = AnonymousClass000.A0r("app/sendGetCollectionProductList jid=");
        A0r.append(userJid);
        Log.i(AnonymousClass000.A0h(" success", A0r));
    }

    public void APb(String str) {
        if (this.A01.A04 == null) {
            this.A06.A01("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/delivery-error");
        this.A00.A00(-1);
    }

    public void APn(UserJid userJid) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/direct-connection-error");
        this.A00.A00(421);
    }

    public void APo(UserJid userJid) {
        Log.i("GetCollectionProductListProtocolonDirectConnectionSucceeded/retry-request");
        A02();
    }

    public void AQe(C28371Vv r4, String str) {
        C55252j9 r2 = this.A01;
        if (r2.A04 == null) {
            this.A06.A01("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductList/response-error");
        int A002 = C34451kH.A00(r4);
        if (!A01(r2.A03, A002)) {
            this.A00.A00(A002);
        }
    }

    public void AYG(C28371Vv r5, String str) {
        AnonymousClass2GE A012;
        C55252j9 r3 = this.A01;
        if (r3.A04 == null) {
            this.A06.A01("view_collection_details_tag");
        }
        this.A07.A02(str);
        C53812gL r1 = this.A02;
        C28371Vv A0J = r5.A0J("collection");
        if (A0J == null || (A012 = r1.A01(A0J)) == null) {
            Log.e(AnonymousClass000.A0f(r3.A03, AnonymousClass000.A0r("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess/emptyPage jid=")));
            this.A00.A00(0);
            return;
        }
        C83514Gz r2 = new C83514Gz(C61713Aa.A00(A0J.A0J("paging")), A012);
        StringBuilder A0r = AnonymousClass000.A0r("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess jid=");
        A0r.append(r3.A03);
        C13680ns.A1V(A0r);
        this.A00.A01(r2, r3);
    }
}
