package X;

import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import java.util.concurrent.CopyOnWriteArrayList;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.0tD  reason: invalid class name and case insensitive filesystem */
public class C16530tD {
    public CopyOnWriteArrayList A00;
    public NativeVOPRFExtension A01;
    public final int A02;
    public final C16600tK A03;
    public final C16550tF A04;
    public final C16540tE A05;
    public final C63093Gc A06;
    public final C16440t3 A07;
    public final C14710pd A08;
    public final AnonymousClass1WA A09;
    public final String A0A;
    public volatile int A0B;
    public volatile long A0C;
    public volatile long A0D;
    public volatile String A0E;
    public volatile boolean A0F;
    public volatile boolean A0G = false;
    public volatile byte[] A0H;
    public volatile byte[] A0I;

    public C16530tD(C16600tK r3, C16550tF r4, C16540tE r5, C63093Gc r6, C16440t3 r7, C14710pd r8, C16320sq r9, String str) {
        this.A07 = r7;
        this.A08 = r8;
        this.A05 = r5;
        this.A0A = str;
        this.A06 = r6;
        r6.A00 = this;
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = new CopyOnWriteArrayList();
        this.A09 = new AnonymousClass1WA(r9, false);
        this.A02 = str.equals("WA_BizDirectorySearch") ? 2 : 1;
    }

    public final synchronized void A00() {
        this.A0E = null;
        this.A0H = null;
        this.A0B = 0;
        this.A0G = false;
        this.A0F = false;
        C16540tE r3 = this.A05;
        r3.A04("original_token_string", (String) null);
        r3.A04("next_original_token_string", (String) null);
        r3.A03("base_timestamp", 0);
        r3.A03("time_to_live_in_seconds", 0);
        r3.A04("blinding_factor_string", (String) null);
        r3.A02("redeem_count", -1);
        r3.A04("shared_secret_string", (String) null);
    }

    public final void A01(int i2) {
        int i3 = this.A0B;
        C16540tE r3 = this.A05;
        if (i3 < r3.A00().getInt("max_sign_retry_count", 0)) {
            this.A0B++;
            this.A09.A02(new RunnableRunnableShape2S0100000_I0_1(this, 30), r3.A00().getLong("sign_retry_interval_sec", 0) * ((long) this.A0B) * ((long) this.A0B) * 1000);
            return;
        }
        int i4 = 10;
        if (i2 == 5) {
            i4 = 9;
        }
        r3.A01(i4);
        A02(false);
    }

    public final synchronized void A02(boolean z2) {
        this.A0F = false;
        C16540tE r2 = this.A05;
        r2.A04("blinding_factor_string", (String) null);
        if (this.A0G) {
            r2.A04("next_original_token_string", (String) null);
        } else {
            r2.A04("original_token_string", (String) null);
        }
        this.A0G = false;
        this.A0H = null;
        if (!z2) {
            this.A0E = null;
            this.A0B = 0;
        }
    }
}
