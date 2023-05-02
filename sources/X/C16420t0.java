package X;

import android.os.SystemClock;
import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.0t0  reason: invalid class name and case insensitive filesystem */
public class C16420t0 {
    public NativeVOPRFExtension A00;
    public final C15900s5 A01;
    public final C16600tK A02;
    public final C16440t3 A03;
    public final C16450t5 A04;
    public final C16430t1 A05;
    public final C24741Hc A06;
    public final C16320sq A07;
    public final AnonymousClass12P A08;
    public volatile int A09 = 0;
    public volatile long A0A;
    public volatile long A0B;
    public volatile String A0C;
    public volatile boolean A0D;
    public volatile boolean A0E = false;
    public volatile byte[] A0F;

    public C16420t0(C15900s5 r2, C16600tK r3, C16440t3 r4, C16450t5 r5, C16430t1 r6, C24741Hc r7, C16320sq r8, AnonymousClass12P r9) {
        this.A03 = r4;
        this.A07 = r8;
        this.A0D = false;
        this.A01 = r2;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        r7.A00 = this;
    }

    public int A00() {
        C16430t1 r4 = this.A05;
        int i2 = r4.A00().getInt("first_token_stage", 0);
        if (i2 == 1) {
            synchronized (this) {
                return this.A0D ? 15 : 2;
            }
        } else if (i2 != 0) {
            return r4.A00().getInt("token_not_ready_reason", 0);
        } else {
            return 2;
        }
    }

    public synchronized void A01() {
        if (!A07() && !this.A0D) {
            C16430t1 r9 = this.A05;
            int i2 = r9.A00().getInt("redeem_count", -1);
            long A002 = (this.A03.A00() / 1000) - r9.A00().getLong("base_timestamp", 0);
            if (i2 < 0 || i2 >= 512 || A002 >= r9.A00().getLong("time_to_live", 0)) {
                this.A0D = true;
                A05(false);
            } else {
                C15900s5 r3 = this.A01;
                int A022 = r3.A02(C15910s6.A09);
                long A023 = (long) r3.A02(C15910s6.A08);
                if (i2 >= A022 || A002 > r9.A00().getLong("time_to_live", 0) - A023) {
                    this.A0D = true;
                    A05(true);
                }
            }
        }
    }

    public final synchronized void A02() {
        this.A0C = null;
        this.A0F = null;
        this.A09 = 0;
        this.A0E = false;
        this.A0D = false;
        C16430t1 r3 = this.A05;
        r3.A05("original_token", (String) null);
        r3.A05("next_original_token", (String) null);
        r3.A04("base_timestamp", 0);
        r3.A04("time_to_live", 0);
        r3.A05("blinding_factor", (String) null);
        r3.A02(-1);
        r3.A05("shared_secret", (String) null);
        if (r3.A00().getInt("first_token_stage", 0) == 1) {
            r3.A01(0);
        }
    }

    public final void A03(int i2) {
        if (this.A09 < 2) {
            this.A09++;
            this.A07.Ad4(new RunnableRunnableShape9S0100000_I0_8(this, 13), "PrivateStatstoken/retry", ((long) this.A09) * AnonymousClass1NO.A0L * ((long) this.A09));
            return;
        }
        C16430t1 r2 = this.A05;
        int i3 = 10;
        if (i2 == 5) {
            i3 = 9;
        }
        r2.A03(i3);
        A06(false, i2);
    }

    public final synchronized void A04(int i2) {
        if (!this.A0D) {
            this.A0D = true;
            StringBuilder sb = new StringBuilder();
            sb.append("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ");
            sb.append(i2);
            Log.i(sb.toString());
            A05(false);
        }
    }

    public void A05(boolean z2) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        byte[] bArr = new byte[32];
        C47392Iu r3 = nativeVOPRFExtension.A00;
        r3.A00(bArr);
        byte[] bArr2 = null;
        int i2 = 0;
        while (i2 < 256) {
            bArr2 = new byte[32];
            r3.A00(bArr2);
            bArr2[31] = (byte) (bArr2[31] & 31);
            if (nativeVOPRFExtension.A00(bArr2)) {
                break;
            }
            i2++;
        }
        if (i2 >= 256) {
            Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
            this.A05.A03(5);
        } else {
            SystemClock.elapsedRealtime();
            byte[] A022 = nativeVOPRFExtension.A02(bArr, bArr2, 32);
            SystemClock.elapsedRealtime();
            if (A022 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A05.A03(7);
            } else {
                synchronized (this) {
                    this.A0E = z2;
                    this.A0F = A022;
                    if (z2) {
                        C16430t1 r2 = this.A05;
                        r2.A05("next_original_token", Base64.encodeToString(bArr, 10));
                        r2.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                    } else {
                        C16430t1 r4 = this.A05;
                        r4.A05("original_token", Base64.encodeToString(bArr, 10));
                        r4.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                        r4.A05("shared_secret", (String) null);
                        r4.A02(-1);
                        r4.A04("base_timestamp", 0);
                        r4.A04("time_to_live", 0);
                    }
                    this.A09 = 0;
                    this.A0A = SystemClock.elapsedRealtime();
                    this.A0B = this.A0A;
                    if (this.A02.A08()) {
                        this.A0C = this.A06.A00(this.A0F);
                    } else {
                        A03(5);
                    }
                }
                return;
            }
        }
        A06(true, 4);
    }

    public final synchronized void A06(boolean z2, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A04.A01(i2, elapsedRealtime - this.A0A, elapsedRealtime - this.A0B, (long) this.A09);
        this.A0D = false;
        C16430t1 r2 = this.A05;
        r2.A05("blinding_factor", (String) null);
        if (this.A0E) {
            r2.A05("next_original_token", (String) null);
        } else {
            r2.A05("original_token", (String) null);
        }
        this.A0E = false;
        this.A0F = null;
        if (!z2) {
            this.A0C = null;
            this.A09 = 0;
        }
        if (r2.A00().getInt("first_token_stage", 0) == 1) {
            r2.A01(0);
        }
    }

    public final boolean A07() {
        C16430t1 r7 = this.A05;
        int i2 = r7.A00().getInt("first_token_stage", 0);
        if (i2 != 2) {
            int A022 = this.A01.A02(C15910s6.A06);
            if (A022 <= 30) {
                r7.A01(2);
            } else {
                long j2 = r7.A00().getLong("first_token_delay_time", 0);
                if (i2 == 1) {
                    if (!this.A0D) {
                        C16440t3 r5 = this.A03;
                        if (r5.A00() / 1000 > j2 + r7.A00().getLong("first_token_request_timestamp", 0) + 300) {
                            ((AnonymousClass022) this.A08.get()).A0A("name.com.obwhatsapp.privatestats.firsttoken");
                            Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                            A04(2);
                        } else {
                            r5.A00();
                            return true;
                        }
                    }
                    return true;
                } else if (i2 == 0) {
                    long nextInt = ((long) new Random().nextInt(A022 - 30)) + 30;
                    StringBuilder sb = new StringBuilder("PrivateStatsToken/delayForFirstToken-->delay timesec= ");
                    sb.append(nextInt);
                    Log.i(sb.toString());
                    r7.A04("first_token_delay_time", nextInt);
                    r7.A04("first_token_request_timestamp", this.A03.A00() / 1000);
                    r7.A01(1);
                    C006903e r1 = new C006903e(PrivateStatsWorker.class);
                    r1.A02(nextInt, TimeUnit.SECONDS);
                    ((AnonymousClass022) this.A08.get()).A06(AnonymousClass03z.REPLACE, (AnonymousClass043) r1.A00(), "name.com.obwhatsapp.privatestats.firsttoken");
                    return true;
                }
            }
        }
        return false;
    }
}
