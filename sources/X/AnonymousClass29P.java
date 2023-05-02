package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.29P  reason: invalid class name */
public class AnonymousClass29P {
    public final int A00;
    public final AnonymousClass027 A01;
    public final AnonymousClass027 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass027 A04;
    public final AnonymousClass027 A05 = new AnonymousClass027(0);
    public final AnonymousClass027 A06;
    public final C17030uP A07;
    public final AnonymousClass29Q A08;
    public final C17960vv A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;

    public AnonymousClass29P(C17030uP r3, C35541m6 r4, AnonymousClass29Q r5, C17960vv r6, List list, List list2, int i2, int i3, int i4, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.A0B = arrayList;
        this.A09 = r6;
        this.A08 = r5;
        this.A07 = r3;
        this.A00 = i4;
        arrayList.addAll(list);
        this.A03 = new AnonymousClass027(Collections.unmodifiableList(arrayList));
        this.A02 = new AnonymousClass027(Integer.valueOf(i2));
        this.A01 = new AnonymousClass027(Collections.unmodifiableList(list2));
        this.A0A = Collections.unmodifiableList(list2);
        AnonymousClass027 r1 = i3 != -1 ? new AnonymousClass027(Integer.valueOf(i3)) : new AnonymousClass026();
        this.A06 = r1;
        r1.A0B(Integer.valueOf(A01()));
        this.A0C = z2;
        this.A04 = new AnonymousClass027(r4);
    }

    public byte A00() {
        AnonymousClass027 r1 = this.A03;
        if (0 >= ((List) r1.A01()).size()) {
            return -1;
        }
        return this.A09.A01(this.A08.A00((Uri) ((List) r1.A01()).get(0)));
    }

    public final int A01() {
        byte A002;
        AnonymousClass027 r3 = this.A01;
        for (C15830rv r1 : (List) r3.A01()) {
            if ((r1 instanceof UserJid) && this.A07.A02((UserJid) r1)) {
                return 0;
            }
        }
        if (this.A00 == 35 || C16030sJ.A0S((List) r3.A01())) {
            return 0;
        }
        AnonymousClass027 r32 = this.A03;
        if (((List) r32.A01()).size() != 1 || (A002 = A00()) == 13 || A002 == 29) {
            return 0;
        }
        if (!(!this.A08.A00((Uri) ((List) r32.A01()).get(0)).A0F())) {
            return 1;
        }
        Number number = (Number) this.A06.A01();
        return (number == null || number.intValue() != 3) ? 2 : 3;
    }

    public Uri A02() {
        int intValue = ((Number) this.A02.A01()).intValue();
        if (intValue < 0) {
            return null;
        }
        List list = this.A0B;
        if (intValue < list.size()) {
            return (Uri) list.get(intValue);
        }
        return null;
    }

    public final void A03() {
        int size;
        AnonymousClass027 r1 = this.A03;
        List list = this.A0B;
        r1.A09(Collections.unmodifiableList(list));
        if (list.isEmpty()) {
            size = -1;
        } else {
            if (((Number) this.A02.A01()).intValue() >= list.size()) {
                size = list.size() - 1;
            }
            A06(A01());
        }
        A04(size);
        A06(A01());
    }

    public void A04(int i2) {
        AnonymousClass027 r1 = this.A02;
        if (((Number) r1.A01()).intValue() != i2) {
            r1.A0B(Integer.valueOf(i2));
            A05(0);
        }
    }

    public void A05(int i2) {
        AnonymousClass027 r1 = this.A05;
        if (i2 != ((Number) r1.A01()).intValue()) {
            r1.A0B(Integer.valueOf(i2));
        }
    }

    public final void A06(int i2) {
        AnonymousClass027 r1 = this.A06;
        if (i2 != ((Number) r1.A01()).intValue()) {
            r1.A0B(Integer.valueOf(i2));
        }
    }

    public boolean A07() {
        Uri A022 = A02();
        return A022 != null && this.A09.A01(this.A08.A00(A022)) == 1;
    }

    public boolean A08() {
        return ((List) this.A03.A01()).size() > 1;
    }
}
