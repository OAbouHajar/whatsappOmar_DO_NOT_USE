package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0510000_I0;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.12z  reason: invalid class name and case insensitive filesystem */
public class C211512z {
    public long A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public boolean A03;
    public C30971dG[] A04;
    public final C14870pt A05;
    public final C16040sK A06;
    public final C16600tK A07;
    public final AnonymousClass1CH A08;
    public final C16440t3 A09;
    public final C15860rz A0A;
    public final C208211s A0B;
    public final AnonymousClass16P A0C;
    public final C18920xT A0D;
    public final C17190ug A0E;
    public final AnonymousClass1S7 A0F;
    public final AnonymousClass1S8 A0G;
    public final AnonymousClass130 A0H;
    public final C34531kQ A0I = new C34531kQ(10, 610);
    public final C16320sq A0J;

    public C211512z(C14870pt r6, C16040sK r7, C16600tK r8, AnonymousClass1CH r9, C16440t3 r10, C15860rz r11, C208211s r12, AnonymousClass16P r13, C18920xT r14, C17190ug r15, AnonymousClass1S7 r16, AnonymousClass1S8 r17, AnonymousClass130 r18, C16320sq r19) {
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A0J = r19;
        this.A0D = r14;
        this.A0E = r15;
        this.A0C = r13;
        this.A07 = r8;
        this.A0B = r12;
        this.A0A = r11;
        this.A0F = r16;
        this.A0H = r18;
        this.A08 = r9;
        this.A0G = r17;
    }

    public void A00() {
        Lock A012 = this.A0D.A01();
        if (A012 != null) {
            try {
                A012.lock();
            } catch (Throwable th) {
                if (A012 != null) {
                    A012.unlock();
                }
                throw th;
            }
        }
        this.A0B.A0Q();
        A03();
        if (A012 != null) {
            A012.unlock();
        }
    }

    public synchronized void A01() {
        this.A00 = 0;
    }

    public synchronized void A02() {
        if (this.A07.A05) {
            long j2 = this.A00;
            if (j2 == 0 || SystemClock.uptimeMillis() - j2 > 60000) {
                this.A0E.A09(Message.obtain((Handler) null, 0, 88, 0), false);
                this.A00 = SystemClock.uptimeMillis();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        sb.append(this.A00);
        Log.i(sb.toString());
    }

    public synchronized void A03() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.A07.A05) {
            long j2 = this.A01;
            if (j2 == 0 || uptimeMillis - j2 > 180000) {
                A05(uptimeMillis);
                A06(true);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/sendSetPreKey/skip last:");
        sb.append(this.A01);
        Log.i(sb.toString());
    }

    public final synchronized void A04() {
        if (this.A03) {
            this.A03 = false;
            this.A0I.A02();
        }
    }

    public final synchronized void A05(long j2) {
        this.A01 = j2;
    }

    public final void A06(boolean z2) {
        Lock A012 = this.A0D.A01();
        if (A012 == null) {
            try {
                this.A0C.A00();
            } catch (Throwable th) {
                if (A012 != null) {
                    A012.unlock();
                }
                throw th;
            }
        } else {
            A012.lock();
        }
        C208211s r3 = this.A0B;
        int A013 = r3.A07.A01();
        byte[] A0h = r3.A0h();
        Lock A014 = r3.A0I.A01();
        if (A014 == null) {
            r3.A0H.A00();
        } else {
            try {
                A014.lock();
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("error reading prekey ");
                sb.append(r5.A00);
                Log.e(sb.toString(), e2);
            } catch (Throwable th2) {
                if (A014 != null) {
                    A014.unlock();
                }
                throw th2;
            }
        }
        List<C31731ew> A015 = r3.A00.A00.A04.A01();
        ArrayList arrayList = new ArrayList();
        for (C31731ew r5 : A015) {
            arrayList.add(C35971mn.A00(new C36441nY(r5.A01), r5.A00));
        }
        StringBuilder sb2 = new StringBuilder("axolotl reporting back ");
        sb2.append(arrayList.size());
        sb2.append(" prekeys for sending to the server");
        Log.i(sb2.toString());
        C30971dG[] r14 = (C30971dG[]) arrayList.toArray(new C30971dG[0]);
        if (A014 != null) {
            A014.unlock();
        }
        C30971dG A0I2 = r3.A0I();
        this.A05.A0K(new RunnableRunnableShape0S0510000_I0(this, A0h, C28641Wx.A02(A013), r14, A0I2, 1, z2));
        if (A012 != null) {
            A012.unlock();
        }
    }
}
