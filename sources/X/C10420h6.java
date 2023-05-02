package X;

import java.util.List;

/* renamed from: X.0h6  reason: invalid class name and case insensitive filesystem */
public class C10420h6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0UC A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C10420h6(AnonymousClass0UC r1, List list, List list2, int i2) {
        this.A01 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = i2;
    }

    public void run() {
        this.A01.A05.execute(new C09850gB(this, AnonymousClass07B.A00(new AnonymousClass0FX(this))));
    }
}
