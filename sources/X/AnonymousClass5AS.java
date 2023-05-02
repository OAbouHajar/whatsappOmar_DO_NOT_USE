package X;

/* renamed from: X.5AS  reason: invalid class name */
public class AnonymousClass5AS implements AnonymousClass5R6 {
    public long A00;
    public final AnonymousClass5R6 A01;

    public AnonymousClass5AS(AnonymousClass5R6 r1) {
        this.A01 = r1;
    }

    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = this.A01.readLine();
        this.A00 += System.currentTimeMillis() - currentTimeMillis;
        return readLine;
    }
}
