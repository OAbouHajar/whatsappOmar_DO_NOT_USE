package X;

import android.content.Context;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Kx  reason: invalid class name and case insensitive filesystem */
public class C25731Kx {
    public final C16000sG A00;
    public final C16080sP A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;
    public final AnonymousClass125 A05;

    public C25731Kx(C16000sG r1, C16080sP r2, C16440t3 r3, C16980tz r4, AnonymousClass013 r5, AnonymousClass125 r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static C25731Kx A21() {
        return (C25731Kx) yo.mSingletonC.A54.get();
    }

    public String A00(C16010sH r10) {
        int i2;
        String A012 = A01(r10);
        if (A012 != null) {
            return A012;
        }
        AnonymousClass125 r1 = this.A05;
        Jid A08 = r10.A08(C15830rv.class);
        AnonymousClass00B.A06(A08);
        long A013 = r1.A01((C15830rv) A08);
        if (A013 == 0) {
            return "";
        }
        if (A013 == 1) {
            return this.A03.A00.getString(R.string.str05bd);
        }
        toString();
        C16440t3 r0 = this.A02;
        long A022 = r0.A02(A013);
        int A002 = C42681yF.A00(r0.A00(), A022);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A022);
                    switch (instance.get(7)) {
                        case 1:
                            i2 = R.string.str05c3;
                            break;
                        case 2:
                            i2 = R.string.str05c1;
                            break;
                        case 3:
                            i2 = R.string.str05c6;
                            break;
                        case 4:
                            i2 = R.string.str05c7;
                            break;
                        case 5:
                            i2 = R.string.str05c4;
                            break;
                        case 6:
                            i2 = R.string.str05c0;
                            break;
                        case 7:
                            i2 = R.string.str05c2;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                } else {
                    i2 = R.string.str05c9;
                }
            } else {
                i2 = R.string.str05c5;
            }
            AnonymousClass013 r5 = this.A04;
            String A003 = C47672Jx.A00(r5, A022);
            return yo.elapsedTime(A022, C47672Jx.A01(r5, this.A03.A00.getString(i2, new Object[]{A003}), A022));
        }
        String A032 = C28961Zl.A03(this.A04, A002, A022);
        return this.A03.A00.getString(R.string.str05c8, new Object[]{A032});
    }

    public String A01(C16010sH r12) {
        Context context;
        int i2;
        AnonymousClass4IT r2;
        Context context2;
        int i3;
        if (!C16030sJ.A0G(r12.A0E)) {
            boolean A0J = r12.A0J();
            AnonymousClass125 r22 = this.A05;
            Jid A08 = r12.A08(C15830rv.class);
            AnonymousClass00B.A06(A08);
            C15830rv r4 = (C15830rv) A08;
            if (A0J) {
                AnonymousClass2Cl r1 = (AnonymousClass2Cl) r22.A06.get(r4);
                Object obj = null;
                if (r1 != null) {
                    int i4 = -1;
                    if (C16030sJ.A0L(r4)) {
                        HashMap hashMap = r1.A04;
                        if (hashMap != null) {
                            long j2 = 0;
                            for (Map.Entry entry : hashMap.entrySet()) {
                                if (((C46122Cm) entry.getValue()).A01 > j2) {
                                    obj = entry.getKey();
                                    j2 = ((C46122Cm) entry.getValue()).A01;
                                    i4 = ((C46122Cm) entry.getValue()).A00;
                                }
                            }
                            if (j2 != 0 && j2 + 25000 > SystemClock.elapsedRealtime()) {
                                AnonymousClass00B.A06(obj);
                                r2 = new AnonymousClass4IT((C15830rv) obj, i4);
                            }
                        }
                    } else {
                        int A002 = r22.A00(r4, (UserJid) null);
                        if (A002 != -1) {
                            r2 = new AnonymousClass4IT(r4, A002);
                        }
                    }
                    String A0C = this.A01.A0C(this.A00.A0A(r2.A01));
                    int i5 = r2.A00;
                    if (i5 == 0) {
                        context2 = this.A03.A00;
                        i3 = R.string.str05cc;
                    } else if (i5 == 1) {
                        context2 = this.A03.A00;
                        i3 = R.string.str05cd;
                    }
                    return context2.getString(i3, new Object[]{this.A04.A0G(A0C)});
                }
            } else {
                int A003 = r22.A00(r4, (UserJid) null);
                if (A003 == 0) {
                    context = this.A03.A00;
                    i2 = R.string.str05be;
                } else if (A003 == 1) {
                    context = this.A03.A00;
                    i2 = R.string.str05bf;
                }
                return context.getString(i2);
            }
        }
        return null;
    }

    public String A02(C16010sH r8) {
        if (A01(r8) != null) {
            return null;
        }
        AnonymousClass125 r4 = this.A05;
        Class<C15830rv> cls = C15830rv.class;
        Jid A08 = r8.A08(cls);
        AnonymousClass00B.A06(A08);
        long A012 = r4.A01((C15830rv) A08);
        Jid A082 = r8.A08(cls);
        AnonymousClass00B.A06(A082);
        if (1 == r4.A01((C15830rv) A082)) {
            return null;
        }
        C16440t3 r0 = this.A02;
        long A022 = r0.A02(A012);
        int A002 = C42681yF.A00(r0.A00(), A022);
        if (A002 > 6) {
            return C28961Zl.A03(this.A04, A002, A022);
        }
        if (!(A002 == 0 || A002 == 1)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(A022);
            instance.get(7);
        }
        AnonymousClass013 r1 = this.A04;
        return yo.elapsedTime(A022, C47672Jx.A01(r1, C47672Jx.A00(r1, A022), A022));
    }
}
