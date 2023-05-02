package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.4cp  reason: invalid class name and case insensitive filesystem */
public final class C89744cp {
    public static final C17930vs A00;
    public static final C17930vs A01;

    static {
        AnonymousClass1C5 r7 = new AnonymousClass1C5();
        r7.put("deleteChat", Arrays.asList(new String[]{"pin_v1", "mute", "clearChat", "deleteChat", "archive", "star", "markChatAsRead", "deleteMessageForMe"}));
        r7.put("clearChat", Arrays.asList(new String[]{"clearChat", "deleteChat", "star", "deleteMessageForMe"}));
        r7.put("archive", Collections.singletonList("pin_v1"));
        r7.put("deleteMessageForMe", Collections.singletonList("star"));
        A00 = r7.build();
        AnonymousClass1C5 r1 = new AnonymousClass1C5();
        r1.put("archive", Collections.singletonList("setting_unarchiveChats"));
        A01 = r1.build();
    }

    public static Pair A00(AnonymousClass1WJ r3) {
        C15830rv AAV;
        C28381Vw r1;
        if (r3 instanceof C36861oE) {
            C36861oE r32 = (C36861oE) r3;
            AAV = r32.AAV();
            r1 = r32.ADY();
        } else if (r3 instanceof C36821oA) {
            AAV = ((C36821oA) r3).AAV();
            r1 = null;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("SyncdCrossIndexDependencyUtil/getValues: ");
            A0r.append(r3.A04());
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" mutation needs to implement either MessageKeyProvider or ChatJidProvider", A0r));
        }
        return new Pair(AAV, r1);
    }
}
