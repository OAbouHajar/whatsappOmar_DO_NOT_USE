package X;

import com.facebook.redex.RunnableRunnableShape1S1201000_I1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* renamed from: X.3Gb  reason: invalid class name and case insensitive filesystem */
public final class C63083Gb implements C19550yc {
    public AnonymousClass1UJ A00;
    public AnonymousClass1UJ A01;
    public final C16300so A02;
    public final AnonymousClass18U A03;
    public final AnonymousClass18V A04;
    public final C17190ug A05;
    public final C16320sq A06;
    public final HashMap A07 = AnonymousClass000.A0x();
    public final HashMap A08 = AnonymousClass000.A0x();

    public C63083Gb(C16300so r2, AnonymousClass18U r3, AnonymousClass18V r4, C17190ug r5, C16320sq r6) {
        C18450wi.A0L(r2, r6, r5, r3, r4);
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void APb(String str) {
        C18450wi.A0H(str, 0);
        this.A08.remove(str);
        AnonymousClass1UJ r2 = this.A00;
        if (r2 != null) {
            C102454yy r1 = C102454yy.A00;
            int remove = this.A07.remove(str);
            if (remove == null) {
                remove = 0;
            }
            r2.AIV(r1, remove);
        }
    }

    public void AQe(C28371Vv r9, String str) {
        C800442i r2;
        C18450wi.A0H(str, 0);
        C18450wi.A0H(r9, 1);
        this.A08.remove(str);
        int A002 = C28371Vv.A00(r9.A0K("error"), "code");
        AnonymousClass1UJ r5 = this.A00;
        if (r5 != null) {
            C800442i[] values = C800442i.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    r2 = C800442i.A01;
                    break;
                }
                r2 = values[i2];
                i2++;
                if (r2.code == A002) {
                    break;
                }
            }
            C102434yw r1 = new C102434yw(r2);
            int remove = this.A07.remove(str);
            if (remove == null) {
                remove = 0;
            }
            r5.AIV(r1, remove);
        }
    }

    public void AYG(C28371Vv r13, String str) {
        AnonymousClass2X8 r3;
        C18450wi.A0H(str, 0);
        C18450wi.A0H(r13, 1);
        Number number = (Number) this.A07.remove(str);
        if (number != null) {
            int intValue = number.intValue();
            AnonymousClass2BN r7 = (AnonymousClass2BN) this.A08.remove(str);
            if (r7 != null && (r3 = r7.A02) != null) {
                C16300so r4 = this.A02;
                boolean A0R = C18450wi.A0R(r13.A0G(r4, GroupJid.class, "from"), r7.A05);
                AnonymousClass00B.A0B("Group Jid in request and response don't match.", A0R);
                if (A0R) {
                    C28371Vv A0K = r13.A0K("membership_requests_action").A0K(r3.value).A0K("participant");
                    boolean A0R2 = C18450wi.A0R(A0K.A0G(r4, UserJid.class, "jid"), r7.A06);
                    AnonymousClass00B.A0B("Requester Jid in request and response don't match.", A0R2);
                    if (A0R2) {
                        String A052 = C28371Vv.A05(A0K, "error");
                        if (A052 == null) {
                            int i2 = r3.statusOnSuccess;
                            AnonymousClass42N[] values = AnonymousClass42N.values();
                            int length = values.length;
                            int i3 = 0;
                            while (i3 < length) {
                                AnonymousClass42N r1 = values[i3];
                                i3++;
                                if (r1.value == i2) {
                                    r7.A01 = r1;
                                    AnonymousClass1UJ r0 = this.A01;
                                    if (r0 != null) {
                                        r0.AIV(r7, number);
                                        return;
                                    }
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        this.A06.Acl(new RunnableRunnableShape1S1201000_I1(r7, this, A052, intValue, 1));
                        return;
                    }
                }
                AnonymousClass1UJ r12 = this.A00;
                if (r12 != null) {
                    r12.AIV(C102454yy.A00, number);
                }
            }
        }
    }
}
