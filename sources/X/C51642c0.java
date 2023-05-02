package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import com.facebook.redex.IDxComparatorShape183S0100000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2c0  reason: invalid class name and case insensitive filesystem */
public class C51642c0 extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;
    public final /* synthetic */ DeviceJid[] A01;

    public C51642c0(C51542bq r1, DeviceJid[] deviceJidArr) {
        this.A00 = r1;
        this.A01 = deviceJidArr;
    }

    public static Message A00(DeviceJid[] deviceJidArr, int i2) {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("jids")) {
            bundle.putStringArray("jids", deviceJidArr != null ? C16030sJ.A0T(Arrays.asList(deviceJidArr)) : null);
            bundle.putInt("errorCode", i2);
            return Message.obtain((Handler) null, 0, 76, 0, bundle);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("jids");
        sb.append(" already used");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A01(int i2) {
        AnonymousClass2H7 r1 = this.A00.A09;
        DeviceJid[] deviceJidArr = this.A01;
        Log.i("xmpp/reader/on-get-pre-key-error");
        r1.A01.AZq(A00(deviceJidArr, i2));
    }

    public void A02(C28371Vv r31) {
        byte b2;
        byte[] bArr;
        C30971dG r0;
        C28371Vv A0K = r31.A0K("list");
        DeviceJid[] deviceJidArr = this.A01;
        DeviceJid[] deviceJidArr2 = deviceJidArr;
        int length = deviceJidArr.length;
        HashSet hashSet = new HashSet(length);
        HashMap hashMap = new HashMap(length);
        C28371Vv[] r10 = A0K.A03;
        int i2 = 0;
        if (r10 != null) {
            C51542bq r9 = this.A00;
            C16300so r02 = r9.A04;
            C16300so r29 = r02;
            Arrays.sort(r10, new IDxComparatorShape183S0100000_2_I0(r02, 4));
            ArrayList arrayList = new ArrayList();
            int length2 = r10.length;
            int i3 = 0;
            while (i3 < length2) {
                C28371Vv r7 = r10[i3];
                DeviceJid deviceJid = (DeviceJid) r7.A0G(r29, DeviceJid.class, "jid");
                C28371Vv A0J = r7.A0J("error");
                if (A0J != null) {
                    int A0B = A0J.A0B(A0J.A0M("code"), "code");
                    hashSet.add(deviceJid);
                    hashMap.put(deviceJid, Integer.valueOf(A0B));
                } else {
                    C28371Vv A0K2 = r7.A0K("identity");
                    C28371Vv A0J2 = r7.A0J("device-identity");
                    C28371Vv A0K3 = r7.A0K("registration");
                    C28371Vv A0J3 = r7.A0J("type");
                    if (A0J3 == null) {
                        b2 = 5;
                    } else {
                        byte[] bArr2 = A0J3.A01;
                        if (bArr2 == null || bArr2.length != 1) {
                            throw new AnonymousClass1W9("type node should contain exactly 1 byte");
                        }
                        b2 = bArr2[i2];
                    }
                    C28371Vv A0J4 = r7.A0J("key");
                    if (A0J4 != null) {
                        bArr = null;
                        r0 = new C30971dG(A0J4.A0K("id").A01, A0J4.A0K("value").A01, (byte[]) null);
                    } else {
                        bArr = null;
                        r0 = null;
                    }
                    C28371Vv A0K4 = r7.A0K("skey");
                    C28371Vv A0K5 = A0K4.A0K("id");
                    C28371Vv A0K6 = A0K4.A0K("value");
                    C28371Vv A0K7 = A0K4.A0K("signature");
                    byte[] bArr3 = A0K2.A01;
                    byte[] bArr4 = A0K3.A01;
                    if (A0J2 != null) {
                        bArr = A0J2.A01;
                    }
                    C52312dZ r20 = new C52312dZ(deviceJid, r0, new C30971dG(A0K5.A01, A0K6.A01, A0K7.A01), bArr3, bArr4, bArr, b2);
                    if (r9.A08.A0E(C16620tM.A02, 632)) {
                        arrayList.add(r20);
                    } else {
                        List singletonList = Collections.singletonList(r20);
                        AnonymousClass2H7 r1 = r9.A09;
                        Log.i("xmpp/reader/on-get-pre-key-success");
                        r1.A01.AZq(Message.obtain((Handler) null, 0, 74, 0, singletonList));
                    }
                    hashSet.add(deviceJid);
                }
                i3++;
                i2 = 0;
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass2H7 r2 = r9.A09;
                Log.i("xmpp/reader/on-get-pre-key-success");
                r2.A01.AZq(Message.obtain((Handler) null, i2, 74, i2, arrayList));
            }
        }
        SparseArray sparseArray = new SparseArray();
        while (i2 < length) {
            DeviceJid deviceJid2 = deviceJidArr2[i2];
            if (!hashSet.contains(deviceJid2)) {
                AnonymousClass2H7 r22 = this.A00.A09;
                Log.i("xmpp/reader/on-get-pre-key-none");
                AnonymousClass2H8 r72 = r22.A01;
                Bundle bundle = new Bundle();
                AnonymousClass2RS.A01(bundle, deviceJid2, "jid");
                r72.AZq(Message.obtain((Handler) null, 0, 75, 0, bundle));
            }
            if (hashMap.containsKey(deviceJid2)) {
                int intValue = ((Number) hashMap.get(deviceJid2)).intValue();
                List list = (List) sparseArray.get(intValue);
                if (list != null) {
                    list.add(deviceJid2);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(deviceJid2);
                    sparseArray.put(intValue, arrayList2);
                }
            }
            i2++;
        }
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnonymousClass2H7 r12 = this.A00.A09;
            int keyAt = sparseArray.keyAt(i4);
            Log.i("xmpp/reader/on-get-pre-key-error");
            r12.A01.AZq(A00((DeviceJid[]) ((List) sparseArray.valueAt(i4)).toArray(new DeviceJid[0]), keyAt));
        }
    }
}
