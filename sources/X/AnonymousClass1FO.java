package X;

import com.obwhatsapp.avatar.init.AvatarStickerPackWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1FO  reason: invalid class name */
public final class AnonymousClass1FO {
    public final AnonymousClass12P A00;

    public AnonymousClass1FO(AnonymousClass12P r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final void A00() {
        AnonymousClass040 r1 = new AnonymousClass040();
        r1.A01(AnonymousClass041.CONNECTED);
        AnonymousClass042 A002 = r1.A00();
        C006903e r4 = new C006903e(AvatarStickerPackWorker.class);
        r4.A00.A0A = A002;
        r4.A03(AnonymousClass04P.EXPONENTIAL, TimeUnit.SECONDS, 10);
        ((AnonymousClass022) this.A00.get()).A02(AnonymousClass03z.REPLACE, (AnonymousClass043) r4.A00(), "tag.whatsapp.avatar.init.download").A03();
    }
}
