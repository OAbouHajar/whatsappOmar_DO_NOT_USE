package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0x1  reason: invalid class name and case insensitive filesystem */
public class C18640x1 {
    public final AnonymousClass1TE A00;
    public final Map A01 = new AnonymousClass197(5);
    public final Map A02 = new AnonymousClass197(100);
    public final Map A03 = new HashMap();

    public C18640x1(AnonymousClass1TE r3) {
        this.A00 = r3;
    }

    public int A00(UserJid userJid) {
        int i2;
        synchronized (this) {
            List<C35701mM> A08 = A08(userJid);
            i2 = 7;
            if (A08 != null) {
                for (C35701mM hashCode : A08) {
                    i2 = (i2 * 31) + hashCode.hashCode();
                }
            }
        }
        return i2;
    }

    public final AnonymousClass2GD A01(UserJid userJid) {
        AnonymousClass2GD r0;
        synchronized (this) {
            Map map = this.A01;
            r0 = (AnonymousClass2GD) map.get(userJid);
            if (r0 == null) {
                r0 = new AnonymousClass2GD();
                map.put(userJid, r0);
            }
        }
        return r0;
    }

    public AnonymousClass2GH A02(UserJid userJid) {
        synchronized (this) {
            AnonymousClass2GD r0 = (AnonymousClass2GD) this.A01.get(userJid);
            if (r0 == null) {
                return null;
            }
            AnonymousClass2GH r02 = r0.A00;
            return r02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2GH A03(com.whatsapp.jid.UserJid r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001c }
            X.2GD r0 = (X.AnonymousClass2GD) r0     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r0.A04     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x001c }
            X.2GF r0 = (X.AnonymousClass2GF) r0     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            X.2GH r0 = r0.A00     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return r0
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return r1
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18640x1.A03(com.whatsapp.jid.UserJid, java.lang.String):X.2GH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2GE A04(com.whatsapp.jid.UserJid r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001c }
            X.2GD r0 = (X.AnonymousClass2GD) r0     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r0.A04     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x001c }
            X.2GF r0 = (X.AnonymousClass2GF) r0     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            X.2GE r0 = r0.A01     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return r0
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return r1
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18640x1.A04(com.whatsapp.jid.UserJid, java.lang.String):X.2GE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35701mM A05(com.whatsapp.jid.UserJid r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0095 }
            r6 = 0
            if (r0 != 0) goto L_0x002b
            java.util.Map r4 = r7.A02     // Catch:{ all -> 0x0095 }
            X.2GG r0 = new X.2GG     // Catch:{ all -> 0x0095 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0095 }
            X.1mM r0 = (X.C35701mM) r0     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0019
            monitor-exit(r7)     // Catch:{ all -> 0x0095 }
            return r0
        L_0x0019:
            java.util.Map r0 = r7.A03     // Catch:{ all -> 0x0095 }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x0095 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x0095 }
            if (r3 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x002d
            boolean r0 = r3.equals(r8)     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            monitor-exit(r7)     // Catch:{ all -> 0x0095 }
            goto L_0x0093
        L_0x002d:
            java.util.Map r0 = r7.A01     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0095 }
            X.2GD r2 = (X.AnonymousClass2GD) r2     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x002b
            java.util.ArrayList r0 = r2.A02     // Catch:{ all -> 0x0095 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0095 }
        L_0x003d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0095 }
            X.1mM r5 = (X.C35701mM) r5     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x003d
            X.2GG r0 = new X.2GG     // Catch:{ all -> 0x0095 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x0095 }
        L_0x0056:
            r4.put(r0, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r7)     // Catch:{ all -> 0x0095 }
            goto L_0x0094
        L_0x005b:
            java.util.Map r0 = r2.A04     // Catch:{ all -> 0x0095 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0095 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0095 }
        L_0x0065:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0095 }
            X.2GF r0 = (X.AnonymousClass2GF) r0     // Catch:{ all -> 0x0095 }
            X.2GE r0 = r0.A01     // Catch:{ all -> 0x0095 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0095 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0095 }
        L_0x0079:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0095 }
            X.1mM r5 = (X.C35701mM) r5     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0079
            X.2GG r0 = new X.2GG     // Catch:{ all -> 0x0095 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x0095 }
            goto L_0x0056
        L_0x0093:
            return r6
        L_0x0094:
            return r5
        L_0x0095:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0095 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18640x1.A05(com.whatsapp.jid.UserJid, java.lang.String):X.1mM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35691mL A06(com.whatsapp.jid.UserJid r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r4.A08(r5)     // Catch:{ all -> 0x0037 }
            r3 = 0
            if (r0 == 0) goto L_0x0035
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0037 }
        L_0x000c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0037 }
            X.1mM r1 = (X.C35701mM) r1     // Catch:{ all -> 0x0037 }
            X.1mK r0 = r1.A01     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A00     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x000c
            boolean r0 = r1.A07     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x000c
            java.util.List r1 = r1.A06     // Catch:{ all -> 0x0037 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x000c
            r0 = 0
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0037 }
            X.1mL r0 = (X.C35691mL) r0     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return r0
        L_0x0035:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return r3
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18640x1.A06(com.whatsapp.jid.UserJid):X.1mL");
    }

    public List A07(UserJid userJid) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            AnonymousClass2GD r3 = (AnonymousClass2GD) this.A01.get(userJid);
            if (r3 != null) {
                for (String str : r3.A03) {
                    AnonymousClass2GF r0 = (AnonymousClass2GF) r3.A04.get(str);
                    if (r0 != null) {
                        arrayList.add(r0.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    public List A08(UserJid userJid) {
        List unmodifiableList;
        synchronized (this) {
            AnonymousClass2GD r0 = (AnonymousClass2GD) this.A01.get(userJid);
            unmodifiableList = r0 == null ? null : Collections.unmodifiableList(r0.A02);
        }
        return unmodifiableList;
    }

    public void A09() {
        synchronized (this) {
            this.A01.clear();
            this.A02.clear();
            this.A03.clear();
        }
    }

    public void A0A(AnonymousClass2GC r10, UserJid userJid, boolean z2) {
        synchronized (this) {
            AnonymousClass2GD A012 = A01(userJid);
            if (!z2) {
                A012.A03.clear();
            }
            for (AnonymousClass2GE r7 : r10.A01) {
                AnonymousClass2GF r6 = new AnonymousClass2GF(r7);
                for (C35701mM r3 : r7.A04) {
                    Map map = this.A02;
                    String str = r3.A0D;
                    map.put(new AnonymousClass2GG(userJid, str), r3);
                    this.A03.put(str, userJid);
                }
                List list = A012.A03;
                String str2 = r7.A03;
                list.add(str2);
                A012.A04.put(str2, r6);
            }
            A012.A00 = r10.A00;
        }
    }

    public void A0B(AnonymousClass2GI r7, UserJid userJid, boolean z2) {
        synchronized (this) {
            AnonymousClass2GD A012 = A01(userJid);
            if (!z2) {
                ArrayList arrayList = A012.A02;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A03.remove(((C35701mM) it.next()).A0D);
                }
                arrayList.clear();
            }
            for (C35701mM r3 : r7.A01) {
                A012.A02.add(r3);
                Map map = this.A02;
                String str = r3.A0D;
                map.put(new AnonymousClass2GG(userJid, str), r3);
                this.A03.put(str, userJid);
            }
            A012.A01 = r7.A00;
            this.A00.A00().A00(userJid);
        }
    }

    public void A0C(C35701mM r7, UserJid userJid) {
        synchronized (this) {
            Map map = this.A02;
            String str = r7.A0D;
            map.put(new AnonymousClass2GG(userJid, str), r7);
            if (!(userJid == null && (userJid = (UserJid) this.A03.get(str)) == null)) {
                AnonymousClass2GD A012 = A01(userJid);
                Iterator it = A012.A04.values().iterator();
                while (true) {
                    int i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    List list = ((AnonymousClass2GF) it.next()).A01.A04;
                    while (true) {
                        if (i2 >= list.size()) {
                            break;
                        } else if (str.equals(((C35701mM) list.get(i2)).A0D)) {
                            list.set(i2, r7);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = A012.A02;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(0, r7);
                        this.A03.put(str, userJid);
                        break;
                    } else if (str.equals(((C35701mM) arrayList.get(i3)).A0D)) {
                        arrayList.set(i3, r7);
                        break;
                    } else {
                        i3++;
                    }
                }
                this.A00.A00().A00(userJid);
            }
        }
    }

    public void A0D(UserJid userJid) {
        synchronized (this) {
            Map map = this.A01;
            AnonymousClass2GD r4 = (AnonymousClass2GD) map.get(userJid);
            if (r4 != null) {
                Iterator it = r4.A02.iterator();
                while (it.hasNext()) {
                    Map map2 = this.A03;
                    String str = ((C35701mM) it.next()).A0D;
                    map2.remove(str);
                    this.A02.remove(new AnonymousClass2GG(userJid, str));
                }
                for (AnonymousClass2GF r0 : r4.A04.values()) {
                    for (C35701mM r1 : r0.A01.A04) {
                        Map map3 = this.A03;
                        String str2 = r1.A0D;
                        map3.remove(str2);
                        this.A02.remove(new AnonymousClass2GG(userJid, str2));
                    }
                }
            }
            map.remove(userJid);
            this.A00.A00().A00(userJid);
        }
    }

    public void A0E(UserJid userJid, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("CatalogCacheManager/trimProductsInCatalogCache/Invalid size argument - ");
            sb.append(i2);
            Log.e(sb.toString());
            return;
        }
        synchronized (this) {
            AnonymousClass2GD r2 = (AnonymousClass2GD) this.A01.get(userJid);
            if (r2 != null) {
                r2.A01 = new AnonymousClass2GH((String) null, true);
                ArrayList arrayList = r2.A02;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size - i2; i3++) {
                    int size2 = arrayList.size() - 1;
                    String str = ((C35701mM) arrayList.get(size2)).A0D;
                    this.A03.remove(str);
                    this.A02.remove(new AnonymousClass2GG(userJid, str));
                    arrayList.remove(size2);
                }
            }
        }
    }

    public void A0F(UserJid userJid, boolean z2) {
        synchronized (this) {
            AnonymousClass2GD r3 = (AnonymousClass2GD) this.A01.get(userJid);
            if (r3 != null) {
                r3.A03.clear();
                r3.A04.clear();
                if (z2) {
                    r3.A00 = new AnonymousClass2GH((String) null, true);
                }
            }
        }
    }

    public void A0G(String str) {
        AnonymousClass2GD r4;
        synchronized (this) {
            Map map = this.A03;
            UserJid userJid = (UserJid) map.get(str);
            this.A02.remove(new AnonymousClass2GG(userJid, str));
            map.remove(str);
            if (!(userJid == null || (r4 = (AnonymousClass2GD) this.A01.get(userJid)) == null)) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = r4.A02;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (str.equals(((C35701mM) arrayList.get(i2)).A0D)) {
                        arrayList.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                for (AnonymousClass2GF r3 : r4.A04.values()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= r3.A01.A04.size()) {
                            break;
                        } else if (str.equals(((C35701mM) r3.A01.A04.get(i3)).A0D)) {
                            r3.A01.A04.remove(i3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                this.A00.A00().A00(userJid);
            }
        }
    }

    public boolean A0H(UserJid userJid) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.A01.get(userJid) != null) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean A0I(UserJid userJid) {
        boolean z2;
        synchronized (this) {
            AnonymousClass2GD r0 = (AnonymousClass2GD) this.A01.get(userJid);
            z2 = false;
            if (r0 != null && !r0.A03.isEmpty()) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean A0J(UserJid userJid) {
        boolean z2;
        synchronized (this) {
            AnonymousClass2GD r0 = (AnonymousClass2GD) this.A01.get(userJid);
            z2 = false;
            if (r0 != null && !r0.A02.isEmpty()) {
                z2 = true;
            }
        }
        return z2;
    }
}
