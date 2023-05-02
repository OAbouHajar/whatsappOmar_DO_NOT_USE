package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.08C  reason: invalid class name */
public class AnonymousClass08C implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public AnonymousClass08C(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public void run() {
        AnonymousClass0ZV r0;
        ActionMenuView actionMenuView = this.A00.A0O;
        if (actionMenuView != null && (r0 = actionMenuView.A08) != null) {
            r0.A03();
        }
    }
}
