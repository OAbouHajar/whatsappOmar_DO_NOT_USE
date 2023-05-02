package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* renamed from: X.3yU  reason: invalid class name and case insensitive filesystem */
public class C78683yU extends C34331k5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public C78683yU(Activity activity, Intent intent, int i2) {
        this.A01 = activity;
        this.A02 = intent;
        this.A00 = i2;
    }

    public void A06(View view) {
        this.A01.startActivityForResult(this.A02, this.A00);
    }
}
