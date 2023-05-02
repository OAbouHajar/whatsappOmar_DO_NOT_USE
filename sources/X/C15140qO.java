package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0qO  reason: invalid class name and case insensitive filesystem */
public class C15140qO extends C15150qP {
    public final C24691Gx A00;
    public final C15210qV A01;
    public final C15340qi A02;

    public /* synthetic */ C15140qO(C15340qi r5) {
        C24691Gx r2;
        C15360qk r0;
        C27321Rh r1 = (C27321Rh) r5;
        C15210qV r02 = new C15210qV(r1);
        this.A02 = r5;
        this.A01 = r02;
        synchronized (C24691Gx.class) {
            r2 = C24691Gx.A01;
            if (r2 == null) {
                r2 = new C24691Gx();
                C24691Gx.A01 = r2;
            }
        }
        this.A00 = r2;
        Context A9y = r1.A9y();
        synchronized (C15360qk.class) {
            r0 = C15360qk.A03;
            if (r0 == null) {
                r0 = new C15360qk(A9y);
                C15360qk.A03 = r0;
            }
        }
        this.A00 = r0;
        this.A01 = this;
        this.A00 = new C96124np(A9y, this);
        C47732Ke r3 = new C47732Ke(this);
        HashMap hashMap = r2.A00;
        List list = (List) hashMap.get(0);
        list = list == null ? new ArrayList() : list;
        list.add(r3);
        hashMap.put(0, list);
    }
}
