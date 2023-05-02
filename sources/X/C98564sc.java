package X;

/* renamed from: X.4sc  reason: invalid class name and case insensitive filesystem */
public final class C98564sc implements AnonymousClass5M7 {
    public static final AnonymousClass5RI A01 = new C98494sV();
    public final AnonymousClass5RI A00;

    public C98564sc() {
        AnonymousClass5RI r1;
        AnonymousClass5RI[] r2 = new AnonymousClass5RI[2];
        r2[0] = C98514sX.A00;
        try {
            r1 = (AnonymousClass5RI) AnonymousClass3K3.A0i(Class.forName("com.google.protobuf.DescriptorMessageInfoFactory"), "getInstance");
        } catch (Exception unused) {
            r1 = A01;
        }
        r2[1] = r1;
        this.A00 = new C98504sW(r2);
    }
}
