package X;

import com.google.android.exoplayer2.Timeline;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3UE  reason: invalid class name */
public final class AnonymousClass3UE extends AnonymousClass3UQ {
    public final int A00;
    public final int A01;
    public final HashMap A02 = AnonymousClass000.A0x();
    public final int[] A03;
    public final int[] A04;
    public final Timeline[] A05;
    public final Object[] A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UE(AnonymousClass5TE r8, Collection collection) {
        super(r8);
        int i2 = 0;
        int size = collection.size();
        this.A03 = new int[size];
        this.A04 = new int[size];
        this.A05 = new Timeline[size];
        this.A06 = new Object[size];
        Iterator it = collection.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            AnonymousClass5R8 r2 = (AnonymousClass5R8) it.next();
            Timeline[] timelineArr = this.A05;
            timelineArr[i4] = r2.AGa();
            this.A04[i4] = i2;
            this.A03[i4] = i3;
            Timeline timeline = timelineArr[i4];
            i2 += timeline.A01();
            i3 += timeline.A00();
            Object[] objArr = this.A06;
            objArr[i4] = r2.AGj();
            C13680ns.A1X(objArr[i4], this.A02, i4);
            i4++;
        }
        this.A01 = i2;
        this.A00 = i3;
    }
}
