package X;

import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1j3  reason: invalid class name and case insensitive filesystem */
public class C33721j3 extends C20380zx {
    public final C16440t3 A00;
    public final C212613k A01;

    public C33721j3(C16440t3 r1, C20360zv r2, C212613k r3) {
        super(r2);
        this.A00 = r1;
        this.A01 = r3;
    }

    public final void A0A(C34151jm r5) {
        C34421kE r3 = new C34421kE();
        this.A01.A0F(new AnonymousClass2NL(r3), r5);
        try {
            r3.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("RemoveRecentStickerHandler/removeStickerFromRecentBlocking ", e2);
        }
    }
}
