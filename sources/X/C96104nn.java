package X;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4nn  reason: invalid class name and case insensitive filesystem */
public abstract class C96104nn implements AnonymousClass5UN {
    public final AnonymousClass5UN A00;

    public C96104nn(AnonymousClass5UN r1) {
        this.A00 = r1;
    }

    public Set A9t() {
        LinkedHashSet linkedHashSet;
        if (!(this instanceof AnonymousClass3U8)) {
            return this.A00.A9t();
        }
        AnonymousClass3U8 r9 = (AnonymousClass3U8) this;
        C12890l8 r10 = r9.A00;
        long now = r10.now();
        long j2 = AnonymousClass3U8.A04;
        if (r10.now() - r9.A02 > j2) {
            Set set = r9.A01;
            synchronized (set) {
                if (r10.now() - r9.A02 > j2) {
                    set.clear();
                    set.addAll(r9.A00.A9t());
                    r9.A02 = now;
                }
            }
        }
        Set set2 = r9.A01;
        synchronized (set2) {
            linkedHashSet = new LinkedHashSet(set2);
        }
        return linkedHashSet;
    }

    public File ACE(String str) {
        Iterator it;
        if (this instanceof AnonymousClass3U7) {
            AnonymousClass3U7 r2 = (AnonymousClass3U7) this;
            List list = r2.A00;
            if (list.isEmpty()) {
                return r2.A00.ACE(str);
            }
            try {
                AnonymousClass5UN r0 = r2.A00;
                File ACE = r0.ACE(str);
                r0.AHY(str);
                it = list.iterator();
                if (!it.hasNext()) {
                    return ACE;
                }
            } catch (Throwable th) {
                it = list.iterator();
                if (!it.hasNext()) {
                    throw th;
                }
            }
            it.next();
            throw AnonymousClass000.A0W("onGet");
        }
        AnonymousClass3U8 r5 = (AnonymousClass3U8) this;
        if (r5.A02 == AnonymousClass3U8.A03 || r5.A01.contains(str)) {
            return r5.A00.ACE(str);
        }
        return null;
    }

    public File ACH(String str) {
        return this.A00.ACH(str);
    }

    public long ACt(String str) {
        return this.A00.ACt(str);
    }

    public long AG7() {
        return this.A00.AG7();
    }

    public boolean AHY(String str) {
        if (!(this instanceof AnonymousClass3U8)) {
            return this.A00.AHY(str);
        }
        AnonymousClass3U8 r5 = (AnonymousClass3U8) this;
        if (r5.A02 == AnonymousClass3U8.A03) {
            Set set = r5.A01;
            if (!set.contains(str)) {
                if (!r5.A00.AHY(str)) {
                    return false;
                }
                set.add(str);
                return true;
            }
        }
        return r5.A01.contains(str);
    }

    public File AIO(String str) {
        Iterator it;
        if (this instanceof AnonymousClass3U7) {
            AnonymousClass3U7 r0 = (AnonymousClass3U7) this;
            List list = r0.A01;
            boolean isEmpty = list.isEmpty();
            AnonymousClass5UN r02 = r0.A00;
            if (isEmpty) {
                return r02.AIO(str);
            }
            r02.AHY(str);
            try {
                File AIO = r02.AIO(str);
                it = list.iterator();
                if (!it.hasNext()) {
                    return AIO;
                }
            } catch (Throwable th) {
                it = list.iterator();
                if (!it.hasNext()) {
                    throw th;
                }
            }
            it.next();
            throw AnonymousClass000.A0W("onInsert");
        }
        AnonymousClass3U8 r1 = (AnonymousClass3U8) this;
        r1.A01.add(str);
        return r1.A00.AIO(str);
    }

    public long AK3(String str) {
        return this.A00.AK3(str);
    }

    public boolean Abs(String str) {
        if (this instanceof AnonymousClass3U7) {
            return Abt(str, 0);
        }
        AnonymousClass3U8 r1 = (AnonymousClass3U8) this;
        r1.A01.remove(str);
        return r1.A00.Abs(str);
    }

    public boolean Abt(String str, int i2) {
        if (this instanceof AnonymousClass3U7) {
            AnonymousClass3U7 r0 = (AnonymousClass3U7) this;
            List list = r0.A02;
            boolean isEmpty = list.isEmpty();
            boolean Abt = r0.A00.Abt(str, 0);
            if (!isEmpty) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0W("onRemove");
                }
            }
            return Abt;
        }
        AnonymousClass3U8 r2 = (AnonymousClass3U8) this;
        r2.A01.remove(str);
        return r2.A00.Abt(str, 0);
    }
}
