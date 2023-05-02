package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3Z9  reason: invalid class name */
public final class AnonymousClass3Z9 extends C105875Bn<String> implements C109995Up, RandomAccess {
    public static final AnonymousClass3Z9 A01;
    public static final C109995Up A02;
    public final List A00;

    static {
        AnonymousClass3Z9 r1 = new AnonymousClass3Z9(C13690nt.A0i(10));
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public AnonymousClass3Z9(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AnonymousClass556)) {
            return new String((byte[]) obj, AnonymousClass4ZB.A03);
        }
        AnonymousClass556 r4 = (AnonymousClass556) obj;
        Charset charset = AnonymousClass4ZB.A03;
        if (r4.A02() == 0) {
            return "";
        }
        AnonymousClass3ZC r42 = (AnonymousClass3ZC) r4;
        return new String(r42.zzfp, r42.A03(), r42.A02(), charset);
    }

    public final Object AFN(int i2) {
        return this.A00.get(i2);
    }

    public final List AjC() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C109995Up AjD() {
        return this.A00 ? new C105885Bo(this) : this;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= size()) {
            ArrayList A0i = C13690nt.A0i(i2);
            A0i.addAll(this.A00);
            return new AnonymousClass3Z9(A0i);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A02();
        this.A00.add(i2, obj);
        this.modCount++;
    }

    public final boolean addAll(int i2, Collection collection) {
        A02();
        if (collection instanceof C109995Up) {
            collection = ((C109995Up) collection).AjC();
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
        int A022;
        List list = this.A00;
        Object obj = list.get(i2);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof AnonymousClass556) {
            AnonymousClass556 r7 = (AnonymousClass556) obj;
            Charset charset = AnonymousClass4ZB.A03;
            if (r7.A02() == 0) {
                str = "";
            } else {
                AnonymousClass3ZC r0 = (AnonymousClass3ZC) r7;
                str = new String(r0.zzfp, r0.A03(), r0.A02(), charset);
            }
            AnonymousClass3ZC r72 = (AnonymousClass3ZC) r7;
            int A03 = r72.A03();
            A022 = C90324dx.A00.A02(r72.zzfp, A03, r72.A02() + A03);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AnonymousClass4ZB.A03);
            A022 = C90324dx.A00.A02(bArr, 0, bArr.length);
        }
        if (A022 == 0) {
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
