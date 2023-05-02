package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.0ZR  reason: invalid class name */
public class AnonymousClass0ZR implements C12940lD, DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnKeyListener {
    public C005702l A00;
    public AnonymousClass0ZT A01;
    public C016607w A02;

    public AnonymousClass0ZR(C016607w r1) {
        this.A02 = r1;
    }

    public void AOk(C016607w r2, boolean z2) {
        C005702l r0;
        if ((z2 || r2 == this.A02) && (r0 = this.A00) != null) {
            r0.dismiss();
        }
    }

    public boolean AUB(C016607w r2) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        C016607w r3 = this.A02;
        AnonymousClass0ZT r1 = this.A01;
        AnonymousClass0C4 r0 = r1.A03;
        if (r0 == null) {
            r0 = new AnonymousClass0C4(r1);
            r1.A03 = r0;
        }
        r3.A0L((C07290av) r0.getItem(i2), (C13350lt) null, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A01.AOk(this.A02, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0G(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i2, keyEvent, 0);
    }
}
