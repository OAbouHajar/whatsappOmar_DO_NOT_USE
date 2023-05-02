package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1Sb  reason: invalid class name and case insensitive filesystem */
public class C27521Sb {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16040sK A01;
    public final C18020w1 A02;
    public final C19000xb A03;
    public final C19250y7 A04;
    public final AnonymousClass1SL A05;
    public final C16440t3 A06;
    public final C208211s A07;
    public final AnonymousClass16P A08;
    public final C18920xT A09;
    public final C15810rt A0A;
    public final C16460t6 A0B;
    public final C16070sO A0C;
    public final AnonymousClass16V A0D;
    public final AnonymousClass1HF A0E;
    public final AnonymousClass15G A0F;
    public final AnonymousClass137 A0G;
    public final C19810z2 A0H;
    public final C14710pd A0I;
    public final AnonymousClass0y3 A0J;
    public final AnonymousClass124 A0K;
    public final C207811o A0L;
    public final AnonymousClass1RV A0M;
    public final AnonymousClass1GC A0N;
    public final C19450yS A0O;
    public final JniBridge A0P;

    public C27521Sb(C16040sK r3, C18020w1 r4, C19000xb r5, C19250y7 r6, AnonymousClass1SL r7, C16440t3 r8, C208211s r9, AnonymousClass16P r10, C18920xT r11, C15810rt r12, C16460t6 r13, C16070sO r14, AnonymousClass16V r15, AnonymousClass1HF r16, AnonymousClass15G r17, AnonymousClass137 r18, C19810z2 r19, C14710pd r20, AnonymousClass0y3 r21, AnonymousClass124 r22, C207811o r23, AnonymousClass1RV r24, AnonymousClass1GC r25, C19450yS r26, JniBridge jniBridge) {
        this.A06 = r8;
        this.A0I = r20;
        this.A01 = r3;
        this.A0A = r12;
        this.A0P = jniBridge;
        this.A0K = r22;
        this.A09 = r11;
        this.A03 = r5;
        this.A02 = r4;
        this.A0E = r16;
        this.A08 = r10;
        this.A0B = r13;
        this.A0M = r24;
        this.A07 = r9;
        this.A0H = r19;
        this.A0J = r21;
        this.A04 = r6;
        this.A0L = r23;
        this.A0F = r17;
        this.A0G = r18;
        this.A0D = r15;
        this.A0O = r26;
        this.A0C = r14;
        this.A05 = r7;
        this.A0N = r25;
    }

    public byte[] A00(DeviceJid deviceJid, C28381Vw r17, C30971dG r18, C30971dG r19, byte[] bArr, byte[] bArr2, int i2, int i3, boolean z2) {
        DeviceJid deviceJid2 = deviceJid;
        Lock A042 = this.A09.A04(deviceJid2);
        if (A042 == null) {
            this.A08.A00();
        } else {
            try {
                A042.lock();
            } catch (Throwable th) {
                if (A042 != null) {
                    A042.unlock();
                }
                throw th;
            }
        }
        C28861Yb A022 = C28851Ya.A02(deviceJid2);
        StringBuilder sb = new StringBuilder();
        sb.append("axolotl checking sessions for ");
        sb.append(A022);
        sb.append(" due to retry receipt for ");
        C28381Vw r2 = r17;
        sb.append(r2);
        Log.i(sb.toString());
        boolean z3 = false;
        byte[] bArr3 = bArr2;
        int i4 = i3;
        if (bArr2 != null) {
            C30971dG r11 = r18;
            if (r18 != null) {
                C30971dG r10 = r19;
                if (r19 != null) {
                    if (z2) {
                        C208211s r1 = this.A07;
                        if (!r1.A0d(A022)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("axolotl Not processing keys from the receipt, missing session for ");
                            sb2.append(r2);
                            Log.i(sb2.toString());
                        } else if (r1.A0D(A022).A01.A00.A03 != i4) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Not processing keys from the receipt, registrationId does not match for ");
                            sb3.append(r2);
                            Log.i(sb3.toString());
                        }
                        z3 = true;
                    }
                    if (!z3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("axolotl processing keys from the receipt for jid:");
                        sb4.append(deviceJid2);
                        Log.i(sb4.toString());
                        int A043 = this.A07.A04(C28851Ya.A02(deviceJid2), r10, r11, bArr3, bArr, (byte) 5);
                        if (A043 == 0) {
                            this.A00.post(new RunnableRunnableShape10S0200000_I0_8(this, 7, deviceJid2));
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Error received from SignalCoordinator; status=");
                            sb5.append(A043);
                            Log.e(sb5.toString());
                        }
                    }
                }
            }
        }
        C208211s r6 = this.A07;
        if (r6.A0d(A022)) {
            C36031mt r12 = r6.A0D(A022).A01.A00;
            byte[] A044 = r12.A05.A04();
            if (r12.A03 != i4) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("axolotl deleting session due to registration id change for ");
                sb6.append(r2);
                Log.i(sb6.toString());
                r6.A0U(A022);
                r6.A0T(A022);
            } else {
                int i5 = i2;
                if (i5 > 2 && r6.A0f(A022, r2)) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("axolotl will wait to send ");
                    sb7.append(r2);
                    sb7.append(" until a new prekey has been fetched");
                    Log.i(sb7.toString());
                } else if (i5 == 2) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("axolotl will record the base key used to send ");
                    sb8.append(r2);
                    Log.i(sb8.toString());
                    r6.A0X(A022, r2, A044);
                }
            }
            if (A042 != null) {
                A042.unlock();
            }
            return A044;
        }
        if (A042 != null) {
            A042.unlock();
        }
        return null;
    }
}
