package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5vo  reason: invalid class name and case insensitive filesystem */
public class C119035vo {
    static {
        new AnonymousClass5vQ(1280, 720);
        new AnonymousClass5vQ(1920, 1080);
    }

    public static List A00(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0i = C13690nt.A0i(length);
        int i2 = 0;
        do {
            A0i.add(new AnonymousClass5vQ(sizeArr[i2].getWidth(), sizeArr[i2].getHeight()));
            i2++;
        } while (i2 < length);
        return Collections.unmodifiableList(A0i);
    }
}
