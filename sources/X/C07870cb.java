package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.0cb  reason: invalid class name and case insensitive filesystem */
public class C07870cb implements C12000jg {
    public final WindowId A00;

    public C07870cb(View view) {
        this.A00 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C07870cb) && ((C07870cb) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
