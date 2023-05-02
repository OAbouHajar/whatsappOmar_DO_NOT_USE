package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2yd  reason: invalid class name and case insensitive filesystem */
public class C59642yd extends AnonymousClass26L {
    public final AnonymousClass395 A00;
    public final C18620wz A01;
    public final AnonymousClass4O7 A02;
    public final C59552yT A03;
    public final C18260wP A04;
    public final C18630x0 A05;

    public C59642yd(AnonymousClass395 r10, C18710x8 r11, C18650x2 r12, C84734Lr r13, C18690x6 r14, C18620wz r15, AnonymousClass4O7 r16, C59552yT r17, C18260wP r18, C18630x0 r19, AnonymousClass4IY r20, C16320sq r21) {
        super(r11, r12, r13, r14, r20, r21, 4);
        this.A03 = r17;
        this.A01 = r15;
        this.A02 = r16;
        this.A05 = r19;
        this.A04 = r18;
        this.A00 = r10;
    }

    public final void A05() {
        C31081dR r1;
        if (this.A02.A05 == null && (r1 = (C31081dR) this.A05.A02.get("catalog_collections_view_tag")) != null) {
            r1.A07("datasource_collections");
        }
    }

    public void APZ(IOException iOException) {
        A05();
        Log.e("GetCollectionsGraphQLService/onDeliveryFailure");
        if (!A04(this.A02.A04, -1, false)) {
            this.A00.A00(-1);
        }
    }

    public void APn(UserJid userJid) {
        Log.e(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("GetCollectionsGraphQLService/onDirectConnectionError, jid = ")));
        this.A00.A00(422);
    }

    public void APo(UserJid userJid) {
        A03();
    }

    public void AQa(Exception exc) {
        A05();
        Log.e("GetCollectionsGraphQLService/onError/error - 0");
        if (!A04(this.A02.A04, 0, false)) {
            this.A00.A00(0);
        }
    }
}
