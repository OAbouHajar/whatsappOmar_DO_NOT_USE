package X;

import com.whatsapp.util.Log;

/* renamed from: X.519  reason: invalid class name */
public final class AnonymousClass519 implements AnonymousClass2HV {
    public final /* synthetic */ AnonymousClass1FP A00;
    public final /* synthetic */ C211913d A01;
    public final /* synthetic */ C17330uu A02;

    public AnonymousClass519(AnonymousClass1FP r1, C211913d r2, C17330uu r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AQu(Exception exc) {
        C18450wi.A0H(exc, 0);
        Log.e("AvatarStickerPackAsyncInit/onAsyncInit Failed to delete avatar via Smax: ", exc);
    }

    public void onSuccess() {
        C14870pt.A00(this.A00.A00, this.A01, 16);
        this.A02.A01();
    }
}
