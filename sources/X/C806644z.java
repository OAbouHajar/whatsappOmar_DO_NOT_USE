package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.44z  reason: invalid class name and case insensitive filesystem */
public class C806644z {
    public static List A00(byte[] bArr) {
        int i2 = (bArr[11] & 255) << 8;
        ArrayList A0i = C13690nt.A0i(3);
        A0i.add(bArr);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong((((long) ((bArr[10] & 255) | i2)) * 1000000000) / 48000);
        A0i.add(order.array());
        ByteBuffer order2 = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order2.putLong(80000000);
        A0i.add(order2.array());
        return A0i;
    }
}
