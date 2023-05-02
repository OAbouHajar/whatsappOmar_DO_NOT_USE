package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0fC  reason: invalid class name and case insensitive filesystem */
public class C09250fC implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C09250fC(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A00();
        actionBarOverlayLayout.A05 = actionBarOverlayLayout.A07.animate().translationY((float) (-actionBarOverlayLayout.A07.getHeight())).setListener(actionBarOverlayLayout.A0K);
    }
}
