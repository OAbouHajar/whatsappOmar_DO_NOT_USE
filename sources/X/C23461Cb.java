package X;

import android.content.Intent;
import com.obwhatsapp.companiondevice.sync.HistorySyncWorker;
import com.obwhatsapp.service.MDSyncService;
import com.whatsapp.util.Log;

/* renamed from: X.1Cb  reason: invalid class name and case insensitive filesystem */
public class C23461Cb {
    public Boolean A00 = null;
    public final C16980tz A01;
    public final C14710pd A02;
    public final AnonymousClass116 A03;
    public final AnonymousClass12P A04;

    public C23461Cb(C16980tz r2, C14710pd r3, AnonymousClass116 r4, AnonymousClass12P r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A00() {
        boolean A032 = A03();
        StringBuilder sb = new StringBuilder("HistorySyncWorkManager/historySyncRmrCompleted shouldUseWorkManager: ");
        sb.append(A032);
        Log.i(sb.toString());
        if (!A032) {
            this.A03.A03(this.A01.A00, new Intent("com.obwhatsapp.service.MDSyncService.RMR_COMPLETED"), MDSyncService.class);
        }
    }

    public void A01() {
        boolean A032 = A03();
        StringBuilder sb = new StringBuilder("HistorySyncWorkManager/historySyncRmrStarted shouldUseWorkManager: ");
        sb.append(A032);
        Log.i(sb.toString());
        if (!A032) {
            this.A03.A03(this.A01.A00, new Intent("com.obwhatsapp.service.MDSyncService.RMR_STARTED"), MDSyncService.class);
        }
    }

    public void A02() {
        boolean A032 = A03();
        StringBuilder sb = new StringBuilder("HistorySyncWorkManager/startHistorySync shouldUseWorkManager: ");
        sb.append(A032);
        Log.i(sb.toString());
        if (A032) {
            AnonymousClass03z r4 = AnonymousClass03z.KEEP;
            C006903e r3 = new C006903e(HistorySyncWorker.class);
            C007403j r2 = C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            C007303i r1 = r3.A00;
            r1.A0H = true;
            r1.A0D = r2;
            AnonymousClass040 r12 = new AnonymousClass040();
            r12.A01(AnonymousClass041.CONNECTED);
            r3.A00.A0A = r12.A00();
            ((AnonymousClass022) this.A04.get()).A06(r4, (AnonymousClass043) r3.A00(), "HISTORY_SYNC_WORK_UNIQUE_NAME");
            return;
        }
        this.A03.A03(this.A01.A00, new Intent("com.obwhatsapp.service.MDSyncService.START_HISTORY_SYNC"), MDSyncService.class);
    }

    public final synchronized boolean A03() {
        Boolean bool;
        bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(this.A02.A0E(C16620tM.A02, 2066));
            this.A00 = bool;
        }
        return bool.booleanValue();
    }
}
