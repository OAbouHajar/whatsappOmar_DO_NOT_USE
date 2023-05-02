package X;

import java.util.ArrayList;

/* renamed from: X.0gA  reason: invalid class name and case insensitive filesystem */
public class C09840gA implements Runnable {
    public final /* synthetic */ AnonymousClass0S3 A00;
    public final /* synthetic */ AnonymousClass0V5 A01;

    public C09840gA(AnonymousClass0S3 r1, AnonymousClass0V5 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0V5 r2 = this.A01;
        ArrayList arrayList = r2.A03;
        AnonymousClass0S3 r1 = this.A00;
        arrayList.remove(r1);
        r2.A04.remove(r1);
    }
}
