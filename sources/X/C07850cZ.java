package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: X.0cZ  reason: invalid class name and case insensitive filesystem */
public class C07850cZ implements C13080lR {
    public final ViewGroupOverlay A00;

    public C07850cZ(ViewGroup viewGroup) {
        this.A00 = viewGroup.getOverlay();
    }

    public void A4U(View view) {
        this.A00.add(view);
    }

    public void Abr(View view) {
        this.A00.remove(view);
    }
}
