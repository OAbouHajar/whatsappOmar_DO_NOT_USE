package X;

import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.28O  reason: invalid class name */
public class AnonymousClass28O extends C16690tT {
    public WeakReference A00;
    public final C19410yO A01;
    public final AnonymousClass113 A02;

    public AnonymousClass28O(AnonymousClass28N r2, C19410yO r3, AnonymousClass113 r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = new WeakReference(r2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        C19410yO r5 = this.A01;
        List A06 = r5.A06();
        Collections.sort(A06, r5.A02);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = A06.iterator();
        long A002 = r5.A0B.A00();
        int i2 = 0;
        while (it.hasNext()) {
            AnonymousClass1WN r11 = (AnonymousClass1WN) it.next();
            long j2 = r11.A01;
            if (j2 > 0) {
                if (C42681yF.A00(A002, j2) > 5) {
                    it.remove();
                    arrayList2.add(r11.A06);
                } else {
                    i2++;
                }
            }
        }
        if (i2 > 20) {
            int size = A06.size();
            ArrayList arrayList3 = new ArrayList(A06.subList(size - (i2 - 20), size));
            A06.removeAll(arrayList3);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AnonymousClass1WN) it2.next()).A06);
            }
        }
        if (!arrayList2.isEmpty()) {
            r5.A0I.A04(C17380uz.copyOf((Collection) arrayList2));
        }
        AnonymousClass113 r6 = this.A02;
        if (r6 instanceof AnonymousClass1GK) {
            AnonymousClass1GK r62 = (AnonymousClass1GK) r6;
            if (r62.A01.A00.A05(C15910s6.A11)) {
                ArrayList arrayList4 = new ArrayList();
                C15970sD r4 = r62.A03;
                for (String str : r4.A02()) {
                    AnonymousClass1GJ r1 = r62.A02;
                    Number number = (Number) r1.A01.get(str);
                    int intValue = number != null ? number.intValue() : R.string.str188d;
                    Number number2 = (Number) r1.A00.get(str);
                    arrayList4.add(new AnonymousClass4ML(str, intValue, number2 != null ? number2.intValue() : R.drawable.device_list_ic_unknown_device, r4.A01().getLong(C15970sD.A00(str, "metadata/last_active_time"), 0)));
                }
                arrayList = arrayList4;
                return new C83534Hb(A06, arrayList);
            }
        }
        arrayList = Collections.emptyList();
        return new C83534Hb(A06, arrayList);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83534Hb r4 = (C83534Hb) obj;
        AnonymousClass28N r2 = (AnonymousClass28N) this.A00.get();
        if (r2 != null) {
            r2.AUQ(r4.A00, r4.A01);
        }
    }
}
