package X;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0DE  reason: invalid class name */
public class AnonymousClass0DE extends AnonymousClass0ZW implements C12970lG {
    public static Method A01;
    public C12970lG A00;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = AnonymousClass000.A0t(PopupWindow.class, Boolean.TYPE, "setTouchModal", new Class[1], 0);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public AnonymousClass0DE(Context context, int i2, int i3) {
        super(context, (AttributeSet) null, i2, i3);
    }

    public AnonymousClass0CV A00(Context context, boolean z2) {
        AnonymousClass0D8 r0 = new AnonymousClass0D8(context, z2);
        r0.A01 = this;
        return r0;
    }

    public void A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0A.setEnterTransition((Transition) null);
        }
    }

    public void A03() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0A.setExitTransition((Transition) null);
        }
    }

    public void A04() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    method.invoke(this.A0A, new Object[]{false});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A0A.setTouchModal(false);
        }
    }

    public void ASS(MenuItem menuItem, C016607w r3) {
        C12970lG r0 = this.A00;
        if (r0 != null) {
            r0.ASS(menuItem, r3);
        }
    }

    public void AST(MenuItem menuItem, C016607w r3) {
        C12970lG r0 = this.A00;
        if (r0 != null) {
            r0.AST(menuItem, r3);
        }
    }
}
