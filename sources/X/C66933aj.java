package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3aj  reason: invalid class name and case insensitive filesystem */
public final class C66933aj extends C105895Bp<String> implements C110005Uq, RandomAccess {
    public static final C66933aj A01;
    public static final C110005Uq A02;
    public final List A00;

    static {
        C66933aj r1 = new C66933aj(C13690nt.A0i(10));
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public C66933aj(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AnonymousClass557)) {
            return new String((byte[]) obj, AnonymousClass4ZC.A02);
        }
        AnonymousClass557 r4 = (AnonymousClass557) obj;
        Charset charset = AnonymousClass4ZC.A02;
        if (r4.A02() == 0) {
            return "";
        }
        C66963am r42 = (C66963am) r4;
        return new String(r42.zzb, r42.A03(), r42.A02(), charset);
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= size()) {
            ArrayList A0i = C13690nt.A0i(i2);
            A0i.addAll(this.A00);
            return new C66933aj(A0i);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final void Aip(AnonymousClass557 r2) {
        A02();
        this.A00.add(r2);
        this.modCount++;
    }

    public final Object Aj6(int i2) {
        return this.A00.get(i2);
    }

    public final List AjH() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C110005Uq AjJ() {
        return this.A00 ? new C105905Bq(this) : this;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A02();
        this.A00.add(i2, obj);
        this.modCount++;
    }

    public final boolean addAll(int i2, Collection collection) {
        A02();
        if (collection instanceof C110005Uq) {
            collection = ((C110005Uq) collection).AjH();
        }
        boolean addAll = this.A00.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        A02();
        this.A00.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i2) {
        String str;
        int A012;
        List list = this.A00;
        Object obj = list.get(i2);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof AnonymousClass557) {
            AnonymousClass557 r7 = (AnonymousClass557) obj;
            Charset charset = AnonymousClass4ZC.A02;
            if (r7.A02() == 0) {
                str = "";
            } else {
                C66963am r0 = (C66963am) r7;
                str = new String(r0.zzb, r0.A03(), r0.A02(), charset);
            }
            C66963am r72 = (C66963am) r7;
            int A03 = r72.A03();
            A012 = AnonymousClass4YS.A00.A01(r72.zzb, A03, r72.A02() + A03);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AnonymousClass4ZC.A02);
            A012 = AnonymousClass4YS.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i2, str);
        }
        return str;
    }

    public final /* synthetic */ Object remove(int i2) {
        A02();
        Object remove = this.A00.remove(i2);
        this.modCount++;
        return A00(remove);
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        A02();
        return A00(this.A00.set(i2, obj));
    }

    public final int size() {
        return this.A00.size();
    }
}
