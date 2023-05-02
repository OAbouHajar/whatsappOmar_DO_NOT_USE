package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.4w8  reason: invalid class name and case insensitive filesystem */
public final class C100744w8 implements C108625Os {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass4RW A02;
    public final /* synthetic */ AnonymousClass1K5 A03;

    public C100744w8(Activity activity, Context context, AnonymousClass4RW r3, AnonymousClass1K5 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void AWT(boolean z2) {
        if (!z2) {
            this.A02.A00(C798441n.NO_PERMISSION);
            return;
        }
        AnonymousClass1K5 r5 = this.A03;
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(UUID.randomUUID(), A0o);
        File AC7 = r5.AC7(AnonymousClass000.A0h(".jpg", A0o));
        try {
            Uri A012 = AnonymousClass1XI.A01(this.A01, AC7);
            Intent A022 = C13700nu.A02("android.media.action.IMAGE_CAPTURE");
            A022.putExtra("output", A012);
            r5.Ag2(this.A00, A022, new C85884Qj(this, AC7), 1);
        } catch (IOException unused) {
            this.A02.A00(C798441n.INTERNAL_ERROR);
            AC7.delete();
        }
    }
}
