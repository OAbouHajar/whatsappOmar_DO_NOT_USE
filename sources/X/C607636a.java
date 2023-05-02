package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.36a  reason: invalid class name and case insensitive filesystem */
public class C607636a extends C16690tT {
    public C16930tt A00;
    public C16930tt A01;
    public boolean A02;
    public boolean A03;
    public final C16460t6 A04;
    public final C16480t8 A05;
    public final C14710pd A06;
    public final C15830rv A07;
    public final C49122Rd A08;
    public final C16730tY A09;

    public C607636a(C16460t6 r1, C16480t8 r2, C14710pd r3, C15830rv r4, C49122Rd r5, C16730tY r6) {
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r6;
        this.A08 = r5;
        this.A04 = r1;
        this.A05 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16930tt r0;
        Log.i("mediaview/task/getmsgs");
        C16460t6 r6 = this.A04;
        C15830rv r5 = this.A07;
        C16480t8 r7 = this.A05;
        C16730tY r8 = this.A09;
        Cursor A032 = r7.A03(r5, 512, r8.A13);
        C14710pd r4 = this.A06;
        this.A00 = new C16930tt(A032, r6, r4, r5);
        C16700tU r10 = this.A02;
        if (r10.isCancelled()) {
            r0 = this.A00;
        } else {
            this.A01 = new C16930tt(r7.A04(r5, 512, r8.A13), r6, r4, r5);
            boolean isCancelled = r10.isCancelled();
            C16930tt r02 = this.A00;
            if (isCancelled) {
                r02.close();
                r0 = this.A01;
            } else {
                int count = r02.getCount();
                boolean z2 = false;
                if (count < 512) {
                    z2 = true;
                }
                this.A02 = z2;
                this.A00.moveToPosition(0);
                if (this.A00.getCount() == 0) {
                    this.A00.close();
                    C16930tt r03 = new C16930tt(r7.A03(r5, 0, r8.A13), r6, r4, r5);
                    this.A00 = r03;
                    r03.moveToPosition(0);
                    this.A02 = true;
                    StringBuilder A0r = AnonymousClass000.A0r("mediaview/navigator/getmsgs head-upgraded:");
                    A0r.append(this.A00.getCount());
                    C13680ns.A1V(A0r);
                }
                boolean z3 = false;
                if (this.A01.getCount() < 512) {
                    z3 = true;
                }
                this.A03 = z3;
                this.A01.moveToPosition(0);
                if (this.A01.getCount() == 0) {
                    this.A01.close();
                    C16930tt r04 = new C16930tt(r7.A04(r5, 0, r8.A13), r6, r4, r5);
                    this.A01 = r04;
                    r04.moveToPosition(0);
                    this.A03 = true;
                    StringBuilder A0r2 = AnonymousClass000.A0r("mediaview/navigator/getmsgs tail-upgraded:");
                    A0r2.append(this.A01.getCount());
                    C13680ns.A1V(A0r2);
                }
                return Integer.valueOf(this.A00.getCount() + this.A01.getCount());
            }
        }
        r0.close();
        Log.i("GetMediaMessagesTask cancelled");
        return -1;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C16730tY A1U;
        C16750ta r0;
        File file;
        if (AnonymousClass000.A0D(obj) >= 0) {
            C49122Rd r6 = this.A08;
            C16930tt r5 = this.A00;
            boolean z2 = this.A02;
            C16930tt r3 = this.A01;
            boolean z3 = this.A03;
            MediaViewFragment mediaViewFragment = r6.A0G;
            if (mediaViewFragment.A0C() != null && !((C14550pN) mediaViewFragment.A0D()).AIm()) {
                r6.close();
                r6.A0B.put(0, r6.A0H);
                r6.A02 = r5;
                r6.A08 = z2;
                r6.A03 = r3;
                r6.A09 = z3;
                r6.A00 = r5.getCount();
                int count = r3.getCount();
                r6.A01 = count;
                StringBuilder A0r = AnonymousClass000.A0r("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                A0r.append(r6.A00);
                A0r.append(" head-full:");
                A0r.append(z2);
                A0r.append(" tail-count:");
                A0r.append(count);
                A0r.append(" tail-full:");
                A0r.append(z3);
                C13680ns.A1V(A0r);
                ContentObserver contentObserver = r6.A0A;
                r5.registerContentObserver(contentObserver);
                r3.registerContentObserver(contentObserver);
                int i2 = r6.A00;
                mediaViewFragment.A1C.getCount();
                mediaViewFragment.A03 = i2;
                mediaViewFragment.A1G();
                mediaViewFragment.A09.A0F(i2, false);
                if (!(!mediaViewFragment.A0y.A0E(C16620tM.A02, 1466) || (A1U = mediaViewFragment.A1U(i2)) == null || mediaViewFragment.A1L.A02 || (r0 = A1U.A02) == null || (file = r0.A0F) == null)) {
                    AnonymousClass1A9 r32 = mediaViewFragment.A1Y;
                    AnonymousClass37O r2 = new AnonymousClass37O(Uri.fromFile(file), mediaViewFragment.A1t, r32);
                    mediaViewFragment.A1Q.A00("photo_received");
                    C13700nu.A0W(r2, mediaViewFragment.A1a);
                }
                mediaViewFragment.A0D().invalidateOptionsMenu();
                mediaViewFragment.A02.setVisibility(8);
            }
        }
    }
}
