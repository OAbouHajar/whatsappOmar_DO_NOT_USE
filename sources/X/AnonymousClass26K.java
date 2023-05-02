package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.26K  reason: invalid class name */
public class AnonymousClass26K extends AnonymousClass26L {
    public final C16300so A00;
    public final C17150uc A01;
    public final C18620wz A02;
    public final AnonymousClass5RX A03;
    public final C18260wP A04;
    public final AnonymousClass26O A05;
    public final C18720x9 A06;
    public final C17190ug A07;
    public final C18630x0 A08;

    public AnonymousClass26K(C16300so r10, C17150uc r11, C18710x8 r12, C18650x2 r13, C84734Lr r14, C18690x6 r15, C18620wz r16, AnonymousClass5RX r17, C18260wP r18, AnonymousClass26O r19, C18720x9 r20, C17190ug r21, C18630x0 r22, AnonymousClass4IY r23, C16320sq r24) {
        super(r12, r13, r14, r15, r23, r24, 1);
        this.A03 = r17;
        this.A00 = r10;
        this.A08 = r22;
        this.A01 = r11;
        this.A04 = r18;
        this.A02 = r16;
        this.A05 = r19;
        this.A07 = r21;
        this.A06 = r20;
    }

    public final void A05() {
        C31081dR r1;
        if (this.A05.A06 == null && (r1 = (C31081dR) this.A08.A02.get("catalog_collections_view_tag")) != null) {
            r1.A07("datasource_catalog");
        }
    }

    public final void A06(Exception exc, String str, int i2, int i3, boolean z2, boolean z3) {
        Log.e("GetProductCatalogGraphQLService/onError/response-error");
        A05();
        AnonymousClass26O r2 = this.A05;
        if (!A04(r2.A05, i2, z2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("GetProductCatalogGraphQLService");
            sb.append(str);
            String obj = sb.toString();
            if (exc != null) {
                Log.e(obj, exc);
            } else {
                Log.e(obj);
            }
            this.A03.AQt(r2, i3);
            if (!z3) {
                C16300so r3 = this.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GetProductCatalogGraphQLService");
                sb2.append(str);
                String obj2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder("error_code=");
                sb3.append(i3);
                r3.AcB(obj2, sb3.toString(), true);
            }
        }
    }

    public void APZ(IOException iOException) {
        A06(iOException, "/delivery-error", -1, -1, false, true);
    }

    public void APn(UserJid userJid) {
        StringBuilder sb = new StringBuilder("GetProductCatalogGraphQLServicesendGetBizProductCatalog/direct-connection-error/jid=");
        sb.append(userJid);
        Log.e(sb.toString());
        this.A03.AQt(this.A05, 422);
    }

    public void APo(UserJid userJid) {
        A03();
    }

    public void AQa(Exception exc) {
        A06(exc, "/onError", 0, 0, false, false);
    }
}
