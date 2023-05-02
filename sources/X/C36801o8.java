package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1o8  reason: invalid class name and case insensitive filesystem */
public class C36801o8 {
    public final long A00;
    public final long A01;
    public final Set A02;
    public final Set A03;

    public C36801o8(Set set, Set set2, long j2, long j3) {
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = set;
        this.A03 = set2;
    }

    public static int A00(C36801o8 r1, C36801o8 r2) {
        boolean A032 = A03(r1, r2);
        boolean A033 = A03(r2, r1);
        return A032 ? A033 ? 2 : 0 : A033 ? 1 : 3;
    }

    public static C36801o8 A01(C36801o8 r10, C36801o8 r11) {
        long max = Math.max(r10.A00, r11.A00);
        long max2 = Math.max(r10.A01, r11.A01);
        HashSet hashSet = new HashSet(r10.A02);
        hashSet.addAll(r11.A02);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C37901pv) it.next()).A00 < max) {
                it.remove();
            }
        }
        if (hashSet.size() > 1000) {
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(22));
            List subList = arrayList.subList(0, 1000);
            hashSet = new HashSet(subList);
            max = ((C37901pv) subList.get(subList.size() - 1)).A00;
        }
        HashSet hashSet2 = new HashSet(r10.A03);
        hashSet2.addAll(r11.A03);
        if (max2 <= max) {
            max2 = 0;
        }
        return new C36801o8(hashSet, hashSet2, max, max2);
    }

    public static C36801o8 A02(C36791o7 r17, boolean z2) {
        if (z2) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C36791o7 r3 = r17;
            long millis = timeUnit.toMillis(r3.A01);
            long millis2 = timeUnit.toMillis(r3.A02);
            int i2 = r3.A00;
            if ((i2 & 1) == 1 && (i2 & 2) == 2 && millis2 <= millis) {
                throw new C36771o5(2);
            }
            AnonymousClass1XE<AnonymousClass2M4> r0 = r3.A03;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (AnonymousClass2M4 r1 : r0) {
                if ((r1.A00 & 1) == 1) {
                    C33231iF r02 = r1.A02;
                    C33231iF r32 = r02;
                    if (r02 == null) {
                        r02 = C33231iF.A05;
                    }
                    if ((r02.A00 & 2) == 2) {
                        C33231iF r03 = r32;
                        if (r32 == null) {
                            r03 = C33231iF.A05;
                        }
                        if ((r03.A00 & 4) == 4) {
                            C33231iF r04 = r32;
                            if (r32 == null) {
                                r04 = C33231iF.A05;
                            }
                            if ((r04.A00 & 1) == 1) {
                                if (r32 == null) {
                                    r32 = C33231iF.A05;
                                }
                                C15830rv A022 = C15830rv.A02(r32.A03);
                                if (A022 != null) {
                                    UserJid nullable = UserJid.getNullable(r32.A02);
                                    boolean z3 = r32.A04;
                                    if (!C16030sJ.A0L(A022) || z3 || nullable != null) {
                                        C37901pv r6 = new C37901pv(A022, nullable, r32.A01, TimeUnit.SECONDS.toMillis(r1.A01), z3);
                                        if (r6.A00 == 0) {
                                            hashSet2.add(r6);
                                        } else {
                                            hashSet.add(r6);
                                        }
                                    } else {
                                        throw new C36771o5(11);
                                    }
                                } else {
                                    throw new C36771o5(10);
                                }
                            } else {
                                throw new C36771o5(7);
                            }
                        } else {
                            throw new C36771o5(9);
                        }
                    } else {
                        throw new C36771o5(8);
                    }
                } else {
                    throw new C36771o5(6);
                }
            }
            if (hashSet.size() <= 1000) {
                return new C36801o8(hashSet, hashSet2, millis, millis2);
            }
            throw new C36771o5(5);
        }
        throw new C36771o5(1);
    }

    public static boolean A03(C36801o8 r8, C36801o8 r9) {
        for (Object next : r9.A03) {
            if (!r8.A02.contains(next) && !r8.A03.contains(next)) {
                return false;
            }
        }
        for (C37901pv r5 : r9.A02) {
            if (r5.A00 > r8.A00 && !r8.A02.contains(r5) && !r8.A03.contains(r5)) {
                return false;
            }
        }
        return true;
    }

    public C36791o7 A04() {
        C28581Wr A0U = C36791o7.A04.A0U();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.A00);
        long seconds2 = timeUnit.toSeconds(this.A01);
        if (seconds > 0) {
            A0U.A03();
            C36791o7 r1 = (C36791o7) A0U.A00;
            r1.A00 |= 1;
            r1.A01 = seconds;
        }
        if (seconds2 > 0) {
            A0U.A03();
            C36791o7 r12 = (C36791o7) A0U.A00;
            r12.A00 |= 2;
            r12.A02 = seconds2;
        }
        for (C37901pv A002 : this.A02) {
            AnonymousClass2M4 A003 = A002.A00();
            A0U.A03();
            C36791o7 r2 = (C36791o7) A0U.A00;
            AnonymousClass1XE r13 = r2.A03;
            if (!((AnonymousClass1XF) r13).A00) {
                r13 = C28541Wm.A0G(r13);
                r2.A03 = r13;
            }
            r13.add(A003);
        }
        for (C37901pv A004 : this.A03) {
            AnonymousClass2M4 A005 = A004.A00();
            A0U.A03();
            C36791o7 r22 = (C36791o7) A0U.A00;
            AnonymousClass1XE r14 = r22.A03;
            if (!((AnonymousClass1XF) r14).A00) {
                r14 = C28541Wm.A0G(r14);
                r22.A03 = r14;
            }
            r14.add(A005);
        }
        return (C36791o7) A0U.A02();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C36801o8 r7 = (C36801o8) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Long.valueOf(this.A01), this.A02, this.A03});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdMessageRange{lastMessageTimestamp=");
        sb.append(this.A00);
        sb.append(", lastSystemMessageTimestamp=");
        sb.append(this.A01);
        sb.append(", messages=");
        sb.append(this.A02);
        sb.append(", messagesWithoutTimestamp=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }
}
