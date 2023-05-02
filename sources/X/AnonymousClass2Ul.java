package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.2Ul  reason: invalid class name */
public abstract class AnonymousClass2Ul extends AnonymousClass2Um {
    public AnonymousClass2Ul(Context context, AnonymousClass1YG r2, C16730tY r3) {
        super(context, r2, r3);
    }

    public static int A0d(C16740tZ r4) {
        byte b2 = r4.A10;
        return (b2 == 1 || b2 == 3) ? TextUtils.isEmpty(((C16730tY) r4).A13()) ? 1 : -1 : (b2 == 20 && r4.A0L == null) ? 2 : -1;
    }

    public boolean A1L(C28381Vw r3) {
        if (this instanceof AnonymousClass31J) {
            List<C16740tZ> list = ((AnonymousClass31J) this).A06;
            if (list == null) {
                return false;
            }
            for (C16740tZ r0 : list) {
                if (r0.A11.equals(r3)) {
                    return true;
                }
            }
            return false;
        }
        List<C16740tZ> list2 = ((AnonymousClass2Uj) this).A05;
        if (list2 == null) {
            return false;
        }
        for (C16740tZ r02 : list2) {
            if (r02.A11.equals(r3)) {
                return true;
            }
        }
        return false;
    }

    public abstract void A1N(List list, boolean z2);

    public abstract int getMaxAlbumSize();

    public abstract int getMessageCount();

    public abstract int getMinAlbumSize();
}
