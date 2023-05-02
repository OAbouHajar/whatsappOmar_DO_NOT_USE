package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3Sg  reason: invalid class name and case insensitive filesystem */
public class C64943Sg extends C005602k {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass013 A05;
    public final C16490t9 A06;
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public C64943Sg(View view, AnonymousClass013 r5, C16490t9 r6) {
        super(view);
        this.A06 = r6;
        this.A05 = r5;
        View A0E = C004601z.A0E(view, R.id.forwarded_files_container);
        this.A00 = A0E;
        this.A02 = C13680ns.A0L(view, R.id.forwarded_files_size_text_view);
        this.A07 = (StorageUsageMediaPreviewView) C004601z.A0E(view, R.id.forwarded_files_preview_view);
        View A0E2 = C004601z.A0E(view, R.id.large_files_container);
        this.A01 = A0E2;
        this.A04 = C13680ns.A0L(view, R.id.large_files_title_text_view);
        this.A03 = C13680ns.A0L(view, R.id.large_files_size_text_view);
        this.A08 = (StorageUsageMediaPreviewView) C004601z.A0E(view, R.id.large_files_preview_view);
        AnonymousClass2JP.A02(A0E);
        AnonymousClass2JP.A02(A0E2);
    }
}
