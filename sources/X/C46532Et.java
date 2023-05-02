package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.whatsapp.util.Log;

/* renamed from: X.2Et  reason: invalid class name and case insensitive filesystem */
public class C46532Et extends C003401n {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass028 A01;
    public final AnonymousClass026 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass027 A04;
    public final C15860rz A05;
    public final C16900tq A06;
    public final C27851Tj A07;
    public final AnonymousClass2FI A08;
    public final C46542Eu A09;
    public final C19640yl A0A;
    public final C27861Tk A0B;
    public final Runnable A0C = new RunnableRunnableShape14S0100000_I0_13((Object) this, 0);

    public C46532Et(C15860rz r21, C16250si r22, C16900tq r23, C19090xk r24, AnonymousClass0y3 r25, AnonymousClass11L r26, C19760yx r27, C27851Tj r28, C19640yl r29, C27861Tk r30, C210112l r31, C16220sf r32, C16210se r33, C16280sl r34, C16320sq r35) {
        AnonymousClass026 r5 = new AnonymousClass026();
        this.A02 = r5;
        AnonymousClass2FI r4 = new AnonymousClass2FI(this);
        this.A08 = r4;
        AnonymousClass027 r3 = new AnonymousClass027();
        this.A03 = r3;
        this.A06 = r23;
        this.A05 = r21;
        C27851Tj r13 = r28;
        this.A07 = r13;
        this.A0A = r29;
        C27861Tk r6 = r30;
        this.A0B = r6;
        C16250si r8 = r22;
        C19090xk r9 = r24;
        AnonymousClass0y3 r10 = r25;
        AnonymousClass11L r11 = r26;
        C19760yx r12 = r27;
        C210112l r15 = r31;
        C46542Eu r7 = new C46542Eu(r8, r9, r10, r11, r12, r13, this, r15, r32, r33, r34, r35);
        this.A09 = r7;
        AnonymousClass027 r2 = r7.A00;
        this.A01 = r2;
        r5.A0D(r2, new IDxObserverShape115S0100000_2_I0((Object) this, 225));
        r5.A0D(r3, new IDxObserverShape115S0100000_2_I0((Object) r5, 119));
        this.A04 = new AnonymousClass027();
        r6.A02(r4);
        A05();
    }

    public void A04() {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        this.A00.removeCallbacks(this.A0C);
        AnonymousClass026 r1 = this.A02;
        r1.A0C(this.A03);
        r1.A0C(this.A01);
        this.A0B.A03(this.A08);
    }

    public final void A05() {
        C16900tq r0 = this.A06;
        r0.A04();
        if (r0.A01) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A08(this.A05.A0B(), 2);
            A07(6);
            return;
        }
        C15860rz r1 = this.A05;
        r1.A0K().putInt("migrate_from_other_app_attempt_count", r1.A0B() + 1).apply();
        A06();
        Integer num = 1;
        if (!num.equals(this.A03.A01())) {
            Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
            A07(1);
            C46542Eu r12 = this.A09;
            if (!r12.A05.A0F()) {
                r12.A00.A09(0);
            } else {
                r12.A00();
            }
        }
    }

    public final void A06() {
        int i2 = ((SharedPreferences) this.A05.A01.get()).getInt("direct_db_migration_timeout_in_secs", 180);
        StringBuilder sb = new StringBuilder("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout =");
        long j2 = ((long) i2) * 1000;
        sb.append(j2);
        Log.i(sb.toString());
        if (i2 > 0) {
            this.A00.postDelayed(this.A0C, j2);
        }
    }

    public final void A07(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 7:
                break;
            default:
                if (this.A05.A0B() >= 3) {
                    A07(7);
                    return;
                }
                break;
        }
        this.A03.A09(Integer.valueOf(i2));
    }

    public final void A08(int i2, int i3) {
        if (i2 == 1) {
            this.A07.A01.A04 = Integer.valueOf(i3);
        } else if (i2 == 2) {
            this.A07.A01.A07 = Integer.valueOf(i3);
        } else if (i2 == 3) {
            this.A07.A01.A08 = Integer.valueOf(i3);
        }
    }
}
