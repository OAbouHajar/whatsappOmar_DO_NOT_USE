package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$6;
import com.facebook.redex.IDxRLauncherShape0S1201000_I0;
import com.obwhatsapp.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.02C  reason: invalid class name */
public abstract class AnonymousClass02C implements AnonymousClass02D {
    public int A00 = -1;
    public AnonymousClass05Q A01;
    public C011105i A02;
    public C011105i A03;
    public C011105i A04;
    public AnonymousClass01A A05;
    public AnonymousClass01A A06;
    public AnonymousClass061 A07;
    public AnonymousClass062 A08;
    public AnonymousClass06B A09 = new AnonymousClass06B(this);
    public AnonymousClass07K A0A;
    public AnonymousClass06D A0B = new AnonymousClass06C(this);
    public Runnable A0C = new AnonymousClass06E(this);
    public ArrayDeque A0D = new ArrayDeque();
    public ArrayList A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public ArrayList A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public Map A0K = Collections.synchronizedMap(new HashMap());
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final AnonymousClass068 A0R = new AnonymousClass067(this);
    public final AnonymousClass066 A0S = new AnonymousClass066(this);
    public final C010304y A0T = new C010304y(this);
    public final AnonymousClass065 A0U = new AnonymousClass065();
    public final AnonymousClass06A A0V = new AnonymousClass069(this);
    public final ArrayList A0W = new ArrayList();
    public final Map A0X = Collections.synchronizedMap(new HashMap());
    public final Map A0Y = Collections.synchronizedMap(new HashMap());
    public final CopyOnWriteArrayList A0Z = new CopyOnWriteArrayList();
    public final AtomicInteger A0a = new AtomicInteger();

    public static void A00(AnonymousClass01A r2) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(r2);
            Log.v("FragmentManager", sb.toString());
        }
        if (r2.A0a) {
            r2.A0a = false;
            r2.A0b = !r2.A0b;
        }
    }

    public static boolean A01() {
        return A02(3);
    }

    public static boolean A02(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static final boolean A03(AnonymousClass01A r2) {
        if (r2.A0Z && r2.A0e) {
            return true;
        }
        AnonymousClass065 r0 = r2.A0G.A0U;
        ArrayList<AnonymousClass01A> arrayList = new ArrayList<>();
        for (AnonymousClass0WQ r02 : r0.A02.values()) {
            arrayList.add(r02 != null ? r02.A02 : null);
        }
        for (AnonymousClass01A r03 : arrayList) {
            if (r03 != null && A03(r03)) {
                return true;
            }
        }
        return false;
    }

    public int A04() {
        ArrayList arrayList = this.A0E;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable A05() {
        /*
            r10 = this;
            r10.A0K()
            java.util.Set r0 = r10.A0F()
            java.util.Iterator r1 = r0.iterator()
        L_0x000b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.0V5 r0 = (X.AnonymousClass0V5) r0
            r0.A03()
            goto L_0x000b
        L_0x001b:
            r1 = 1
            r10.A0m(r1)
            r10.A0P = r1
            X.07K r0 = r10.A0A
            r0.A01 = r1
            X.065 r3 = r10.A0U
            java.util.HashMap r1 = r3.A02
            int r0 = r1.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x003a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r5.next()
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            if (r0 == 0) goto L_0x003a
            X.01A r4 = r0.A02
            X.0YF r2 = r0.A01()
            r6.add(r2)
            r0 = 2
            boolean r0 = A02(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "Saved state of "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ": "
            r1.append(r0)
            android.os.Bundle r0 = r2.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
            goto L_0x003a
        L_0x0076:
            boolean r0 = r6.isEmpty()
            java.lang.String r7 = "FragmentManager"
            r9 = 2
            r5 = 0
            if (r0 == 0) goto L_0x008c
            boolean r0 = A02(r9)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "saveAllState: no fragments!"
            android.util.Log.v(r7, r0)
        L_0x008b:
            return r5
        L_0x008c:
            java.util.ArrayList r3 = r3.A01
            monitor-enter(r3)
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0097
            r4 = 0
            goto L_0x00da
        L_0x0097:
            int r0 = r3.size()     // Catch:{ all -> 0x015a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x015a }
            r4.<init>(r0)     // Catch:{ all -> 0x015a }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x015a }
        L_0x00a4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x015a }
            X.01A r2 = (X.AnonymousClass01A) r2     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r2.A0T     // Catch:{ all -> 0x015a }
            r4.add(r0)     // Catch:{ all -> 0x015a }
            boolean r0 = A02(r9)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015a }
            r1.<init>()     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "saveAllState: adding fragment ("
            r1.append(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r2.A0T     // Catch:{ all -> 0x015a }
            r1.append(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "): "
            r1.append(r0)     // Catch:{ all -> 0x015a }
            r1.append(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015a }
            android.util.Log.v(r7, r0)     // Catch:{ all -> 0x015a }
            goto L_0x00a4
        L_0x00da:
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            java.util.ArrayList r0 = r10.A0E
            if (r0 == 0) goto L_0x0121
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0121
            X.0YC[] r5 = new X.AnonymousClass0YC[r3]
            r2 = 0
        L_0x00e8:
            java.util.ArrayList r0 = r10.A0E
            java.lang.Object r1 = r0.get(r2)
            X.050 r1 = (X.AnonymousClass050) r1
            X.0YC r0 = new X.0YC
            r0.<init>((X.AnonymousClass050) r1)
            r5[r2] = r0
            boolean r0 = A02(r9)
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "saveAllState: adding back stack #"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.util.ArrayList r0 = r10.A0E
            java.lang.Object r0 = r0.get(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r7, r0)
        L_0x011c:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0121
            goto L_0x00e8
        L_0x0121:
            X.0YB r3 = new X.0YB
            r3.<init>()
            r3.A02 = r6
            r3.A03 = r4
            r3.A07 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0a
            int r0 = r0.get()
            r3.A00 = r0
            X.01A r0 = r10.A06
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = r0.A0T
            r3.A01 = r0
        L_0x013c:
            java.util.ArrayList r1 = r3.A05
            java.util.Map r2 = r10.A0Y
            java.util.Set r0 = r2.keySet()
            r1.addAll(r0)
            java.util.ArrayList r1 = r3.A06
            java.util.Collection r0 = r2.values()
            r1.addAll(r0)
            java.util.ArrayDeque r1 = r10.A0D
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r3.A04 = r0
            return r3
        L_0x015a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02C.A05():android.os.Parcelable");
    }

    public final ViewGroup A06(AnonymousClass01A r4) {
        ViewGroup viewGroup = r4.A0B;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (r4.A01 > 0 && this.A08.A01()) {
            View A002 = this.A08.A00(r4.A01);
            if (A002 instanceof ViewGroup) {
                return (ViewGroup) A002;
            }
        }
        return null;
    }

    public AnonymousClass0Y8 A07(AnonymousClass01A r5) {
        Bundle A002;
        AnonymousClass065 r0 = this.A0U;
        AnonymousClass0WQ r3 = (AnonymousClass0WQ) r0.A02.get(r5.A0T);
        if (r3 != null) {
            AnonymousClass01A r1 = r3.A02;
            if (r1.equals(r5)) {
                if (r1.A03 <= -1 || (A002 = r3.A00()) == null) {
                    return null;
                }
                return new AnonymousClass0Y8(A002);
            }
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(r5);
        sb.append(" is not currently in the FragmentManager");
        A0g(new IllegalStateException(sb.toString()));
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass01A A08(int i2) {
        AnonymousClass065 r4 = this.A0U;
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass01A r2 = (AnonymousClass01A) arrayList.get(size);
                if (r2 != null && r2.A02 == i2) {
                    return r2;
                }
            } else {
                for (AnonymousClass0WQ r0 : r4.A02.values()) {
                    if (r0 != null) {
                        AnonymousClass01A r22 = r0.A02;
                        if (r22.A02 == i2) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public AnonymousClass01A A09(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        AnonymousClass01A A0A2 = A0A(string);
        if (A0A2 != null) {
            return A0A2;
        }
        StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        A0g(new IllegalStateException(sb.toString()));
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass01A A0A(String str) {
        AnonymousClass0WQ r0 = (AnonymousClass0WQ) this.A0U.A02.get(str);
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public AnonymousClass01A A0B(String str) {
        AnonymousClass065 r4 = this.A0U;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass01A r2 = (AnonymousClass01A) arrayList.get(size);
                if (r2 != null && str.equals(r2.A0R)) {
                    return r2;
                }
            } else {
                for (AnonymousClass0WQ r0 : r4.A02.values()) {
                    if (r0 != null) {
                        AnonymousClass01A r22 = r0.A02;
                        if (str.equals(r22.A0R)) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public AnonymousClass06B A0C() {
        AnonymousClass01A r0 = this.A05;
        return r0 != null ? r0.A0H.A0C() : this.A09;
    }

    public AnonymousClass0WQ A0D(AnonymousClass01A r4) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(r4);
            Log.v("FragmentManager", sb.toString());
        }
        AnonymousClass0WQ A0E2 = A0E(r4);
        r4.A0H = this;
        AnonymousClass065 r1 = this.A0U;
        r1.A04(A0E2);
        if (!r4.A0X) {
            r1.A03(r4);
            r4.A0g = false;
            if (r4.A0A == null) {
                r4.A0b = false;
            }
            if (A03(r4)) {
                this.A0O = true;
            }
        }
        return A0E2;
    }

    public AnonymousClass0WQ A0E(AnonymousClass01A r4) {
        AnonymousClass065 r2 = this.A0U;
        AnonymousClass0WQ r1 = (AnonymousClass0WQ) r2.A02.get(r4.A0T);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0WQ r12 = new AnonymousClass0WQ(r4, this.A0T, r2);
        r12.A06(this.A07.A01.getClassLoader());
        r12.A00 = this.A00;
        return r12;
    }

    public final Set A0F() {
        HashSet hashSet = new HashSet();
        for (AnonymousClass0WQ r0 : this.A0U.A01()) {
            ViewGroup viewGroup = r0.A02.A0B;
            if (viewGroup != null) {
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof AnonymousClass0V5)) {
                    tag = new C02790Ey(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    public void A0G() {
        this.A0L = true;
        A0m(true);
        for (AnonymousClass0V5 A032 : A0F()) {
            A032.A03();
        }
        A0O(-1);
        this.A07 = null;
        this.A08 = null;
        this.A05 = null;
        if (this.A01 != null) {
            Iterator it = this.A0R.A00.iterator();
            while (it.hasNext()) {
                ((AnonymousClass07J) it.next()).cancel();
            }
            this.A01 = null;
        }
        C011105i r0 = this.A03;
        if (r0 != null) {
            IDxRLauncherShape0S1201000_I0 iDxRLauncherShape0S1201000_I0 = (IDxRLauncherShape0S1201000_I0) r0;
            ((AnonymousClass05R) iDxRLauncherShape0S1201000_I0.A01).A04(iDxRLauncherShape0S1201000_I0.A03);
            IDxRLauncherShape0S1201000_I0 iDxRLauncherShape0S1201000_I02 = (IDxRLauncherShape0S1201000_I0) this.A04;
            ((AnonymousClass05R) iDxRLauncherShape0S1201000_I02.A01).A04(iDxRLauncherShape0S1201000_I02.A03);
            IDxRLauncherShape0S1201000_I0 iDxRLauncherShape0S1201000_I03 = (IDxRLauncherShape0S1201000_I0) this.A02;
            ((AnonymousClass05R) iDxRLauncherShape0S1201000_I03.A01).A04(iDxRLauncherShape0S1201000_I03.A03);
        }
    }

    public void A0H() {
        if (this.A07 != null) {
            this.A0P = false;
            this.A0Q = false;
            this.A0A.A01 = false;
            for (AnonymousClass01A r0 : this.A0U.A02()) {
                if (r0 != null) {
                    r0.A0G.A0H();
                }
            }
        }
    }

    public void A0I() {
        A0d(new C07420bL(this, (String) null, -1, 0), false);
    }

    public final void A0J() {
        this.A0M = false;
        this.A0I.clear();
        this.A0J.clear();
    }

    public final void A0K() {
        for (AnonymousClass0V5 r1 : A0F()) {
            if (r1.A00) {
                r1.A00 = false;
                r1.A02();
            }
        }
    }

    public final void A0L() {
        for (AnonymousClass0WQ r2 : this.A0U.A01()) {
            AnonymousClass01A r1 = r2.A02;
            if (r1.A0W) {
                if (this.A0M) {
                    this.A0N = true;
                } else {
                    r1.A0W = false;
                    r2.A04();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (A04() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (A0u(r3.A05) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r1 = r3.A0R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r3 = this;
            java.util.ArrayList r1 = r3.A0W
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 != 0) goto L_0x0010
            X.068 r0 = r3.A0R     // Catch:{ all -> 0x0026 }
            r0.A01 = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            X.068 r1 = r3.A0R
            int r0 = r3.A04()
            if (r0 <= 0) goto L_0x0024
            X.01A r0 = r3.A05
            boolean r0 = r3.A0u(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r1.A01 = r2
            return
        L_0x0024:
            r2 = 0
            goto L_0x0021
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02C.A0M():void");
    }

    public void A0N(int i2) {
        if (i2 >= 0) {
            A0d(new C07420bL(this, (String) null, i2, 1), false);
            return;
        }
        StringBuilder sb = new StringBuilder("Bad id: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void A0O(int i2) {
        try {
            this.A0M = true;
            for (AnonymousClass0WQ r0 : this.A0U.A02.values()) {
                if (r0 != null) {
                    r0.A00 = i2;
                }
            }
            A0P(i2, false);
            for (AnonymousClass0V5 A032 : A0F()) {
                A032.A03();
            }
            this.A0M = false;
            A0m(true);
        } catch (Throwable th) {
            this.A0M = false;
            throw th;
        }
    }

    public void A0P(int i2, boolean z2) {
        AnonymousClass061 r2;
        if (this.A07 == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.A00) {
            this.A00 = i2;
            AnonymousClass065 r5 = this.A0U;
            Iterator it = r5.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass0WQ r0 = (AnonymousClass0WQ) r5.A02.get(((AnonymousClass01A) it.next()).A0T);
                if (r0 != null) {
                    r0.A04();
                }
            }
            for (AnonymousClass0WQ r22 : r5.A02.values()) {
                if (r22 != null) {
                    r22.A04();
                    AnonymousClass01A r1 = r22.A02;
                    if (r1.A0g && r1.A00 <= 0) {
                        r5.A05(r22);
                    }
                }
            }
            A0L();
            if (this.A0O && (r2 = this.A07) != null && this.A00 == 7) {
                r2.A04.A0a();
                this.A0O = false;
            }
        }
    }

    public void A0Q(Bundle bundle, AnonymousClass01A r4, String str) {
        if (r4.A0H != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r4);
            sb.append(" is not currently in the FragmentManager");
            A0g(new IllegalStateException(sb.toString()));
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        bundle.putString(str, r4.A0T);
    }

    public void A0R(Parcelable parcelable) {
        AnonymousClass01A r6;
        AnonymousClass0WQ r9;
        Parcelable parcelable2 = parcelable;
        if (parcelable != null) {
            AnonymousClass0YB r4 = (AnonymousClass0YB) parcelable2;
            if (r4.A02 != null) {
                AnonymousClass065 r13 = this.A0U;
                HashMap hashMap = r13.A02;
                hashMap.clear();
                Iterator it = r4.A02.iterator();
                while (it.hasNext()) {
                    AnonymousClass0YF r12 = (AnonymousClass0YF) it.next();
                    if (r12 != null) {
                        AnonymousClass01A r62 = (AnonymousClass01A) this.A0A.A03.get(r12.A07);
                        if (r62 != null) {
                            if (A02(2)) {
                                StringBuilder sb = new StringBuilder("restoreSaveState: re-attaching retained ");
                                sb.append(r62);
                                Log.v("FragmentManager", sb.toString());
                            }
                            r9 = new AnonymousClass0WQ(r62, this.A0T, r12, r13);
                        } else {
                            r9 = new AnonymousClass0WQ(this.A0T, A0C(), r12, r13, this.A07.A01.getClassLoader());
                        }
                        AnonymousClass01A r63 = r9.A02;
                        r63.A0H = this;
                        if (A02(2)) {
                            StringBuilder sb2 = new StringBuilder("restoreSaveState: active (");
                            sb2.append(r63.A0T);
                            sb2.append("): ");
                            sb2.append(r63);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        r9.A06(this.A07.A01.getClassLoader());
                        r13.A04(r9);
                        r9.A00 = this.A00;
                    }
                }
                Iterator it2 = new ArrayList(this.A0A.A03.values()).iterator();
                while (it2.hasNext()) {
                    AnonymousClass01A r64 = (AnonymousClass01A) it2.next();
                    if (hashMap.get(r64.A0T) == null) {
                        if (A02(2)) {
                            StringBuilder sb3 = new StringBuilder("Discarding retained Fragment ");
                            sb3.append(r64);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(r4.A02);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.A0A.A05(r64);
                        r64.A0H = this;
                        AnonymousClass0WQ r1 = new AnonymousClass0WQ(r64, this.A0T, r13);
                        r1.A00 = 1;
                        r1.A04();
                        r64.A0g = true;
                        r1.A04();
                    }
                }
                ArrayList arrayList = r4.A03;
                r13.A01.clear();
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        AnonymousClass0WQ r0 = (AnonymousClass0WQ) hashMap.get(str);
                        if (r0 == null || (r6 = r0.A02) == null) {
                            StringBuilder sb4 = new StringBuilder("No instantiated fragment for (");
                            sb4.append(str);
                            sb4.append(")");
                            throw new IllegalStateException(sb4.toString());
                        }
                        if (A02(2)) {
                            StringBuilder sb5 = new StringBuilder("restoreSaveState: added (");
                            sb5.append(str);
                            sb5.append("): ");
                            sb5.append(r6);
                            Log.v("FragmentManager", sb5.toString());
                        }
                        r13.A03(r6);
                    }
                }
                AnonymousClass0YC[] r02 = r4.A07;
                if (r02 != null) {
                    this.A0E = new ArrayList(r02.length);
                    int i2 = 0;
                    while (true) {
                        AnonymousClass0YC[] r14 = r4.A07;
                        if (i2 >= r14.length) {
                            break;
                        }
                        AnonymousClass0YC r92 = r14[i2];
                        AnonymousClass050 r7 = new AnonymousClass050(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = r92.A0D;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            AnonymousClass0W0 r122 = new AnonymousClass0W0();
                            int i5 = i3 + 1;
                            r122.A00 = iArr[i3];
                            if (A02(2)) {
                                StringBuilder sb6 = new StringBuilder("Instantiate ");
                                sb6.append(r7);
                                sb6.append(" op #");
                                sb6.append(i4);
                                sb6.append(" base fragment #");
                                sb6.append(iArr[i5]);
                                Log.v("FragmentManager", sb6.toString());
                            }
                            String str2 = (String) r92.A07.get(i4);
                            r122.A05 = str2 != null ? A0A(str2) : null;
                            r122.A07 = C011005f.values()[r92.A0C[i4]];
                            r122.A06 = C011005f.values()[r92.A0B[i4]];
                            int i6 = i5 + 1;
                            int i7 = iArr[i5];
                            r122.A01 = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr[i6];
                            r122.A02 = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr[i8];
                            r122.A03 = i11;
                            i3 = i10 + 1;
                            int i12 = iArr[i10];
                            r122.A04 = i12;
                            r7.A02 = i7;
                            r7.A03 = i9;
                            r7.A05 = i11;
                            r7.A06 = i12;
                            r7.A0G(r122);
                            i4++;
                        }
                        r7.A07 = r92.A03;
                        r7.A0A = r92.A06;
                        r7.A04 = r92.A02;
                        r7.A0E = true;
                        r7.A01 = r92.A01;
                        r7.A09 = r92.A05;
                        r7.A00 = r92.A00;
                        r7.A08 = r92.A04;
                        r7.A0C = r92.A08;
                        r7.A0D = r92.A09;
                        r7.A0H = r92.A0A;
                        r7.A05(1);
                        if (A02(2)) {
                            StringBuilder sb7 = new StringBuilder("restoreAllState: back stack #");
                            sb7.append(i2);
                            sb7.append(" (index ");
                            sb7.append(r7.A04);
                            sb7.append("): ");
                            sb7.append(r7);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new AnonymousClass0JD());
                            r7.A0H(printWriter, "  ", false);
                            printWriter.close();
                        }
                        this.A0E.add(r7);
                        i2++;
                    }
                } else {
                    this.A0E = null;
                }
                this.A0a.set(r4.A00);
                String str3 = r4.A01;
                if (str3 != null) {
                    AnonymousClass01A A0A2 = A0A(str3);
                    this.A06 = A0A2;
                    A0Y(A0A2);
                }
                ArrayList arrayList2 = r4.A05;
                if (arrayList2 != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        Bundle bundle = (Bundle) r4.A06.get(i13);
                        bundle.setClassLoader(this.A07.A01.getClassLoader());
                        this.A0Y.put(arrayList2.get(i13), bundle);
                    }
                }
                this.A0D = new ArrayDeque(r4.A04);
            }
        }
    }

    public void A0S(Menu menu) {
        if (this.A00 >= 1) {
            for (AnonymousClass01A r0 : this.A0U.A02()) {
                if (r0 != null) {
                    r0.A0V(menu);
                }
            }
        }
    }

    public void A0T(AnonymousClass01A r5) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(r5);
            Log.v("FragmentManager", sb.toString());
        }
        if (r5.A0X) {
            r5.A0X = false;
            if (!r5.A0U) {
                this.A0U.A03(r5);
                if (A02(2)) {
                    StringBuilder sb2 = new StringBuilder("add from attach: ");
                    sb2.append(r5);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (A03(r5)) {
                    this.A0O = true;
                }
            }
        }
    }

    public void A0U(AnonymousClass01A r6) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(r6);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r6.A0X) {
            r6.A0X = true;
            if (r6.A0U) {
                if (A02(2)) {
                    StringBuilder sb2 = new StringBuilder("remove from detach: ");
                    sb2.append(r6);
                    Log.v("FragmentManager", sb2.toString());
                }
                ArrayList arrayList = this.A0U.A01;
                synchronized (arrayList) {
                    arrayList.remove(r6);
                }
                r6.A0U = false;
                if (A03(r6)) {
                    this.A0O = true;
                }
                A0Z(r6);
            }
        }
    }

    public void A0V(AnonymousClass01A r3) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r3.A0a) {
            r3.A0a = true;
            r3.A0b = true ^ r3.A0b;
            A0Z(r3);
        }
    }

    public void A0W(AnonymousClass01A r4) {
        if (A02(2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(r4);
            sb.append(" nesting=");
            sb.append(r4.A00);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z2 = false;
        if (r4.A00 > 0) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (!r4.A0X || z3) {
            ArrayList arrayList = this.A0U.A01;
            synchronized (arrayList) {
                arrayList.remove(r4);
            }
            r4.A0U = false;
            if (A03(r4)) {
                this.A0O = true;
            }
            r4.A0g = true;
            A0Z(r4);
        }
    }

    public void A0X(AnonymousClass01A r3) {
        if (r3 == null || (r3.equals(A0A(r3.A0T)) && (r3.A0F == null || r3.A0H == this))) {
            AnonymousClass01A r0 = this.A06;
            this.A06 = r3;
            A0Y(r0);
            A0Y(this.A06);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(r3);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void A0Y(AnonymousClass01A r3) {
        if (r3 != null && r3.equals(A0A(r3.A0T))) {
            boolean A0u = r3.A0H.A0u(r3);
            Boolean bool = r3.A0O;
            if (bool == null || bool.booleanValue() != A0u) {
                r3.A0O = Boolean.valueOf(A0u);
                AnonymousClass02C r1 = r3.A0G;
                r1.A0M();
                r1.A0Y(r1.A06);
            }
        }
    }

    public final void A0Z(AnonymousClass01A r5) {
        AnonymousClass0PD r2;
        ViewGroup A062 = A06(r5);
        if (A062 != null && (r2 = r5.A0C) != null && r2.A01 + r2.A02 + r2.A04 + r2.A05 > 0) {
            if (A062.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A062.setTag(R.id.visible_removing_fragment_view_tag, r5);
            }
            AnonymousClass01A r22 = (AnonymousClass01A) A062.getTag(R.id.visible_removing_fragment_view_tag);
            AnonymousClass0PD r0 = r5.A0C;
            boolean z2 = r0 == null ? false : r0.A0F;
            if (r22.A0C != null) {
                r22.A08().A0F = z2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.00t, X.00q, X.061] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(X.AnonymousClass01A r7, X.AnonymousClass061 r8, X.AnonymousClass062 r9) {
        /*
            r6 = this;
            X.061 r0 = r6.A07
            if (r0 != 0) goto L_0x0119
            r6.A07 = r8
            r6.A08 = r9
            r6.A05 = r7
            if (r7 == 0) goto L_0x0112
            X.0bM r1 = new X.0bM
            r1.<init>(r7, r6)
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A0Z
            r0.add(r1)
        L_0x0016:
            X.01A r0 = r6.A05
            if (r0 == 0) goto L_0x001d
            r6.A0M()
        L_0x001d:
            boolean r0 = r8 instanceof X.C001800t
            if (r0 == 0) goto L_0x0030
            r2 = r8
            X.05Q r1 = r8.AE3()
            r6.A01 = r1
            if (r7 == 0) goto L_0x002b
            r2 = r7
        L_0x002b:
            X.068 r0 = r6.A0R
            r1.A01(r0, r2)
        L_0x0030:
            if (r7 == 0) goto L_0x00f1
            X.02C r0 = r7.A0H
            X.07K r3 = r0.A0A
            java.util.HashMap r2 = r3.A02
            java.lang.String r0 = r7.A0T
            java.lang.Object r1 = r2.get(r0)
            X.07K r1 = (X.AnonymousClass07K) r1
            if (r1 != 0) goto L_0x004e
            boolean r0 = r3.A05
            X.07K r1 = new X.07K
            r1.<init>(r0)
            java.lang.String r0 = r7.A0T
            r2.put(r0, r1)
        L_0x004e:
            r6.A0A = r1
            boolean r0 = r6.A0o()
            r1.A01 = r0
            X.065 r0 = r6.A0U
            r0.A00 = r1
            X.061 r1 = r6.A07
            boolean r0 = r1 instanceof X.C001700s
            if (r0 == 0) goto L_0x00ed
            X.05R r4 = r1.A9m()
            if (r7 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.A0T
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        L_0x0079:
            java.lang.String r1 = "FragmentManager:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartActivityForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.07M r2 = new X.07M
            r2.<init>()
            r1 = 2
            com.facebook.redex.IDxRCallbackShape214S0100000_I0 r0 = new com.facebook.redex.IDxRCallbackShape214S0100000_I0
            r0.<init>(r6, r1)
            X.05i r0 = r4.A02(r0, r2, r3)
            r6.A03 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartIntentSenderForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.07O r2 = new X.07O
            r2.<init>()
            r1 = 0
            com.facebook.redex.IDxRCallbackShape214S0100000_I0 r0 = new com.facebook.redex.IDxRCallbackShape214S0100000_I0
            r0.<init>(r6, r1)
            X.05i r0 = r4.A02(r0, r2, r3)
            r6.A04 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "RequestPermissions"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.07P r2 = new X.07P
            r2.<init>()
            r1 = 1
            com.facebook.redex.IDxRCallbackShape214S0100000_I0 r0 = new com.facebook.redex.IDxRCallbackShape214S0100000_I0
            r0.<init>(r6, r1)
            X.05i r0 = r4.A02(r0, r2, r3)
            r6.A02 = r0
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.String r2 = ""
            goto L_0x0079
        L_0x00f1:
            boolean r0 = r8 instanceof X.C001500q
            if (r0 == 0) goto L_0x010a
            X.05a r2 = r8.AGy()
            X.04o r0 = X.AnonymousClass07K.A06
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C010505a) r2)
            java.lang.Class<X.07K> r0 = X.AnonymousClass07K.class
            X.01n r1 = r1.A01(r0)
            X.07K r1 = (X.AnonymousClass07K) r1
            goto L_0x004e
        L_0x010a:
            r0 = 0
            X.07K r1 = new X.07K
            r1.<init>(r0)
            goto L_0x004e
        L_0x0112:
            boolean r0 = r8 instanceof X.AnonymousClass063
            if (r0 == 0) goto L_0x0016
            r1 = r8
            goto L_0x0011
        L_0x0119:
            java.lang.String r1 = "Already attached"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02C.A0a(X.01A, X.061, X.062):void");
    }

    public void A0b(AnonymousClass01A r3, C011005f r4) {
        if (!r3.equals(A0A(r3.A0T)) || !(r3.A0F == null || r3.A0H == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r3);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        r3.A0J = r4;
    }

    public void A0c(AnonymousClass01A r3, boolean z2) {
        ViewGroup A062 = A06(r3);
        if (A062 != null && (A062 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A062).A03 = !z2;
        }
    }

    public void A0d(AnonymousClass051 r4, boolean z2) {
        if (!z2) {
            if (this.A07 == null) {
                if (this.A0L) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A0o()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0W;
        synchronized (arrayList) {
            if (this.A07 != null) {
                arrayList.add(r4);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A07.A02;
                        Runnable runnable = this.A0C;
                        handler.removeCallbacks(runnable);
                        this.A07.A02.post(runnable);
                        A0M();
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } else if (!z2) {
                th = new IllegalStateException("Activity has been destroyed");
                throw th;
            }
        }
    }

    public void A0e(AnonymousClass051 r3, boolean z2) {
        if (!z2 || (this.A07 != null && !this.A0L)) {
            A0n(z2);
            if (r3.A9O(this.A0J, this.A0I)) {
                this.A0M = true;
                try {
                    A0k(this.A0J, this.A0I);
                } finally {
                    A0J();
                }
            }
            A0M();
            if (this.A0N) {
                this.A0N = false;
                A0L();
            }
            this.A0U.A02.values().removeAll(Collections.singleton((Object) null));
        }
    }

    public final void A0f(AnonymousClass07E r5, C001300o r6, String str) {
        C009704q lifecycle = r6.getLifecycle();
        if (((C009604p) lifecycle).A02 != C011005f.DESTROYED) {
            FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, r5, lifecycle, str);
            lifecycle.A00(fragmentManager$6);
            C07440bN r0 = (C07440bN) this.A0X.put(str, new C07440bN(r5, lifecycle, fragmentManager$6));
            if (r0 != null) {
                r0.A01.A01(r0.A02);
            }
        }
    }

    public final void A0g(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new AnonymousClass0JD());
        AnonymousClass061 r5 = this.A07;
        if (r5 != null) {
            try {
                r5.A04.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        } else {
            A0j("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    public void A0h(String str, int i2) {
        A0d(new C07420bL(this, str, -1, i2), false);
    }

    public final void A0i(String str, Bundle bundle) {
        C07440bN r2 = (C07440bN) this.A0X.get(str);
        if (r2 != null) {
            if (((C009604p) r2.A01).A02.A00(C011005f.STARTED)) {
                r2.ARb(str, bundle);
                return;
            }
        }
        this.A0Y.put(str, bundle);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A0j(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            X.065 r3 = r6.A0U
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            java.util.HashMap r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005a
            r9.print(r7)
            java.lang.String r0 = "Active Fragments:"
            r9.println(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            r9.print(r7)
            if (r0 == 0) goto L_0x0054
            X.01A r0 = r0.A02
            r9.println(r0)
            r0.A0X(r2, r8, r9, r10)
            goto L_0x003a
        L_0x0054:
            java.lang.String r0 = "null"
            r9.println(r0)
            goto L_0x003a
        L_0x005a:
            java.util.ArrayList r4 = r3.A01
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x008b
            r9.print(r7)
            java.lang.String r0 = "Added Fragments:"
            r9.println(r0)
            r2 = 0
        L_0x006b:
            java.lang.Object r1 = r4.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x008b
            goto L_0x006b
        L_0x008b:
            java.util.ArrayList r0 = r6.A0G
            r4 = 0
            if (r0 == 0) goto L_0x00c1
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00c1
            r9.print(r7)
            java.lang.String r0 = "Fragments Created Menus:"
            r9.println(r0)
            r2 = 0
        L_0x009f:
            java.util.ArrayList r0 = r6.A0G
            java.lang.Object r1 = r0.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00c1
            goto L_0x009f
        L_0x00c1:
            java.util.ArrayList r0 = r6.A0E
            if (r0 == 0) goto L_0x00fc
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00fc
            r9.print(r7)
            java.lang.String r0 = "Back Stack:"
            r9.println(r0)
            r2 = 0
        L_0x00d4:
            java.util.ArrayList r0 = r6.A0E
            java.lang.Object r1 = r0.get(r2)
            X.050 r1 = (X.AnonymousClass050) r1
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            r0 = 1
            r1.A0H(r9, r5, r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00fc
            goto L_0x00d4
        L_0x00fc:
            r9.print(r7)
            java.lang.String r0 = "Back Stack Index: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0a
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            java.util.ArrayList r3 = r6.A0W
            monitor-enter(r3)
            int r2 = r3.size()     // Catch:{ all -> 0x01b6 }
            if (r2 <= 0) goto L_0x0145
            r9.print(r7)     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = "Pending Actions:"
            r9.println(r0)     // Catch:{ all -> 0x01b6 }
        L_0x0127:
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x01b6 }
            X.051 r1 = (X.AnonymousClass051) r1     // Catch:{ all -> 0x01b6 }
            r9.print(r7)     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = "  #"
            r9.print(r0)     // Catch:{ all -> 0x01b6 }
            r9.print(r4)     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = ": "
            r9.print(r0)     // Catch:{ all -> 0x01b6 }
            r9.println(r1)     // Catch:{ all -> 0x01b6 }
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0145
            goto L_0x0127
        L_0x0145:
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            r9.print(r7)
            java.lang.String r0 = "FragmentManager misc state:"
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mHost="
            r9.print(r0)
            X.061 r0 = r6.A07
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mContainer="
            r9.print(r0)
            X.062 r0 = r6.A08
            r9.println(r0)
            X.01A r0 = r6.A05
            if (r0 == 0) goto L_0x0179
            r9.print(r7)
            java.lang.String r0 = "  mParent="
            r9.print(r0)
            X.01A r0 = r6.A05
            r9.println(r0)
        L_0x0179:
            r9.print(r7)
            java.lang.String r0 = "  mCurState="
            r9.print(r0)
            int r0 = r6.A00
            r9.print(r0)
            java.lang.String r0 = " mStateSaved="
            r9.print(r0)
            boolean r0 = r6.A0P
            r9.print(r0)
            java.lang.String r0 = " mStopped="
            r9.print(r0)
            boolean r0 = r6.A0Q
            r9.print(r0)
            java.lang.String r0 = " mDestroyed="
            r9.print(r0)
            boolean r0 = r6.A0L
            r9.println(r0)
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x01b5
            r9.print(r7)
            java.lang.String r0 = "  mNeedMenuInvalidate="
            r9.print(r0)
            boolean r0 = r6.A0O
            r9.println(r0)
        L_0x01b5:
            return
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02C.A0j(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void A0k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!((AnonymousClass050) arrayList.get(i2)).A0H) {
                    if (i3 != i2) {
                        A0l(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                        while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((AnonymousClass050) arrayList.get(i3)).A0H) {
                            i3++;
                        }
                    }
                    A0l(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                A0l(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void A0l(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        ArrayList arrayList3 = arrayList;
        int i4 = i2;
        boolean z2 = ((AnonymousClass050) arrayList3.get(i4)).A0H;
        ArrayList arrayList4 = this.A0H;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.A0H = arrayList4;
        } else {
            arrayList4.clear();
        }
        AnonymousClass065 r21 = this.A0U;
        arrayList4.addAll(r21.A02());
        AnonymousClass01A r8 = this.A06;
        int i5 = i4;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i6 = i3;
            if (i5 < i6) {
                AnonymousClass050 r9 = (AnonymousClass050) arrayList3.get(i5);
                boolean booleanValue = ((Boolean) arrayList5.get(i5)).booleanValue();
                ArrayList arrayList6 = this.A0H;
                if (!booleanValue) {
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList7 = r9.A0B;
                        if (i7 < arrayList7.size()) {
                            AnonymousClass0W0 r11 = (AnonymousClass0W0) arrayList7.get(i7);
                            int i8 = r11.A00;
                            if (i8 != 1) {
                                if (i8 == 2) {
                                    AnonymousClass01A r6 = r11.A05;
                                    int i9 = r6.A01;
                                    boolean z4 = false;
                                    for (int size = arrayList6.size() - 1; size >= 0; size--) {
                                        AnonymousClass01A r5 = (AnonymousClass01A) arrayList6.get(size);
                                        if (r5.A01 == i9) {
                                            if (r5 == r6) {
                                                z4 = true;
                                            } else {
                                                if (r5 == r8) {
                                                    arrayList7.add(i7, new AnonymousClass0W0(r5, 9));
                                                    i7++;
                                                    r8 = null;
                                                }
                                                AnonymousClass0W0 r15 = new AnonymousClass0W0(r5, 3);
                                                r15.A01 = r11.A01;
                                                r15.A03 = r11.A03;
                                                r15.A02 = r11.A02;
                                                r15.A04 = r11.A04;
                                                arrayList7.add(i7, r15);
                                                arrayList6.remove(r5);
                                                i7++;
                                            }
                                        }
                                    }
                                    if (z4) {
                                        arrayList7.remove(i7);
                                        i7--;
                                    } else {
                                        r11.A00 = 1;
                                        arrayList6.add(r6);
                                    }
                                } else if (i8 == 3 || i8 == 6) {
                                    arrayList6.remove(r11.A05);
                                    AnonymousClass01A r62 = r11.A05;
                                    if (r62 == r8) {
                                        arrayList7.add(i7, new AnonymousClass0W0(r62, 9));
                                        i7++;
                                        r8 = null;
                                    }
                                } else if (i8 != 7) {
                                    if (i8 == 8) {
                                        arrayList7.add(i7, new AnonymousClass0W0(r8, 9));
                                        i7++;
                                        r8 = r11.A05;
                                    }
                                }
                                i7++;
                            }
                            arrayList6.add(r11.A05);
                            i7++;
                        }
                    }
                } else {
                    ArrayList arrayList8 = r9.A0B;
                    for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                        AnonymousClass0W0 r63 = (AnonymousClass0W0) arrayList8.get(size2);
                        int i10 = r63.A00;
                        if (i10 != 1) {
                            if (i10 != 3) {
                                switch (i10) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        r8 = null;
                                        break;
                                    case 9:
                                        r8 = r63.A05;
                                        break;
                                    case 10:
                                        r63.A06 = r63.A07;
                                        break;
                                }
                            }
                            arrayList6.add(r63.A05);
                        }
                        arrayList6.remove(r63.A05);
                    }
                }
                if (!z3) {
                    z3 = false;
                    if (!r9.A0E) {
                        i5++;
                    }
                }
                z3 = true;
                i5++;
            } else {
                this.A0H.clear();
                if (!z2 && this.A00 >= 1) {
                    for (int i11 = i4; i11 < i6; i11++) {
                        Iterator it = ((AnonymousClass050) arrayList3.get(i11)).A0B.iterator();
                        while (it.hasNext()) {
                            AnonymousClass01A r7 = ((AnonymousClass0W0) it.next()).A05;
                            if (!(r7 == null || r7.A0H == null)) {
                                r21.A04(A0E(r7));
                            }
                        }
                    }
                }
                for (int i12 = i4; i12 < i6; i12++) {
                    AnonymousClass050 r92 = (AnonymousClass050) arrayList3.get(i12);
                    if (((Boolean) arrayList5.get(i12)).booleanValue()) {
                        r92.A05(-1);
                        ArrayList arrayList9 = r92.A0B;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            AnonymousClass0W0 r14 = (AnonymousClass0W0) arrayList9.get(size3);
                            AnonymousClass01A r82 = r14.A05;
                            if (r82 != null) {
                                if (r82.A0C != null) {
                                    r82.A08().A0F = true;
                                }
                                int i13 = r92.A07;
                                int i14 = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
                                if (i13 != 4097) {
                                    if (i13 != 4099) {
                                        i14 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
                                        if (i13 != 8194) {
                                            i14 = 0;
                                        }
                                    } else {
                                        i14 = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
                                    }
                                }
                                if (!(r82.A0C == null && i14 == 0)) {
                                    r82.A08();
                                    r82.A0C.A03 = i14;
                                }
                                ArrayList arrayList10 = r92.A0D;
                                ArrayList arrayList11 = r92.A0C;
                                r82.A08();
                                AnonymousClass0PD r0 = r82.A0C;
                                r0.A0C = arrayList10;
                                r0.A0D = arrayList11;
                            }
                            int i15 = r14.A00;
                            switch (i15) {
                                case 1:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass02C r02 = r92.A0J;
                                    r02.A0c(r82, true);
                                    r02.A0W(r82);
                                    break;
                                case 3:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r92.A0J.A0D(r82);
                                    break;
                                case 4:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    A00(r82);
                                    break;
                                case 5:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass02C r03 = r92.A0J;
                                    r03.A0c(r82, true);
                                    r03.A0V(r82);
                                    break;
                                case 6:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r92.A0J.A0T(r82);
                                    break;
                                case 7:
                                    r82.A0N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass02C r04 = r92.A0J;
                                    r04.A0c(r82, true);
                                    r04.A0U(r82);
                                    break;
                                case 8:
                                    r92.A0J.A0X((AnonymousClass01A) null);
                                    break;
                                case 9:
                                    r92.A0J.A0X(r82);
                                    break;
                                case 10:
                                    r92.A0J.A0b(r82, r14.A07);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                                    sb.append(i15);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                        }
                        continue;
                    } else {
                        r92.A05(1);
                        ArrayList arrayList12 = r92.A0B;
                        int size4 = arrayList12.size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            AnonymousClass0W0 r13 = (AnonymousClass0W0) arrayList12.get(i16);
                            AnonymousClass01A r12 = r13.A05;
                            if (r12 != null) {
                                if (r12.A0C != null) {
                                    r12.A08().A0F = false;
                                }
                                int i17 = r92.A07;
                                if (!(r12.A0C == null && i17 == 0)) {
                                    r12.A08();
                                    r12.A0C.A03 = i17;
                                }
                                ArrayList arrayList13 = r92.A0C;
                                ArrayList arrayList14 = r92.A0D;
                                r12.A08();
                                AnonymousClass0PD r05 = r12.A0C;
                                r05.A0C = arrayList13;
                                r05.A0D = arrayList14;
                            }
                            int i18 = r13.A00;
                            switch (i18) {
                                case 1:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass02C r06 = r92.A0J;
                                    r06.A0c(r12, false);
                                    r06.A0D(r12);
                                    break;
                                case 3:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r92.A0J.A0W(r12);
                                    break;
                                case 4:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r92.A0J.A0V(r12);
                                    break;
                                case 5:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r92.A0J.A0c(r12, false);
                                    A00(r12);
                                    break;
                                case 6:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r92.A0J.A0U(r12);
                                    break;
                                case 7:
                                    r12.A0N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass02C r07 = r92.A0J;
                                    r07.A0c(r12, false);
                                    r07.A0T(r12);
                                    break;
                                case 8:
                                    r92.A0J.A0X(r12);
                                    break;
                                case 9:
                                    r92.A0J.A0X((AnonymousClass01A) null);
                                    break;
                                case 10:
                                    r92.A0J.A0b(r12, r13.A06);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder("Unknown cmd: ");
                                    sb2.append(i18);
                                    throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList5.get(i3 - 1)).booleanValue();
                for (int i19 = i4; i19 < i6; i19++) {
                    AnonymousClass050 r10 = (AnonymousClass050) arrayList3.get(i19);
                    ArrayList arrayList15 = r10.A0B;
                    if (booleanValue2) {
                        for (int size5 = arrayList15.size() - 1; size5 >= 0; size5--) {
                            AnonymousClass01A r08 = ((AnonymousClass0W0) r10.A0B.get(size5)).A05;
                            if (r08 != null) {
                                A0E(r08).A04();
                            }
                        }
                    } else {
                        Iterator it2 = arrayList15.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass01A r09 = ((AnonymousClass0W0) it2.next()).A05;
                            if (r09 != null) {
                                A0E(r09).A04();
                            }
                        }
                    }
                }
                A0P(this.A00, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i4; i20 < i6; i20++) {
                    Iterator it3 = ((AnonymousClass050) arrayList3.get(i20)).A0B.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass01A r010 = ((AnonymousClass0W0) it3.next()).A05;
                        if (!(r010 == null || (viewGroup = r010.A0B) == null)) {
                            hashSet.add(AnonymousClass0V5.A01(viewGroup));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AnonymousClass0V5 r011 = (AnonymousClass0V5) it4.next();
                    r011.A01 = booleanValue2;
                    r011.A04();
                    r011.A02();
                }
                while (i4 < i6) {
                    AnonymousClass050 r1 = (AnonymousClass050) arrayList3.get(i4);
                    if (((Boolean) arrayList5.get(i4)).booleanValue() && r1.A04 >= 0) {
                        r1.A04 = -1;
                    }
                    i4++;
                }
                if (z3 && this.A0F != null) {
                    int i21 = 0;
                    while (true) {
                        ArrayList arrayList16 = this.A0F;
                        if (i21 < arrayList16.size()) {
                            C000900k r3 = (C000900k) ((C11900jW) arrayList16.get(i21));
                            C005402i x2 = r3.x();
                            if (x2 != null) {
                                int A042 = r3.A03.A00.A03.A04();
                                int i22 = R.string.str0fbe;
                                if (A042 == 0) {
                                    i22 = R.string.str0fbd;
                                }
                                x2.A0J(r3.getString(i22));
                                x2.A0N(true);
                            }
                            i21++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A0m(boolean z2) {
        A0n(z2);
        while (true) {
            ArrayList arrayList = this.A0J;
            ArrayList arrayList2 = this.A0I;
            ArrayList arrayList3 = this.A0W;
            synchronized (arrayList3) {
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    boolean z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= ((AnonymousClass051) arrayList3.get(i2)).A9O(arrayList, arrayList2);
                    }
                    arrayList3.clear();
                    this.A07.A02.removeCallbacks(this.A0C);
                    if (!z3) {
                        break;
                    }
                    this.A0M = true;
                    try {
                        A0k(this.A0J, this.A0I);
                    } finally {
                        A0J();
                    }
                } else {
                    break;
                }
            }
        }
        A0M();
        if (this.A0N) {
            this.A0N = false;
            A0L();
        }
        this.A0U.A02.values().removeAll(Collections.singleton((Object) null));
    }

    public final void A0n(boolean z2) {
        if (this.A0M) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.A07 == null) {
            if (this.A0L) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A07.A02.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !A0o()) {
            if (this.A0J == null) {
                this.A0J = new ArrayList();
                this.A0I = new ArrayList();
            }
            this.A0M = true;
            this.A0M = false;
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean A0o() {
        return this.A0P || this.A0Q;
    }

    public boolean A0p() {
        boolean z2;
        int size;
        A0m(false);
        A0n(true);
        AnonymousClass01A r0 = this.A06;
        if (r0 != null && r0.A0F().A0p()) {
            return true;
        }
        ArrayList arrayList = this.A0J;
        ArrayList arrayList2 = this.A0I;
        ArrayList arrayList3 = this.A0E;
        if (arrayList3 == null || (size = arrayList3.size() - 1) < 0) {
            z2 = false;
        } else {
            arrayList.add(arrayList3.remove(size));
            arrayList2.add(Boolean.TRUE);
            z2 = true;
            this.A0M = true;
            try {
                A0k(arrayList, arrayList2);
            } finally {
                A0J();
            }
        }
        A0M();
        if (this.A0N) {
            this.A0N = false;
            A0L();
        }
        this.A0U.A02.values().removeAll(Collections.singleton((Object) null));
        return z2;
    }

    public boolean A0q(Menu menu) {
        boolean z2 = false;
        if (this.A00 >= 1) {
            for (AnonymousClass01A r1 : this.A0U.A02()) {
                if (r1 != null && r1.A0d() && r1.A0f(menu)) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public boolean A0r(Menu menu, MenuInflater menuInflater) {
        int i2 = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AnonymousClass01A r1 : this.A0U.A02()) {
            if (r1 != null && r1.A0d() && r1.A0g(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r1);
                z2 = true;
            }
        }
        if (this.A0G != null) {
            while (true) {
                ArrayList arrayList2 = this.A0G;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                AnonymousClass01A r12 = (AnonymousClass01A) arrayList2.get(i2);
                if (arrayList == null || !arrayList.contains(r12)) {
                    r12.A0m();
                }
                i2++;
            }
        }
        this.A0G = arrayList;
        return z2;
    }

    public boolean A0s(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (AnonymousClass01A r0 : this.A0U.A02()) {
                if (r0 != null && r0.A0h(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0t(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (AnonymousClass01A r0 : this.A0U.A02()) {
                if (r0 != null && r0.A0i(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0u(AnonymousClass01A r4) {
        if (r4 != null) {
            AnonymousClass02C r1 = r4.A0H;
            if (!r4.equals(r1.A06) || !A0u(r1.A05)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int identityHashCode;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AnonymousClass01A r1 = this.A05;
        if (r1 != null) {
            sb.append(r1.getClass().getSimpleName());
            sb.append("{");
            identityHashCode = System.identityHashCode(r1);
        } else {
            AnonymousClass061 r12 = this.A07;
            if (r12 != null) {
                sb.append(r12.getClass().getSimpleName());
                sb.append("{");
                identityHashCode = System.identityHashCode(r12);
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(identityHashCode));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }
}
