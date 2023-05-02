package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.09L  reason: invalid class name */
public class AnonymousClass09L extends AnonymousClass07S {
    public final /* synthetic */ AnonymousClass09B A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass09L(Window.Callback callback, AnonymousClass09B r2) {
        super(callback);
        this.A00 = r2;
    }

    public View onCreatePanelView(int i2) {
        return i2 == 0 ? new View(((AnonymousClass09F) this.A00.A01).A09.getContext()) : super.onCreatePanelView(i2);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
        if (onPreparePanel) {
            AnonymousClass09B r2 = this.A00;
            if (!r2.A05) {
                ((AnonymousClass09F) r2.A01).A0D = true;
                r2.A05 = true;
            }
        }
        return onPreparePanel;
    }
}
