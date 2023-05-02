package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1aJ  reason: invalid class name and case insensitive filesystem */
public class C29261aJ {
    public int A00 = 1;
    public int A01 = 1;
    public AnonymousClass2BC A02;
    public AnonymousClass29Q A03 = new AnonymousClass29Q();
    public boolean A04;
    public final Context A05;
    public final List A06 = new ArrayList();
    public final Set A07 = new LinkedHashSet();

    public C29261aJ(Context context) {
        this.A05 = context;
    }

    public void A00() {
        this.A07.clear();
        this.A03 = new AnonymousClass29Q();
        this.A06.clear();
    }

    public void A01() {
        List<C54972iZ> list = this.A06;
        if (!list.isEmpty()) {
            for (C54972iZ ACD : list) {
                File ACD2 = ACD.ACD();
                if (!ACD2.delete()) {
                    StringBuilder sb = new StringBuilder("camerastatemanager/cannot-delete-file ");
                    sb.append(ACD2);
                    Log.w(sb.toString());
                }
            }
            list.clear();
        }
    }

    public boolean A02(Collection collection) {
        for (Object next : collection) {
            Iterator it = this.A06.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(((AnonymousClass2BF) it.next()).A9L())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
