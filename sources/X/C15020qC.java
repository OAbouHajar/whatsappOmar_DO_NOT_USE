package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.google.android.gms.common.api.internal.RunnablezaavShape0S0200000_I0;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0qC  reason: invalid class name and case insensitive filesystem */
public final class C15020qC implements C15030qD {
    public int A00;
    public int A01 = 0;
    public int A02;
    public C15700rh A03;
    public IAccountAccessor A04;
    public AnonymousClass5UT A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final Bundle A0C = new Bundle();
    public final AnonymousClass3AP A0D;
    public final AnonymousClass3WP A0E;
    public final AnonymousClass3EC A0F;
    public final AnonymousClass4O1 A0G;
    public final ArrayList A0H = new ArrayList();
    public final Map A0I;
    public final Set A0J = new HashSet();
    public final Lock A0K;

    public C15020qC(Context context, AnonymousClass3AP r3, AnonymousClass3WP r4, AnonymousClass3EC r5, AnonymousClass4O1 r6, Map map, Lock lock) {
        this.A0F = r5;
        this.A0G = r6;
        this.A0I = map;
        this.A0D = r3;
        this.A0E = r4;
        this.A0K = lock;
        this.A0B = context;
    }

    public final void A00() {
        this.A07 = false;
        AnonymousClass3EC r6 = this.A0F;
        r6.A05.A03 = Collections.emptySet();
        for (Object next : this.A0J) {
            Map map = r6.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new C15700rh(17, (PendingIntent) null));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        AnonymousClass3EC r3 = this.A0F;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            r3.A05.A0B();
            r3.A0E = new AnonymousClass3EA(r3);
            r3.A0E.AiU();
            r3.A0C.signalAll();
            lock.unlock();
            C815048o.A00.execute(new RunnableRunnableShape1S0100000_I0((Object) this, 7));
            AnonymousClass5UT r1 = this.A05;
            if (r1 != null) {
                if (this.A09) {
                    IAccountAccessor iAccountAccessor = this.A04;
                    C13710nw.A01(iAccountAccessor);
                    boolean z2 = this.A0A;
                    C65853Wv r12 = (C65853Wv) r1;
                    try {
                        C92094h0 r4 = (C92094h0) r12.A01();
                        Integer num = r12.A02;
                        C13710nw.A01(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r4.A01);
                        obtain.writeStrongBinder(iAccountAccessor == null ? null : iAccountAccessor.asBinder());
                        obtain.writeInt(intValue);
                        obtain.writeInt(z2 ? 1 : 0);
                        r4.A00(9, obtain);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            for (Object obj : r3.A0A.keySet()) {
                Object obj2 = r3.A09.get(obj);
                C13710nw.A01(obj2);
                ((C15750rn) obj2).A80();
            }
            Bundle bundle = this.A0C;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            r3.A07.AiQ(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void A02() {
        if (this.A02 != 0) {
            return;
        }
        if (!this.A07 || this.A08) {
            ArrayList arrayList = new ArrayList();
            this.A01 = 1;
            AnonymousClass3EC r5 = this.A0F;
            Map map = r5.A09;
            this.A02 = map.size();
            for (Object next : map.keySet()) {
                if (!r5.A0A.containsKey(next)) {
                    arrayList.add(map.get(next));
                } else if (A06()) {
                    A01();
                }
            }
            if (!arrayList.isEmpty()) {
                this.A0H.add(C815048o.A00.submit(new RunnablezaavShape0S0200000_I0(this, arrayList)));
            }
        }
    }

    public final void A03(C15700rh r6) {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        A05(!r6.A00());
        AnonymousClass3EC r0 = this.A0F;
        r0.A00(r6);
        r0.A07.AiO(r6);
    }

    public final void A04(C15700rh r5, C437721l r6, boolean z2) {
        if ((!z2 || r5.A00() || this.A0D.A01((Context) null, (String) null, r5.A01) != null) && this.A03 == null) {
            this.A03 = r5;
            this.A00 = Integer.MAX_VALUE;
        }
        this.A0F.A0A.put(r6.A01, r5);
    }

    public final void A05(boolean z2) {
        AnonymousClass5UT r4 = this.A05;
        if (r4 != null) {
            if (r4.isConnected() && z2) {
                C65853Wv r0 = (C65853Wv) r4;
                try {
                    C92094h0 r3 = (C92094h0) r0.A01();
                    Integer num = r0.A02;
                    C13710nw.A01(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(r3.A01);
                    obtain.writeInt(intValue);
                    r3.A00(7, obtain);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            r4.A80();
            C13710nw.A01(this.A0G);
            this.A04 = null;
        }
    }

    public final boolean A06() {
        C15700rh r2;
        int i2 = this.A02 - 1;
        this.A02 = i2;
        if (i2 <= 0) {
            if (i2 < 0) {
                Log.w("GACConnecting", this.A0F.A05.A09());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                r2 = new C15700rh(8, (PendingIntent) null);
            } else {
                r2 = this.A03;
                if (r2 == null) {
                    return true;
                }
                this.A0F.A00 = this.A00;
            }
            A03(r2);
        }
        return false;
    }

    public final boolean A07(int i2) {
        if (this.A01 == i2) {
            return true;
        }
        Log.w("GACConnecting", this.A0F.A05.A09());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i3 = this.A02;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i3);
        Log.w("GACConnecting", sb.toString());
        String str = this.A01 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str.length() + 70 + str2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        A03(new C15700rh(8, (PendingIntent) null));
        return false;
    }

    public final C438121p AiN(C438121p r2) {
        this.A0F.A05.A0I.add(r2);
        return r2;
    }

    public final C438121p AiP(C438121p r3) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.5UT, X.0rn] */
    public final void AiU() {
        AnonymousClass3EC r2 = this.A0F;
        r2.A0A.clear();
        this.A07 = false;
        this.A03 = null;
        this.A01 = 0;
        this.A06 = true;
        this.A08 = false;
        this.A09 = false;
        HashMap hashMap = new HashMap();
        Map map = this.A0I;
        for (C437721l r6 : map.keySet()) {
            Map map2 = r2.A09;
            AnonymousClass458 r5 = r6.A01;
            Object obj = map2.get(r5);
            C13710nw.A01(obj);
            C15750rn r4 = (C15750rn) obj;
            boolean booleanValue = ((Boolean) map.get(r6)).booleanValue();
            if (r4.AcM()) {
                this.A07 = true;
                if (booleanValue) {
                    this.A0J.add(r5);
                } else {
                    this.A06 = false;
                }
            }
            hashMap.put(r4, new C98024qy(r6, this, booleanValue));
        }
        if (this.A07) {
            AnonymousClass4O1 r9 = this.A0G;
            C13710nw.A01(r9);
            AnonymousClass3WP r42 = this.A0E;
            C13710nw.A01(r42);
            C57912sB r1 = r2.A05;
            r9.A00 = Integer.valueOf(System.identityHashCode(r1));
            C97864qi r7 = new C97864qi(this);
            this.A05 = r42.A00(this.A0B, r1.A06, r7, r7, r9, r9.A01);
        }
        this.A02 = r2.A09.size();
        this.A0H.add(C815048o.A00.submit(new RunnablezaavShape0S0200000_I0(this, (Map) hashMap)));
    }

    public final void AiX() {
    }

    public final void Aia(Bundle bundle) {
        if (A07(1)) {
            if (bundle != null) {
                this.A0C.putAll(bundle);
            }
            if (A06()) {
                A01();
            }
        }
    }

    public final void Aib(C15700rh r2, C437721l r3, boolean z2) {
        if (A07(1)) {
            A04(r2, r3, z2);
            if (A06()) {
                A01();
            }
        }
    }

    public final void Aic(int i2) {
        A03(new C15700rh(8, (PendingIntent) null));
    }

    public final boolean Aid() {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0F.A00((C15700rh) null);
        return true;
    }
}
