package X;

import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4xu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101804xu implements AnonymousClass5PU {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C101804xu(MediaViewFragment mediaViewFragment, List list) {
        this.A00 = mediaViewFragment;
        this.A01 = list;
    }

    public final void AQD(Collection collection) {
        MediaViewFragment mediaViewFragment = this.A00;
        List list = this.A01;
        AnonymousClass529 r0 = new AnonymousClass529(mediaViewFragment);
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
        storageUsageDeleteMessagesDialogFragment.A04 = list;
        storageUsageDeleteMessagesDialogFragment.A03 = collection;
        storageUsageDeleteMessagesDialogFragment.A01 = r0;
        storageUsageDeleteMessagesDialogFragment.A1G(mediaViewFragment.A0F(), (String) null);
    }
}
