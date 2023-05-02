package X;

import java.util.List;
import java.util.Locale;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0Qf  reason: invalid class name and case insensitive filesystem */
public class C05320Qf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass0Rs A09;
    public final AnonymousClass0HT A0A;
    public final AnonymousClass0HS A0B;
    public final AnonymousClass0Oi A0C;
    public final C08450df A0D;
    public final C03680Jl A0E;
    public final AnonymousClass0JX A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;

    public C05320Qf(AnonymousClass0Rs r3, AnonymousClass0HT r4, AnonymousClass0HS r5, AnonymousClass0Oi r6, C08450df r7, C03680Jl r8, AnonymousClass0JX r9, String str, String str2, List list, List list2, List list3, float f2, float f3, int i2, int i3, int i4, int i5, int i6, long j2, long j3, boolean z2) {
        this.A0K = list;
        this.A09 = r3;
        this.A0G = str;
        this.A07 = j2;
        this.A0E = r8;
        this.A08 = j3;
        this.A0H = str2;
        this.A0J = list2;
        this.A0D = r7;
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A01 = f2;
        this.A00 = f3;
        this.A03 = i5;
        this.A02 = i6;
        this.A0B = r5;
        this.A0C = r6;
        this.A0I = list3;
        this.A0F = r9;
        this.A0A = r4;
        this.A0L = z2;
    }

    public String A00(String str) {
        int i2;
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(this.A0G);
        A0q.append(IOUtils.LINE_SEPARATOR_UNIX);
        AnonymousClass0Rs r2 = this.A09;
        long j2 = this.A08;
        AnonymousClass03G r5 = r2.A05;
        C05320Qf r1 = (C05320Qf) r5.A04(j2, (Object) null);
        if (r1 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A0q.append(str2);
                A0q.append(r1.A0G);
                r1 = (C05320Qf) r5.A04(r1.A08, (Object) null);
                if (r1 == null) {
                    break;
                }
                str2 = "->";
            }
            A0q.append(str);
            A0q.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        List list = this.A0J;
        if (!list.isEmpty()) {
            A0q.append(str);
            A0q.append("\tMasks: ");
            A0q.append(list.size());
            A0q.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        int i3 = this.A06;
        if (!(i3 == 0 || (i2 = this.A05) == 0)) {
            A0q.append(str);
            A0q.append("\tBackground: ");
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass000.A1M(objArr, i3, 0);
            AnonymousClass000.A1M(objArr, i2, 1);
            AnonymousClass000.A1M(objArr, this.A04, 2);
            A0q.append(String.format(locale, "%dx%d %X\n", objArr));
        }
        List list2 = this.A0K;
        if (!list2.isEmpty()) {
            A0q.append(str);
            A0q.append("\tShapes:\n");
            for (Object next : list2) {
                A0q.append(str);
                AnonymousClass000.A1F(next, "\t\t", IOUtils.LINE_SEPARATOR_UNIX, A0q);
            }
        }
        return A0q.toString();
    }

    public String toString() {
        return A00("");
    }
}
