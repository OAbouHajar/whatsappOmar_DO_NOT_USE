package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0XH  reason: invalid class name */
public class AnonymousClass0XH {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public AnonymousClass0XH(View view) {
        this.A04 = view;
    }

    public void A00(int i2) {
        ViewParent viewParent = i2 != 0 ? this.A00 : this.A01;
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof C018908v) {
                ((C018908v) viewParent).AXx(view, i2);
            } else if (i2 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        AnonymousClass0X8.A01(view, viewParent);
                    } catch (AbstractMethodError e2) {
                        StringBuilder A0r = AnonymousClass000.A0r("ViewParent ");
                        A0r.append(viewParent);
                        Log.e("ViewParentCompat", AnonymousClass000.A0h(" does not implement interface method onStopNestedScroll", A0r), e2);
                    }
                } else if (viewParent instanceof C019008w) {
                    ((C019008w) viewParent).onStopNestedScroll(view);
                }
            }
            if (i2 != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public boolean A01(float f2, float f3) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        View view = this.A04;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return AnonymousClass0X8.A05(view, viewParent, f2, f3);
            } catch (AbstractMethodError e2) {
                StringBuilder A0r = AnonymousClass000.A0r("ViewParent ");
                A0r.append(viewParent);
                Log.e("ViewParentCompat", AnonymousClass000.A0h(" does not implement interface method onNestedPreFling", A0r), e2);
                return false;
            }
        } else if (viewParent instanceof C019008w) {
            return ((C019008w) viewParent).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public boolean A02(float f2, float f3, boolean z2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        View view = this.A04;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return AnonymousClass0X8.A06(view, viewParent, f2, f3, z2);
            } catch (AbstractMethodError e2) {
                StringBuilder A0r = AnonymousClass000.A0r("ViewParent ");
                A0r.append(viewParent);
                Log.e("ViewParentCompat", AnonymousClass000.A0h(" does not implement interface method onNestedFling", A0r), e2);
                return false;
            }
        } else if (viewParent instanceof C019008w) {
            return ((C019008w) viewParent).onNestedFling(view, f2, f3, z2);
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0083
            android.view.ViewParent r0 = r7.A00
        L_0x0004:
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00a2
            android.view.View r5 = r7.A04
            android.view.ViewParent r3 = r5.getParent()
            r4 = r5
        L_0x0016:
            if (r3 == 0) goto L_0x00a2
            boolean r0 = r3 instanceof X.C018908v
            if (r0 == 0) goto L_0x0049
            r0 = r3
            X.08v r0 = (X.C018908v) r0
            boolean r0 = r0.AXV(r4, r5, r8, r9)
        L_0x0023:
            if (r0 == 0) goto L_0x0077
            if (r9 == 0) goto L_0x0046
            r7.A00 = r3
        L_0x0029:
            boolean r0 = r3 instanceof X.C018908v
            if (r0 == 0) goto L_0x0033
            X.08v r3 = (X.C018908v) r3
            r3.ATx(r4, r5, r8, r9)
        L_0x0032:
            return r6
        L_0x0033:
            if (r9 != 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x003c
            goto L_0x0087
        L_0x003c:
            boolean r0 = r3 instanceof X.C019008w
            if (r0 == 0) goto L_0x0032
            X.08w r3 = (X.C019008w) r3
            r3.onNestedScrollAccepted(r4, r5, r8)
            return r6
        L_0x0046:
            r7.A01 = r3
            goto L_0x0029
        L_0x0049:
            if (r9 != 0) goto L_0x0077
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0056
            boolean r0 = X.AnonymousClass0X8.A04(r4, r5, r3, r8)     // Catch:{ AbstractMethodError -> 0x0062 }
            goto L_0x0023
        L_0x0056:
            boolean r0 = r3 instanceof X.C019008w
            if (r0 == 0) goto L_0x0077
            r0 = r3
            X.08w r0 = (X.C019008w) r0
            boolean r0 = r0.onStartNestedScroll(r4, r5, r8)
            goto L_0x0023
        L_0x0062:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
        L_0x0077:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x007e
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L_0x007e:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x0016
        L_0x0083:
            android.view.ViewParent r0 = r7.A01
            goto L_0x0004
        L_0x0087:
            X.AnonymousClass0X8.A00(r4, r5, r3, r8)     // Catch:{ AbstractMethodError -> 0x008b }
            goto L_0x00a1
        L_0x008b:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
            return r6
        L_0x00a1:
            return r6
        L_0x00a2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XH.A03(int, int):boolean");
    }

    public boolean A04(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr3 = iArr;
        if (this.A02) {
            int i7 = i4;
            ViewParent viewParent = i4 != 0 ? this.A00 : this.A01;
            if (viewParent != null) {
                int i8 = i2;
                int i9 = i3;
                if (i2 != 0 || i3 != 0) {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i5 = iArr2[0];
                        i6 = iArr2[1];
                    } else {
                        i5 = 0;
                        i6 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof C018908v) {
                        ((C018908v) viewParent).ATu(view, iArr3, i8, i9, i7);
                    } else if (i4 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                AnonymousClass0X8.A03(view, viewParent, iArr3, i8, i9);
                            } catch (AbstractMethodError e2) {
                                StringBuilder A0r = AnonymousClass000.A0r("ViewParent ");
                                A0r.append(viewParent);
                                Log.e("ViewParentCompat", AnonymousClass000.A0h(" does not implement interface method onNestedPreScroll", A0r), e2);
                            }
                        } else if (viewParent instanceof C019008w) {
                            ((C019008w) viewParent).onNestedPreScroll(view, i8, i9, iArr3);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i5;
                        iArr2[1] = iArr2[1] - i6;
                    }
                    if (!(iArr3[0] == 0 && iArr3[1] == 0)) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public final boolean A05(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int[] iArr3 = iArr2;
        if (this.A02) {
            int i9 = i6;
            ViewParent viewParent = i6 != 0 ? this.A00 : this.A01;
            if (viewParent != null) {
                int[] iArr4 = iArr;
                int i10 = i2;
                int i11 = i3;
                int i12 = i4;
                int i13 = i5;
                if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                    if (iArr != null) {
                        this.A04.getLocationInWindow(iArr4);
                        i7 = iArr[0];
                        i8 = iArr[1];
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    if (iArr2 == null) {
                        iArr3 = this.A03;
                        if (iArr3 == null) {
                            iArr3 = new int[2];
                            this.A03 = iArr3;
                        }
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                    }
                    View view = this.A04;
                    if (viewParent instanceof AnonymousClass09V) {
                        ((AnonymousClass09V) viewParent).ATw(view, iArr3, i10, i11, i12, i13, i9);
                    } else {
                        iArr3[0] = iArr3[0] + i4;
                        iArr3[1] = iArr3[1] + i5;
                        if (viewParent instanceof C018908v) {
                            ((C018908v) viewParent).ATv(view, i10, i11, i12, i13, i9);
                        } else if (i6 == 0) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                try {
                                    AnonymousClass0X8.A02(view, viewParent, i10, i11, i12, i13);
                                } catch (AbstractMethodError e2) {
                                    StringBuilder A0r = AnonymousClass000.A0r("ViewParent ");
                                    A0r.append(viewParent);
                                    Log.e("ViewParentCompat", AnonymousClass000.A0h(" does not implement interface method onNestedScroll", A0r), e2);
                                }
                            } else if (viewParent instanceof C019008w) {
                                ((C019008w) viewParent).onNestedScroll(view, i10, i11, i12, i13);
                            }
                        }
                    }
                    if (iArr != null) {
                        view.getLocationInWindow(iArr4);
                        iArr[0] = iArr[0] - i7;
                        iArr[1] = iArr[1] - i8;
                    }
                    return true;
                } else if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            }
        }
        return false;
    }
}
