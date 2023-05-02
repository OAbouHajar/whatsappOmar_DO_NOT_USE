package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

/* renamed from: X.1h1  reason: invalid class name and case insensitive filesystem */
public abstract class C32721h1 {
    public int A00;
    public C32841hK A01;
    public MultiBufferLogger A02;
    public String A03;
    public boolean A04;
    public volatile boolean A05;

    public C32721h1(String str) {
        this.A03 = str;
        this.A04 = str == null;
    }

    public final MultiBufferLogger A00() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A02 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A02;
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        if (!this.A04) {
            synchronized (this) {
                if (!this.A04) {
                    MultiBufferLogger A002 = A00();
                    try {
                        int writeStandardEntry = A002.writeStandardEntry(6, 21, 0, 0, 0, 0, 0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("ensureSoLibLoaded: ");
                        String str = this.A03;
                        sb.append(str);
                        A002.writeBytesEntry(0, 83, writeStandardEntry, sb.toString());
                        SoLoader.A06(str);
                        this.A04 = true;
                        A002.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                    } catch (Throwable th) {
                        A002.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                        throw th;
                    }
                }
            }
        }
    }

    public final void A02(C32841hK r4) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i2 = this.A00;
        if (i2 != 0) {
            int i3 = i2 & TraceEvents.sProviders;
            int i4 = this.A00;
            if (i3 == i4) {
                return;
            }
            if (i4 != 0) {
                disable();
                this.A01 = null;
            }
        }
        if (supportedProviders != 0) {
            this.A01 = r4;
            enable();
        }
        this.A00 = supportedProviders;
    }

    public final void A03(C32841hK r3, C32751h7 r4) {
        if (this.A00 != 0 && (r3.A02 & getSupportedProviders()) != 0) {
            A01();
            onTraceEnded(r3, r4);
            A02(r3);
            A00().removeBuffer(r3.A09);
        }
    }

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(C32841hK r1, C32751h7 r2) {
    }

    public void onTraceStarted(C32841hK r1, C32751h7 r2) {
    }
}
