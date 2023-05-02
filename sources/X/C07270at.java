package X;

import android.content.Intent;

/* renamed from: X.0at  reason: invalid class name and case insensitive filesystem */
public final class C07270at implements C12990lI {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ AnonymousClass03J A02;

    public C07270at(Intent intent, AnonymousClass03J r2, int i2) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i2;
    }

    public void A6U() {
        this.A02.stopSelf(this.A00);
    }

    public Intent getIntent() {
        return this.A01;
    }
}
