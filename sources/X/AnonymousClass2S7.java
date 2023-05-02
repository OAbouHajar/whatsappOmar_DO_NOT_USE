package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import com.obwhatsapp.R;

/* renamed from: X.2S7  reason: invalid class name */
public class AnonymousClass2S7 extends Dialog {
    public final int A00;
    public final Activity A01;
    public final AnonymousClass01V A02;
    public final C16440t3 A03;
    public final AnonymousClass013 A04;

    public AnonymousClass2S7(Activity activity, AnonymousClass01V r3, C16440t3 r4, AnonymousClass013 r5, int i2) {
        super(activity, R.style.style018c);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = activity;
        this.A00 = i2;
        this.A02 = r3;
    }

    public void onCreate(Bundle bundle) {
        C45902Bo.A0B(getWindow(), this.A04);
        super.onCreate(bundle);
        Window window = getWindow();
        AnonymousClass00B.A06(window);
        setContentView(window.getLayoutInflater().inflate(this.A00, (ViewGroup) null, false));
        getWindow().setLayout(-1, -1);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }
}
