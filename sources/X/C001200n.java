package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.00n  reason: invalid class name and case insensitive filesystem */
public abstract class C001200n extends Activity implements C001300o, C001400p {
    public AnonymousClass00O A00 = new AnonymousClass00O();
    public C009604p A01 = new C009604p(this);

    public static final void A0J() {
    }

    public static void A0K(String[] strArr) {
    }

    @Deprecated
    public void A0L(AnonymousClass0LJ r3) {
        this.A00.put(r3.getClass(), r3);
    }

    @Deprecated
    public void A0M(Class cls) {
        this.A00.get(cls);
    }

    public boolean AgU(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C004601z.A0r(keyEvent, decorView)) {
            return AnonymousClass0NJ.A00(keyEvent, decorView, this, this);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C004601z.A0r(keyEvent, decorView)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public abstract C009704q getLifecycle();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C010905e.A00(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C009604p r2 = this.A01;
        C011005f r1 = C011005f.CREATED;
        r2.A07("markState");
        r2.A05(r1);
        super.onSaveInstanceState(bundle);
    }
}
