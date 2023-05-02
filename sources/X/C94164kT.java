package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.4kT  reason: invalid class name and case insensitive filesystem */
public class C94164kT implements View.OnLongClickListener {
    public final /* synthetic */ int A00;

    public C94164kT(int i2) {
        this.A00 = i2;
    }

    public boolean onLongClick(View view) {
        return view.performAccessibilityAction(this.A00, (Bundle) null);
    }
}
