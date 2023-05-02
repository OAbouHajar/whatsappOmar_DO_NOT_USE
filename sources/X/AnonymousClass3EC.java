package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3EC  reason: invalid class name */
public final class AnonymousClass3EC implements C15590rW, C15740rm {
    public int A00;
    public C15700rh A01 = null;
    public final Context A02;
    public final AnonymousClass3AP A03;
    public final AnonymousClass3WP A04;
    public final C57912sB A05;
    public final C66313Yw A06;
    public final AnonymousClass5SQ A07;
    public final AnonymousClass4O1 A08;
    public final Map A09;
    public final Map A0A = AnonymousClass000.A0x();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C15030qD A0E;

    public AnonymousClass3EC(Context context, Looper looper, AnonymousClass3AP r6, AnonymousClass3WP r7, C57912sB r8, AnonymousClass5SQ r9, AnonymousClass4O1 r10, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = r6;
        this.A09 = map;
        this.A08 = r10;
        this.A0B = map2;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = r9;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C97874qj) arrayList.get(i2)).A00 = this;
        }
        this.A06 = new C66313Yw(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new AnonymousClass3EB(this);
    }

    public final void A00(C15700rh r3) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = r3;
            this.A0E = new AnonymousClass3EB(this);
            this.A0E.AiU();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final C438121p AiW(C438121p r2) {
        r2.zak();
        this.A0E.AiN(r2);
        return r2;
    }

    public final C438121p AiZ(C438121p r2) {
        r2.zak();
        return this.A0E.AiP(r2);
    }

    public final void Aie() {
        this.A0E.AiX();
    }

    public final void Aif() {
        this.A0E.Aid();
        this.A0A.clear();
    }

    public final void Aig(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String str2 = str;
        String concat = String.valueOf(str2).concat("  ");
        PrintWriter printWriter2 = printWriter;
        printWriter2.append(str2).append("mState=").println(this.A0E);
        Iterator A0I = C13700nu.A0I(this.A0B);
        while (A0I.hasNext()) {
            C437721l r2 = (C437721l) A0I.next();
            printWriter2.append(str2).append(r2.A02).println(":");
            Object obj = this.A09.get(r2.A01);
            C13710nw.A01(obj);
            C15770rp r7 = (C15770rp) ((C15750rn) obj);
            synchronized (r7.A0M) {
                i2 = r7.A02;
                iInterface = r7.A06;
            }
            synchronized (r7.A0N) {
                iGmsServiceBroker = r7.A09;
            }
            printWriter2.append(concat).append("mConnectState=");
            printWriter2.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
            printWriter2.append(" mService=");
            if (iInterface == null) {
                printWriter2.append("null");
            } else {
                printWriter2.append(r7.A0A()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter2.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter2.println("null");
            } else {
                printWriter2.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (r7.A04 > 0) {
                PrintWriter append = printWriter2.append(concat).append("lastConnectedTime=");
                long j2 = r7.A04;
                String format = simpleDateFormat.format(new Date(j2));
                StringBuilder A0g = C13690nt.A0g(C13680ns.A06(format) + 21);
                A0g.append(j2);
                A0g.append(" ");
                append.println(AnonymousClass000.A0h(format, A0g));
            }
            if (r7.A03 > 0) {
                printWriter2.append(concat).append("lastSuspendedCause=");
                int i3 = r7.A00;
                printWriter2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? String.valueOf(i3) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
                PrintWriter append2 = printWriter2.append(" lastSuspendedTime=");
                long j3 = r7.A03;
                String format2 = simpleDateFormat.format(new Date(j3));
                StringBuilder A0g2 = C13690nt.A0g(C13680ns.A06(format2) + 21);
                A0g2.append(j3);
                A0g2.append(" ");
                append2.println(AnonymousClass000.A0h(format2, A0g2));
            }
            if (r7.A05 > 0) {
                printWriter2.append(concat).append("lastFailedStatus=").append(AnonymousClass45O.A00(r7.A01));
                PrintWriter append3 = printWriter2.append(" lastFailedTime=");
                long j4 = r7.A05;
                String format3 = simpleDateFormat.format(new Date(j4));
                StringBuilder A0g3 = C13690nt.A0g(C13680ns.A06(format3) + 21);
                A0g3.append(j4);
                A0g3.append(" ");
                append3.println(AnonymousClass000.A0h(format3, A0g3));
            }
        }
    }

    public final void Aih() {
    }

    public final boolean Aii() {
        return this.A0E instanceof AnonymousClass3EA;
    }

    public final boolean Aij(C107765Li r2) {
        return false;
    }

    public final void onConnected(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Aia(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i2) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Aic(i2);
        } finally {
            lock.unlock();
        }
    }
}
