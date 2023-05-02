package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1NK  reason: invalid class name */
public class AnonymousClass1NK {
    public static final List A0B;
    public int A00 = 0;
    public int A01 = 0;
    public List A02;
    public final AnonymousClass1NR A03;
    public final AnonymousClass5TF A04;
    public final AnonymousClass1NL A05;
    public final C82774Ec A06;
    public final C108885Pw A07;
    public final C26871Po A08;
    public final List A09 = Collections.unmodifiableList(new ArrayList(A0B));
    public final AtomicInteger A0A = new AtomicInteger(Integer.MIN_VALUE);

    static {
        ArrayList arrayList = new ArrayList();
        Double valueOf = Double.valueOf(0.5d);
        arrayList.add(valueOf);
        arrayList.add(valueOf);
        A0B = Collections.unmodifiableList(arrayList);
    }

    public AnonymousClass1NK(AnonymousClass1NR r3, AnonymousClass1NL r4, C26871Po r5) {
        this.A05 = r4;
        this.A03 = r3;
        this.A08 = r5;
        this.A06 = new C82774Ec(this);
        this.A07 = new C102954zn(this);
        this.A04 = new C102924zk(this);
    }

    public static /* synthetic */ void A00(AnonymousClass1NK r2, int i2) {
        synchronized (r2) {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleMigrate/setCurrentScreen = ");
            sb.append(i2);
            Log.i(sb.toString());
            r2.A01 = i2;
        }
    }

    public void A01(int i2, int i3, int i4) {
        double doubleValue;
        double d2 = (((double) i3) * 1.0d) / ((double) i4);
        synchronized (this) {
            if (this.A02 == null) {
                List list = this.A09;
                ArrayList arrayList = new ArrayList();
                double d3 = 0.0d;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    arrayList.add(Double.valueOf(d3));
                    d3 += ((Double) list.get(i5)).doubleValue();
                }
                arrayList.add(Double.valueOf(d3));
                this.A02 = Collections.unmodifiableList(arrayList);
            }
        }
        List list2 = this.A09;
        if (i2 >= list2.size()) {
            doubleValue = 1.0d;
        } else {
            double min = Math.min(Math.max(0.0d, d2), 1.0d);
            doubleValue = (((Number) this.A02.get(i2)).doubleValue() + (((Number) list2.get(i2)).doubleValue() * min)) / ((Number) this.A02.get(list2.size())).doubleValue();
        }
        int i6 = (int) (doubleValue * 100.0d);
        if (i6 != this.A0A.getAndSet(i6)) {
            for (AnonymousClass5TF AVL : this.A05.A01()) {
                AVL.AVL(i6);
            }
        }
    }
}
