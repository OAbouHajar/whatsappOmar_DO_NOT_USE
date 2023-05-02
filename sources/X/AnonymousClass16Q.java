package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.16Q  reason: invalid class name */
public class AnonymousClass16Q {
    public C445824q A00 = new C445824q();
    public Runnable A01;
    public final C16040sK A02;
    public final C15900s5 A03;
    public final C33301iM A04 = new C33301iM();
    public final C33271iJ A05 = new C33271iJ();
    public final C16320sq A06;

    public AnonymousClass16Q(C16040sK r2, C15900s5 r3, C16320sq r4) {
        this.A02 = r2;
        this.A06 = r4;
        this.A03 = r3;
    }

    public final void A00() {
        C445824q r4 = this.A00;
        if (r4.A02()) {
            boolean A012 = r4.A01();
            boolean z2 = r4.A02;
            StringBuilder sb = new StringBuilder("CriticalDataUploadManager/handleCompleted isSuccess=");
            sb.append(A012);
            sb.append(", hasTimedOut=");
            sb.append(z2);
            Log.i(sb.toString());
            synchronized (this) {
                Runnable runnable = this.A01;
                if (runnable != null) {
                    this.A06.Ac3(runnable);
                    this.A01 = null;
                }
                AnonymousClass1ZU r1 = r4.A01;
                synchronized (r1) {
                    r1.A00 = 1;
                }
                AnonymousClass1ZU r12 = r4.A00;
                synchronized (r12) {
                    r12.A00 = 1;
                }
                r4.A02 = false;
            }
            Iterator it = this.A04.A01().iterator();
            if (A012) {
                while (it.hasNext()) {
                    ((C33321iO) it.next()).onSuccess();
                }
                return;
            }
            while (it.hasNext()) {
                ((C33321iO) it.next()).AQr(z2);
            }
        }
    }

    public void A01(boolean z2) {
        C445824q r2 = this.A00;
        AnonymousClass1ZU r1 = r2.A01;
        if ((!r1.A05() || !r2.A00.A05()) && C445824q.A00(r1, z2)) {
            StringBuilder sb = new StringBuilder("CriticalDataUploadManager/onHistorySyncComplete isSuccess=");
            sb.append(z2);
            Log.i(sb.toString());
            A00();
        }
    }

    public synchronized void A02(boolean z2) {
        C445824q r1 = this.A00;
        if (!r1.A01.A05() || !r1.A00.A05()) {
            if (C445824q.A00(r1.A00, z2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CriticalDataUploadManager/onAppStateSyncComplete isSuccess=");
                sb.append(z2);
                Log.i(sb.toString());
                A00();
            }
        }
    }
}
