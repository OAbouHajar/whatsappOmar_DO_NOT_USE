package X;

import java.util.Arrays;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4U5  reason: invalid class name */
public final class AnonymousClass4U5 {
    public final C28371Vv A00;
    public final byte[] A01;

    public AnonymousClass4U5(C28371Vv r10) {
        AnonymousClass3K3.A1G(r10);
        this.A01 = (byte[]) C32271fx.A01((C16300so) null, r10, byte[].class, AnonymousClass3K2.A0a(), Long.valueOf(FileUtils.ONE_KB), (Object) null, new String[]{"cat", "#elementValue"}, false);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U5.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass4U5) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K4.A0B(this.A01, AnonymousClass3K2.A03() * 31);
    }
}
