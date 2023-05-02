package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.0bD  reason: invalid class name and case insensitive filesystem */
public class C07370bD implements C13190lc {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    public C07370bD(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    public void AMR(View view) {
        this.A01 = true;
    }

    public void AMS(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A0C = null;
            C07370bD.super.setVisibility(this.A00);
        }
    }

    public void AMT(View view) {
        C07370bD.super.setVisibility(0);
        this.A01 = false;
    }
}
