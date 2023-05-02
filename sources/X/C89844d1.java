package X;

import java.util.EnumSet;

/* renamed from: X.4d1  reason: invalid class name and case insensitive filesystem */
public class C89844d1 {
    public final AnonymousClass4TN A00;

    public C89844d1(String str, AnonymousClass5OQ[] r3) {
        this.A00 = C89144bf.A00(str, r3);
    }

    public static C88604an A00(Object obj) {
        AnonymousClass4RU r2 = new AnonymousClass4RU();
        r2.A00 = new C99724uU();
        r2.A03.addAll(EnumSet.noneOf(AnonymousClass420.class));
        AnonymousClass4RV A002 = r2.A00();
        C90264dr.A03(obj, "json object can not be null");
        return new C88604an(A002, obj);
    }

    public static C88604an A01(String str) {
        AnonymousClass4RU r2 = new AnonymousClass4RU();
        r2.A00 = new C99724uU();
        r2.A03.addAll(EnumSet.noneOf(AnonymousClass420.class));
        AnonymousClass4RV A002 = r2.A00();
        if (str == null || str.length() == 0) {
            throw AnonymousClass000.A0T("json string can not be null or empty");
        }
        try {
            return new C88604an(A002, new C107215Gw(-1).A0A(str, ((C99724uU) A002.A00).A00));
        } catch (C804343v e2) {
            throw new C69993fw(e2);
        }
    }
}
