package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/* renamed from: X.1Gb  reason: invalid class name and case insensitive filesystem */
public class C24471Gb {
    public final AnonymousClass01V A00;
    public final C15860rz A01;
    public final C16490t9 A02;
    public final C16320sq A03;

    public C24471Gb(AnonymousClass01V r1, C15860rz r2, C16490t9 r3, C16320sq r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.A03.Acl(new RunnableRunnableShape8S0100000_I0_7(this, 28));
        }
    }

    public final void A01() {
        ActivityManager A032 = this.A00.A03();
        if (A032 == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator listIterator = A032.getHistoricalProcessExitReasons((String) null, 0, 100).listIterator();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        C15860rz r6 = this.A01;
        long A0J = r6.A0J("last_exit_reason_sync_timestamp");
        while (listIterator.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator.next();
            if (applicationExitInfo.getTimestamp() <= A0J) {
                break;
            }
            arrayList.add(applicationExitInfo);
            Integer valueOf = Integer.valueOf(applicationExitInfo.getReason());
            int i2 = 1;
            if (hashMap.containsKey(valueOf)) {
                i2 = ((Number) hashMap.get(valueOf)).intValue() + 1;
            }
            hashMap.put(valueOf, Integer.valueOf(i2));
        }
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) listIterator2.previous();
            C75613sR r4 = new C75613sR();
            r4.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            r4.A01 = Double.valueOf((double) applicationExitInfo2.getPss());
            r4.A04 = Long.valueOf((long) applicationExitInfo2.getReason());
            r4.A07 = applicationExitInfo2.getDescription();
            r4.A05 = Long.valueOf(applicationExitInfo2.getTimestamp());
            r4.A02 = Double.valueOf((double) applicationExitInfo2.getRss());
            r4.A06 = Long.valueOf((long) applicationExitInfo2.getStatus());
            r4.A03 = Long.valueOf((long) applicationExitInfo2.getImportance());
            try {
                InputStream traceInputStream = applicationExitInfo2.getTraceInputStream();
                if (traceInputStream != null) {
                    while (new BufferedReader(new InputStreamReader(traceInputStream)).readLine() != null) {
                    }
                }
            } catch (IOException e2) {
                Log.e("Android11ExitReasonReporter/could not get exit info", e2);
            }
            this.A02.A06(r4);
            r6.A14("last_exit_reason_sync_timestamp", applicationExitInfo2.getTimestamp());
        }
        C74673qv r2 = new C74673qv();
        r2.A01 = hashMap.toString();
        r2.A00 = Long.valueOf(r6.A0J("last_exit_reason_sync_timestamp"));
        this.A02.A06(r2);
    }
}
