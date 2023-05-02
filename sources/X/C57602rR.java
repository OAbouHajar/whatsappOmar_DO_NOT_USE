package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;

/* renamed from: X.2rR  reason: invalid class name and case insensitive filesystem */
public class C57602rR extends AnonymousClass071 {
    public final /* synthetic */ BusinessDirectoryConsumerHomeFragment A00;

    public C57602rR(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        this.A00 = businessDirectoryConsumerHomeFragment;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        View view;
        BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment = this.A00;
        if (businessDirectoryConsumerHomeFragment.A08.A01) {
            boolean canScrollVertically = recyclerView.canScrollVertically(-1);
            BusinessDirectoryActivity A1B = businessDirectoryConsumerHomeFragment.A1B();
            if (canScrollVertically) {
                A1B.A38();
                BusinessDirectoryActivity A1B2 = businessDirectoryConsumerHomeFragment.A1B();
                C004601z.A0X(A1B2.findViewById(R.id.search_toolbar_container), A1B2.getResources().getDimension(R.dimen.dimen005d));
            } else {
                A1B.A36();
                C004601z.A0X(businessDirectoryConsumerHomeFragment.A1B().findViewById(R.id.search_toolbar_container), 0.0f);
            }
        }
        if (i3 != 0 && recyclerView.A0B == 1 && C23061Ai.A00(businessDirectoryConsumerHomeFragment.A0A) && (view = businessDirectoryConsumerHomeFragment.A0A) != null) {
            businessDirectoryConsumerHomeFragment.A09.A01(view);
        }
    }
}
