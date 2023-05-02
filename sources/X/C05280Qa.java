package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Qa  reason: invalid class name and case insensitive filesystem */
public class C05280Qa {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SparseArray A03;
    public final String A04;
    public final HashMap A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;

    public C05280Qa(C04890Ok r6) {
        String str = r6.A01;
        this.A04 = str;
        HashMap hashMap = r6.A02;
        this.A05 = hashMap == null ? AnonymousClass000.A0x() : hashMap;
        this.A08 = AnonymousClass000.A0x();
        this.A09 = AnonymousClass000.A0x();
        int i2 = r6.A00;
        this.A01 = i2 <= 0 ? 719983200 : i2;
        int A0G = (AnonymousClass000.A0G(str) * 31) + (hashMap != null ? hashMap.hashCode() : 0);
        if (TextUtils.isEmpty((CharSequence) null)) {
            synchronized (AnonymousClass0TO.class) {
                LruCache lruCache = AnonymousClass0TO.A00;
                Integer valueOf = Integer.valueOf(A0G);
                Integer num = (Integer) lruCache.get(valueOf);
                A0G = num != null ? (num.intValue() + 1) * 31 : A0G;
                lruCache.put(valueOf, Integer.valueOf(A0G));
            }
            this.A00 = A0G;
            this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
            this.A06 = r6.A03;
            this.A03 = new SparseArray();
            this.A07 = AnonymousClass000.A0x();
            return;
        }
        throw AnonymousClass000.A0W("hashCode");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C05280Qa)) {
            return false;
        }
        C05280Qa r4 = (C05280Qa) obj;
        String str = this.A04;
        String str2 = r4.A04;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A05.equals(r4.A05)) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence) null)) {
            return TextUtils.isEmpty((CharSequence) null);
        }
        throw AnonymousClass000.A0W("equals");
    }

    public int hashCode() {
        String str = this.A04;
        HashMap hashMap = this.A05;
        int i2 = 0;
        int A0G = AnonymousClass000.A0G(str) * 31;
        if (hashMap != null) {
            i2 = hashMap.hashCode();
        }
        int i3 = A0G + i2;
        if (TextUtils.isEmpty((CharSequence) null)) {
            return i3;
        }
        throw AnonymousClass000.A0W("hashCode");
    }
}
