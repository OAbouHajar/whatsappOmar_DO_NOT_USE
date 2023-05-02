package X;

import java.util.List;

/* renamed from: X.2kn  reason: invalid class name and case insensitive filesystem */
public class C56002kn implements AnonymousClass2XJ {
    public final String A00;
    public final List A01;

    public C56002kn(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public C16010sH AAn() {
        return (C16010sH) this.A01.get(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NonWhatsAppContactListItem{displayName='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", waContactList=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
