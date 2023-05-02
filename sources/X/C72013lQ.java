package X;

import java.util.Queue;

/* renamed from: X.3lQ  reason: invalid class name and case insensitive filesystem */
public class C72013lQ extends C31301dt {
    public final C109185Ra A00;
    public final Queue A01;

    public C72013lQ(C109185Ra r2, Queue queue) {
        super(AnonymousClass428.A06);
        this.A01 = queue;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return C34901l3.A00(this.A01, ((C72013lQ) obj).A01);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, super.hashCode());
        objArr[1] = this.A01;
        return AnonymousClass000.A0F(this.A00, objArr, 2);
    }
}
