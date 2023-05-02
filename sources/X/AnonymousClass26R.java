package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.26R  reason: invalid class name */
public class AnonymousClass26R extends AnonymousClass26L {
    public final C17150uc A00;
    public final C18640x1 A01;
    public final AnonymousClass4Q4 A02;
    public final AnonymousClass1KA A03;
    public final C18620wz A04;
    public final C18260wP A05;
    public final AnonymousClass26S A06;
    public final C18720x9 A07;
    public final C17190ug A08;
    public final C18630x0 A09;

    public AnonymousClass26R(C17150uc r10, C18640x1 r11, AnonymousClass4Q4 r12, AnonymousClass1KA r13, C18710x8 r14, C18650x2 r15, C84734Lr r16, C18690x6 r17, C18620wz r18, C18260wP r19, AnonymousClass26S r20, C18720x9 r21, C17190ug r22, C18630x0 r23, AnonymousClass4IY r24, C16320sq r25) {
        super(r14, r15, r16, r17, r24, r25, 2);
        this.A09 = r23;
        this.A00 = r10;
        this.A03 = r13;
        this.A01 = r11;
        this.A06 = r20;
        this.A04 = r18;
        this.A08 = r22;
        this.A05 = r19;
        this.A07 = r21;
        this.A02 = r12;
    }

    public final void A05(Exception exc, String str, int i2, int i3, boolean z2) {
        Log.e("GetProductGraphQLService/onError/response-error");
        this.A09.A01("view_product_tag");
        AnonymousClass26S r2 = this.A06;
        if (!A04(r2.A00, i3, z2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("GetProductGraphQLService");
            sb.append(str);
            String obj = sb.toString();
            if (exc != null) {
                Log.e(obj, exc);
            } else {
                Log.e(obj);
            }
            this.A02.A00(r2, i2);
        }
    }

    public void APZ(IOException iOException) {
        A05(iOException, "/onDeliveryFailure", 0, -1, false);
    }

    public void APn(UserJid userJid) {
        StringBuilder sb = new StringBuilder("GetProductGraphQLService/direct-connection-error/jid=");
        sb.append(userJid.getRawString());
        Log.e(sb.toString());
        this.A02.A00(this.A06, 0);
    }

    public void APo(UserJid userJid) {
        A03();
    }

    public void AQa(Exception exc) {
        A05(exc, "/onError", 0, 0, false);
    }
}
