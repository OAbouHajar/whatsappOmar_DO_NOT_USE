package com.google.firebase.iid;

import X.C13710nw;
import X.C13720nx;
import X.C13760o2;
import X.C13770o3;
import X.C13780o4;
import X.C13790o5;
import X.C13810o7;
import X.C13910oH;
import X.C14040oW;
import X.C14050oX;
import X.C14060oY;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class Registrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        Collections.addAll(hashSet, new Class[0]);
        C13790o5 r1 = new C13790o5(C13720nx.class, 1);
        C13710nw.A03("Components are not allowed to depend on interfaces they themselves provide.", !hashSet.contains(r1.A01));
        hashSet2.add(r1);
        C13790o5 r12 = new C13790o5(C13910oH.class, 1);
        C13710nw.A03("Components are not allowed to depend on interfaces they themselves provide.", !hashSet.contains(r12.A01));
        hashSet2.add(r12);
        C13790o5 r13 = new C13790o5(C13780o4.class, 1);
        C13710nw.A03("Components are not allowed to depend on interfaces they themselves provide.", !hashSet.contains(r13.A01));
        hashSet2.add(r13);
        C13810o7 r8 = C14040oW.A00;
        C13710nw.A02(r8, "Null factory");
        C13760o2 r7 = new C13760o2(r8, new HashSet(hashSet), new HashSet(hashSet2), hashSet3, 1, 0);
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(C14050oX.class);
        Collections.addAll(hashSet4, new Class[0]);
        C13790o5 r14 = new C13790o5(cls, 1);
        C13710nw.A03("Components are not allowed to depend on interfaces they themselves provide.", !hashSet4.contains(r14.A01));
        hashSet5.add(r14);
        C13810o7 r15 = C14060oY.A00;
        C13710nw.A02(r15, "Null factory");
        return Arrays.asList(new C13760o2[]{r7, new C13760o2(r15, new HashSet(hashSet4), new HashSet(hashSet5), hashSet6, 0, 0), C13770o3.A00("fire-iid", "20.0.0")});
    }
}
