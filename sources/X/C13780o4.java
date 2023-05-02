package X;

import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public class C13780o4 {
    public final C14080oa A00;
    public final String A01;

    public C13780o4(C14080oa r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass00S r1 = (AnonymousClass00S) ((AnonymousClass00P) it.next());
            sb.append(r1.A00);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(r1.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
