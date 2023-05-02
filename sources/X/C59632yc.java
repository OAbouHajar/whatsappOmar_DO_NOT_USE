package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2yc  reason: invalid class name and case insensitive filesystem */
public class C59632yc extends AnonymousClass26L {
    public boolean A00;
    public final AnonymousClass4H1 A01;
    public final C86124Rh A02;
    public final C18620wz A03;
    public final C18260wP A04;

    public C59632yc(AnonymousClass4H1 r10, C86124Rh r11, C18710x8 r12, C18650x2 r13, C84734Lr r14, C18690x6 r15, C18620wz r16, C18260wP r17, AnonymousClass4IY r18, C16320sq r19) {
        super(r12, r13, r14, r15, r18, r19, 6);
        this.A03 = r16;
        this.A04 = r17;
        this.A01 = r10;
        this.A02 = r11;
    }

    public final void A05(int i2) {
        AnonymousClass4H1 r0 = this.A01;
        r0.A00.AR4(this.A02, i2);
    }

    public void APZ(IOException iOException) {
        Log.e("GetCategoriesGraphQLService/onDeliveryFailure", iOException);
        if (this.A00) {
            try {
                if (!A04(this.A02.A02, -1, false)) {
                    A05(-1);
                }
            } catch (Exception unused) {
                A05(0);
            }
        } else {
            this.A00 = true;
            A03();
        }
    }

    public void APn(UserJid userJid) {
        A05(422);
    }

    public void APo(UserJid userJid) {
        A03();
    }

    public void AQa(Exception exc) {
        Log.e("GetCategoriesGraphQLService/onError", exc);
        try {
            if (!A04(this.A02.A02, 0, false)) {
                A05(0);
            }
        } catch (Exception unused) {
            A05(0);
        }
    }
}
