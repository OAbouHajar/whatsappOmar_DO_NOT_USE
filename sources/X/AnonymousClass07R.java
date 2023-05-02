package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: X.07R  reason: invalid class name */
public class AnonymousClass07R extends AnonymousClass07S {
    public final /* synthetic */ AnonymousClass06G A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass07R(Window.Callback callback, AnonymousClass06G r2) {
        super(callback);
        this.A00 = r2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.A0W(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C016607w r0;
        C016607w r02;
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        AnonymousClass06G r6 = this.A00;
        int keyCode = keyEvent.getKeyCode();
        r6.A0O();
        C005402i r03 = r6.A0B;
        if (r03 != null && r03.A0W(keyCode, keyEvent)) {
            return true;
        }
        AnonymousClass09A r2 = r6.A0G;
        if (r2 != null) {
            int keyCode2 = keyEvent.getKeyCode();
            if (!keyEvent.isSystem() && ((r2.A0D || r6.A0X(keyEvent, r2)) && (r02 = r2.A0A) != null && r02.performShortcut(keyCode2, keyEvent, 1))) {
                AnonymousClass09A r04 = r6.A0G;
                if (r04 == null) {
                    return true;
                }
                r04.A0B = true;
                return true;
            }
        }
        if (r6.A0G != null) {
            return false;
        }
        AnonymousClass09A A0L = r6.A0L(0);
        r6.A0X(keyEvent, A0L);
        int keyCode3 = keyEvent.getKeyCode();
        boolean z2 = false;
        if (!keyEvent.isSystem() && ((A0L.A0D || r6.A0X(keyEvent, A0L)) && (r0 = A0L.A0A) != null)) {
            z2 = r0.performShortcut(keyCode3, keyEvent, 1);
        }
        A0L.A0D = false;
        return z2;
    }

    public void onContentChanged() {
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof C016607w)) {
            return super.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        super.onMenuOpened(i2, menu);
        AnonymousClass06G r1 = this.A00;
        if (i2 != 108) {
            return true;
        }
        r1.A0O();
        C005402i r12 = r1.A0B;
        if (r12 == null) {
            return true;
        }
        r12.A0L(true);
        return true;
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
        AnonymousClass06G r3 = this.A00;
        if (i2 == 108) {
            r3.A0O();
            C005402i r0 = r3.A0B;
            if (r0 != null) {
                r0.A0L(false);
            }
        } else if (i2 == 0) {
            AnonymousClass09A A0L = r3.A0L(i2);
            if (A0L.A0C) {
                r3.A0T(A0L, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
        /*
            r3 = this;
            boolean r0 = r6 instanceof X.C016607w
            if (r0 == 0) goto L_0x000d
            r2 = r6
            X.07w r2 = (X.C016607w) r2
        L_0x0007:
            r1 = 0
            if (r4 != 0) goto L_0x000f
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x000d:
            r2 = 0
            goto L_0x0007
        L_0x000f:
            if (r2 == 0) goto L_0x0014
        L_0x0011:
            r0 = 1
            r2.A0I = r0
        L_0x0014:
            boolean r0 = super.onPreparePanel(r4, r5, r6)
            if (r2 == 0) goto L_0x001c
            r2.A0I = r1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07R.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        C016607w r0 = this.A00.A0L(0).A0A;
        if (r0 != null) {
            super.onProvideKeyboardShortcuts(list, r0, i2);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i2);
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AnonymousClass06G r2 = this.A00;
        AnonymousClass0ZI r1 = new AnonymousClass0ZI(r2.A0j, callback);
        AnonymousClass05J A05 = r2.A05(r1);
        if (A05 != null) {
            return r1.A00(A05);
        }
        return null;
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.onWindowStartingActionMode(callback, i2);
        }
        AnonymousClass06G r2 = this.A00;
        AnonymousClass0ZI r1 = new AnonymousClass0ZI(r2.A0j, callback);
        AnonymousClass05J A05 = r2.A05(r1);
        if (A05 != null) {
            return r1.A00(A05);
        }
        return null;
    }
}
