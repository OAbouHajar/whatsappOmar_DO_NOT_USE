package X;

/* renamed from: X.0gc  reason: invalid class name and case insensitive filesystem */
public class C10120gc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass05R A01;
    public final /* synthetic */ AnonymousClass0NM A02;

    public C10120gc(AnonymousClass05R r1, AnonymousClass0NM r2, int i2) {
        this.A01 = r1;
        this.A00 = i2;
        this.A02 = r2;
    }

    public void run() {
        AnonymousClass05g r0;
        AnonymousClass05R r3 = this.A01;
        int i2 = this.A00;
        Object obj = this.A02.A00;
        String str = (String) AnonymousClass000.A0Y(r3.A06, i2);
        if (str != null) {
            r3.A00.remove(str);
            AnonymousClass07N r02 = (AnonymousClass07N) r3.A07.get(str);
            if (r02 == null || (r0 = r02.A00) == null) {
                r3.A02.remove(str);
                r3.A05.put(str, obj);
                return;
            }
            r0.AM3(obj);
        }
    }
}
