package X;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0NJ  reason: invalid class name */
public class AnonymousClass0NJ {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static boolean A00(KeyEvent keyEvent, View view, Window.Callback callback, C001400p r11) {
        if (r11 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return r11.AgU(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!A02) {
                        try {
                            A01 = AnonymousClass000.A0s(actionBar.getClass(), KeyEvent.class, "onMenuKeyEvent", new Class[1], 0);
                        } catch (NoSuchMethodException unused) {
                        }
                        A02 = true;
                    }
                    Method method = A01;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                            if (invoke != null && AnonymousClass000.A1X(invoke)) {
                                return true;
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C004601z.A0q(keyEvent, decorView)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && C004601z.A0q(keyEvent, view)) || r11.AgU(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            if (!A03) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    A00 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                A03 = true;
            }
            Field field = A00;
            if (field != null) {
                try {
                    DialogInterface.OnKeyListener onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (C004601z.A0q(keyEvent, decorView2)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
    }
}
