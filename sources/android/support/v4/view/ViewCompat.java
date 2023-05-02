package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public class ViewCompat {
    private static final long FAKE_FRAME_TIME = 10;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;

    static class BaseViewCompatImpl implements ViewCompatImpl {
        BaseViewCompatImpl() {
        }

        public boolean canScrollHorizontally(View view, int i2) {
            return false;
        }

        public boolean canScrollVertically(View view, int i2) {
            return false;
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            return null;
        }

        /* access modifiers changed from: package-private */
        public long getFrameTime() {
            return ViewCompat.FAKE_FRAME_TIME;
        }

        public int getImportantForAccessibility(View view) {
            return 0;
        }

        public int getLabelFor(View view) {
            return 0;
        }

        public int getLayerType(View view) {
            return 0;
        }

        public int getLayoutDirection(View view) {
            return 0;
        }

        public int getOverScrollMode(View view) {
            return 2;
        }

        public ViewParent getParentForAccessibility(View view) {
            return view.getParent();
        }

        public boolean hasTransientState(View view) {
            return false;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return false;
        }

        public void postInvalidateOnAnimation(View view) {
            view.postInvalidateDelayed(getFrameTime());
        }

        public void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateDelayed(getFrameTime(), i2, i3, i4, i5);
        }

        public void postOnAnimation(View view, Runnable runnable) {
            view.postDelayed(runnable, getFrameTime());
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long j2) {
            view.postDelayed(runnable, getFrameTime() + j2);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        }

        public void setHasTransientState(View view, boolean z2) {
        }

        public void setImportantForAccessibility(View view, int i2) {
        }

        public void setLabelFor(View view, int i2) {
        }

        public void setLayerPaint(View view, Paint paint) {
        }

        public void setLayerType(View view, int i2, Paint paint) {
        }

        public void setLayoutDirection(View view, int i2) {
        }

        public void setOverScrollMode(View view, int i2) {
        }
    }

    static class GBViewCompatImpl extends BaseViewCompatImpl {
        GBViewCompatImpl() {
        }

        public int getOverScrollMode(View view) {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }

        public void setOverScrollMode(View view, int i2) {
            ViewCompatGingerbread.setOverScrollMode(view, i2);
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl {
        HCViewCompatImpl() {
        }

        /* access modifiers changed from: package-private */
        public long getFrameTime() {
            return ViewCompatHC.getFrameTime();
        }

        public int getLayerType(View view) {
            return ViewCompatHC.getLayerType(view);
        }

        public void setLayerPaint(View view, Paint paint) {
            setLayerType(view, getLayerType(view), paint);
            view.invalidate();
        }

        public void setLayerType(View view, int i2, Paint paint) {
            ViewCompatHC.setLayerType(view, i2, paint);
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl {
        ICSViewCompatImpl() {
        }

        public boolean canScrollHorizontally(View view, int i2) {
            return ViewCompatICS.canScrollHorizontally(view, i2);
        }

        public boolean canScrollVertically(View view, int i2) {
            return ViewCompatICS.canScrollVertically(view, i2);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            ViewCompatICS.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewCompatICS.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.getInfo());
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            ViewCompatICS.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
            ViewCompatICS.setAccessibilityDelegate(view, accessibilityDelegateCompat.getBridge());
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl {
        JBViewCompatImpl() {
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            Object accessibilityNodeProvider = ViewCompatJB.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
            }
            return null;
        }

        public int getImportantForAccessibility(View view) {
            return ViewCompatJB.getImportantForAccessibility(view);
        }

        public ViewParent getParentForAccessibility(View view) {
            return ViewCompatJB.getParentForAccessibility(view);
        }

        public boolean hasTransientState(View view) {
            return ViewCompatJB.hasTransientState(view);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return ViewCompatJB.performAccessibilityAction(view, i2, bundle);
        }

        public void postInvalidateOnAnimation(View view) {
            ViewCompatJB.postInvalidateOnAnimation(view);
        }

        public void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5) {
            ViewCompatJB.postInvalidateOnAnimation(view, i2, i3, i4, i5);
        }

        public void postOnAnimation(View view, Runnable runnable) {
            ViewCompatJB.postOnAnimation(view, runnable);
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long j2) {
            ViewCompatJB.postOnAnimationDelayed(view, runnable, j2);
        }

        public void setHasTransientState(View view, boolean z2) {
            ViewCompatJB.setHasTransientState(view, z2);
        }

        public void setImportantForAccessibility(View view, int i2) {
            ViewCompatJB.setImportantForAccessibility(view, i2);
        }
    }

    static class JbMr1ViewCompatImpl extends JBViewCompatImpl {
        JbMr1ViewCompatImpl() {
        }

        public int getLabelFor(View view) {
            return ViewCompatJellybeanMr1.getLabelFor(view);
        }

        public int getLayoutDirection(View view) {
            return ViewCompatJellybeanMr1.getLayoutDirection(view);
        }

        public void setLabelFor(View view, int i2) {
            ViewCompatJellybeanMr1.setLabelFor(view, i2);
        }

        public void setLayerPaint(View view, Paint paint) {
            ViewCompatJellybeanMr1.setLayerPaint(view, paint);
        }

        public void setLayoutDirection(View view, int i2) {
            ViewCompatJellybeanMr1.setLayoutDirection(view, i2);
        }
    }

    interface ViewCompatImpl {
        boolean canScrollHorizontally(View view, int i2);

        boolean canScrollVertically(View view, int i2);

        AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

        int getImportantForAccessibility(View view);

        int getLabelFor(View view);

        int getLayerType(View view);

        int getLayoutDirection(View view);

        int getOverScrollMode(View view);

        ViewParent getParentForAccessibility(View view);

        boolean hasTransientState(View view);

        void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

        void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        boolean performAccessibilityAction(View view, int i2, Bundle bundle);

        void postInvalidateOnAnimation(View view);

        void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5);

        void postOnAnimation(View view, Runnable runnable);

        void postOnAnimationDelayed(View view, Runnable runnable, long j2);

        void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat);

        void setHasTransientState(View view, boolean z2);

        void setImportantForAccessibility(View view, int i2);

        void setLabelFor(View view, int i2);

        void setLayerPaint(View view, Paint paint);

        void setLayerType(View view, int i2, Paint paint);

        void setLayoutDirection(View view, int i2);

        void setOverScrollMode(View view, int i2);
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            IMPL = new JbMr1ViewCompatImpl();
        } else if (i2 >= 16) {
            IMPL = new JBViewCompatImpl();
        } else if (i2 >= 14) {
            IMPL = new ICSViewCompatImpl();
        } else if (i2 >= 11) {
            IMPL = new HCViewCompatImpl();
        } else if (i2 >= 9) {
            IMPL = new GBViewCompatImpl();
        } else {
            IMPL = new BaseViewCompatImpl();
        }
    }

    public static boolean canScrollHorizontally(View view, int i2) {
        return IMPL.canScrollHorizontally(view, i2);
    }

    public static boolean canScrollVertically(View view, int i2) {
        return IMPL.canScrollVertically(view, i2);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return IMPL.getAccessibilityNodeProvider(view);
    }

    public static int getImportantForAccessibility(View view) {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getLabelFor(View view) {
        return IMPL.getLabelFor(view);
    }

    public static int getLayerType(View view) {
        return IMPL.getLayerType(view);
    }

    public static int getLayoutDirection(View view) {
        return IMPL.getLayoutDirection(view);
    }

    public static int getOverScrollMode(View view) {
        return IMPL.getOverScrollMode(view);
    }

    public static ViewParent getParentForAccessibility(View view) {
        return IMPL.getParentForAccessibility(view);
    }

    public static boolean hasTransientState(View view) {
        return IMPL.hasTransientState(view);
    }

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IMPL.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        IMPL.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IMPL.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return IMPL.performAccessibilityAction(view, i2, bundle);
    }

    public static void postInvalidateOnAnimation(View view) {
        IMPL.postInvalidateOnAnimation(view);
    }

    public static void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5) {
        IMPL.postInvalidateOnAnimation(view, i2, i3, i4, i5);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        IMPL.postOnAnimation(view, runnable);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long j2) {
        IMPL.postOnAnimationDelayed(view, runnable, j2);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        IMPL.setAccessibilityDelegate(view, accessibilityDelegateCompat);
    }

    public static void setHasTransientState(View view, boolean z2) {
        IMPL.setHasTransientState(view, z2);
    }

    public static void setImportantForAccessibility(View view, int i2) {
        IMPL.setImportantForAccessibility(view, i2);
    }

    public static void setLabelFor(View view, int i2) {
        IMPL.setLabelFor(view, i2);
    }

    public static void setLayerPaint(View view, Paint paint) {
        IMPL.setLayerPaint(view, paint);
    }

    public static void setLayerType(View view, int i2, Paint paint) {
        IMPL.setLayerType(view, i2, paint);
    }

    public static void setLayoutDirection(View view, int i2) {
        IMPL.setLayoutDirection(view, i2);
    }

    public static void setOverScrollMode(View view, int i2) {
        IMPL.setOverScrollMode(view, i2);
    }
}
