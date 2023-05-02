package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.Calendar;

/* renamed from: X.60g  reason: invalid class name and case insensitive filesystem */
public class C1200860g implements C227319b {
    public final C16980tz A00;
    public final AnonymousClass013 A01;
    public final C14710pd A02;
    public final C116045qj A03;
    public final AnonymousClass17O A04;
    public final AnonymousClass5xE A05;
    public final C18090w8 A06;

    public C1200860g(C16980tz r1, AnonymousClass013 r2, C14710pd r3, C116045qj r4, AnonymousClass17O r5, AnonymousClass5xE r6, C18090w8 r7) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public C005702l A00(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, DialogInterface.OnDismissListener onDismissListener3, String str, int i2) {
        Context context2 = context;
        int i3 = i2;
        if (i3 == 2896002) {
            C32241fu A002 = C32241fu.A00(context);
            A002.A01(R.string.str0294);
            C13690nt.A1F(A002);
            A002.setNegativeButton(R.string.str1cf6, new C119495xy(context, this));
            return A002.create();
        }
        DialogInterface.OnDismissListener onDismissListener4 = onDismissListener2;
        DialogInterface.OnDismissListener onDismissListener5 = onDismissListener3;
        String str2 = str;
        switch (i2) {
            case 10780:
                return AnonymousClass5xE.A00(context, onDismissListener4, context.getString(R.string.str0857));
            case 2826028:
            case 2826029:
                return AnonymousClass5xE.A00(context, onDismissListener5, C13680ns.A0d(context, str2, C13680ns.A1b(), 0, R.string.str0284));
            case 2826043:
                AnonymousClass013 r4 = this.A01;
                Calendar instance = Calendar.getInstance(C13690nt.A0m(r4));
                instance.set(10, 20);
                instance.set(12, 0);
                String A003 = C47672Jx.A00(r4, instance.getTimeInMillis());
                Calendar instance2 = Calendar.getInstance(C13690nt.A0m(r4));
                instance2.set(10, 6);
                instance2.set(12, 0);
                String A004 = C47672Jx.A00(r4, instance2.getTimeInMillis());
                String string = context.getString(R.string.str0de2);
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = A003;
                return AnonymousClass5xE.A01(context, onDismissListener5, string, C13680ns.A0d(context, A004, A1Z, 1, R.string.str0de1));
            default:
                return this.A05.A04(context2, onDismissListener, onDismissListener4, onDismissListener5, str2, i3);
        }
    }

    public C005702l A01(Context context, C14710pd r6, C1204661t r7, int i2, int i3) {
        C005702l A022 = this.A05.A02(context, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i2);
        if (A022 != null) {
            return A022;
        }
        String ADW = r6.A0C(698) ? r7.ADW(String.valueOf(i2)) : "";
        if (TextUtils.isEmpty(ADW)) {
            int i4 = R.string.str0f44;
            if (i2 != -233) {
                i4 = R.string.str0752;
                if (i2 != 477) {
                    i4 = R.string.str028a;
                    if (i2 != 10229) {
                        i4 = R.string.str0fd1;
                        if (i2 != 10234) {
                            i4 = R.string.str0857;
                            if (i2 != 10780) {
                                if (i2 != 2896002) {
                                    ADW = context.getString(i3);
                                } else {
                                    C32241fu A002 = C32241fu.A00(context);
                                    A002.A01(R.string.str0294);
                                    A002.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
                                    A002.setNegativeButton(R.string.str1cf6, new C119495xy(context, this));
                                    return A002.create();
                                }
                            }
                        }
                    }
                }
            }
            ADW = context.getString(i4);
        }
        return AnonymousClass5xE.A00(context, new AnonymousClass5yA(), ADW);
    }

    public String AB8(int i2) {
        Context context;
        int i3;
        if (!AnonymousClass000.A1R(i2, 2826013)) {
            return null;
        }
        C18090w8 r2 = this.A06;
        if (r2.A03.A0C(1587)) {
            context = this.A00.A00;
            i3 = R.string.str17be;
        } else if (!r2.A05()) {
            return null;
        } else {
            boolean A0C = this.A04.A0C();
            context = this.A00.A00;
            i3 = R.string.str17c0;
            if (!A0C) {
                i3 = R.string.str17bf;
            }
        }
        return context.getString(i3);
    }

    public int AB9(AnonymousClass1ME r4, C35611mD r5, int i2) {
        if (!AnonymousClass000.A1R(i2, 2826013)) {
            return -1;
        }
        C18090w8 r2 = this.A06;
        if (r2.A03.A0C(1587)) {
            return 20;
        }
        if (!r2.A05()) {
            return -1;
        }
        if (!this.A04.A0C()) {
            return 25;
        }
        C14710pd r1 = r4.A02;
        r1.A0C(1176);
        r1.A0C(1212);
        return -1;
    }

    public String ABA(int i2) {
        if (!AnonymousClass000.A1R(i2, 2826013)) {
            return null;
        }
        C18090w8 r1 = this.A06;
        if (!r1.A05() && !r1.A03.A0C(1587)) {
            return null;
        }
        this.A02.A02(1590);
        return this.A00.A00.getString(R.string.str1823);
    }

    public String ABB(int i2) {
        return null;
    }

    public String AC1(int i2, String str) {
        Context context;
        int i3;
        if (i2 == 14121 || i2 == 14125) {
            context = this.A00.A00;
            i3 = R.string.str17e5;
        } else if (i2 != 2709017) {
            return str;
        } else {
            context = this.A00.A00;
            i3 = R.string.str17e1;
        }
        return context.getString(i3);
    }

    public int AC2(AnonymousClass4XO r2, int i2) {
        return 0;
    }

    public String AFX(int i2) {
        Context context;
        int i3;
        if (i2 == 1703) {
            context = this.A00.A00;
            i3 = R.string.str17cd;
        } else if (i2 == 10768) {
            context = this.A00.A00;
            i3 = R.string.str180c;
        } else if (i2 == 10779 || i2 == 12854 || i2 == 12907 || i2 == 20986 || i2 == 2709018) {
            context = this.A00.A00;
            i3 = R.string.str17dc;
        } else if (i2 == 2826005) {
            context = this.A00.A00;
            i3 = R.string.str10d7;
        } else if (i2 == 10755) {
            context = this.A00.A00;
            i3 = R.string.str1807;
        } else if (i2 != 10756) {
            return null;
        } else {
            context = this.A00.A00;
            i3 = R.string.str1812;
        }
        return context.getString(i3);
    }

    public void AHN(String str) {
    }

    public boolean AIi(int i2) {
        return false;
    }

    public boolean AIy(int i2) {
        return AnonymousClass000.A1R(i2, 2001);
    }

    public boolean AIz(int i2) {
        return false;
    }

    public boolean AJ0(int i2) {
        return false;
    }

    public boolean AJ1(int i2) {
        return AnonymousClass000.A1R(i2, 10244);
    }

    public boolean AJ2(int i2) {
        return AnonymousClass000.A1R(i2, 10242);
    }

    public boolean AJ3(int i2) {
        return AnonymousClass000.A1R(i2, 10241);
    }

    public boolean AJ4(int i2) {
        return false;
    }

    public boolean AJ5(int i2) {
        return AnonymousClass000.A1R(i2, 10240);
    }

    public boolean AJ9(int i2) {
        return AnonymousClass000.A1R(i2, 12871);
    }

    public boolean AJA(int i2) {
        return AnonymousClass000.A1R(i2, 18510);
    }

    public boolean AJB(int i2) {
        return AnonymousClass000.A1R(i2, 12894);
    }

    public boolean AJE(int i2) {
        return false;
    }

    public boolean AJF(int i2) {
        return AnonymousClass000.A1R(i2, 12858);
    }

    public boolean AJG(int i2) {
        return AnonymousClass000.A1R(i2, 21001);
    }

    public boolean AJP(int i2) {
        return AnonymousClass000.A1R(i2, 20985);
    }

    public boolean AJQ(int i2) {
        return AnonymousClass000.A1R(i2, 1353003);
    }

    public boolean AJW(int i2) {
        return AnonymousClass000.A1R(i2, 2826013);
    }

    public boolean AJm(int i2) {
        return false;
    }

    public boolean AJp(int i2) {
        return AnonymousClass000.A1R(i2, 21000);
    }

    public int ALS() {
        return 0;
    }

    public int ALT() {
        return 0;
    }

    public boolean AfO(int i2) {
        return true;
    }
}
