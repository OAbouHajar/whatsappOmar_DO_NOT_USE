package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

/* renamed from: X.2SD  reason: invalid class name */
public class AnonymousClass2SD extends ProgressDialog {
    public AnonymousClass2SD(Context context) {
        super(context);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 84) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }
}
