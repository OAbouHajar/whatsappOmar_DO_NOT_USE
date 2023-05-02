package X;

import java.util.LinkedList;

/* renamed from: X.1fB  reason: invalid class name and case insensitive filesystem */
public class C31881fB {
    public LinkedList A00 = new LinkedList();

    public C31881fB() {
    }

    public C31881fB(byte[] bArr) {
        for (C36221nC r2 : ((C36741o2) C28541Wm.A0E(C36741o2.A01, bArr)).A00) {
            this.A00.add(new C36211nB(r2));
        }
    }

    public C36211nB A00() {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            return (C36211nB) linkedList.get(0);
        }
        throw new C36281nI("No key state in record!");
    }
}
