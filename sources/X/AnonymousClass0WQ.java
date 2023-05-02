package X;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0WQ  reason: invalid class name */
public class AnonymousClass0WQ {
    public int A00 = -1;
    public boolean A01 = false;
    public final AnonymousClass01A A02;
    public final C010304y A03;
    public final AnonymousClass065 A04;

    public AnonymousClass0WQ(AnonymousClass01A r2, C010304y r3, AnonymousClass065 r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public AnonymousClass0WQ(AnonymousClass01A r4, C010304y r5, AnonymousClass0YF r6, AnonymousClass065 r7) {
        this.A03 = r5;
        this.A04 = r7;
        this.A02 = r4;
        r4.A08 = null;
        r4.A07 = null;
        r4.A00 = 0;
        r4.A0c = false;
        r4.A0U = false;
        AnonymousClass01A r0 = r4.A0E;
        r4.A0S = r0 != null ? r0.A0T : null;
        r4.A0E = null;
        Bundle bundle = r6.A00;
        r4.A06 = bundle == null ? new Bundle() : bundle;
    }

    public AnonymousClass0WQ(C010304y r4, AnonymousClass06B r5, AnonymousClass0YF r6, AnonymousClass065 r7, ClassLoader classLoader) {
        this.A03 = r4;
        this.A04 = r7;
        AnonymousClass01A A002 = r5.A00(r6.A05);
        this.A02 = A002;
        Bundle bundle = r6.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        A002.A0T(bundle);
        A002.A0T = r6.A07;
        A002.A0Y = r6.A09;
        A002.A0h = true;
        A002.A02 = r6.A02;
        A002.A01 = r6.A01;
        A002.A0R = r6.A06;
        A002.A0i = r6.A0C;
        A002.A0g = r6.A0B;
        A002.A0X = r6.A08;
        A002.A0a = r6.A0A;
        A002.A0J = C011005f.values()[r6.A03];
        Bundle bundle2 = r6.A00;
        A002.A06 = bundle2 == null ? new Bundle() : bundle2;
        if (AnonymousClass02C.A02(2)) {
            Log.v("FragmentManager", AnonymousClass000.A0g("Instantiated fragment ", A002));
        }
    }

    public final Bundle A00() {
        Bundle bundle = new Bundle();
        AnonymousClass01A r2 = this.A02;
        r2.A0R(bundle);
        this.A03.A04(bundle, r2);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (r2.A0A != null) {
            A05();
        }
        if (r2.A08 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", r2.A08);
        }
        if (r2.A07 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", r2.A07);
        }
        if (!r2.A0j) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", r2.A0j);
        }
        return bundle;
    }

    public AnonymousClass0YF A01() {
        AnonymousClass01A r4 = this.A02;
        AnonymousClass0YF r3 = new AnonymousClass0YF(r4);
        if (r4.A03 <= -1 || r3.A00 != null) {
            r3.A00 = r4.A06;
            return r3;
        }
        Bundle A002 = A00();
        r3.A00 = A002;
        if (r4.A0S != null) {
            if (A002 == null) {
                A002 = new Bundle();
                r3.A00 = A002;
            }
            A002.putString("android:target_state", r4.A0S);
            int i2 = r4.A04;
            if (i2 != 0) {
                r3.A00.putInt("android:target_req_state", i2);
            }
        }
        return r3;
    }

    public void A02() {
        int i2;
        View view;
        View view2;
        AnonymousClass065 r0 = this.A04;
        AnonymousClass01A r6 = this.A02;
        ViewGroup viewGroup = r6.A0B;
        if (viewGroup != null) {
            ArrayList arrayList = r0.A01;
            int indexOf = arrayList.indexOf(r6);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AnonymousClass01A r1 = (AnonymousClass01A) arrayList.get(indexOf);
                        if (r1.A0B == viewGroup && (view = r1.A0A) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AnonymousClass01A r12 = (AnonymousClass01A) arrayList.get(i3);
                    if (r12.A0B == viewGroup && (view2 = r12.A0A) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
            r6.A0B.addView(r6.A0A, i2);
        }
        i2 = -1;
        r6.A0B.addView(r6.A0A, i2);
    }

    public void A03() {
        AnonymousClass01A r4 = this.A02;
        if (r4.A0Y && r4.A0c && !r4.A0f) {
            if (AnonymousClass02C.A01()) {
                Log.d("FragmentManager", AnonymousClass000.A0g("moveto CREATE_VIEW: ", r4));
            }
            LayoutInflater A0v = r4.A0v(r4.A06);
            r4.A09 = A0v;
            r4.A0U(r4.A06, A0v, (ViewGroup) null);
            View view = r4.A0A;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                r4.A0A.setTag(R.id.fragment_container_view_tag, r4);
                if (r4.A0a) {
                    r4.A0A.setVisibility(8);
                }
                r4.A18(r4.A06, r4.A0A);
                r4.A0G.A0O(2);
                this.A03.A00(r4.A06, r4.A0A, r4);
                r4.A03 = 2;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04ca, code lost:
        if (r3.A00 > 0) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0664, code lost:
        r3.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06b2, code lost:
        r3.A03 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x027c A[Catch:{ all -> 0x0930 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x07ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x022d A[Catch:{ all -> 0x0930 }, LOOP:2: B:93:0x0227->B:95:0x022d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r14 = this;
            boolean r0 = r14.A01
            java.lang.String r1 = "FragmentManager"
            r6 = 2
            if (r0 == 0) goto L_0x001d
            boolean r0 = X.AnonymousClass02C.A02(r6)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            X.01A r0 = r14.A02
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r2)
            android.util.Log.v(r1, r0)
        L_0x001c:
            return
        L_0x001d:
            r2 = 0
            r4 = 1
            r14.A01 = r4     // Catch:{ all -> 0x0930 }
        L_0x0021:
            X.01A r3 = r14.A02     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0H     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x06b6
            int r7 = r3.A03     // Catch:{ all -> 0x0930 }
        L_0x0029:
            int r0 = r3.A03     // Catch:{ all -> 0x0930 }
            if (r7 == r0) goto L_0x08d6
            if (r7 <= r0) goto L_0x03af
            int r0 = r0 + 1
            switch(r0) {
                case 0: goto L_0x01df;
                case 1: goto L_0x01b2;
                case 2: goto L_0x02d9;
                case 3: goto L_0x0132;
                case 4: goto L_0x02a9;
                case 5: goto L_0x00e6;
                case 6: goto L_0x02a6;
                case 7: goto L_0x0035;
                default: goto L_0x0034;
            }     // Catch:{ all -> 0x0930 }
        L_0x0034:
            goto L_0x0021
        L_0x0035:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0044:
            X.0PD r0 = r3.A0C     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x009c
            android.view.View r8 = r0.A06     // Catch:{ all -> 0x0930 }
            if (r8 == 0) goto L_0x009c
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r8 == r0) goto L_0x005f
            android.view.ViewParent r5 = r8.getParent()     // Catch:{ all -> 0x0930 }
        L_0x0054:
            if (r5 == 0) goto L_0x009c
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r5 == r0) goto L_0x005f
            android.view.ViewParent r5 = r5.getParent()     // Catch:{ all -> 0x0930 }
            goto L_0x0054
        L_0x005f:
            boolean r7 = r8.requestFocus()     // Catch:{ all -> 0x0930 }
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "requestFocus: Restoring focused view "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r5.append(r8)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " "
            r5.append(r0)     // Catch:{ all -> 0x0930 }
            if (r7 == 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            java.lang.String r0 = "failed"
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = "succeeded"
        L_0x007f:
            r5.append(r0)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " on Fragment "
            r5.append(r0)     // Catch:{ all -> 0x0930 }
            r5.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r0.findFocus()     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r5)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x009c:
            r7 = 0
            X.0PD r0 = r3.A08()     // Catch:{ all -> 0x0930 }
            r0.A06 = r7     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0H()     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0m(r4)     // Catch:{ all -> 0x0930 }
            r0 = 7
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A14()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x07ab
            X.04p r0 = r3.A0K     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_RESUME     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x00cb
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x00cb:
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r5.A0P = r2     // Catch:{ all -> 0x0930 }
            r5.A0Q = r2     // Catch:{ all -> 0x0930 }
            X.07K r0 = r5.A0A     // Catch:{ all -> 0x0930 }
            r0.A01 = r2     // Catch:{ all -> 0x0930 }
            r0 = 7
            r5.A0O(r0)     // Catch:{ all -> 0x0930 }
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A0A(r3)     // Catch:{ all -> 0x0930 }
            r3.A06 = r7     // Catch:{ all -> 0x0930 }
            r3.A08 = r7     // Catch:{ all -> 0x0930 }
            r3.A07 = r7     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x00e6:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "moveto STARTED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x00f5:
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0H()     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0m(r4)     // Catch:{ all -> 0x0930 }
            r0 = 5
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0q()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x07c0
            X.04p r0 = r3.A0K     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_START     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x011d
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x011d:
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r5.A0P = r2     // Catch:{ all -> 0x0930 }
            r5.A0Q = r2     // Catch:{ all -> 0x0930 }
            X.07K r0 = r5.A0A     // Catch:{ all -> 0x0930 }
            r0.A01 = r2     // Catch:{ all -> 0x0930 }
            r0 = 5
            r5.A0O(r0)     // Catch:{ all -> 0x0930 }
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A0B(r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x0132:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0141:
            android.os.Bundle r5 = r3.A06     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0H()     // Catch:{ all -> 0x0930 }
            r0 = 3
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0n(r5)     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x07ea
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = "moveto RESTORE_VIEW_STATE: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0163:
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x0198
            android.os.Bundle r8 = r3.A06     // Catch:{ all -> 0x0930 }
            android.util.SparseArray r0 = r3.A08     // Catch:{ all -> 0x0930 }
            r7 = 0
            if (r0 == 0) goto L_0x0173
            r5.restoreHierarchyState(r0)     // Catch:{ all -> 0x0930 }
            r3.A08 = r7     // Catch:{ all -> 0x0930 }
        L_0x0173:
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0182
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            android.os.Bundle r5 = r3.A07     // Catch:{ all -> 0x0930 }
            X.05O r0 = r0.A02     // Catch:{ all -> 0x0930 }
            r0.A01(r5)     // Catch:{ all -> 0x0930 }
            r3.A07 = r7     // Catch:{ all -> 0x0930 }
        L_0x0182:
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0l(r8)     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x07d5
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0198
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_CREATE     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x0198:
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x0930 }
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r5.A0P = r2     // Catch:{ all -> 0x0930 }
            r5.A0Q = r2     // Catch:{ all -> 0x0930 }
            X.07K r0 = r5.A0A     // Catch:{ all -> 0x0930 }
            r0.A01 = r2     // Catch:{ all -> 0x0930 }
            r0 = 4
            r5.A0O(r0)     // Catch:{ all -> 0x0930 }
            X.04y r5 = r14.A03     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r5.A01(r0, r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x01b2:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = "moveto CREATED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x01c1:
            boolean r0 = r3.A0d     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x01d8
            X.04y r5 = r14.A03     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r5.A03(r0, r3)     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r3.A0Q(r0)     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r5.A02(r0, r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x01d8:
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r3.A0S(r0)     // Catch:{ all -> 0x0930 }
            goto L_0x04af
        L_0x01df:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = "moveto ATTACHED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x01ee:
            X.01A r5 = r3.A0E     // Catch:{ all -> 0x0930 }
            java.lang.String r7 = " that does not belong to this FragmentManager!"
            java.lang.String r8 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            r9 = 0
            if (r5 == 0) goto L_0x0237
            X.065 r0 = r14.A04     // Catch:{ all -> 0x0930 }
            java.lang.String r5 = r5.A0T     // Catch:{ all -> 0x0930 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0930 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0930 }
            X.0WQ r5 = (X.AnonymousClass0WQ) r5     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x0812
            X.01A r0 = r3.A0E     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r0.A0T     // Catch:{ all -> 0x0930 }
            r3.A0S = r0     // Catch:{ all -> 0x0930 }
            r3.A0E = r9     // Catch:{ all -> 0x0930 }
        L_0x020f:
            r5.A04()     // Catch:{ all -> 0x0930 }
        L_0x0212:
            X.02C r5 = r3.A0H     // Catch:{ all -> 0x0930 }
            X.061 r0 = r5.A07     // Catch:{ all -> 0x0930 }
            r3.A0F = r0     // Catch:{ all -> 0x0930 }
            X.01A r0 = r5.A05     // Catch:{ all -> 0x0930 }
            r3.A0D = r0     // Catch:{ all -> 0x0930 }
            X.04y r8 = r14.A03     // Catch:{ all -> 0x0930 }
            r8.A09(r3)     // Catch:{ all -> 0x0930 }
            java.util.ArrayList r7 = r3.A0k     // Catch:{ all -> 0x0930 }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x0930 }
        L_0x0227:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x025f
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0930 }
            X.0Po r0 = (X.C05170Po) r0     // Catch:{ all -> 0x0930 }
            r0.A00()     // Catch:{ all -> 0x0930 }
            goto L_0x0227
        L_0x0237:
            java.lang.String r5 = r3.A0S     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x0212
            X.065 r0 = r14.A04     // Catch:{ all -> 0x0930 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0930 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0930 }
            X.0WQ r5 = (X.AnonymousClass0WQ) r5     // Catch:{ all -> 0x0930 }
            if (r5 != 0) goto L_0x020f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r10)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            r1.append(r8)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0S     // Catch:{ all -> 0x0930 }
            r1.append(r0)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ all -> 0x0930 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x025f:
            r7.clear()     // Catch:{ all -> 0x0930 }
            X.02C r7 = r3.A0G     // Catch:{ all -> 0x0930 }
            X.061 r5 = r3.A0F     // Catch:{ all -> 0x0930 }
            X.062 r0 = r3.A0E()     // Catch:{ all -> 0x0930 }
            r7.A0a(r3, r5, r0)     // Catch:{ all -> 0x0930 }
            r3.A03 = r2     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            X.061 r0 = r3.A0F     // Catch:{ all -> 0x0930 }
            android.content.Context r0 = r0.A01     // Catch:{ all -> 0x0930 }
            r3.A16(r0)     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x07ff
            X.02C r7 = r3.A0H     // Catch:{ all -> 0x0930 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.A0Z     // Catch:{ all -> 0x0930 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0930 }
        L_0x0284:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0294
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0930 }
            X.063 r0 = (X.AnonymousClass063) r0     // Catch:{ all -> 0x0930 }
            r0.AMh(r3, r7)     // Catch:{ all -> 0x0930 }
            goto L_0x0284
        L_0x0294:
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r5.A0P = r2     // Catch:{ all -> 0x0930 }
            r5.A0Q = r2     // Catch:{ all -> 0x0930 }
            X.07K r0 = r5.A0A     // Catch:{ all -> 0x0930 }
            r0.A01 = r2     // Catch:{ all -> 0x0930 }
            r5.A0O(r2)     // Catch:{ all -> 0x0930 }
            r8.A05(r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x02a6:
            r0 = 6
            goto L_0x0664
        L_0x02a9:
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x02d6
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x02d6
            r3.A0G()     // Catch:{ all -> 0x0930 }
            X.0V5 r7 = X.AnonymousClass0V5.A01(r0)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0930 }
            X.0Kg r5 = X.C03890Kg.A00(r0)     // Catch:{ all -> 0x0930 }
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = "SpecialEffectsController: Enqueuing add operation for fragment "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x02d1:
            X.0Ji r0 = X.C03650Ji.ADDING     // Catch:{ all -> 0x0930 }
            r7.A06(r14, r0, r5)     // Catch:{ all -> 0x0930 }
        L_0x02d6:
            r0 = 4
            goto L_0x0664
        L_0x02d9:
            r14.A03()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x0021
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = "moveto CREATE_VIEW: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x02ef:
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            android.view.LayoutInflater r8 = r3.A0v(r0)     // Catch:{ all -> 0x0930 }
            r3.A09 = r8     // Catch:{ all -> 0x0930 }
            r7 = 0
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x02fe
            r7 = r0
            goto L_0x0317
        L_0x02fe:
            int r5 = r3.A01     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x0317
            r0 = -1
            if (r5 == r0) goto L_0x0859
            X.02C r0 = r3.A0H     // Catch:{ all -> 0x0930 }
            X.062 r0 = r0.A08     // Catch:{ all -> 0x0930 }
            android.view.View r7 = r0.A00(r5)     // Catch:{ all -> 0x0930 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x0930 }
            if (r7 != 0) goto L_0x0317
            boolean r0 = r3.A0h     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x0317
            goto L_0x082a
        L_0x0317:
            r3.A0B = r7     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r3.A0U(r0, r8, r7)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06b2
            r0.setSaveFromParentEnabled(r2)     // Catch:{ all -> 0x0930 }
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            r0 = 2131363777(0x7f0a07c1, float:1.8347372E38)
            r5.setTag(r0, r3)     // Catch:{ all -> 0x0930 }
            if (r7 == 0) goto L_0x0332
            r14.A02()     // Catch:{ all -> 0x0930 }
        L_0x0332:
            boolean r0 = r3.A0a     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x033d
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            r0 = 8
            r5.setVisibility(r0)     // Catch:{ all -> 0x0930 }
        L_0x033d:
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            boolean r0 = X.C004601z.A0t(r0)     // Catch:{ all -> 0x0930 }
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0376
            X.C004601z.A0T(r5)     // Catch:{ all -> 0x0930 }
        L_0x034a:
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r3.A18(r0, r5)     // Catch:{ all -> 0x0930 }
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0O(r6)     // Catch:{ all -> 0x0930 }
            X.04y r7 = r14.A03     // Catch:{ all -> 0x0930 }
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            android.os.Bundle r0 = r3.A06     // Catch:{ all -> 0x0930 }
            r7.A00(r0, r5, r3)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            int r7 = r0.getVisibility()     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            float r5 = r0.getAlpha()     // Catch:{ all -> 0x0930 }
            X.0PD r0 = r3.A08()     // Catch:{ all -> 0x0930 }
            r0.A00 = r5     // Catch:{ all -> 0x0930 }
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06b2
            goto L_0x037f
        L_0x0376:
            X.0Yc r0 = new X.0Yc     // Catch:{ all -> 0x0930 }
            r0.<init>(r5, r14)     // Catch:{ all -> 0x0930 }
            r5.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0930 }
            goto L_0x034a
        L_0x037f:
            if (r7 != 0) goto L_0x06b2
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            android.view.View r7 = r0.findFocus()     // Catch:{ all -> 0x0930 }
            if (r7 == 0) goto L_0x03a7
            X.0PD r0 = r3.A08()     // Catch:{ all -> 0x0930 }
            r0.A06 = r7     // Catch:{ all -> 0x0930 }
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x03a7
            java.lang.String r0 = "requestFocus: Saved focused view "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r5.append(r7)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " for Fragment "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r5)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x03a7:
            android.view.View r5 = r3.A0A     // Catch:{ all -> 0x0930 }
            r0 = 0
            r5.setAlpha(r0)     // Catch:{ all -> 0x0930 }
            goto L_0x06b2
        L_0x03af:
            int r0 = r0 + -1
            switch(r0) {
                case -1: goto L_0x05ba;
                case 0: goto L_0x04b3;
                case 1: goto L_0x0434;
                case 2: goto L_0x06b0;
                case 3: goto L_0x0668;
                case 4: goto L_0x03f2;
                case 5: goto L_0x0663;
                case 6: goto L_0x03b6;
                default: goto L_0x03b4;
            }     // Catch:{ all -> 0x0930 }
        L_0x03b4:
            goto L_0x0021
        L_0x03b6:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x03c5
            java.lang.String r0 = "movefrom RESUMED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x03c5:
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0 = 5
            r5.A0O(r0)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x03d8
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_PAUSE     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x03d8:
            X.04p r5 = r3.A0K     // Catch:{ all -> 0x0930 }
            X.05n r0 = X.C011405n.ON_PAUSE     // Catch:{ all -> 0x0930 }
            r5.A04(r0)     // Catch:{ all -> 0x0930 }
            r0 = 6
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0w()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x086d
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A08(r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x03f2:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0401
            java.lang.String r0 = "movefrom STARTED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0401:
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            r5.A0Q = r4     // Catch:{ all -> 0x0930 }
            X.07K r0 = r5.A0A     // Catch:{ all -> 0x0930 }
            r0.A01 = r4     // Catch:{ all -> 0x0930 }
            r0 = 4
            r5.A0O(r0)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x041a
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_STOP     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x041a:
            X.04p r5 = r3.A0K     // Catch:{ all -> 0x0930 }
            X.05n r0 = X.C011405n.ON_STOP     // Catch:{ all -> 0x0930 }
            r5.A04(r0)     // Catch:{ all -> 0x0930 }
            r0 = 4
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A15()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0882
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A0C(r3)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x0434:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0443
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0443:
            android.view.ViewGroup r5 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x044e
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x044e
            r5.removeView(r0)     // Catch:{ all -> 0x0930 }
        L_0x044e:
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0O(r4)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0471
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            r0.A00()     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            X.05f r5 = r0.A02     // Catch:{ all -> 0x0930 }
            X.05f r0 = X.C011005f.CREATED     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.A00(r0)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0471
            X.0bv r0 = r3.A0I     // Catch:{ all -> 0x0930 }
            X.05n r5 = X.C011405n.ON_DESTROY     // Catch:{ all -> 0x0930 }
            X.04p r0 = r0.A00     // Catch:{ all -> 0x0930 }
            r0.A04(r5)     // Catch:{ all -> 0x0930 }
        L_0x0471:
            r3.A03 = r4     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A13()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0897
            X.05a r5 = r3.AGy()     // Catch:{ all -> 0x0930 }
            X.0Rw r0 = new X.0Rw     // Catch:{ all -> 0x0930 }
            r0.<init>(r3, r5)     // Catch:{ all -> 0x0930 }
            X.0F5 r0 = r0.A01     // Catch:{ all -> 0x0930 }
            X.07U r8 = r0.A00     // Catch:{ all -> 0x0930 }
            int r7 = r8.A00     // Catch:{ all -> 0x0930 }
            r5 = 0
        L_0x048c:
            if (r5 >= r7) goto L_0x049a
            java.lang.Object[] r0 = r8.A02     // Catch:{ all -> 0x0930 }
            r0 = r0[r5]     // Catch:{ all -> 0x0930 }
            X.0F4 r0 = (X.AnonymousClass0F4) r0     // Catch:{ all -> 0x0930 }
            r0.A0D()     // Catch:{ all -> 0x0930 }
            int r5 = r5 + 1
            goto L_0x048c
        L_0x049a:
            r3.A0f = r2     // Catch:{ all -> 0x0930 }
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A0D(r3)     // Catch:{ all -> 0x0930 }
            r5 = 0
            r3.A0B = r5     // Catch:{ all -> 0x0930 }
            r3.A0A = r5     // Catch:{ all -> 0x0930 }
            r3.A0I = r5     // Catch:{ all -> 0x0930 }
            X.027 r0 = r3.A0L     // Catch:{ all -> 0x0930 }
            r0.A0B(r5)     // Catch:{ all -> 0x0930 }
            r3.A0c = r2     // Catch:{ all -> 0x0930 }
        L_0x04af:
            r3.A03 = r4     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x04b3:
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x04c2
            java.lang.String r0 = "movefrom CREATED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x04c2:
            boolean r0 = r3.A0g     // Catch:{ all -> 0x0930 }
            r7 = 1
            if (r0 == 0) goto L_0x04cc
            int r0 = r3.A00     // Catch:{ all -> 0x0930 }
            r10 = 1
            if (r0 <= 0) goto L_0x04ff
        L_0x04cc:
            r10 = 0
            X.065 r9 = r14.A04     // Catch:{ all -> 0x0930 }
            X.07K r8 = r9.A00     // Catch:{ all -> 0x0930 }
            java.util.HashMap r5 = r8.A03     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.containsKey(r0)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x04ff
            boolean r0 = r8.A05     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x04ff
            boolean r0 = r8.A00     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x04ff
            java.lang.String r5 = r3.A0S     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x04fb
            java.util.HashMap r0 = r9.A02     // Catch:{ all -> 0x0930 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0930 }
            X.0WQ r0 = (X.AnonymousClass0WQ) r0     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x04fb
            X.01A r5 = r0.A02     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x04fb
            boolean r0 = r5.A0i     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x04fb
            r3.A0E = r5     // Catch:{ all -> 0x0930 }
        L_0x04fb:
            r3.A03 = r2     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x04ff:
            X.061 r5 = r3.A0F     // Catch:{ all -> 0x0930 }
            boolean r0 = r5 instanceof X.C001500q     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x050c
            X.065 r0 = r14.A04     // Catch:{ all -> 0x0930 }
            X.07K r0 = r0.A00     // Catch:{ all -> 0x0930 }
            boolean r7 = r0.A00     // Catch:{ all -> 0x0930 }
            goto L_0x051a
        L_0x050c:
            android.content.Context r5 = r5.A01     // Catch:{ all -> 0x0930 }
            boolean r0 = r5 instanceof android.app.Activity     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x051a
            android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.isChangingConfigurations()     // Catch:{ all -> 0x0930 }
            r7 = r0 ^ 1
        L_0x051a:
            if (r10 != 0) goto L_0x051e
            if (r7 == 0) goto L_0x0559
        L_0x051e:
            X.065 r0 = r14.A04     // Catch:{ all -> 0x0930 }
            X.07K r7 = r0.A00     // Catch:{ all -> 0x0930 }
            boolean r0 = X.AnonymousClass02C.A01()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0531
            java.lang.String r0 = "Clearing non-config state for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0531:
            java.util.HashMap r5 = r7.A02     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0930 }
            X.07K r0 = (X.AnonymousClass07K) r0     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0545
            r0.A04()     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            r5.remove(r0)     // Catch:{ all -> 0x0930 }
        L_0x0545:
            java.util.HashMap r5 = r7.A04     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0930 }
            X.05a r0 = (X.C010505a) r0     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0559
            r0.A00()     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            r5.remove(r0)     // Catch:{ all -> 0x0930 }
        L_0x0559:
            X.02C r0 = r3.A0G     // Catch:{ all -> 0x0930 }
            r0.A0G()     // Catch:{ all -> 0x0930 }
            X.04p r5 = r3.A0K     // Catch:{ all -> 0x0930 }
            X.05n r0 = X.C011405n.ON_DESTROY     // Catch:{ all -> 0x0930 }
            r5.A04(r0)     // Catch:{ all -> 0x0930 }
            r3.A03 = r2     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0d = r2     // Catch:{ all -> 0x0930 }
            r3.A12()     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x08ac
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A06(r3)     // Catch:{ all -> 0x0930 }
            X.065 r8 = r14.A04     // Catch:{ all -> 0x0930 }
            java.util.List r0 = r8.A01()     // Catch:{ all -> 0x0930 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0930 }
        L_0x0581:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x05a1
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0930 }
            X.0WQ r0 = (X.AnonymousClass0WQ) r0     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0581
            X.01A r7 = r0.A02     // Catch:{ all -> 0x0930 }
            java.lang.String r5 = r3.A0T     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r7.A0S     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0581
            r7.A0E = r3     // Catch:{ all -> 0x0930 }
            r0 = 0
            r7.A0S = r0     // Catch:{ all -> 0x0930 }
            goto L_0x0581
        L_0x05a1:
            java.lang.String r5 = r3.A0S     // Catch:{ all -> 0x0930 }
            if (r5 == 0) goto L_0x05b3
            java.util.HashMap r0 = r8.A02     // Catch:{ all -> 0x0930 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0930 }
            X.0WQ r0 = (X.AnonymousClass0WQ) r0     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x05b8
            X.01A r0 = r0.A02     // Catch:{ all -> 0x0930 }
        L_0x05b1:
            r3.A0E = r0     // Catch:{ all -> 0x0930 }
        L_0x05b3:
            r8.A05(r14)     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x05b8:
            r0 = 0
            goto L_0x05b1
        L_0x05ba:
            r8 = 3
            boolean r0 = X.AnonymousClass02C.A02(r8)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x05ca
            java.lang.String r0 = "movefrom ATTACHED: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x05ca:
            r0 = -1
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r3.A0V = r2     // Catch:{ all -> 0x0930 }
            r3.A0k()     // Catch:{ all -> 0x0930 }
            r0 = 0
            r3.A09 = r0     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x08c1
            X.02C r5 = r3.A0G     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.A0L     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x05e9
            r5.A0G()     // Catch:{ all -> 0x0930 }
            X.064 r0 = new X.064     // Catch:{ all -> 0x0930 }
            r0.<init>()     // Catch:{ all -> 0x0930 }
            r3.A0G = r0     // Catch:{ all -> 0x0930 }
        L_0x05e9:
            X.04y r0 = r14.A03     // Catch:{ all -> 0x0930 }
            r0.A07(r3)     // Catch:{ all -> 0x0930 }
            r0 = -1
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            r0 = 0
            r3.A0F = r0     // Catch:{ all -> 0x0930 }
            r3.A0D = r0     // Catch:{ all -> 0x0930 }
            r3.A0H = r0     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0g     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0600
            int r0 = r3.A00     // Catch:{ all -> 0x0930 }
            if (r0 <= 0) goto L_0x0616
        L_0x0600:
            X.065 r0 = r14.A04     // Catch:{ all -> 0x0930 }
            X.07K r7 = r0.A00     // Catch:{ all -> 0x0930 }
            java.util.HashMap r5 = r7.A03     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x0930 }
            boolean r0 = r5.containsKey(r0)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0616
            boolean r0 = r7.A05     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0616
            boolean r0 = r7.A00     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0021
        L_0x0616:
            boolean r0 = X.AnonymousClass02C.A02(r8)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0625
            java.lang.String r0 = "initState called for fragment: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0625:
            X.04p r0 = new X.04p     // Catch:{ all -> 0x0930 }
            r0.<init>(r3)     // Catch:{ all -> 0x0930 }
            r3.A0K = r0     // Catch:{ all -> 0x0930 }
            X.05O r0 = new X.05O     // Catch:{ all -> 0x0930 }
            r0.<init>(r3)     // Catch:{ all -> 0x0930 }
            r3.A0N = r0     // Catch:{ all -> 0x0930 }
            r5 = 0
            r3.A0M = r5     // Catch:{ all -> 0x0930 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0930 }
            r3.A0T = r0     // Catch:{ all -> 0x0930 }
            r3.A0U = r2     // Catch:{ all -> 0x0930 }
            r3.A0g = r2     // Catch:{ all -> 0x0930 }
            r3.A0Y = r2     // Catch:{ all -> 0x0930 }
            r3.A0c = r2     // Catch:{ all -> 0x0930 }
            r3.A0h = r2     // Catch:{ all -> 0x0930 }
            r3.A00 = r2     // Catch:{ all -> 0x0930 }
            r3.A0H = r5     // Catch:{ all -> 0x0930 }
            X.064 r0 = new X.064     // Catch:{ all -> 0x0930 }
            r0.<init>()     // Catch:{ all -> 0x0930 }
            r3.A0G = r0     // Catch:{ all -> 0x0930 }
            r3.A0F = r5     // Catch:{ all -> 0x0930 }
            r3.A02 = r2     // Catch:{ all -> 0x0930 }
            r3.A01 = r2     // Catch:{ all -> 0x0930 }
            r3.A0R = r5     // Catch:{ all -> 0x0930 }
            r3.A0a = r2     // Catch:{ all -> 0x0930 }
            r3.A0X = r2     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x0663:
            r0 = 5
        L_0x0664:
            r3.A03 = r0     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x0668:
            r8 = 3
            boolean r0 = X.AnonymousClass02C.A02(r8)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x067c
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = "movefrom ACTIVITY_CREATED: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r5)     // Catch:{ all -> 0x0930 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x067c:
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0687
            android.util.SparseArray r0 = r3.A08     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x0687
            r14.A05()     // Catch:{ all -> 0x0930 }
        L_0x0687:
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06ac
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06ac
            r3.A0G()     // Catch:{ all -> 0x0930 }
            X.0V5 r7 = X.AnonymousClass0V5.A01(r0)     // Catch:{ all -> 0x0930 }
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06a5
            java.lang.String r0 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x06a5:
            X.0Kg r5 = X.C03890Kg.REMOVED     // Catch:{ all -> 0x0930 }
            X.0Ji r0 = X.C03650Ji.REMOVING     // Catch:{ all -> 0x0930 }
            r7.A06(r14, r0, r5)     // Catch:{ all -> 0x0930 }
        L_0x06ac:
            r3.A03 = r8     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x06b0:
            r3.A0c = r2     // Catch:{ all -> 0x0930 }
        L_0x06b2:
            r3.A03 = r6     // Catch:{ all -> 0x0930 }
            goto L_0x0021
        L_0x06b6:
            int r7 = r14.A00     // Catch:{ all -> 0x0930 }
            r11 = r7
            X.05f r0 = r3.A0J     // Catch:{ all -> 0x0930 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0930 }
            r9 = -1
            r8 = 5
            r10 = 3
            r5 = 4
            switch(r0) {
                case 1: goto L_0x0753;
                case 2: goto L_0x074d;
                case 3: goto L_0x0747;
                case 4: goto L_0x06ca;
                default: goto L_0x06c6;
            }     // Catch:{ all -> 0x0930 }
        L_0x06c6:
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ all -> 0x0930 }
        L_0x06ca:
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06e4
            boolean r0 = r3.A0c     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0739
            int r7 = java.lang.Math.max(r11, r6)     // Catch:{ all -> 0x0930 }
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06e4
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x06e4
            int r7 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x0930 }
        L_0x06e4:
            boolean r0 = r3.A0U     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x06ec
            int r7 = java.lang.Math.min(r7, r4)     // Catch:{ all -> 0x0930 }
        L_0x06ec:
            r11 = 0
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0761
            r3.A0G()     // Catch:{ all -> 0x0930 }
            X.0V5 r12 = X.AnonymousClass0V5.A01(r0)     // Catch:{ all -> 0x0930 }
            java.util.ArrayList r0 = r12.A03     // Catch:{ all -> 0x0930 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0930 }
        L_0x06fe:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0737
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0930 }
            X.0S3 r11 = (X.AnonymousClass0S3) r11     // Catch:{ all -> 0x0930 }
            X.01A r0 = r11.A04     // Catch:{ all -> 0x0930 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x06fe
            boolean r0 = r11.A02     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x06fe
            X.0Ji r11 = r11.A00     // Catch:{ all -> 0x0930 }
        L_0x0718:
            java.util.ArrayList r0 = r12.A04     // Catch:{ all -> 0x0930 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0930 }
        L_0x071e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0761
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0930 }
            X.0S3 r12 = (X.AnonymousClass0S3) r12     // Catch:{ all -> 0x0930 }
            X.01A r0 = r12.A04     // Catch:{ all -> 0x0930 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x071e
            boolean r0 = r12.A02     // Catch:{ all -> 0x0930 }
            if (r0 != 0) goto L_0x071e
            goto L_0x0759
        L_0x0737:
            r11 = 0
            goto L_0x0718
        L_0x0739:
            if (r11 >= r5) goto L_0x0742
            int r0 = r3.A03     // Catch:{ all -> 0x0930 }
            int r7 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0930 }
            goto L_0x06e4
        L_0x0742:
            int r7 = java.lang.Math.min(r7, r4)     // Catch:{ all -> 0x0930 }
            goto L_0x06e4
        L_0x0747:
            int r7 = java.lang.Math.min(r7, r8)     // Catch:{ all -> 0x0930 }
            goto L_0x06ca
        L_0x074d:
            int r7 = java.lang.Math.min(r7, r4)     // Catch:{ all -> 0x0930 }
            goto L_0x06ca
        L_0x0753:
            int r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x0930 }
            goto L_0x06ca
        L_0x0759:
            if (r11 == 0) goto L_0x075f
            X.0Ji r0 = X.C03650Ji.NONE     // Catch:{ all -> 0x0930 }
            if (r11 != r0) goto L_0x0761
        L_0x075f:
            X.0Ji r11 = r12.A00     // Catch:{ all -> 0x0930 }
        L_0x0761:
            X.0Ji r0 = X.C03650Ji.ADDING     // Catch:{ all -> 0x0930 }
            if (r11 != r0) goto L_0x0790
            r0 = 6
            int r7 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0930 }
        L_0x076a:
            boolean r0 = r3.A0W     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0776
            int r0 = r3.A03     // Catch:{ all -> 0x0930 }
            if (r0 >= r8) goto L_0x0776
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0930 }
        L_0x0776:
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r5.append(r7)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " for "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r5)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
            goto L_0x0029
        L_0x0790:
            X.0Ji r0 = X.C03650Ji.REMOVING     // Catch:{ all -> 0x0930 }
            if (r11 != r0) goto L_0x0799
            int r7 = java.lang.Math.max(r7, r10)     // Catch:{ all -> 0x0930 }
            goto L_0x076a
        L_0x0799:
            boolean r0 = r3.A0g     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x076a
            int r0 = r3.A00     // Catch:{ all -> 0x0930 }
            if (r0 <= 0) goto L_0x07a6
            int r7 = java.lang.Math.min(r7, r4)     // Catch:{ all -> 0x0930 }
            goto L_0x076a
        L_0x07a6:
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ all -> 0x0930 }
            goto L_0x076a
        L_0x07ab:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onResume()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x07c0:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onStart()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x07d5:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onViewStateRestored()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x07ea:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onActivityCreated()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x07ff:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r10)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onAttach()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x0812:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r10)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            r1.append(r8)     // Catch:{ all -> 0x0930 }
            X.01A r0 = r3.A0E     // Catch:{ all -> 0x0930 }
            r1.append(r0)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ all -> 0x0930 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x082a:
            android.content.Context r0 = r3.A02()     // Catch:{ NotFoundException -> 0x0839 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x0839 }
            int r0 = r3.A01     // Catch:{ NotFoundException -> 0x0839 }
            java.lang.String r4 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0839 }
            goto L_0x083b
        L_0x0839:
            java.lang.String r4 = "unknown"
        L_0x083b:
            java.lang.String r0 = "No view found for id 0x"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            int r0 = r3.A01     // Catch:{ all -> 0x0930 }
            X.AnonymousClass000.A1J(r1, r0)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r4)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = ") for fragment "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r1)     // Catch:{ all -> 0x0930 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x0859:
            java.lang.String r0 = "Cannot create fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " for a container view with no id"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x086d:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onPause()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x0882:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onStop()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x0897:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onDestroyView()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x08ac:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onDestroy()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x08c1:
            java.lang.String r0 = "Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0930 }
            r1.append(r3)     // Catch:{ all -> 0x0930 }
            java.lang.String r0 = " did not call through to super.onDetach()"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0930 }
            X.0BY r0 = new X.0BY     // Catch:{ all -> 0x0930 }
            r0.<init>(r1)     // Catch:{ all -> 0x0930 }
            throw r0     // Catch:{ all -> 0x0930 }
        L_0x08d6:
            boolean r0 = r3.A0b     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x092d
            android.view.View r0 = r3.A0A     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0903
            android.view.ViewGroup r0 = r3.A0B     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0903
            r3.A0G()     // Catch:{ all -> 0x0930 }
            X.0V5 r5 = X.AnonymousClass0V5.A01(r0)     // Catch:{ all -> 0x0930 }
            boolean r0 = r3.A0a     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0916
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x08fc
            java.lang.String r0 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x08fc:
            X.0Kg r1 = X.C03890Kg.GONE     // Catch:{ all -> 0x0930 }
            X.0Ji r0 = X.C03650Ji.NONE     // Catch:{ all -> 0x0930 }
            r5.A06(r14, r0, r1)     // Catch:{ all -> 0x0930 }
        L_0x0903:
            X.02C r1 = r3.A0H     // Catch:{ all -> 0x0930 }
            if (r1 == 0) goto L_0x0913
            boolean r0 = r3.A0U     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0913
            boolean r0 = X.AnonymousClass02C.A03(r3)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0913
            r1.A0O = r4     // Catch:{ all -> 0x0930 }
        L_0x0913:
            r3.A0b = r2     // Catch:{ all -> 0x0930 }
            goto L_0x092d
        L_0x0916:
            boolean r0 = X.AnonymousClass02C.A02(r6)     // Catch:{ all -> 0x0930 }
            if (r0 == 0) goto L_0x0925
            java.lang.String r0 = "SpecialEffectsController: Enqueuing show operation for fragment "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ all -> 0x0930 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0930 }
        L_0x0925:
            X.0Kg r1 = X.C03890Kg.VISIBLE     // Catch:{ all -> 0x0930 }
            X.0Ji r0 = X.C03650Ji.NONE     // Catch:{ all -> 0x0930 }
            r5.A06(r14, r0, r1)     // Catch:{ all -> 0x0930 }
            goto L_0x0903
        L_0x092d:
            r14.A01 = r2
            return
        L_0x0930:
            r0 = move-exception
            r14.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WQ.A04():void");
    }

    public void A05() {
        AnonymousClass01A r2 = this.A02;
        View view = r2.A0A;
        if (view != null) {
            SparseArray sparseArray = new SparseArray();
            view.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                r2.A08 = sparseArray;
            }
            Bundle bundle = new Bundle();
            r2.A0I.A02.A02(bundle);
            if (!bundle.isEmpty()) {
                r2.A07 = bundle;
            }
        }
    }

    public void A06(ClassLoader classLoader) {
        boolean z2;
        AnonymousClass01A r3 = this.A02;
        Bundle bundle = r3.A06;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            r3.A08 = r3.A06.getSparseParcelableArray("android:view_state");
            r3.A07 = r3.A06.getBundle("android:view_registry_state");
            String string = r3.A06.getString("android:target_state");
            r3.A0S = string;
            if (string != null) {
                r3.A04 = r3.A06.getInt("android:target_req_state", 0);
            }
            Boolean bool = r3.A0P;
            if (bool != null) {
                z2 = bool.booleanValue();
                r3.A0j = z2;
                r3.A0P = null;
            } else {
                z2 = r3.A06.getBoolean("android:user_visible_hint", true);
                r3.A0j = z2;
            }
            if (!z2) {
                r3.A0W = true;
            }
        }
    }
}
