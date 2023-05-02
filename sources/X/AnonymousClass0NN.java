package X;

import android.content.Context;

/* renamed from: X.0NN  reason: invalid class name */
public final class AnonymousClass0NN {
    public final AnonymousClass028 A00;

    public AnonymousClass0NN(Context context) {
        this.A00 = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new AnonymousClass0F2() : new AnonymousClass0F3(context);
    }
}
