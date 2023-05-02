package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.2dk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52402dk implements C52412dl {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C228119j A01;
    public final /* synthetic */ WeakReference A02;

    public /* synthetic */ C52402dk(Intent intent, C228119j r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = intent;
    }

    public final void AQk(Object obj) {
        C228119j r5 = this.A01;
        WeakReference weakReference = this.A02;
        Intent intent = this.A00;
        C52382di r7 = (C52382di) obj;
        Context context = (Context) weakReference.get();
        if (context != null) {
            int i2 = r7.A00;
            if (2 == i2) {
                ((C19980zJ) r5.A00.get()).A06(context, intent);
            } else if (i2 == 0) {
                ((C15860rz) ((C228419m) r5.A01.get()).A01.get()).A0K().putInt("shops_privacy_notice", -1).apply();
                r5.A00(context, intent);
            }
        }
    }
}
