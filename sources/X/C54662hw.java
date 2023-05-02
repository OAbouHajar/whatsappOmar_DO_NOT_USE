package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.redex.IDxCListenerShape111S0200000_2_I0;
import com.facebook.redex.IDxTListenerShape443S0100000_2_I0;
import com.obwhatsapp.gallerypicker.PhotoViewPager;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.2hw  reason: invalid class name and case insensitive filesystem */
public class C54662hw extends PhotoViewPager {
    public final /* synthetic */ MediaViewBaseFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54662hw(Context context, MediaViewBaseFragment mediaViewBaseFragment) {
        super(context, (AttributeSet) null);
        this.A00 = mediaViewBaseFragment;
        this.A0W = new IDxCListenerShape111S0200000_2_I0(mediaViewBaseFragment, 0, this);
        this.A04 = new IDxTListenerShape443S0100000_2_I0(this, 1);
    }
}
