package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1HD  reason: invalid class name */
public class AnonymousClass1HD {
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final C19000xb A03;
    public final C16440t3 A04;
    public final C14710pd A05;
    public final C16490t9 A06;
    public final C34531kQ A07 = new C34531kQ(10, 610);
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();

    public AnonymousClass1HD(C19000xb r7, C16440t3 r8, C14710pd r9, C16490t9 r10) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A04 = r8;
        this.A05 = r9;
        this.A02 = handler;
        this.A06 = r10;
        this.A03 = r7;
    }

    public synchronized void A00() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = false;
            this.A07.A02();
            A01();
        }
    }

    public synchronized void A01() {
        Map map = this.A09;
        if (!map.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                DeviceJid deviceJid = (DeviceJid) entry.getKey();
                C46612Fd r2 = (C46612Fd) entry.getValue();
                Map map2 = this.A08;
                if (!map2.containsKey(deviceJid)) {
                    arrayList.add(deviceJid);
                    boolean z2 = r2.A04;
                    if (z2) {
                        arrayList2.add(deviceJid);
                    }
                    map2.put(deviceJid, new C46612Fd(r2.A00, r2.A02, r2.A01, uptimeMillis, z2));
                }
            }
            A02(arrayList, arrayList2, 9);
            map.clear();
            this.A00 = false;
        }
    }

    public void A02(List list, List list2, int i2) {
        C14710pd r3;
        int A032;
        int A033;
        if (list.isEmpty()) {
            Log.i("prekeysmanager/startPrekeyFetchJobs jids list is empty");
            return;
        }
        Log.i("prekeysmanager/startPrekeyFetchJobs creating BulkGetPreKeyJob");
        DeviceJid[] deviceJidArr = list2.isEmpty() ? null : (DeviceJid[]) list2.toArray(new DeviceJid[0]);
        synchronized (this) {
            r3 = this.A05;
            A032 = r3.A03(C16620tM.A01, 767);
        }
        int size = list.size();
        if (A032 <= 0 || size < A032 || (A033 = r3.A03(C16620tM.A02, 921)) <= 0 || size <= A033) {
            this.A03.A00(new BulkGetPreKeyJob((DeviceJid[]) list.toArray(new DeviceJid[0]), deviceJidArr, i2));
            return;
        }
        C34101jh r32 = new C34101jh(list.toArray(new DeviceJid[0]), A033);
        while (r32.hasNext()) {
            this.A03.A00(new BulkGetPreKeyJob((DeviceJid[]) r32.next(), deviceJidArr, i2));
        }
    }

    public synchronized void A03(DeviceJid[] deviceJidArr, int i2, int i3, int i4, boolean z2) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("prekeysmanager/getprekeys request for jids:");
            DeviceJid[] deviceJidArr2 = deviceJidArr;
            sb.append(Arrays.toString(deviceJidArr2));
            Log.i(sb.toString());
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = this.A08;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((C46612Fd) ((Map.Entry) it.next()).getValue()).A03 + 60000 < uptimeMillis) {
                    it.remove();
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int length = deviceJidArr2.length;
            int i5 = 0;
            while (true) {
                int i6 = i2;
                if (i5 < length) {
                    DeviceJid deviceJid = deviceJidArr[i5];
                    if (!map.containsKey(deviceJid)) {
                        arrayList.add(deviceJid);
                        map.put(deviceJid, new C46612Fd(i6, i3, i4, uptimeMillis2, z2));
                        if (z2) {
                            arrayList2.add(deviceJid);
                        }
                    }
                    i5++;
                } else {
                    A02(arrayList, arrayList2, i6);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("prekeysmanager/sending getprekeys for jids:");
                    sb2.append(Arrays.toString(deviceJidArr2));
                    Log.i(sb2.toString());
                    A00();
                }
            }
        }
    }

    public synchronized void A04(DeviceJid[] deviceJidArr, int i2, boolean z2) {
        synchronized (this) {
            A03(deviceJidArr, i2, 0, 0, z2);
        }
    }
}
