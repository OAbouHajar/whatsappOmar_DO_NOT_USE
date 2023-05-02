package X;

import android.content.Intent;
import androidx.car.app.IStartCarApp;

/* renamed from: X.0ah  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07150ah implements C12300kA {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ IStartCarApp A01;

    public /* synthetic */ C07150ah(Intent intent, IStartCarApp iStartCarApp) {
        this.A01 = iStartCarApp;
        this.A00 = intent;
    }

    public final Object call() {
        this.A01.startCarApp(this.A00);
        return null;
    }
}
