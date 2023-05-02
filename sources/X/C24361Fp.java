package X;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Fp  reason: invalid class name and case insensitive filesystem */
public class C24361Fp implements C18000vz {
    public final C16440t3 A00;
    public final HashMap A01 = new HashMap();

    public C24361Fp(C16440t3 r2) {
        this.A00 = r2;
    }

    public C31961fJ A00(String str) {
        C31961fJ r4;
        InetAddress[] inetAddressArr;
        StringBuilder sb = new StringBuilder("resolving ");
        sb.append(str);
        Log.i(sb.toString());
        synchronized (this) {
            HashMap hashMap = this.A01;
            List<C35761mS> list = (List) hashMap.get(str);
            if (list == null) {
                r4 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                int i2 = 0;
                for (C35761mS r5 : list) {
                    C16440t3 r1 = this.A00;
                    Long l2 = r5.A01;
                    if (l2 == null || r1.A00() < l2.longValue()) {
                        arrayList.add(r5.A03);
                        i2 = r5.A00;
                    } else {
                        hashSet.add(r5);
                    }
                }
                list.removeAll(hashSet);
                if (list.isEmpty()) {
                    hashMap.remove(str);
                }
                r4 = new C31961fJ(new C35771mT(i2), (InetAddress[]) arrayList.toArray(new InetAddress[0]));
            }
        }
        if (r4 == null || (inetAddressArr = r4.A04) == null || inetAddressArr.length <= 0) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                A02(Arrays.asList(allByName), str, 0);
                r4 = new C31961fJ(new C35771mT(0), allByName);
            } catch (UnknownHostException e2) {
                StringBuilder sb2 = new StringBuilder("primary dns resolution failed for ");
                sb2.append(str);
                Log.w(sb2.toString(), e2);
                try {
                    List<C35791mV> A012 = C35781mU.A01(str, 0);
                    ArrayList arrayList2 = new ArrayList(A012.size());
                    for (C35791mV r0 : A012) {
                        arrayList2.add(r0.A01);
                    }
                    A02(arrayList2, str, 1);
                    r4 = new C31961fJ(new C35771mT(1), (InetAddress[]) arrayList2.toArray(new InetAddress[0]));
                } catch (UnknownHostException e3) {
                    StringBuilder sb3 = new StringBuilder("secondary dns resolution failed for ");
                    sb3.append(str);
                    Log.w(sb3.toString(), e3);
                    try {
                        r4 = A01(str, true);
                    } catch (UnknownHostException e4) {
                        StringBuilder sb4 = new StringBuilder("hardcoded ip resolution failed for ");
                        sb4.append(str);
                        Log.w(sb4.toString(), e4);
                        throw e2;
                    }
                }
            }
        }
        Arrays.toString(r4.A04);
        return r4;
    }

    public final C31961fJ A01(String str, boolean z2) {
        List list = (List) C35801mW.A00.get(str);
        if (list == null || list.isEmpty()) {
            StringBuilder sb = new StringBuilder("no hardcoded ips found for ");
            sb.append(str);
            throw new UnknownHostException(sb.toString());
        }
        if (z2) {
            A02(list, str, 2);
        }
        return new C31961fJ(new C35771mT(2), (InetAddress[]) list.toArray(new InetAddress[0]));
    }

    public final void A02(Iterable iterable, String str, int i2) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C35761mS(Long.valueOf(currentTimeMillis), (Short) null, (InetAddress) it.next(), i2, false, false));
        }
        synchronized (this) {
            this.A01.put(str, arrayList);
        }
    }

    public void AP4(AnonymousClass1UX r2) {
        synchronized (this) {
            this.A01.clear();
        }
    }
}
