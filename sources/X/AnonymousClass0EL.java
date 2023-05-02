package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.mod.bomfab.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0EL  reason: invalid class name */
public abstract class AnonymousClass0EL extends AnonymousClass05M {
    public static final Rect A09 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C11880jU A0A = new C07410bK();
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public AnonymousClass0EY A02;
    public final Rect A03 = AnonymousClass000.A0J();
    public final Rect A04 = AnonymousClass000.A0J();
    public final Rect A05 = AnonymousClass000.A0J();
    public final View A06;
    public final AccessibilityManager A07;
    public final int[] A08 = new int[2];
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public AnonymousClass0EL(View view) {
        if (view != null) {
            this.A06 = view;
            this.A07 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                C004601z.A0d(view, 1);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0T("View may not be null");
    }

    public static int A00(Rect rect, Rect rect2, int i2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw AnonymousClass000.A0T("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i4);
    }

    public static int A01(Rect rect, Rect rect2, int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw AnonymousClass000.A0T("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i3 = rect.left + (rect.width() >> 1);
            i4 = rect2.left;
            i5 = rect2.width();
            return AnonymousClass000.A09(i3, i4 + (i5 >> 1));
        }
        i3 = rect.top + (rect.height() >> 1);
        i4 = rect2.top;
        i5 = rect2.height();
        return AnonymousClass000.A09(i3, i4 + (i5 >> 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L_0x0023
            r0 = 33
            if (r5 == r0) goto L_0x0018
            r0 = 66
            if (r5 == r0) goto L_0x0023
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x0018
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0018:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L_0x0030
            int r1 = r4.left
            int r0 = r3.right
            goto L_0x002d
        L_0x0023:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L_0x0030
            int r1 = r4.top
            int r0 = r3.bottom
        L_0x002d:
            if (r1 > r0) goto L_0x0030
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A02(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public static boolean A03(Rect rect, Rect rect2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i2 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 <= i8 && rect.left < i8) {
                return false;
            }
            i3 = rect.left;
            i4 = rect2.left;
        } else if (i2 != 33) {
            if (i2 == 66) {
                int i9 = rect.left;
                int i10 = rect2.left;
                if (i9 >= i10 && rect.right > i10) {
                    return false;
                }
                i5 = rect.right;
                i6 = rect2.right;
            } else if (i2 == 130) {
                int i11 = rect.top;
                int i12 = rect2.top;
                if (i11 >= i12 && rect.bottom > i12) {
                    return false;
                }
                i5 = rect.bottom;
                i6 = rect2.bottom;
            } else {
                throw AnonymousClass000.A0T("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            return i5 < i6;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if (i13 <= i14 && rect.top < i14) {
                return false;
            }
            i3 = rect.top;
            i4 = rect2.top;
        }
        return i3 > i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 <= r0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r1 < r0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A02(r5, r6, r8)
            boolean r0 = A02(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0049
            if (r1 == 0) goto L_0x0049
            r0 = 17
            r2 = 1
            if (r8 == r0) goto L_0x005e
            r0 = 33
            if (r8 == r0) goto L_0x0059
            r0 = 66
            if (r8 == r0) goto L_0x0054
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0068
            int r1 = r5.bottom
            int r0 = r7.top
        L_0x0022:
            if (r1 > r0) goto L_0x0065
        L_0x0024:
            r3 = 1
            if (r2 == 0) goto L_0x0067
            r0 = 17
            if (r8 == r0) goto L_0x0067
            r1 = 66
            if (r8 == r1) goto L_0x0067
            int r2 = A00(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L_0x004f
            if (r8 == r1) goto L_0x004a
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0068
            int r1 = r7.bottom
            int r0 = r5.bottom
        L_0x0041:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L_0x0049
            r4 = 1
        L_0x0049:
            return r4
        L_0x004a:
            int r1 = r7.right
            int r0 = r5.right
            goto L_0x0041
        L_0x004f:
            int r1 = r5.top
            int r0 = r7.top
            goto L_0x0041
        L_0x0054:
            int r1 = r5.right
            int r0 = r7.left
            goto L_0x0022
        L_0x0059:
            int r1 = r5.top
            int r0 = r7.bottom
            goto L_0x0062
        L_0x005e:
            int r1 = r5.left
            int r0 = r7.right
        L_0x0062:
            if (r1 < r0) goto L_0x0065
            goto L_0x0024
        L_0x0065:
            r2 = 0
            goto L_0x0024
        L_0x0067:
            return r3
        L_0x0068:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A04(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public C06200Ur A05(View view) {
        AnonymousClass0EY r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0EY r02 = new AnonymousClass0EY(this);
        this.A02 = r02;
        return r02;
    }

    public void A06(View view, AnonymousClass031 r2) {
        super.A06(view, r2);
        A0C(r2);
    }

    public abstract int A07(float f2, float f3);

    public AnonymousClass031 A08(int i2) {
        if (i2 != -1) {
            return A09(i2);
        }
        View view = this.A06;
        AnonymousClass031 r5 = new AnonymousClass031(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList A0u = AnonymousClass000.A0u();
        A0E(A0u);
        if (accessibilityNodeInfo.getChildCount() <= 0 || A0u.size() <= 0) {
            int size = A0u.size();
            for (int i3 = 0; i3 < size; i3++) {
                accessibilityNodeInfo.addChild(view, AnonymousClass000.A0D(A0u.get(i3)));
            }
            return r5;
        }
        throw AnonymousClass000.A0a("Views cannot have both real and virtual children");
    }

    public final AnonymousClass031 A09(int i2) {
        String str;
        boolean z2;
        AnonymousClass031 r5 = new AnonymousClass031(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClassName("android.view.View");
        Rect rect = A09;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A06;
        accessibilityNodeInfo.setParent(view);
        A0D(r5, i2);
        if (r5.A02() == null && accessibilityNodeInfo.getContentDescription() == null) {
            str = "Callbacks must add text or a content description in populateNodeForVirtualViewId()";
        } else {
            Rect rect2 = this.A03;
            accessibilityNodeInfo.getBoundsInParent(rect2);
            if (!rect2.equals(rect)) {
                int actions = accessibilityNodeInfo.getActions();
                if ((actions & 64) != 0) {
                    str = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()";
                } else if ((actions & 128) == 0) {
                    accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                    r5.A00 = i2;
                    accessibilityNodeInfo.setSource(view, i2);
                    if (this.A00 == i2) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        accessibilityNodeInfo.addAction(128);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        accessibilityNodeInfo.addAction(64);
                    }
                    if (this.A01 == i2) {
                        z2 = true;
                        accessibilityNodeInfo.addAction(2);
                    } else {
                        z2 = false;
                        if (accessibilityNodeInfo.isFocusable()) {
                            accessibilityNodeInfo.addAction(1);
                        }
                    }
                    accessibilityNodeInfo.setFocused(z2);
                    int[] iArr = this.A08;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.A04;
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        accessibilityNodeInfo.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.A05;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            accessibilityNodeInfo.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return r5;
                } else {
                    str = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()";
                }
            } else {
                str = "Callbacks must set parent bounds in populateNodeForVirtualViewId()";
            }
        }
        throw AnonymousClass000.A0a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r4 = this;
            r3 = 1
            android.view.accessibility.AccessibilityManager r0 = r4.A07
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            android.view.View r2 = r4.A06
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0020
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            r2.onInitializeAccessibilityEvent(r0)
            X.C04220Lq.A00(r0, r3)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A0A():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r6.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(int r7, int r8) {
        /*
            r6 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L_0x0082
            android.view.accessibility.AccessibilityManager r0 = r6.A07
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0082
            android.view.View r3 = r6.A06
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0082
            r0 = -1
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r8)
            if (r7 == r0) goto L_0x007c
            X.031 r5 = r6.A08(r7)
            java.util.List r4 = r1.getText()
            java.lang.CharSequence r0 = r5.A02()
            r4.add(r0)
            android.view.accessibility.AccessibilityNodeInfo r4 = r5.A01
            java.lang.CharSequence r0 = r4.getContentDescription()
            r1.setContentDescription(r0)
            boolean r0 = r4.isScrollable()
            r1.setScrollable(r0)
            boolean r0 = r4.isPassword()
            r1.setPassword(r0)
            boolean r0 = r4.isEnabled()
            r1.setEnabled(r0)
            boolean r0 = r4.isChecked()
            r1.setChecked(r0)
            java.util.List r0 = r1.getText()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0066
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0066:
            java.lang.CharSequence r0 = r4.getClassName()
            r1.setClassName(r0)
            r1.setSource(r3, r7)
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getPackageName()
            r1.setPackageName(r0)
            goto L_0x007f
        L_0x007c:
            r3.onInitializeAccessibilityEvent(r1)
        L_0x007f:
            r2.requestSendAccessibilityEvent(r3, r1)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A0B(int, int):void");
    }

    public void A0C(AnonymousClass031 r1) {
    }

    public abstract void A0D(AnonymousClass031 r1, int i2);

    public abstract void A0E(List list);

    public final void A0F(boolean z2, int i2, Rect rect) {
        int i3 = this.A01;
        if (i3 != Integer.MIN_VALUE && i3 == i3) {
            this.A01 = Integer.MIN_VALUE;
            A0B(i3, 8);
        }
        if (z2) {
            A0I(i2, rect);
        }
    }

    public final boolean A0G(int i2) {
        int i3;
        View view = this.A06;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.A01) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE && i3 == i3) {
            this.A01 = Integer.MIN_VALUE;
            A0B(i3, 8);
        }
        this.A01 = i2;
        A0B(i2, 8);
        return true;
    }

    public abstract boolean A0H(int i2, int i3, Bundle bundle);

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0152, code lost:
        if (r0 < r1) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0179, code lost:
        if (r0 >= 0) goto L_0x0154;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(int r15, android.graphics.Rect r16) {
        /*
            r14 = this;
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r14.A0E(r2)
            X.07U r3 = new X.07U
            r3.<init>()
            r1 = 0
        L_0x000d:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x001d
            X.031 r0 = r14.A09(r1)
            r3.A03(r1, r0)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x001d:
            int r0 = r14.A01
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r7) goto L_0x0119
            r8 = 0
        L_0x0024:
            r9 = 1
            if (r15 == r9) goto L_0x011f
            r0 = 2
            if (r15 == r0) goto L_0x011f
            r0 = 17
            if (r15 == r0) goto L_0x0041
            r0 = 33
            if (r15 == r0) goto L_0x0041
            r0 = 66
            if (r15 == r0) goto L_0x0041
            r0 = 130(0x82, float:1.82E-43)
            if (r15 == r0) goto L_0x0041
            java.lang.String r0 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
        L_0x003c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0041:
            android.graphics.Rect r6 = X.AnonymousClass000.A0J()
            int r0 = r14.A01
            if (r0 == r7) goto L_0x00dc
            X.031 r0 = r14.A08(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A01
            r0.getBoundsInParent(r6)
        L_0x0052:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r6)
            r0 = 17
            r4 = 0
            if (r15 == r0) goto L_0x00d2
            r0 = 33
            if (r15 == r0) goto L_0x00cb
            r0 = 66
            if (r15 == r0) goto L_0x00c3
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0115
            int r0 = r6.height()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x006f:
            r5.offset(r4, r0)
        L_0x0072:
            r9 = 0
            int r13 = r3.A00
            android.graphics.Rect r12 = X.AnonymousClass000.A0J()
        L_0x0079:
            if (r4 >= r13) goto L_0x0158
            java.lang.Object[] r0 = r3.A02
            r11 = r0[r4]
            X.031 r11 = (X.AnonymousClass031) r11
            if (r11 == r8) goto L_0x00c0
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.A01
            r0.getBoundsInParent(r12)
            boolean r0 = A03(r6, r12, r15)
            if (r0 == 0) goto L_0x00c0
            boolean r0 = A03(r6, r5, r15)
            if (r0 == 0) goto L_0x00bc
            boolean r0 = A04(r6, r12, r5, r15)
            if (r0 != 0) goto L_0x00bc
            boolean r0 = A04(r6, r5, r12, r15)
            if (r0 != 0) goto L_0x00c0
            int r1 = A00(r6, r12, r15)
            int r0 = A01(r6, r12, r15)
            int r10 = r1 * 13
            int r10 = r10 * r1
            int r0 = r0 * r0
            int r10 = r10 + r0
            int r2 = A00(r6, r5, r15)
            int r1 = A01(r6, r5, r15)
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r1 * r1
            int r0 = r0 + r1
            if (r10 >= r0) goto L_0x00c0
        L_0x00bc:
            r5.set(r12)
            r9 = r11
        L_0x00c0:
            int r4 = r4 + 1
            goto L_0x0079
        L_0x00c3:
            int r0 = r6.width()
            int r0 = r0 + 1
            int r0 = -r0
            goto L_0x00d8
        L_0x00cb:
            int r0 = r6.height()
            int r0 = r0 + 1
            goto L_0x006f
        L_0x00d2:
            int r0 = r6.width()
            int r0 = r0 + 1
        L_0x00d8:
            r5.offset(r0, r4)
            goto L_0x0072
        L_0x00dc:
            r0 = r16
            if (r16 == 0) goto L_0x00e5
            r6.set(r0)
            goto L_0x0052
        L_0x00e5:
            android.view.View r0 = r14.A06
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            r0 = 17
            r2 = 0
            if (r15 == r0) goto L_0x0110
            r0 = 33
            if (r15 == r0) goto L_0x010b
            r0 = 66
            r1 = -1
            if (r15 == r0) goto L_0x0106
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0115
            r6.set(r2, r1, r5, r1)
            goto L_0x0052
        L_0x0106:
            r6.set(r1, r2, r1, r4)
            goto L_0x0052
        L_0x010b:
            r6.set(r2, r4, r5, r4)
            goto L_0x0052
        L_0x0110:
            r6.set(r5, r2, r5, r4)
            goto L_0x0052
        L_0x0115:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            goto L_0x003c
        L_0x0119:
            java.lang.Object r8 = r3.A01(r0)
            goto L_0x0024
        L_0x011f:
            android.view.View r0 = r14.A06
            int r0 = X.C004601z.A06(r0)
            boolean r6 = X.AnonymousClass000.A1R(r0, r9)
            X.0jU r5 = A0A
            int r4 = r3.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r1 = 0
        L_0x0133:
            if (r1 >= r4) goto L_0x013f
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0133
        L_0x013f:
            X.0ha r0 = new X.0ha
            r0.<init>(r5, r6)
            java.util.Collections.sort(r2, r0)
            if (r15 == r9) goto L_0x016d
            int r1 = r2.size()
            if (r8 != 0) goto L_0x0168
            r0 = -1
        L_0x0150:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0181
        L_0x0154:
            java.lang.Object r9 = r2.get(r0)
        L_0x0158:
            if (r9 == 0) goto L_0x0181
            r1 = 0
        L_0x015b:
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x017c
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            if (r0 == r9) goto L_0x017d
            int r1 = r1 + 1
            goto L_0x015b
        L_0x0168:
            int r0 = r2.lastIndexOf(r8)
            goto L_0x0150
        L_0x016d:
            int r0 = r2.size()
            if (r8 == 0) goto L_0x0177
            int r0 = r2.indexOf(r8)
        L_0x0177:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0181
            goto L_0x0154
        L_0x017c:
            r1 = -1
        L_0x017d:
            int[] r0 = r3.A01
            r7 = r0[r1]
        L_0x0181:
            boolean r0 = r14.A0G(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A0I(int, android.graphics.Rect):boolean");
    }

    public final boolean A0J(KeyEvent keyEvent) {
        int i2;
        int i3 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                        case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode != 21) {
                                    i2 = 66;
                                    if (keyCode != 22) {
                                        i2 = 130;
                                    }
                                } else {
                                    i2 = 17;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i3 < repeatCount && A0I(i2, (Rect) null)) {
                                    i3++;
                                    z2 = true;
                                }
                                return z2;
                            }
                            break;
                        case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = this.A01;
                    if (i4 == Integer.MIN_VALUE) {
                        return true;
                    }
                    A0H(i4, 16, (Bundle) null);
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A0I(2, (Rect) null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A0I(1, (Rect) null);
                }
            }
        }
        return false;
    }

    public final boolean A0K(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A07;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A072 = A07(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(A072);
            return A072 != Integer.MIN_VALUE;
        } else if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        } else {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
    }

    public final void updateHoveredVirtualView(int i2) {
        int i3 = this.mHoveredVirtualViewId;
        if (i3 != i2) {
            this.mHoveredVirtualViewId = i2;
            A0B(i2, 128);
            A0B(i3, 256);
        }
    }
}
