package X;

import com.obwhatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.11U  reason: invalid class name */
public class AnonymousClass11U {
    public final C16040sK A00;
    public final C19000xb A01;
    public final C23481Cd A02;
    public final C52422dm A03 = new C52422dm();
    public final C18930xU A04;
    public final AnonymousClass11R A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final C18910xS A08;
    public final C24941Hw A09;
    public final C222517f A0A;
    public final C16320sq A0B;
    public final AnonymousClass12P A0C;

    public AnonymousClass11U(C16040sK r2, C19000xb r3, C23481Cd r4, C18930xU r5, AnonymousClass11R r6, C16440t3 r7, C16980tz r8, C18910xS r9, C24941Hw r10, C222517f r11, C16320sq r12, AnonymousClass12P r13) {
        this.A06 = r7;
        this.A00 = r2;
        this.A07 = r8;
        this.A0B = r12;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r3;
        this.A0A = r11;
        this.A0C = r13;
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r6;
    }

    public static final JSONObject A00(int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sync_type", i2);
            jSONObject.put("chunk_order", i3);
            return jSONObject;
        } catch (JSONException unused) {
            Log.e("ReceiveHistorySyncManager/ Could not update history sync companion state");
            return null;
        }
    }

    public void A01() {
        if (this.A09.A01() != null) {
            AnonymousClass03z r4 = AnonymousClass03z.KEEP;
            C006903e r3 = new C006903e(HistorySyncCompanionWorker.class);
            C007403j r2 = C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            C007303i r1 = r3.A00;
            r1.A0H = true;
            r1.A0D = r2;
            ((AnonymousClass022) this.A0C.get()).A06(r4, (AnonymousClass043) r3.A00(), "com.obwhatsapp.sync.historySyncCompanion");
        }
    }

    public void A02(C52362dg r11, boolean z2) {
        StringBuilder sb = new StringBuilder("ReceiveHistorySyncManager/ failed to process syncType=");
        int i2 = r11.A01;
        sb.append(i2);
        sb.append(" chunkOrder=");
        sb.append(r11.A00);
        Log.e(sb.toString());
        if (z2) {
            String str = r11.A08;
            C16040sK r0 = this.A00;
            r0.A0B();
            C29871bM r6 = new C29871bM(new C28381Vw(r0.A05, str, true), 1);
            byte[] bArr = r11.A09;
            r6.A0H = bArr;
            if (bArr == null) {
                Log.e("ReceiveHistorySyncManager/ missing media key");
            } else {
                this.A01.A00(new SendMediaErrorReceiptJob((C15830rv) null, r6, "peer", bArr));
            }
        } else {
            this.A05.A00().edit().putBoolean("HAS_COMPANION_HISTORY_SYNC_FAILED", true).apply();
            C52422dm r2 = this.A03;
            synchronized (r2) {
                C52452dp r02 = r2.A00;
                if (r02 != null) {
                    r02.A00.A02(Boolean.FALSE);
                }
            }
        }
        C23481Cd r7 = this.A02;
        long j2 = r11.A02;
        long j3 = r11.A03;
        C52442do r4 = new C52442do();
        r4.A02 = 2;
        r4.A0B = r7.A00();
        r4.A00 = AnonymousClass19E.A01(i2);
        r4.A01 = AnonymousClass19E.A00(i2);
        long A002 = r7.A03.A00();
        r4.A0A = Long.valueOf(A002);
        r4.A07 = Long.valueOf(A002 - j3);
        r4.A06 = Long.valueOf(j2);
        C14730pf r1 = r7.A04;
        long A042 = r1.A04();
        r4.A08 = Long.valueOf(A042);
        r4.A09 = Long.valueOf(A042 - r1.A02());
        r7.A06.A06(r4);
        this.A09.A02(r11.A08);
    }
}
