package X;

import android.content.Context;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.redex.IDxProviderShape468S0100000_2_I0;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xZ  reason: invalid class name and case insensitive filesystem */
public class C18980xZ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass10O A04;
    public final JniBridge A05;
    public final C26911Ps A06;
    public final C26921Pt A07;

    public C18980xZ(AnonymousClass10O r1, JniBridge jniBridge, C26911Ps r3, C26921Pt r4) {
        this.A05 = jniBridge;
        this.A04 = r1;
        this.A06 = r3;
        this.A07 = r4;
    }

    public synchronized void A00() {
        if (this.A02) {
            JniBridge jniBridge = this.A05;
            JniBridge.jvidispatchI();
            JniBridge.jvidispatchIO(0, (NativeHolder) jniBridge.wajContext.get());
            this.A02 = false;
        }
    }

    public synchronized void A01(Context context) {
        if (!this.A00) {
            Log.i("WaMsysSetup/bootstrap");
            synchronized (com.facebook.msys.mci.Log.class) {
                C004201v.A01("registerLogger");
                try {
                    if (!com.facebook.msys.mci.Log.sRegistered) {
                        com.facebook.msys.mci.Log.registerLoggerNative(823, 5, false);
                        com.facebook.msys.mci.Log.setLogLevel(4);
                        com.facebook.msys.mci.Log.sRegistered = true;
                    }
                } finally {
                    C004201v.A00();
                }
            }
            Proxies.configure(new ProxyProvider(new C42981z7(new IDxProviderShape468S0100000_2_I0(this, 0), new IDxProviderShape468S0100000_2_I0(this, 1))));
            Execution.initialize();
            FileManager.initialize(context.getCacheDir());
            NativeHolder nativeHolder = (NativeHolder) this.A05.wajContext.getAndSet((NativeHolder) JniBridge.jvidispatchO(0));
            if (nativeHolder != null) {
                nativeHolder.release();
            }
            this.A00 = true;
        }
    }

    public final synchronized void A02(Context context, C17130ua r11, C17670vS r12, C17660vR r13, C16320sq r14) {
        NotificationCenter notificationCenter;
        if (!this.A03) {
            C26921Pt r3 = this.A07;
            NotificationCenter notificationCenter2 = new NotificationCenter(false);
            synchronized (r3) {
                try {
                    AnonymousClass00B.A06(notificationCenter2);
                    r3.A00 = notificationCenter2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            C17660vR r6 = r13;
            String A002 = r13.A00();
            synchronized (r3) {
                notificationCenter = r3.A00;
                AnonymousClass00B.A06(notificationCenter);
            }
            NetworkSession networkSession = new NetworkSession(A002, notificationCenter, new AnonymousClass1z9(r11, r12, r6, r14, context.getCacheDir()));
            C26911Ps r1 = this.A06;
            synchronized (r1) {
                try {
                    AnonymousClass00B.A06(networkSession);
                    r1.A00 = networkSession;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            this.A03 = true;
        }
    }

    public synchronized void A03(C17130ua r16, C16980tz r17, C15860rz r18, AnonymousClass013 r19, C17670vS r20, C17660vR r21, C16320sq r22, String str) {
        NetworkSession networkSession;
        synchronized (this) {
            if (!this.A02) {
                Log.i("WaMsysSetup/bootstrapForReg");
                Context context = r17.A00;
                A01(context);
                A02(context, r16, r20, r21, r22);
                JniBridge jniBridge = this.A05;
                C26911Ps r2 = this.A06;
                synchronized (r2) {
                    try {
                        networkSession = r2.A00;
                        AnonymousClass00B.A06(networkSession);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                if (0 != JniBridge.jvidispatchIOO(0, networkSession, (NativeHolder) jniBridge.wajContext.get())) {
                    JniBridge.jvidispatchIIOOOOO((long) 0, r19.A06(), r19.A05(), str, r18.A0N(), (NativeHolder) jniBridge.wajContext.get());
                    JsonSerialization.initialize();
                    this.A02 = true;
                } else {
                    th = new IllegalStateException("wa-msys/failed to initialize WCRManager");
                    throw th;
                }
            }
        }
    }
}
