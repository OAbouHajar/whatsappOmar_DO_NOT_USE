package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.StickyHeadersRecyclerView;

/* renamed from: X.4mZ  reason: invalid class name and case insensitive filesystem */
public class C95394mZ implements C13210le {
    public final /* synthetic */ StickyHeadersRecyclerView A00;

    public C95394mZ(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A00 = stickyHeadersRecyclerView;
    }

    public boolean ASI(MotionEvent motionEvent, RecyclerView recyclerView) {
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A00;
        C005602k r0 = stickyHeadersRecyclerView.A08;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        float y2 = motionEvent.getY();
        int height = stickyHeadersRecyclerView.A08.A0H.getHeight();
        int i2 = stickyHeadersRecyclerView.A04;
        if (i2 >= 0) {
            i2 = 0;
        }
        if (y2 > ((float) (height + i2))) {
            return false;
        }
        stickyHeadersRecyclerView.A07.A00(motionEvent);
        return true;
    }

    public void AWB(boolean z2) {
    }

    public void AYx(MotionEvent motionEvent, RecyclerView recyclerView) {
        this.A00.A07.A00(motionEvent);
    }
}
