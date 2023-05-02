package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1cE  reason: invalid class name and case insensitive filesystem */
public class C30361cE {
    public String A00;
    public String A01;
    public String A02;
    public Map A03 = new ConcurrentHashMap();
    public Map A04 = new ConcurrentHashMap();
    public boolean A05;
    public final C16060sN A06;
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public volatile boolean A09 = false;

    public C30361cE(C16060sN r3) {
        AnonymousClass00B.A06(r3);
        this.A06 = r3;
        this.A05 = false;
    }

    public C30361cE(C16060sN r2, boolean z2) {
        AnonymousClass00B.A06(r2);
        this.A06 = r2;
        this.A05 = z2;
    }

    public static String A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                instance.update(((String) it2.next()).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("1:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Set A01(Collection collection) {
        AnonymousClass00B.A0G(!collection.isEmpty());
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new C39571sh((DeviceJid) it.next(), false, false));
        }
        return hashSet;
    }

    public C17380uz A02() {
        return C17380uz.copyOf((Collection) (this.A05 ? this.A03 : this.A04).keySet());
    }

    public C17380uz A03() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.A04.keySet());
        hashSet.addAll(this.A03.keySet());
        return C17380uz.copyOf((Collection) hashSet);
    }

    public C17380uz A04() {
        return C17380uz.copyOf(this.A04.values());
    }

    public C30661ck A05(UserJid userJid) {
        return (C30661ck) (this.A04.containsKey(userJid) ? this.A04 : this.A03).get(userJid);
    }

    public C30661ck A06(UserJid userJid) {
        C30661ck r0 = (C30661ck) (C16030sJ.A0O(userJid) ? this.A04 : this.A03).remove(userJid);
        if (r0 != null) {
            A0G();
        }
        return r0;
    }

    public final C30661ck A07(UserJid userJid, Collection collection, int i2, boolean z2, boolean z3) {
        C30661ck A052 = A05(userJid);
        if (A052 != null) {
            A052.A01 = i2;
            A052.A02 = z2;
        } else {
            A052 = new C30661ck(userJid, A01(collection), i2, z2);
            if (C16030sJ.A0O(userJid)) {
                A052.A00 = this.A04.size();
                this.A04.put(userJid, A052);
            }
            if (C16030sJ.A0M(userJid) && this.A05) {
                A052.A00 = this.A03.size();
                this.A03.put(userJid, A052);
            }
            this.A09 = true;
            if (z3) {
                A0G();
                return A052;
            }
        }
        return A052;
    }

    public C37451pB A08(C17380uz r10, UserJid userJid, boolean z2) {
        C30661ck A052 = A05(userJid);
        boolean z3 = false;
        if (A052 == null) {
            StringBuilder sb = new StringBuilder("GroupParticipants/refreshDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            return new C37451pB(false, false, false);
        }
        ConcurrentHashMap concurrentHashMap = A052.A04;
        C17380uz copyOf = C17380uz.copyOf((Collection) concurrentHashMap.keySet());
        C28031Ub it = r10.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (!copyOf.contains(deviceJid)) {
                this.A09 = true;
                C39571sh r2 = new C39571sh(deviceJid, false, false);
                DeviceJid deviceJid2 = r2.A02;
                if (!concurrentHashMap.containsKey(deviceJid2)) {
                    concurrentHashMap.put(deviceJid2, r2);
                }
                z4 = true;
            }
        }
        boolean z5 = !z2;
        C28031Ub it2 = copyOf.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!r10.contains(next)) {
                C39571sh r0 = (C39571sh) concurrentHashMap.remove(next);
                if (r0 != null) {
                    z5 |= r0.A01;
                }
                z6 = true;
            }
        }
        if (z4 || z6) {
            A0G();
            if (z6 && z5) {
                z3 = true;
                A0H();
            }
        }
        return new C37451pB(z4, z6, z3);
    }

    public String A09() {
        String str;
        synchronized (this.A07) {
            str = this.A00;
            AnonymousClass00B.A06(str);
        }
        return str;
    }

    public String A0A() {
        String str;
        synchronized (this.A07) {
            str = this.A01;
            AnonymousClass00B.A06(str);
        }
        return str;
    }

    public String A0B() {
        String str;
        synchronized (this.A08) {
            str = this.A02;
            if (str == null) {
                str = A00(this.A04.keySet());
                this.A02 = str;
            }
        }
        return str;
    }

    public ArrayList A0C() {
        ArrayList arrayList = new ArrayList();
        for (C30661ck r1 : this.A04.values()) {
            if (r1.A01 != 0) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public Set A0D() {
        HashSet hashSet = new HashSet();
        for (Map.Entry value : this.A03.entrySet()) {
            C28031Ub it = C17380uz.copyOf(((C30661ck) value.getValue()).A04.values()).iterator();
            while (it.hasNext()) {
                hashSet.add(((C39571sh) it.next()).A02);
            }
        }
        return hashSet;
    }

    public Set A0E() {
        HashSet hashSet = new HashSet();
        for (Map.Entry value : this.A04.entrySet()) {
            C28031Ub it = C17380uz.copyOf(((C30661ck) value.getValue()).A04.values()).iterator();
            while (it.hasNext()) {
                hashSet.add(((C39571sh) it.next()).A02);
            }
        }
        return hashSet;
    }

    public Set A0F(C16040sK r7, boolean z2) {
        HashSet hashSet = new HashSet();
        for (Map.Entry value : (z2 ? this.A03 : this.A04).entrySet()) {
            C28031Ub it = C17380uz.copyOf(((C30661ck) value.getValue()).A04.values()).iterator();
            while (it.hasNext()) {
                C39571sh r0 = (C39571sh) it.next();
                boolean z3 = z2 ? r0.A00 : r0.A01;
                DeviceJid deviceJid = r0.A02;
                if (!r7.A0K(deviceJid) && !z3) {
                    hashSet.add(deviceJid);
                }
            }
        }
        return hashSet;
    }

    public void A0G() {
        synchronized (this.A07) {
            this.A01 = C37431p9.A00(A0E());
            this.A00 = C37431p9.A00(A0D());
        }
        A0A();
        A09();
        synchronized (this.A08) {
            if (this.A02 != null) {
                this.A02 = null;
            }
        }
    }

    public final void A0H() {
        for (C30661ck r0 : this.A04.values()) {
            for (C39571sh r1 : r0.A04.values()) {
                r1.A01 = false;
            }
        }
    }

    public void A0I(C17380uz r7, UserJid userJid) {
        C30661ck A052 = A05(userJid);
        if (A052 == null) {
            StringBuilder sb = new StringBuilder("GroupParticipants/addDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            return;
        }
        this.A09 = true;
        C28031Ub it = r7.iterator();
        while (it.hasNext()) {
            C39571sh r3 = new C39571sh((DeviceJid) it.next(), false, false);
            ConcurrentHashMap concurrentHashMap = A052.A04;
            DeviceJid deviceJid = r3.A02;
            if (!concurrentHashMap.containsKey(deviceJid)) {
                concurrentHashMap.put(deviceJid, r3);
            }
        }
        if (!r7.isEmpty()) {
            A0G();
        }
    }

    public void A0J(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C30661ck r1 = (C30661ck) it.next();
                A07(r1.A03, C17380uz.copyOf((Collection) r1.A04.keySet()), r1.A01, r1.A02, false);
            } else {
                A0G();
                return;
            }
        }
    }

    public void A0K(Collection collection) {
        boolean z2 = false;
        for (Object next : collection) {
            if (this.A04.remove(next) != null || this.A03.remove(next) != null) {
                z2 = true;
            }
        }
        if (z2) {
            A0G();
        }
    }

    public boolean A0L(C17380uz r6, UserJid userJid, boolean z2) {
        C30661ck A052 = A05(userJid);
        if (A052 == null) {
            StringBuilder sb = new StringBuilder("GroupParticipants/removeDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            return false;
        }
        boolean z3 = !z2;
        C28031Ub it = r6.iterator();
        while (it.hasNext()) {
            C39571sh r0 = (C39571sh) A052.A04.remove(it.next());
            if (r0 != null) {
                z3 |= r0.A01;
            }
        }
        if (r6.isEmpty()) {
            return z3;
        }
        if (z3) {
            A0H();
        }
        A0G();
        return z3;
    }

    public boolean A0M(C16040sK r4) {
        r4.A0B();
        AnonymousClass1ZT r2 = r4.A05;
        AnonymousClass1ZX A032 = r4.A03();
        if (r2 == null || !this.A04.containsKey(r2)) {
            return A032 != null && this.A03.containsKey(A032);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (X.C30661ck) r3.A04.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(X.C16040sK r4) {
        /*
            r3 = this;
            r4.A0B()
            X.1ZT r2 = r4.A05
            r1 = 0
            if (r2 == 0) goto L_0x0017
            java.util.Map r0 = r3.A04
            java.lang.Object r0 = r0.get(r2)
            X.1ck r0 = (X.C30661ck) r0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A01
            if (r0 == 0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30361cE.A0N(X.0sK):boolean");
    }

    public boolean A0O(UserJid userJid) {
        if (userJid != null) {
            return this.A04.containsKey(userJid) || this.A03.containsKey(userJid);
        }
        return false;
    }

    public boolean A0P(Collection collection) {
        for (Object obj : collection) {
            C30661ck r0 = (C30661ck) this.A04.get(obj);
            if (r0 != null) {
                C28031Ub it = C17380uz.copyOf(r0.A04.values()).iterator();
                while (it.hasNext()) {
                    if (((C39571sh) it.next()).A01) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C30361cE r4 = (C30361cE) obj;
            if (this.A06.equals(r4.A06) && this.A04.equals(r4.A04) && C34901l3.A00(A09(), r4.A09()) && this.A03.equals(r4.A03)) {
                return C34901l3.A00(A0A(), r4.A0A());
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.A06.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + A09().hashCode()) * 31) + A0A().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupParticipants{groupJid='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", participants=");
        sb.append(this.A04);
        sb.append(", participantHashV1='");
        sb.append(A0A());
        sb.append('\'');
        sb.append(", lidParticipants=");
        sb.append(this.A03);
        sb.append(", lidParticipantHashV1='");
        sb.append(A09());
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
