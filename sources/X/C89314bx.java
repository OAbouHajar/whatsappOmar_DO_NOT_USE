package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4bx  reason: invalid class name and case insensitive filesystem */
public class C89314bx {
    public static final C105625Ai A0A = new C105625Ai();
    public int A00 = 0;
    public final AnonymousClass4RV A01;
    public final AnonymousClass4TN A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final HashMap A06 = AnonymousClass000.A0x();
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public C89314bx(AnonymousClass4RV r3, AnonymousClass4TN r4, Object obj, boolean z2) {
        C90264dr.A03(obj, "root can not be null");
        C90264dr.A03(r3, "configuration can not be null");
        this.A08 = z2;
        this.A02 = r4;
        this.A04 = obj;
        this.A01 = r3;
        AnonymousClass4XH r1 = ((C99724uU) r3.A00).A00;
        this.A05 = r1.A01();
        this.A03 = r1.A01();
        this.A07 = AnonymousClass000.A0u();
        this.A09 = r3.A03.contains(AnonymousClass420.SUPPRESS_EXCEPTIONS);
    }

    public Object A00() {
        AnonymousClass4TN r3 = this.A02;
        if (!r3.A00.A05()) {
            return this.A05;
        }
        if (this.A00 != 0) {
            C109755Tl r0 = this.A01.A00;
            Object obj = this.A05;
            int AK7 = r0.AK7(obj);
            if (AK7 <= 0) {
                return null;
            }
            return ((List) obj).get(AK7 - 1);
        } else if (this.A09) {
            return null;
        } else {
            throw new C69963ft(AnonymousClass000.A0h(r3.toString(), AnonymousClass000.A0r("No results for path: ")));
        }
    }

    public List A01() {
        ArrayList A0u = AnonymousClass000.A0u();
        if (this.A00 > 0) {
            for (Object add : this.A01.A00.Ago(this.A03)) {
                A0u.add(add);
            }
        }
        return A0u;
    }

    public void A02(AnonymousClass552 r5, Object obj, String str) {
        if (this.A08) {
            this.A07.add(r5);
        }
        AnonymousClass4RV r3 = this.A01;
        C109755Tl r2 = r3.A00;
        r2.AdY(this.A05, this.A00, obj);
        r2.AdY(this.A03, this.A00, str);
        this.A00++;
        Collection collection = r3.A02;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("resultFound");
            }
        }
    }
}
