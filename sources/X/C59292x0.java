package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2x0  reason: invalid class name and case insensitive filesystem */
public class C59292x0 extends AnonymousClass4X3 {
    public final C16040sK A00;
    public final C18020w1 A01;
    public final C19000xb A02;
    public final C16000sG A03;
    public final C210712r A04;
    public final AnonymousClass01V A05;
    public final C16440t3 A06;
    public final C15860rz A07;
    public final C208211s A08;
    public final AnonymousClass16P A09;
    public final C18920xT A0A;
    public final C16070sO A0B;
    public final C16320sq A0C;
    public final Random A0D;

    public C59292x0(Context context, C16040sK r2, C18020w1 r3, C19000xb r4, C16000sG r5, C210712r r6, AnonymousClass01V r7, C16440t3 r8, C15860rz r9, C208211s r10, AnonymousClass16P r11, C18920xT r12, C16070sO r13, C16320sq r14, Random random) {
        super(context);
        this.A06 = r8;
        this.A0D = random;
        this.A04 = r6;
        this.A00 = r2;
        this.A0C = r14;
        this.A0A = r12;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A09 = r11;
        this.A05 = r7;
        this.A08 = r10;
        this.A07 = r9;
        this.A0B = r13;
    }

    public void A01() {
        A05();
    }

    public void A02(Intent intent) {
        A06(intent);
    }

    public boolean A04(Intent intent) {
        return "com.obwhatsapp.action.ROTATE_SIGNED_PREKEY".equals(intent.getAction());
    }

    public final void A05() {
        long A002 = this.A06.A00();
        C15860rz r8 = this.A07;
        AnonymousClass01D r4 = r8.A01;
        if (!C13680ns.A0C(r4).contains("dithered_last_signed_prekey_rotation")) {
            long nextInt = A002 - (((long) this.A0D.nextInt(2592000)) * 1000);
            Log.i(AnonymousClass000.A0h(C42681yF.A02(nextInt), AnonymousClass000.A0r("no signed prekey rotation schedule established; setting last rotation time to ")));
            C13680ns.A0x(r8.A0K(), "dithered_last_signed_prekey_rotation", nextInt);
        }
        long j2 = C13680ns.A0C(r4).getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j2 >= 0 && j2 <= A002) {
            long j3 = 2592000000L + j2;
            if (j3 >= A002) {
                if (!C13680ns.A0C(r4).getBoolean("bad_signed_pre_key_check_done", false)) {
                    Log.i("RotateKeysAction/checking bad signed pre key");
                    AnonymousClass16P r42 = this.A09;
                    r42.A00.submit(new RunnableRunnableShape17S0100000_I1((Object) this, 13));
                }
                long j4 = j3 - A002;
                StringBuilder A0r = AnonymousClass000.A0r("scheduling alarm to trigger signed prekey rotation; now=");
                A0r.append(C42681yF.A02(A002));
                A0r.append("; lastSignedPrekeyRotation=");
                A0r.append(C42681yF.A02(j2));
                A0r.append("; deltaToAlarm=");
                A0r.append(j4);
                C13680ns.A1V(A0r);
                PendingIntent A003 = A00("com.obwhatsapp.action.ROTATE_SIGNED_PREKEY", 134217728);
                if (!this.A04.A02(A003, 2, j4 + SystemClock.elapsedRealtime())) {
                    Log.w("RotateKeysAction/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0r2 = AnonymousClass000.A0r("scheduling immediate signed prekey rotation; now=");
        A0r2.append(C42681yF.A02(A002));
        A0r2.append("; lastSignedPrekeyRotation=");
        Log.i(AnonymousClass000.A0h(C42681yF.A02(j2), A0r2));
        this.A0C.Acl(new RunnableRunnableShape17S0100000_I1((Object) this, 12));
    }

    public final void A06(Intent intent) {
        PowerManager.WakeLock wakeLock;
        AssertionError assertionError;
        Log.i(AnonymousClass000.A0g("RotateKeysAction/rotateSignedPrekeyAndSenderKeys; intent=", intent));
        PowerManager A0I = this.A05.A0I();
        if (A0I == null) {
            Log.w("RotateKeysAction/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            wakeLock = C43421zy.A00(A0I, "RotateKeysAction#rotateSignedPrekeyAndSenderKeys", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            AnonymousClass16P r2 = this.A09;
            r2.A00.submit(new RunnableRunnableShape17S0100000_I1((Object) this, 11)).get();
            A05();
            if (wakeLock != null) {
                wakeLock.release();
                return;
            }
            return;
        } catch (InterruptedException e2) {
            assertionError = new AssertionError("interrupted during rotate keys alarm");
            assertionError.initCause(e2);
        } catch (ExecutionException e3) {
            assertionError = new AssertionError("exception during rotate keys alarm");
            assertionError.initCause(e3);
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
        throw assertionError;
    }
}
