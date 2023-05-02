package X;

import java.util.Map;

/* renamed from: X.3Vm  reason: invalid class name and case insensitive filesystem */
public final class C65623Vm extends AnonymousClass40P {
    public final Map headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public C65623Vm(AnonymousClass3AL r2, String str, Map map, byte[] bArr, int i2) {
        super(r2, C13680ns.A0c(i2, "Response code: "));
        this.responseCode = i2;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
