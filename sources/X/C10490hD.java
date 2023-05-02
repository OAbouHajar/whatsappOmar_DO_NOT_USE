package X;

import java.util.ArrayList;

/* renamed from: X.0hD  reason: invalid class name and case insensitive filesystem */
public class C10490hD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0WS A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;

    public C10490hD(AnonymousClass0WS r1, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.A01 = r1;
        this.A00 = i2;
        this.A04 = arrayList;
        this.A02 = arrayList2;
        this.A05 = arrayList3;
        this.A03 = arrayList4;
    }

    public void run() {
        for (int i2 = 0; i2 < this.A00; i2++) {
            C004601z.A0n(AnonymousClass000.A0N(this.A04, i2), (String) this.A02.get(i2));
            C004601z.A0n(AnonymousClass000.A0N(this.A05, i2), (String) this.A03.get(i2));
        }
    }
}
