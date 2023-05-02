package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.jid.DeviceJid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;

/* renamed from: X.1CB  reason: invalid class name */
public class AnonymousClass1CB extends C16590tJ implements C17810vg {
    public int A00;
    public int A01;
    public long A02;
    public Handler A03 = new Handler(Looper.getMainLooper());
    public DeviceJid A04;
    public AnonymousClass27T A05;
    public Runnable A06;
    public Runnable A07;
    public Runnable A08;
    public SecretKey A09;
    public byte[] A0A;
    public byte[] A0B;
    public final AnonymousClass1CG A0C;
    public final C16040sK A0D;
    public final C15900s5 A0E;
    public final C19010xc A0F;
    public final AnonymousClass11Q A0G;
    public final AnonymousClass11W A0H;
    public final C18930xU A0I;
    public final AnonymousClass1CH A0J;
    public final C19710ys A0K;
    public final C53922gW A0L;
    public final C23411Bw A0M;
    public final AnonymousClass11R A0N;
    public final AnonymousClass01V A0O;
    public final C16980tz A0P;
    public final C15860rz A0Q;
    public final C208211s A0R;
    public final AnonymousClass16P A0S;
    public final C19650ym A0T;
    public final C19410yO A0U;
    public final C20360zv A0V;
    public final C14710pd A0W;
    public final C17990vy A0X;
    public final C16490t9 A0Y;
    public final C17190ug A0Z;
    public final C19090xk A0a;
    public final AnonymousClass124 A0b;
    public final AnonymousClass12B A0c;
    public final C18990xa A0d;
    public final AnonymousClass135 A0e;
    public final C16320sq A0f;
    public final List A0g = new ArrayList();

    public AnonymousClass1CB(AnonymousClass1CG r3, C16040sK r4, C15900s5 r5, C19010xc r6, AnonymousClass11Q r7, AnonymousClass11W r8, C18930xU r9, AnonymousClass1CH r10, C19710ys r11, C23411Bw r12, AnonymousClass11R r13, AnonymousClass01V r14, C16980tz r15, C15860rz r16, C208211s r17, AnonymousClass16P r18, C19650ym r19, C19410yO r20, C20360zv r21, C14710pd r22, C17990vy r23, C16490t9 r24, C17190ug r25, C19090xk r26, AnonymousClass124 r27, AnonymousClass12B r28, C18990xa r29, AnonymousClass135 r30, C16320sq r31) {
        this.A0W = r22;
        this.A0D = r4;
        this.A0P = r15;
        this.A0f = r31;
        this.A0Y = r24;
        this.A0b = r27;
        this.A0E = r5;
        this.A0I = r9;
        this.A0C = r3;
        this.A0d = r29;
        this.A0F = r6;
        C17190ug r1 = r25;
        this.A0Z = r1;
        this.A0a = r26;
        this.A0S = r18;
        this.A0O = r14;
        this.A0R = r17;
        this.A0c = r28;
        this.A0V = r21;
        this.A0e = r30;
        this.A0Q = r16;
        this.A0M = r12;
        this.A0U = r20;
        this.A0G = r7;
        this.A0H = r8;
        this.A0J = r10;
        this.A0T = r19;
        this.A0N = r13;
        this.A0K = r11;
        this.A0X = r23;
        this.A0L = new C53922gW(r1);
    }

    public final void A04() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A0f.Ac3(runnable);
        }
        List<Runnable> list = this.A0g;
        for (Runnable Ac3 : list) {
            this.A0f.Ac3(Ac3);
        }
        list.clear();
    }

    public synchronized void A05() {
        C19710ys r1 = this.A0K;
        if (r1.A02()) {
            r1.A01(0);
            A04();
            Runnable runnable = this.A08;
            if (runnable != null) {
                this.A0f.Ac3(runnable);
            }
            Runnable runnable2 = this.A07;
            if (runnable2 != null) {
                this.A0f.Ac3(runnable2);
            }
            this.A0a.A0D(false);
            this.A04 = null;
            this.A0B = null;
            this.A01 = -1;
            this.A00 = -1;
            this.A02 = 0;
            for (AnonymousClass28A A022 : A01()) {
                A022.A02();
            }
        }
    }

    public /* bridge */ /* synthetic */ void A06(AnonymousClass28A r1) {
        super.A02(r1);
    }

    public /* bridge */ /* synthetic */ void A07(AnonymousClass28A r1) {
        super.A03(r1);
    }

    public synchronized void A08(String str, boolean z2, boolean z3) {
        this.A0Y.A0F(true);
        if (z2) {
            AnonymousClass1WD r2 = new AnonymousClass1WD();
            r2.A00(new C1037852s(this, str, z3));
            C101254wy r3 = new C101254wy(r2, this);
            this.A0G.A02(r3);
            r2.A00(new IDxNConsumerShape39S0200000_2_I0(r3, 1, this));
            C18930xU r32 = this.A0I;
            AnonymousClass00B.A0G(r32.A07.A0G());
            C33691iz r1 = (C33691iz) r32.A0T.A02("sentinel");
            if (r1 != null) {
                AnonymousClass00B.A0G(r1.A00.A0G());
                r32.A0S(r1.A0A(false));
                r32.A0N();
            }
            this.A0f.Ad4(new RunnableRunnableShape6S0100000_I0_5(r2, 36), "CompanionRegistrationManager/deregister", TimeUnit.SECONDS.toMillis((long) this.A0E.A02(C15910s6.A1Z)));
        } else {
            this.A03.post(new RunnableRunnableShape0S0110000_I0(this, 11, z3));
        }
    }
}
