package X;

import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.032  reason: invalid class name */
public class AnonymousClass032 {
    public static final AnonymousClass032 A01 = new AnonymousClass032(64, (CharSequence) null);
    public static final AnonymousClass032 A02 = new AnonymousClass032(128, (CharSequence) null);
    public static final AnonymousClass032 A03 = new AnonymousClass032(2, (CharSequence) null);
    public static final AnonymousClass032 A04 = new AnonymousClass032(8, (CharSequence) null);
    public static final AnonymousClass032 A05 = new AnonymousClass032(16, (CharSequence) null);
    public static final AnonymousClass032 A06 = new AnonymousClass032(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END, (CharSequence) null);
    public static final AnonymousClass032 A07;
    public static final AnonymousClass032 A08 = new AnonymousClass032(16384, (CharSequence) null);
    public static final AnonymousClass032 A09 = new AnonymousClass032(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, (CharSequence) null);
    public static final AnonymousClass032 A0A = new AnonymousClass032(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START, (CharSequence) null);
    public static final AnonymousClass032 A0B = new AnonymousClass032(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START, (CharSequence) null);
    public static final AnonymousClass032 A0C = new AnonymousClass032(1, (CharSequence) null);
    public static final AnonymousClass032 A0D;
    public static final AnonymousClass032 A0E;
    public static final AnonymousClass032 A0F = new AnonymousClass032(32, (CharSequence) null);
    public static final AnonymousClass032 A0G;
    public static final AnonymousClass032 A0H = new AnonymousClass032((CharSequence) null, (Object) null, 256);
    public static final AnonymousClass032 A0I = new AnonymousClass032((CharSequence) null, (Object) null, 1024);
    public static final AnonymousClass032 A0J;
    public static final AnonymousClass032 A0K;
    public static final AnonymousClass032 A0L;
    public static final AnonymousClass032 A0M;
    public static final AnonymousClass032 A0N = new AnonymousClass032(32768, (CharSequence) null);
    public static final AnonymousClass032 A0O;
    public static final AnonymousClass032 A0P = new AnonymousClass032((CharSequence) null, (Object) null, 512);
    public static final AnonymousClass032 A0Q = new AnonymousClass032((CharSequence) null, (Object) null, 2048);
    public static final AnonymousClass032 A0R = new AnonymousClass032(8192, (CharSequence) null);
    public static final AnonymousClass032 A0S;
    public static final AnonymousClass032 A0T = new AnonymousClass032(4096, (CharSequence) null);
    public static final AnonymousClass032 A0U;
    public static final AnonymousClass032 A0V;
    public static final AnonymousClass032 A0W;
    public static final AnonymousClass032 A0X;
    public static final AnonymousClass032 A0Y = new AnonymousClass032(4, (CharSequence) null);
    public static final AnonymousClass032 A0Z;
    public static final AnonymousClass032 A0a = new AnonymousClass032((CharSequence) null, (Object) null, 131072);
    public static final AnonymousClass032 A0b = new AnonymousClass032((CharSequence) null, (Object) null, AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END);
    public static final AnonymousClass032 A0c;
    public static final AnonymousClass032 A0d;
    public final Object A00;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        int i2 = Build.VERSION.SDK_INT;
        A0c = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342);
        A0W = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
        A0X = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344);
        A0U = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345);
        A0S = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346);
        A0V = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347);
        if (i2 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        A0M = new AnonymousClass032((CharSequence) null, accessibilityAction2, 16908358);
        A0J = new AnonymousClass032((CharSequence) null, i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359);
        A0K = new AnonymousClass032((CharSequence) null, i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360);
        A0L = new AnonymousClass032((CharSequence) null, i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361);
        A07 = new AnonymousClass032((CharSequence) null, i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348);
        A0Z = new AnonymousClass032((CharSequence) null, i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349);
        A0G = new AnonymousClass032((CharSequence) null, i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354);
        A0d = new AnonymousClass032((CharSequence) null, i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356);
        A0D = new AnonymousClass032((CharSequence) null, i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357);
        A0O = new AnonymousClass032((CharSequence) null, i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362);
        if (i2 >= 30) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        A0E = new AnonymousClass032((CharSequence) null, accessibilityAction, 16908372);
    }

    public AnonymousClass032(int i2, CharSequence charSequence) {
        this(charSequence, (Object) null, i2);
    }

    public AnonymousClass032(CharSequence charSequence, Object obj, int i2) {
        if (Build.VERSION.SDK_INT < 21 || obj != null) {
            this.A00 = obj;
        } else {
            this.A00 = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        }
    }

    public int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A00).getId();
        }
        return 0;
    }

    public CharSequence A01() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A00).getLabel();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass032)) {
            Object obj2 = this.A00;
            Object obj3 = ((AnonymousClass032) obj).A00;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
