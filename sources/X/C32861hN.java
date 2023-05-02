package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.1hN  reason: invalid class name and case insensitive filesystem */
public final class C32861hN implements Parcelable {
    public static final C32861hN A05 = new C32861hN((TreeMap) null, (TreeMap) null);
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(0);
    public final TreeMap A00;
    public final TreeMap A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;

    public C32861hN(Parcel parcel) {
        Class<C32861hN> cls = C32861hN.class;
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet = readBundle.keySet();
        if (!keySet.isEmpty()) {
            this.A02 = new TreeMap();
            for (String str : keySet) {
                this.A02.put(str, Integer.valueOf(readBundle.getInt(str)));
            }
        } else {
            this.A02 = null;
        }
        Bundle readBundle2 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet2 = readBundle2.keySet();
        if (!keySet2.isEmpty()) {
            this.A00 = new TreeMap();
            for (String str2 : keySet2) {
                this.A00.put(str2, Boolean.valueOf(readBundle2.getBoolean(str2)));
            }
        } else {
            this.A00 = null;
        }
        Bundle readBundle3 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet3 = readBundle3.keySet();
        if (!keySet3.isEmpty()) {
            this.A01 = new TreeMap();
            for (String str3 : keySet3) {
                this.A01.put(str3, readBundle3.getIntArray(str3));
            }
        } else {
            this.A01 = null;
        }
        Bundle readBundle4 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet4 = readBundle4.keySet();
        if (!keySet4.isEmpty()) {
            this.A03 = new TreeMap();
            for (String str4 : keySet4) {
                this.A03.put(str4, readBundle4.getStringArrayList(str4));
            }
        } else {
            this.A03 = null;
        }
        Bundle readBundle5 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet5 = readBundle5.keySet();
        if (!keySet5.isEmpty()) {
            this.A04 = new TreeMap();
            for (String str5 : keySet5) {
                this.A04.put(str5, new String(readBundle5.getCharArray(str5)));
            }
            return;
        }
        this.A04 = null;
    }

    public C32861hN(TreeMap treeMap, TreeMap treeMap2) {
        this.A02 = treeMap;
        this.A00 = treeMap2;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (java.lang.Number) r0.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.String r2, int r3) {
        /*
            r1 = this;
            java.util.TreeMap r0 = r1.A02
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0010
            int r3 = r0.intValue()
        L_0x0010:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32861hN.A00(java.lang.String, int):int");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        TreeMap treeMap = this.A02;
        TreeMap treeMap2 = this.A00;
        TreeMap treeMap3 = this.A01;
        TreeMap treeMap4 = this.A03;
        TreeMap treeMap5 = this.A04;
        Bundle bundle = new Bundle();
        if (treeMap != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                bundle.putInt((String) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        if (treeMap2 != null) {
            for (Map.Entry entry2 : treeMap2.entrySet()) {
                bundle2.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle();
        if (treeMap3 != null) {
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                bundle3.putIntArray((String) entry3.getKey(), (int[]) entry3.getValue());
            }
        }
        parcel.writeBundle(bundle3);
        Bundle bundle4 = new Bundle();
        if (treeMap4 != null) {
            for (Map.Entry entry4 : treeMap4.entrySet()) {
                bundle4.putStringArrayList((String) entry4.getKey(), (ArrayList) entry4.getValue());
            }
        }
        parcel.writeBundle(bundle4);
        Bundle bundle5 = new Bundle();
        if (treeMap5 != null) {
            for (Map.Entry entry5 : treeMap5.entrySet()) {
                bundle5.putCharArray((String) entry5.getKey(), ((String) entry5.getValue()).toCharArray());
            }
        }
        parcel.writeBundle(bundle5);
    }
}
