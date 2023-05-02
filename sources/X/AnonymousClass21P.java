package X;

import com.whatsapp.util.Log;

/* renamed from: X.21P  reason: invalid class name */
public class AnonymousClass21P implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r4, AnonymousClass21Q r5, AnonymousClass1GC r6) {
        if (r4 instanceof C30081bi) {
            ((C30081bi) r4).A5j(r5, r6);
            return;
        }
        StringBuilder sb = new StringBuilder("DefaultFMessageProtocolSerializers/buildE2EMessage/error unrecognized media type during send, message.key=");
        sb.append(r4.A11);
        sb.append("; media_wa_type=");
        byte b2 = r4.A10;
        sb.append(b2);
        sb.append("; media_wa_type=");
        sb.append(b2);
        Log.w(sb.toString());
    }

    public int[] ACW() {
        return new int[0];
    }
}
