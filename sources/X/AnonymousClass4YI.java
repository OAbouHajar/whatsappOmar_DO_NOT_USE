package X;

import java.util.Set;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4YI  reason: invalid class name */
public final class AnonymousClass4YI {
    public static final Set A00;

    static {
        Character[] chArr = new Character[9];
        chArr[0] = '<';
        chArr[1] = '>';
        chArr[2] = ':';
        chArr[3] = '\"';
        chArr[4] = Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX);
        chArr[5] = Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS);
        chArr[6] = '|';
        chArr[7] = '?';
        A00 = C13680ns.A0p('*', chArr, 8);
    }
}
