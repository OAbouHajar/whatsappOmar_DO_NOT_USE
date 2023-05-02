package X;

/* renamed from: X.0f3  reason: invalid class name and case insensitive filesystem */
public class C09170f3 implements Comparable {
    public AnonymousClass0Dj A00;
    public AnonymousClass0SA A01;
    public final /* synthetic */ AnonymousClass0Dj A02;

    public C09170f3(AnonymousClass0Dj r1, AnonymousClass0Dj r2) {
        this.A02 = r1;
        this.A00 = r2;
    }

    public int compareTo(Object obj) {
        return this.A01.A02 - ((AnonymousClass0SA) obj).A02;
    }

    public String toString() {
        String str = "[ ";
        if (this.A01 != null) {
            int i2 = 0;
            do {
                StringBuilder A0q = AnonymousClass000.A0q(str);
                A0q.append(this.A01.A09[i2]);
                str = AnonymousClass000.A0h(" ", A0q);
                i2++;
            } while (i2 < 9);
        }
        StringBuilder A0q2 = AnonymousClass000.A0q(str);
        A0q2.append("] ");
        return AnonymousClass000.A0f(this.A01, A0q2);
    }
}
