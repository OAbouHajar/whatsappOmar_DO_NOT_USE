package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment$5;
import com.facebook.redex.IDxObserverShape112S0100000_I1;
import com.obwhatsapp.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.01A  reason: invalid class name */
public class AnonymousClass01A implements C001300o, C001500q, C001600r, C001900u, ComponentCallbacks, View.OnCreateContextMenuListener, C002100w {
    public static final Object A0m = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04;
    public Bundle A05;
    public Bundle A06;
    public Bundle A07;
    public SparseArray A08;
    public LayoutInflater A09;
    public View A0A;
    public ViewGroup A0B;
    public AnonymousClass0PD A0C;
    public AnonymousClass01A A0D;
    public AnonymousClass01A A0E;
    public AnonymousClass061 A0F;
    public AnonymousClass02C A0G = new AnonymousClass064();
    public AnonymousClass02C A0H;
    public C07490bv A0I;
    public C011005f A0J = C011005f.RESUMED;
    public C009604p A0K = new C009604p(this);
    public AnonymousClass027 A0L = new AnonymousClass027();
    public AnonymousClass04o A0M = null;
    public AnonymousClass05O A0N = new AnonymousClass05O(this);
    public Boolean A0O = null;
    public Boolean A0P;
    public Runnable A0Q = new AnonymousClass09O(this);
    public String A0R;
    public String A0S = null;
    public String A0T = UUID.randomUUID().toString();
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e = true;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j = true;
    public final ArrayList A0k = new ArrayList();
    public final AtomicInteger A0l = new AtomicInteger();

    public static void A00(C001300o r1, AnonymousClass028 r2, int i2) {
        r2.A0A(r1, new IDxObserverShape112S0100000_I1(r1, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r2 = this;
            X.05f r1 = r2.A0J
            X.05f r0 = X.C011005f.INITIALIZED
            if (r1 == r0) goto L_0x0017
            X.01A r0 = r2.A0D
            if (r0 == 0) goto L_0x0017
            int r1 = r1.ordinal()
            int r0 = r0.A01()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L_0x0017:
            int r0 = r1.ordinal()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A01():int");
    }

    public final Context A02() {
        Context A0u = A0u();
        if (A0u != null) {
            return A0u;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final Resources A03() {
        return A02().getResources();
    }

    public final Bundle A04() {
        Bundle bundle = this.A05;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final LayoutInflater A05() {
        LayoutInflater layoutInflater = this.A09;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater A0v = A0v((Bundle) null);
        this.A09 = A0v;
        return A0v;
    }

    public final View A06() {
        View view = this.A0A;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public final C011105i A07(AnonymousClass05g r8, AnonymousClass05h r9) {
        C07070Za r4 = new C07070Za(this);
        if (this.A03 <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C05170Po r1 = new C05170Po(r8, r9, r4, this, atomicReference);
            if (this.A03 >= 0) {
                r1.A00();
            } else {
                this.A0k.add(r1);
            }
            return new AnonymousClass0Cf(r9, this, atomicReference);
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass0PD A08() {
        AnonymousClass0PD r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0PD r02 = new AnonymousClass0PD();
        this.A0C = r02;
        return r02;
    }

    @Deprecated
    public final AnonymousClass01A A09() {
        String str;
        AnonymousClass01A r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass02C r1 = this.A0H;
        if (r1 == null || (str = this.A0S) == null) {
            return null;
        }
        return r1.A0A(str);
    }

    public final AnonymousClass01A A0A() {
        AnonymousClass01A r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        Context A0u = A0u();
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        if (A0u == null) {
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        sb.append(this);
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(A0u());
        throw new IllegalStateException(sb.toString());
    }

    public AnonymousClass01A A0B(String str) {
        return str.equals(this.A0T) ? this : this.A0G.A0U.A00(str);
    }

    public final C001000l A0C() {
        AnonymousClass061 r0 = this.A0F;
        if (r0 == null) {
            return null;
        }
        return (C001000l) r0.A00;
    }

    public final C001000l A0D() {
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            return A0C2;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public AnonymousClass062 A0E() {
        return new C02750Eu(this);
    }

    public final AnonymousClass02C A0F() {
        if (this.A0F != null) {
            return this.A0G;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass02C A0G() {
        AnonymousClass02C r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public C001300o A0H() {
        C07490bv r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final CharSequence A0I(int i2) {
        return A02().getResources().getText(i2);
    }

    public final String A0J(int i2) {
        return A02().getResources().getString(i2);
    }

    public final String A0K(int i2, Object... objArr) {
        return A02().getResources().getString(i2, objArr);
    }

    public void A0L() {
        onLowMemory();
        for (AnonymousClass01A r0 : this.A0G.A0U.A02()) {
            if (r0 != null) {
                r0.A0L();
            }
        }
    }

    public void A0M() {
        ViewGroup viewGroup;
        if (this.A0C != null && A08().A0E) {
            if (this.A0F == null) {
                A08().A0E = false;
            } else if (Looper.myLooper() != this.A0F.A02.getLooper()) {
                this.A0F.A02.postAtFrontOfQueue(new C09450fX(this));
            } else {
                AnonymousClass0PD r1 = this.A0C;
                if (r1 != null) {
                    r1.A0E = false;
                }
                if (this.A0A != null && (viewGroup = this.A0B) != null && this.A0H != null) {
                    AnonymousClass0V5 A012 = AnonymousClass0V5.A01(viewGroup);
                    A012.A04();
                    this.A0F.A02.post(new C09820g8(this, A012));
                }
            }
        }
    }

    public void A0N(int i2, int i3, int i4, int i5) {
        if (this.A0C != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            A08().A01 = i2;
            A08().A02 = i3;
            A08().A04 = i4;
            A08().A05 = i5;
        }
    }

    @Deprecated
    public void A0O(Intent intent, int i2, Bundle bundle) {
        if (this.A0F != null) {
            AnonymousClass02C A0G2 = A0G();
            if (A0G2.A03 != null) {
                A0G2.A0D.addLast(new AnonymousClass0Y9(this.A0T, i2));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                A0G2.A03.A00((AnonymousClass09N) null, intent);
                return;
            }
            AnonymousClass061 r1 = A0G2.A07;
            if (i2 == -1) {
                r1.A01.startActivity(intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void A0P(Configuration configuration) {
        onConfigurationChanged(configuration);
        for (AnonymousClass01A r0 : this.A0G.A0U.A02()) {
            if (r0 != null) {
                r0.A0P(configuration);
            }
        }
    }

    public void A0Q(Bundle bundle) {
        this.A0G.A0H();
        this.A03 = 1;
        this.A0V = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A00(new Fragment$5(this));
        }
        this.A0N.A01(bundle);
        A17(bundle);
        this.A0d = true;
        if (this.A0V) {
            this.A0K.A04(C011405n.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new AnonymousClass0BY(sb.toString());
    }

    public void A0R(Bundle bundle) {
        A0s(bundle);
        this.A0N.A02(bundle);
        Parcelable A052 = this.A0G.A05();
        if (A052 != null) {
            bundle.putParcelable(C001000l.A05, A052);
        }
    }

    public void A0S(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(C001000l.A05)) != null) {
            this.A0G.A0R(parcelable);
            AnonymousClass02C r2 = this.A0G;
            r2.A0P = false;
            r2.A0Q = false;
            r2.A0A.A01 = false;
            r2.A0O(1);
        }
    }

    public void A0T(Bundle bundle) {
        AnonymousClass02C r0 = this.A0H;
        if (r0 == null || !r0.A0o()) {
            this.A05 = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void A0U(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0G.A0H();
        this.A0f = true;
        this.A0I = new C07490bv(this, AGy());
        View A11 = A11(bundle, layoutInflater, viewGroup);
        this.A0A = A11;
        C07490bv r0 = this.A0I;
        if (A11 != null) {
            r0.A00();
            this.A0A.setTag(R.id.view_tree_lifecycle_owner, this.A0I);
            this.A0A.setTag(R.id.view_tree_view_model_store_owner, this.A0I);
            AnonymousClass05Z.A00(this.A0A, this.A0I);
            this.A0L.A0B(this.A0I);
        } else if (r0.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.A0I = null;
        }
    }

    public void A0V(Menu menu) {
        if (!this.A0a) {
            this.A0G.A0S(menu);
        }
    }

    @Deprecated
    public void A0W(AnonymousClass01A r4, int i2) {
        AnonymousClass02C r1 = this.A0H;
        AnonymousClass02C r0 = r4 != null ? r4.A0H : null;
        if (r1 == null || r0 == null || r1 == r0) {
            AnonymousClass01A r12 = r4;
            while (r12 != null) {
                if (!r12.equals(this)) {
                    r12 = r12.A09();
                } else {
                    StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(r4);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (r4 == null) {
                this.A0S = null;
            } else if (this.A0H == null || r4.A0H == null) {
                this.A0S = null;
                this.A0E = r4;
                this.A04 = i2;
                return;
            } else {
                this.A0S = r4.A0T;
            }
            this.A0E = null;
            this.A04 = i2;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(r4);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void A0X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A02));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A01));
        printWriter.print(" mTag=");
        printWriter.println(this.A0R);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.A03);
        printWriter.print(" mWho=");
        printWriter.print(this.A0T);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A00);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0U);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A0g);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A0Y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0c);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A0a);
        printWriter.print(" mDetached=");
        printWriter.print(this.A0X);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A0e);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.A0Z);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A0i);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.A0j);
        if (this.A0H != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A0H);
        }
        if (this.A0F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A0F);
        }
        if (this.A0D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A0D);
        }
        if (this.A05 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.A05);
        }
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.A06);
        }
        if (this.A08 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.A08);
        }
        if (this.A07 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.A07);
        }
        AnonymousClass01A A092 = A09();
        if (A092 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A092);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A04);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        AnonymousClass0PD r0 = this.A0C;
        printWriter.println(r0 == null ? false : r0.A0F);
        AnonymousClass0PD r02 = this.A0C;
        if (!(r02 == null || r02.A01 == 0)) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            AnonymousClass0PD r03 = this.A0C;
            printWriter.println(r03 == null ? 0 : r03.A01);
        }
        AnonymousClass0PD r04 = this.A0C;
        if (!(r04 == null || r04.A02 == 0)) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            AnonymousClass0PD r05 = this.A0C;
            printWriter.println(r05 == null ? 0 : r05.A02);
        }
        AnonymousClass0PD r06 = this.A0C;
        if (!(r06 == null || r06.A04 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            AnonymousClass0PD r07 = this.A0C;
            printWriter.println(r07 == null ? 0 : r07.A04);
        }
        AnonymousClass0PD r08 = this.A0C;
        if (!(r08 == null || r08.A05 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            AnonymousClass0PD r09 = this.A0C;
            printWriter.println(r09 == null ? 0 : r09.A05);
        }
        if (this.A0B != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.A0B);
        }
        if (this.A0A != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.A0A);
        }
        if (A0u() != null) {
            new C05520Rw(this, AGy()).A03(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.A0G);
        sb.append(":");
        printWriter.println(sb.toString());
        AnonymousClass02C r2 = this.A0G;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        r2.A0j(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public void A0Y(boolean z2) {
        for (AnonymousClass01A r0 : this.A0G.A0U.A02()) {
            if (r0 != null) {
                r0.A0Y(z2);
            }
        }
    }

    public void A0Z(boolean z2) {
        for (AnonymousClass01A r0 : this.A0G.A0U.A02()) {
            if (r0 != null) {
                r0.A0Z(z2);
            }
        }
    }

    public void A0a(boolean z2) {
        if (this.A0Z != z2) {
            this.A0Z = z2;
            if (A0c() && !this.A0a) {
                this.A0F.A04.A0a();
            }
        }
    }

    public void A0b(boolean z2) {
        if (this.A0e != z2) {
            this.A0e = z2;
            if (this.A0Z && A0c() && !this.A0a) {
                this.A0F.A04.A0a();
            }
        }
    }

    public final boolean A0c() {
        return this.A0F != null && this.A0U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r1.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0d() {
        /*
            r1 = this;
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0014
            X.02C r0 = r1.A0H
            if (r0 == 0) goto L_0x0012
            X.01A r0 = r1.A0D
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A0d()
            if (r0 == 0) goto L_0x0014
        L_0x0012:
            r0 = 1
            return r0
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0e() {
        /*
            r2 = this;
            boolean r0 = r2.A0c()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x001d
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L_0x001d
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x001d
            android.view.View r0 = r2.A0A
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0e():boolean");
    }

    public boolean A0f(Menu menu) {
        boolean z2 = false;
        if (this.A0a) {
            return false;
        }
        if (this.A0Z && this.A0e) {
            z2 = true;
            A0t(menu);
        }
        return z2 | this.A0G.A0q(menu);
    }

    public boolean A0g(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.A0a) {
            return false;
        }
        if (this.A0Z && this.A0e) {
            z2 = true;
            A0z(menu, menuInflater);
        }
        return z2 | this.A0G.A0r(menu, menuInflater);
    }

    public boolean A0h(MenuItem menuItem) {
        if (this.A0a) {
            return false;
        }
        if (A0p(menuItem)) {
            return true;
        }
        return this.A0G.A0s(menuItem);
    }

    public boolean A0i(MenuItem menuItem) {
        if (this.A0a) {
            return false;
        }
        if (!this.A0Z || !this.A0e || !A10(menuItem)) {
            return this.A0G.A0t(menuItem);
        }
        return true;
    }

    @Deprecated
    public void A0j(int i2, String[] strArr, int[] iArr) {
    }

    public void A0k() {
        this.A0V = true;
    }

    public void A0l(Bundle bundle) {
        this.A0V = true;
    }

    public void A0m() {
    }

    @Deprecated
    public void A0n(Bundle bundle) {
        this.A0V = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r6 != false) goto L_0x0033;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0j
            r4 = 5
            if (r0 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x002a
            int r0 = r5.A03
            if (r0 >= r4) goto L_0x002a
            X.02C r3 = r5.A0H
            if (r3 == 0) goto L_0x002a
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x002a
            boolean r0 = r5.A0d
            if (r0 == 0) goto L_0x002a
            X.0WQ r2 = r3.A0E(r5)
            X.01A r1 = r2.A02
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x002a
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x0041
            r0 = 1
            r3.A0N = r0
        L_0x002a:
            r5.A0j = r6
            int r0 = r5.A03
            if (r0 >= r4) goto L_0x0033
            r0 = 1
            if (r6 == 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r5.A0W = r0
            android.os.Bundle r0 = r5.A06
            if (r0 == 0) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A0P = r0
        L_0x0040:
            return
        L_0x0041:
            r0 = 0
            r1.A0W = r0
            r2.A04()
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0o(boolean):void");
    }

    public boolean A0p(MenuItem menuItem) {
        return false;
    }

    public void A0q() {
        this.A0V = true;
    }

    public void A0r(Intent intent) {
        AnonymousClass061 r0 = this.A0F;
        if (r0 != null) {
            r0.A01.startActivity(intent, (Bundle) null);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void A0s(Bundle bundle) {
    }

    public void A0t(Menu menu) {
    }

    public Context A0u() {
        AnonymousClass061 r0 = this.A0F;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public LayoutInflater A0v(Bundle bundle) {
        AnonymousClass061 r0 = this.A0F;
        if (r0 != null) {
            C001000l r1 = r0.A04;
            LayoutInflater cloneInContext = r1.getLayoutInflater().cloneInContext(r1);
            AnonymousClass07Q.A01(this.A0G.A0S, cloneInContext);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void A0w() {
        this.A0V = true;
    }

    @Deprecated
    public void A0x(int i2, int i3, Intent intent) {
        if (AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i2);
            sb.append(" resultCode: ");
            sb.append(i3);
            sb.append(" data: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Deprecated
    public void A0y(Activity activity) {
        this.A0V = true;
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A10(MenuItem menuItem) {
        return false;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void A12() {
        this.A0V = true;
    }

    public void A13() {
        this.A0V = true;
    }

    public void A14() {
        this.A0V = true;
    }

    public void A15() {
        this.A0V = true;
    }

    public void A16(Context context) {
        this.A0V = true;
        AnonymousClass061 r0 = this.A0F;
        if (r0 != null) {
            Activity activity = r0.A00;
            this.A0V = false;
            A0y(activity);
        }
    }

    public void A17(Bundle bundle) {
        this.A0V = true;
        A0S(bundle);
        AnonymousClass02C r2 = this.A0G;
        if (r2.A00 < 1) {
            r2.A0P = false;
            r2.A0Q = false;
            r2.A0A.A01 = false;
            r2.A0O(1);
        }
    }

    public void A18(Bundle bundle, View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (X.AnonymousClass02C.A02(3) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = new java.lang.StringBuilder("Could not find Application instance from Context ");
        r1.append(A02().getApplicationContext());
        r1.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass04o ABj() {
        /*
            r3 = this;
            X.02C r0 = r3.A0H
            if (r0 == 0) goto L_0x0056
            X.04o r1 = r3.A0M
            if (r1 != 0) goto L_0x004e
            r2 = 0
            android.content.Context r0 = r3.A02()
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0011:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x004f
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L_0x0045
        L_0x001e:
            r0 = 3
            boolean r0 = X.AnonymousClass02C.A02(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "Could not find Application instance from Context "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.content.Context r0 = r3.A02()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0045:
            android.os.Bundle r0 = r3.A05
            X.05c r1 = new X.05c
            r1.<init>(r2, r0, r3)
            r3.A0M = r1
        L_0x004e:
            return r1
        L_0x004f:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0011
        L_0x0056:
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.ABj():X.04o");
    }

    public final AnonymousClass05X AFh() {
        return this.A0N.A01;
    }

    public C010505a AGy() {
        AnonymousClass02C r2 = this.A0H;
        if (r2 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (A01() != 1) {
            HashMap hashMap = r2.A0A.A04;
            C010505a r1 = (C010505a) hashMap.get(this.A0T);
            if (r1 != null) {
                return r1;
            }
            C010505a r12 = new C010505a();
            hashMap.put(this.A0T, r12);
            return r12;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public C009704q getLifecycle() {
        return this.A0K;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A0V = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A0D().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.A0V = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        A0O(intent, i2, (Bundle) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.A0T);
        int i2 = this.A02;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.A0R;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }
}
