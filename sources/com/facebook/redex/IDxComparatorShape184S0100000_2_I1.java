package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass03H;
import X.AnonymousClass0YH;
import X.AnonymousClass1US;
import X.C108275Ni;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16180sb;
import X.C18450wi;
import X.C31241dn;
import X.C32001fU;
import X.C34181jp;
import X.C34201js;
import X.C34751ko;
import X.C39631sn;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import java.io.File;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

public class IDxComparatorShape184S0100000_2_I1 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape184S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        try {
            return compareOrg(obj, obj2);
        } catch (Exception unused) {
            return 1;
        }
    }

    public /* bridge */ /* synthetic */ int compareOrg(Object obj, Object obj2) {
        Collator collator;
        String str;
        String str2;
        switch (this.A01) {
            case 0:
                throw AnonymousClass000.A0V("Two plugins with the same ordering provided");
            case 1:
                C108275Ni r0 = (C108275Ni) this.A00;
                return r0.AFk(obj2) - r0.AFk(obj);
            case 2:
                collator = (Collator) this.A00;
                str = ((C31241dn) obj).A01;
                str2 = ((C31241dn) obj2).A01;
                break;
            case 3:
                AnonymousClass0YH r3 = (AnonymousClass0YH) this.A00;
                return C34181jp.A00(Double.valueOf(r3.A00().A00(C18450wi.A02((AnonymousClass1US) obj))), Double.valueOf(r3.A00().A00(C18450wi.A02((AnonymousClass1US) obj2))));
            case 4:
                ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this.A00;
                C32001fU r9 = (C32001fU) obj;
                C32001fU r10 = (C32001fU) obj2;
                int i2 = r9.A01;
                boolean z2 = false;
                if (i2 == 1 && r10.A01 == 1) {
                    return 0;
                }
                if (i2 == 1) {
                    return -1;
                }
                if (r10.A01 == 1) {
                    return 1;
                }
                C16000sG r1 = participantsListViewModel.A08;
                C16010sH A0A = r1.A0A(r9.A07);
                C16010sH A0A2 = r1.A0A(r10.A07);
                C34751ko r2 = A0A.A0D;
                boolean A1V = AnonymousClass000.A1V(r2);
                if (A0A2.A0D != null) {
                    z2 = true;
                }
                if (A1V != z2) {
                    return r2 != null ? -1 : 1;
                }
                C16080sP r02 = participantsListViewModel.A09;
                return r02.A08(A0A).compareTo(r02.A08(A0A2));
            case 5:
                try {
                    return Integer.parseInt(((File) obj).getName().substring(8)) - Integer.parseInt(((File) obj2).getName().substring(8));
                } catch (Exception unused) {
                    return 0;
                }
            case 6:
                return AnonymousClass03H.A00(((C39631sn) obj2).A00, ((C39631sn) obj).A00);
            case 7:
                return (((C39631sn) obj).A01 > ((C39631sn) obj2).A01 ? 1 : (((C39631sn) obj).A01 == ((C39631sn) obj2).A01 ? 0 : -1));
            case 8:
                collator = (Collator) this.A00;
                str = ((C34201js) obj).A03;
                str2 = ((C34201js) obj2).A03;
                break;
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                int compare = ((Collator) this.A00).compare((String) entry.getValue(), (String) entry2.getValue());
                if (compare == 0) {
                    return compare;
                }
                String str3 = C16180sb.A0C;
                if (str3.equals(entry.getValue())) {
                    return -1;
                }
                if (!str3.equals(entry2.getValue())) {
                    String str4 = C16180sb.A0F;
                    if (str4.equals(entry.getValue())) {
                        return -1;
                    }
                    if (str4.equals(entry2.getValue())) {
                        return 1;
                    }
                    return compare;
                }
                return 1;
        }
        return collator.compare(str, str2);
    }
}
