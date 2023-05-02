package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0rp  reason: invalid class name and case insensitive filesystem */
public abstract class C15770rp {
    public static final AnonymousClass3Y2[] A0T = new AnonymousClass3Y2[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public C15700rh A07 = null;
    public C108415Nw A08;
    public IGmsServiceBroker A09;
    public C91564g7 A0A;
    public C84144Jk A0B;
    public AtomicInteger A0C = new AtomicInteger(0);
    public boolean A0D = false;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final Looper A0H;
    public final AnonymousClass3AP A0I;
    public final C107785Lk A0J;
    public final C107795Ll A0K;
    public final C90074dS A0L;
    public final Object A0M = new Object();
    public final Object A0N = new Object();
    public final String A0O;
    public final ArrayList A0P = new ArrayList();
    public volatile C66113Xv A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public C15770rp(Context context, Looper looper, AnonymousClass3AP r6, C107785Lk r7, C107795Ll r8, C90074dS r9, String str, int i2) {
        C13710nw.A02(context, "Context must not be null");
        this.A0F = context;
        C13710nw.A02(looper, "Looper must not be null");
        this.A0H = looper;
        C13710nw.A02(r9, "Supervisor must not be null");
        this.A0L = r9;
        C13710nw.A02(r6, "API availability must not be null");
        this.A0I = r6;
        this.A0G = new C58062sU(looper, this);
        this.A0E = i2;
        this.A0J = r7;
        this.A0K = r8;
        this.A0O = str;
    }

    public static /* bridge */ /* synthetic */ boolean A00(IInterface iInterface, C15770rp r3, int i2, int i3) {
        synchronized (r3.A0M) {
            if (r3.A02 != i2) {
                return false;
            }
            r3.A04(iInterface, i3);
            return true;
        }
    }

    public final IInterface A01() {
        IInterface iInterface;
        synchronized (this.A0M) {
            if (this.A02 == 5) {
                throw new DeadObjectException();
            } else if (isConnected()) {
                iInterface = this.A06;
                C13710nw.A02(iInterface, "Client is connected but service is null");
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    public String A02() {
        return "com.google.android.gms";
    }

    public void A03(Bundle bundle, IBinder iBinder, int i2, int i3) {
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new C58022sQ(bundle, iBinder, this, i2)));
    }

    public final void A04(IInterface iInterface, int i2) {
        C84144Jk r0;
        boolean z2 = true;
        if (i2 != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            synchronized (this.A0M) {
                this.A02 = i2;
                this.A06 = iInterface;
                if (i2 == 1) {
                    C91564g7 r5 = this.A0A;
                    if (r5 != null) {
                        C90074dS r4 = this.A0L;
                        C84144Jk r02 = this.A0B;
                        String str = r02.A00;
                        C13710nw.A01(str);
                        r4.A01(r5, new AnonymousClass3BI(str, r02.A01, r02.A02));
                        this.A0A = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    C91564g7 r52 = this.A0A;
                    if (!(r52 == null || (r0 = this.A0B) == null)) {
                        String str2 = r0.A00;
                        String str3 = r0.A01;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + String.valueOf(str3).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on ");
                        sb.append(str3);
                        Log.e("GmsClient", sb.toString());
                        C90074dS r42 = this.A0L;
                        C84144Jk r03 = this.A0B;
                        String str4 = r03.A00;
                        C13710nw.A01(str4);
                        r42.A01(r52, new AnonymousClass3BI(str4, r03.A01, r03.A02));
                        this.A0C.incrementAndGet();
                    }
                    AtomicInteger atomicInteger = this.A0C;
                    C91564g7 r9 = new C91564g7(this, atomicInteger.get());
                    this.A0A = r9;
                    C84144Jk r8 = new C84144Jk(A02(), A0B(), A05());
                    this.A0B = r8;
                    boolean z4 = r8.A02;
                    if (!z4 || ADl() >= 17895000) {
                        C90074dS r43 = this.A0L;
                        String str5 = r8.A00;
                        C13710nw.A01(str5);
                        String str6 = r8.A01;
                        String str7 = this.A0O;
                        if (str7 == null) {
                            str7 = this.A0F.getClass().getName();
                        }
                        if (!r43.A02(r9, new AnonymousClass3BI(str5, str6, z4), str7)) {
                            C84144Jk r04 = this.A0B;
                            String str8 = r04.A00;
                            String str9 = r04.A01;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(str8);
                            sb2.append(" on ");
                            sb2.append(str9);
                            Log.w("GmsClient", sb2.toString());
                            int i3 = atomicInteger.get();
                            Handler handler = this.A0G;
                            handler.sendMessage(handler.obtainMessage(7, i3, -1, new AnonymousClass3YM(this, 16)));
                        }
                    } else {
                        String valueOf = String.valueOf(r8.A00);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                } else if (i2 == 4) {
                    C13710nw.A01(iInterface);
                    this.A04 = System.currentTimeMillis();
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean A05() {
        return ADl() >= 211700000;
    }

    public boolean A06() {
        return this instanceof C57962sG;
    }

    public AnonymousClass3Y2[] A07() {
        return this instanceof C57962sG ? AnonymousClass4BF.A05 : A0T;
    }

    public Bundle A08() {
        return new Bundle();
    }

    public IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return !(queryLocalInterface instanceof AnonymousClass5UF) ? new C66533a4(iBinder) : queryLocalInterface;
    }

    public String A0A() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public String A0B() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public void A6Y(C108415Nw r3) {
        C13710nw.A02(r3, "Connection progress callbacks cannot be null.");
        this.A08 = r3;
        A04((IInterface) null, 2);
    }

    public void A80() {
        this.A0C.incrementAndGet();
        ArrayList arrayList = this.A0P;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass4R4 r1 = (AnonymousClass4R4) arrayList.get(i2);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0N) {
            this.A09 = null;
        }
        A04((IInterface) null, 1);
    }

    public abstract int ADl();

    /* JADX INFO: finally extract failed */
    public void AFQ(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A082 = A08();
        AnonymousClass3Y1 r7 = new AnonymousClass3Y1(this.A0E, this.A0R);
        r7.A05 = this.A0F.getPackageName();
        r7.A03 = A082;
        if (set != null) {
            r7.A0B = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (AcM()) {
            r7.A02 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                r7.A04 = iAccountAccessor.asBinder();
            }
        }
        r7.A09 = A0T;
        r7.A0A = A07();
        if (A06()) {
            r7.A08 = true;
        }
        try {
            synchronized (this.A0N) {
                IGmsServiceBroker iGmsServiceBroker = this.A09;
                if (iGmsServiceBroker != null) {
                    C58052sT r1 = new C58052sT(this, this.A0C.get());
                    C98034qz r6 = (C98034qz) iGmsServiceBroker;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(r1.asBinder());
                        obtain.writeInt(1);
                        C93354j3.A00(obtain, r7, 0);
                        r6.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0C.get(), 3));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            A03((Bundle) null, (IBinder) null, 8, this.A0C.get());
        }
    }

    public Intent AG4() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean AIg() {
        boolean z2;
        synchronized (this.A0M) {
            int i2 = this.A02;
            z2 = true;
            if (!(i2 == 2 || i2 == 3)) {
                z2 = false;
            }
        }
        return z2;
    }

    public boolean Aav() {
        return false;
    }

    public boolean AcL() {
        return true;
    }

    public boolean AcM() {
        return false;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.A0M) {
            z2 = false;
            if (this.A02 == 4) {
                z2 = true;
            }
        }
        return z2;
    }
}
