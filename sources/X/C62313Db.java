package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3Db  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62313Db implements AnonymousClass023 {
    public final /* synthetic */ AnonymousClass1TC A00;
    public final /* synthetic */ C49272Sb A01;
    public final /* synthetic */ C35171lU A02;

    public /* synthetic */ C62313Db(AnonymousClass1TC r1, C49272Sb r2, C35171lU r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void AOH(Object obj) {
        int i2;
        C49272Sb r0 = this.A01;
        C35171lU r3 = this.A02;
        AnonymousClass1TC r1 = this.A00;
        C49822Vz r15 = (C49822Vz) obj;
        AnonymousClass026 r9 = r0.A01;
        if (r15.A00 == 0) {
            AnonymousClass4K5 r12 = r1.A03;
            float f2 = (float) AnonymousClass000.A0M(r12.A01.A00).heightPixels;
            float f3 = r12.A00;
            i2 = f2 < f3 ? 1 : (int) Math.ceil((double) (f2 / f3));
        } else {
            i2 = 0;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = 0;
        for (C35141lR r32 : r3.A02) {
            ArrayList A0u3 = AnonymousClass000.A0u();
            for (C35161lT r02 : r32.A01) {
                A0u3.add(r02.A00);
                i3++;
            }
            A0u.add(r32.A00);
            A0u2.add(A0u3);
        }
        List<C35701mM> list = r15.A01;
        ArrayList A0u4 = AnonymousClass000.A0u();
        if (list != null) {
            for (C35701mM r2 : list) {
                String str = r2.A0D;
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, r2);
                }
            }
            for (int i4 = 0; i4 < A0u.size(); i4++) {
                ArrayList A0u5 = AnonymousClass000.A0u();
                for (Object obj2 : (List) A0u2.get(i4)) {
                    C35701mM r13 = (C35701mM) linkedHashMap.get(obj2);
                    if (r13 != null) {
                        A0u5.add(new C100414vb(r13));
                    }
                }
                if (!A0u5.isEmpty()) {
                    String str2 = (String) A0u.get(i4);
                    if (!TextUtils.isEmpty(str2)) {
                        A0u4.add(new C100404va(str2));
                    }
                    A0u4.addAll(A0u5);
                }
            }
            int size = i3 - list.size();
            if (size > i2) {
                size = i2;
            }
            for (int i5 = 0; i5 < size; i5++) {
                A0u4.add(new C100394vZ());
            }
        }
        r9.A09(A0u4);
    }
}
