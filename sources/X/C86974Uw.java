package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Uw  reason: invalid class name and case insensitive filesystem */
public abstract class C86974Uw {
    public String A00;
    public ArrayList A01 = AnonymousClass000.A0u();
    public boolean A02;
    public boolean A03;
    public final List A04 = AnonymousClass000.A0u();

    public void A00(String str, Collection collection, boolean z2) {
        AnonymousClass00B.A01();
        this.A02 = z2;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3R7) it.next()).A0E(this);
        }
        this.A03 = false;
    }

    public abstract boolean A01(String str);
}
