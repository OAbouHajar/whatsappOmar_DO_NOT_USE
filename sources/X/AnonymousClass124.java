package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.124  reason: invalid class name */
public class AnonymousClass124 {
    public final C19000xb A00;
    public final C16600tK A01;
    public final C17190ug A02;
    public final C218615s A03;
    public final C19790z0 A04;
    public final C207811o A05;

    public AnonymousClass124(C19000xb r1, C16600tK r2, C17190ug r3, C218615s r4, C19790z0 r5, C207811o r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }

    public void A00() {
        if (this.A01.A05) {
            this.A02.A09(Message.obtain((Handler) null, 0, 13, 0), false);
        }
    }

    public void A01(C15830rv r6, C15830rv r7, Integer num, String str, String str2, String str3) {
        if (this.A01.A05) {
            C17190ug r3 = this.A02;
            Message obtain = Message.obtain((Handler) null, 0, 117, 0, r6);
            obtain.getData().putString("messageKeyId", str);
            if (r7 != null) {
                obtain.getData().putParcelable("remoteResource", r7);
            }
            if (num != null) {
                obtain.getData().putInt("errorCode", num.intValue());
            }
            if (str2 != null) {
                obtain.getData().putString("subType", str2);
            }
            if (str3 != null) {
                obtain.getData().putString("buttonIndex", str3);
            }
            r3.A09(obtain, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if ("played".equals(r4) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C30641ci r6) {
        /*
            r5 = this;
            X.11o r2 = r5.A05
            long r0 = r6.A00
            r2.A03(r0)
            X.0tK r0 = r5.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            java.lang.String r4 = r6.A08
            java.lang.String r0 = "read"
            boolean r3 = r0.equals(r4)
            X.15s r0 = r5.A03
            X.0pd r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "played"
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r3 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0067
        L_0x003b:
            X.0z0 r1 = r5.A04
            com.whatsapp.jid.Jid r0 = r6.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            boolean r0 = r1.A01(r0)
            r1 = r0 ^ 1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "stanzaKey"
            r2.putParcelable(r0, r6)
            java.lang.String r0 = "disable"
            r2.putBoolean(r0, r1)
            r1 = 0
            r3 = 0
            r0 = 96
            android.os.Message r0 = android.os.Message.obtain(r1, r3, r0, r3, r2)
            X.0ug r2 = r5.A02
        L_0x0063:
            r2.A09(r0, r3)
        L_0x0066:
            return
        L_0x0067:
            X.0ug r2 = r5.A02
            r1 = 0
            r3 = 0
            r0 = 76
            android.os.Message r0 = android.os.Message.obtain(r1, r3, r0, r3, r6)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass124.A02(X.1ci):void");
    }

    public void A03(C16730tY r5) {
        C16750ta r0;
        byte[] bArr;
        C28381Vw r1 = r5.A11;
        if (!r1.A02 && !C16030sJ.A0K(r1.A00) && (r0 = r5.A02) != null && (bArr = r0.A0U) != null) {
            C19000xb r2 = this.A00;
            AnonymousClass00B.A06(r0);
            AnonymousClass00B.A06(bArr);
            r2.A00(new SendMediaErrorReceiptJob((C15830rv) null, r5, (String) null, bArr));
        }
    }

    public void A04(String str, Long l2) {
        if (this.A01.A05) {
            Log.i("sendmethods/sendClearDirty");
            C17190ug r5 = this.A02;
            Message obtain = Message.obtain((Handler) null, 0, 18, 0);
            obtain.getData().putString("category", str);
            if (l2 != null) {
                obtain.getData().putLong("timestamp", l2.longValue());
            }
            r5.A09(obtain, false);
        }
    }

    public void A05(Set set, boolean z2) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C16740tZ r7 = (C16740tZ) it.next();
            C28381Vw r6 = r7.A11;
            C38551qy r5 = new C38551qy(r6.A00, r7.A0B(), r7 instanceof C38541qx);
            if (hashMap.containsKey(r5)) {
                ((List) hashMap.get(r5)).add(new C36611np(Long.valueOf(r7.A13), r6.A01));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C36611np(Long.valueOf(r7.A13), r6.A01));
                hashMap.put(r5, arrayList);
            }
        }
        for (C38561qz sendPlayedReceiptJobV2 : C218615s.A00(hashMap)) {
            this.A00.A00(new SendPlayedReceiptJobV2(sendPlayedReceiptJobV2, z2));
        }
    }

    public void A06(boolean z2) {
        if (this.A01.A05) {
            Log.i("sendmethods/sendGetServerProps");
            C17190ug r4 = this.A02;
            Bundle bundle = new Bundle();
            bundle.putBoolean("forceRefresh", z2);
            r4.A09(Message.obtain((Handler) null, 0, 21, 0, bundle), false);
        }
    }
}
