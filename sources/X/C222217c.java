package X;

/* renamed from: X.17c  reason: invalid class name and case insensitive filesystem */
public class C222217c extends C16590tJ {
    public final AnonymousClass01D A00;

    public C222217c(AnonymousClass01D r1, AnonymousClass01D r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A04(C23311Bm r5, Exception exc) {
        String name = r5.getClass().getName();
        StringBuilder sb = new StringBuilder("Observer crashed: ");
        sb.append(name);
        ((C16300so) this.A00.get()).A03("abprops-observer-crashed", name, new RuntimeException(sb.toString(), exc));
    }
}
