package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1TC  reason: invalid class name */
public class AnonymousClass1TC {
    public final C14870pt A00;
    public final C17740vZ A01;
    public final C18640x1 A02;
    public final AnonymousClass4K5 A03;
    public final C18770xE A04;
    public final C14710pd A05;
    public final Map A06 = new HashMap();

    public AnonymousClass1TC(C14870pt r2, C17740vZ r3, C18640x1 r4, C18770xE r5, C16980tz r6, C14710pd r7) {
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = new AnonymousClass4K5(r6, r7);
        this.A04 = r5;
        this.A05 = r7;
        this.A01 = r3;
    }

    public void A00(AnonymousClass027 r9, C55222j6 r10) {
        Map map = this.A06;
        AnonymousClass39J r2 = (AnonymousClass39J) map.get(r10);
        if (r2 == null) {
            r2 = new AnonymousClass39J(this.A00, this.A02, this.A03, r10.A00, r10.A03);
            map.put(r10, r2);
        }
        r2.A02 = r9;
        C49822Vz r1 = new C49822Vz(r2.A01);
        r1.A01 = r2.A00();
        r2.A02.A0B(r1);
    }

    public void A01(C55222j6 r32) {
        C49822Vz r2;
        Map map = this.A06;
        C55222j6 r14 = r32;
        AnonymousClass39J r11 = (AnonymousClass39J) map.get(r14);
        if (r11 == null) {
            r11 = new AnonymousClass39J(this.A00, this.A02, this.A03, r14.A00, r14.A03);
            map.put(r14, r11);
        }
        int i2 = r11.A01;
        if (i2 == 0) {
            r2 = new C49822Vz(0);
        } else {
            if (i2 != 5) {
                int i3 = r11.A00;
                List list = r11.A07;
                if (i3 < list.size()) {
                    AnonymousClass4K5 r7 = r11.A05;
                    int size = list.size();
                    boolean z2 = false;
                    if (r11.A00 == 0) {
                        z2 = true;
                    }
                    float f2 = (float) r7.A01.A00.getResources().getDisplayMetrics().heightPixels;
                    float f3 = r7.A00;
                    int ceil = f2 < f3 ? 1 : (int) Math.ceil((double) (f2 / f3));
                    if (!z2 || size >= ceil * 3) {
                        size = ceil << 1;
                    }
                    C14710pd r1 = r7.A02;
                    C16620tM r8 = C16620tM.A02;
                    int min = Math.min(r1.A03(r8, 464), size);
                    List<String> subList = list.subList(r11.A00, Math.min(list.size(), r11.A00 + min));
                    r11.A00 += min;
                    ArrayList arrayList = new ArrayList();
                    for (String str : subList) {
                        if (r11.A04.A05((UserJid) null, str) == null) {
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (r11.A00 < list.size()) {
                            ArrayList arrayList2 = new ArrayList();
                            r2 = new C49822Vz(1);
                            r2.A01 = arrayList2;
                        }
                    } else if (this.A05.A0E(r8, 1096)) {
                        C18770xE r13 = this.A04;
                        C18760xD r0 = r13.A01;
                        C18630x0 r16 = r0.A0B;
                        C17150uc r15 = r0.A01;
                        C16300so r12 = r0.A00;
                        C18650x2 r10 = r0.A04;
                        C18620wz r9 = r0.A07;
                        C17190ug r82 = r0.A0A;
                        C18700x7 r72 = r0.A0C;
                        C16320sq r6 = r0.A0G;
                        C18710x8 r5 = r0.A03;
                        C84734Lr r4 = new C84734Lr(r5, r10);
                        C18260wP r3 = r0.A08;
                        C18710x8 r18 = r5;
                        C18650x2 r19 = r10;
                        C17150uc r162 = r15;
                        AnonymousClass39J r17 = r11;
                        C16300so r152 = r12;
                        r13.A00(new AnonymousClass2j5(r152, r162, r17, r18, r19, r4, r0.A06, r9, r14, r3, r0.A09, r82, r16, r72, r0.A00(), r6));
                        return;
                    } else {
                        C17740vZ r110 = this.A01;
                        C61713Aa r52 = new C61713Aa(1);
                        UserJid userJid = r14.A00;
                        String str2 = r14.A02;
                        String str3 = r14.A01;
                        C16150sX r83 = r110.A01.A00.A01;
                        C59512yP r84 = new C59512yP((C16300so) r83.A5p.get(), (C17150uc) r83.A34.get(), r11, r52, userJid, (C18720x9) r83.AB0.get(), (C17190ug) r83.AEu.get(), (C18700x7) r83.A1n.get(), str2, str3, arrayList);
                        if (r84.A01.A09()) {
                            r84.A02();
                            return;
                        } else {
                            r84.A03();
                            return;
                        }
                    }
                }
            }
            r2 = new C49822Vz(5);
        }
        r11.A01(r2);
    }
}
