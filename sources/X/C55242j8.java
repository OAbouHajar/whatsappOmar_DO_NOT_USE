package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2j8  reason: invalid class name and case insensitive filesystem */
public class C55242j8 extends AnonymousClass26L {
    public final AnonymousClass394 A00;
    public final C18620wz A01;
    public final C55252j9 A02;
    public final C59502yO A03;
    public final C18260wP A04;
    public final C18630x0 A05;

    public C55242j8(AnonymousClass394 r10, C18710x8 r11, C18650x2 r12, C84734Lr r13, C18690x6 r14, C18620wz r15, C55252j9 r16, C59502yO r17, C18260wP r18, C18630x0 r19, AnonymousClass4IY r20, C16320sq r21) {
        super(r11, r12, r13, r14, r20, r21, 5);
        this.A05 = r19;
        this.A04 = r18;
        this.A02 = r16;
        this.A00 = r10;
        this.A01 = r15;
        this.A03 = r17;
    }

    public final void A05() {
        if (this.A02.A04 == null) {
            this.A05.A01("view_collection_details_tag");
        }
    }

    public void APZ(IOException iOException) {
        A05();
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onDeliveryFailure");
        if (!A04(this.A02.A03, -1, false)) {
            this.A00.A00(-1);
        }
    }

    public void APn(UserJid userJid) {
        Log.e("GetSingleCollectionGraphQLServicesendRequest/direct-connection-error");
        this.A00.A00(422);
    }

    public void APo(UserJid userJid) {
        Log.i("GetSingleCollectionGraphQLService/onDirectConnectionSucceeded/retry-request");
        A03();
    }

    public void AQa(Exception exc) {
        A05();
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onError");
        if (!A04(this.A02.A03, 0, false)) {
            this.A00.A00(0);
        }
    }
}
