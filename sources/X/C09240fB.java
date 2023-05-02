package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0fB  reason: invalid class name and case insensitive filesystem */
public class C09240fB implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C09240fB(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A00();
        actionBarOverlayLayout.A05 = actionBarOverlayLayout.A07.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0K);
    }
}
