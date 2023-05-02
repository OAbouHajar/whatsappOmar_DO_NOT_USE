package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2j5  reason: invalid class name */
public class AnonymousClass2j5 extends AnonymousClass26L {
    public final C16300so A00;
    public final C17150uc A01;
    public final AnonymousClass39J A02;
    public final C18620wz A03;
    public final C55222j6 A04;
    public final C18260wP A05;
    public final C18720x9 A06;
    public final C17190ug A07;
    public final C18630x0 A08;
    public final C18700x7 A09;

    public AnonymousClass2j5(C16300so r10, C17150uc r11, AnonymousClass39J r12, C18710x8 r13, C18650x2 r14, C84734Lr r15, C18690x6 r16, C18620wz r17, C55222j6 r18, C18260wP r19, C18720x9 r20, C17190ug r21, C18630x0 r22, C18700x7 r23, AnonymousClass4IY r24, C16320sq r25) {
        super(r13, r14, r15, r16, r24, r25, 3);
        this.A02 = r12;
        this.A08 = r22;
        this.A01 = r11;
        this.A00 = r10;
        this.A04 = r18;
        this.A03 = r17;
        this.A07 = r21;
        this.A09 = r23;
        this.A05 = r19;
        this.A06 = r20;
    }

    public final void A05(C49822Vz r5, Exception exc, String str, int i2, int i3, boolean z2) {
        Log.e("GetProductListGraphQLService/onError/response-error");
        this.A08.A01("plm_details_view_tag");
        if (!A04(this.A04.A00, i3, z2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("GetProductListGraphQLService");
            sb.append(str);
            String obj = sb.toString();
            if (exc != null) {
                Log.e(obj, exc);
            } else {
                Log.e(obj);
            }
            this.A02.A01(r5);
            C16300so r3 = this.A00;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GetProductListGraphQLService");
            sb2.append(str);
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder("error_code=");
            sb3.append(i2);
            r3.AcB(obj2, sb3.toString(), true);
        }
    }

    public void APZ(IOException iOException) {
        A05(new C49822Vz(3), iOException, "/onDeliveryFailure", -1, -1, false);
    }

    public void APn(UserJid userJid) {
        StringBuilder sb = new StringBuilder("GetProductListGraphQLService/onDirectConnectionError/jid=");
        sb.append(userJid.getRawString());
        Log.e(sb.toString());
        this.A08.A01("plm_details_view_tag");
        this.A02.A01(new C49822Vz(2));
        C16300so r3 = this.A00;
        StringBuilder sb2 = new StringBuilder("error_code=");
        sb2.append(422);
        r3.AcB("GetProductListGraphQLService/get product list error - direct connection failed", sb2.toString(), true);
    }

    public void APo(UserJid userJid) {
        A03();
    }

    public void AQa(Exception exc) {
        A05(new C49822Vz(2), exc, "/onError", 0, 0, false);
    }
}
