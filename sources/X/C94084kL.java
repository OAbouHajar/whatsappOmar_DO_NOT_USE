package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.4kL  reason: invalid class name and case insensitive filesystem */
public class C94084kL implements View.OnDragListener {
    public C75603sQ A00;
    public final Activity A01;
    public final C100054v1 A02;
    public final C16440t3 A03;
    public final C16490t9 A04;
    public final C17960vv A05;

    public C94084kL(Context context, C100054v1 r3, C16440t3 r4, C16490t9 r5, C17960vv r6) {
        this.A02 = r3;
        this.A01 = C19980zJ.A00(context);
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        ClipData.Item itemAt;
        int action = dragEvent.getAction();
        if (action == 1) {
            view.setVisibility(0);
            view.setBackgroundColor(-2134061876);
            C75603sQ r1 = new C75603sQ();
            this.A00 = r1;
            r1.A07 = UUID.randomUUID().toString();
            this.A00.A04 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.A01.requestDragAndDropPermissions(dragEvent);
            }
            C75223ro r5 = new C75223ro();
            C75603sQ r4 = this.A00;
            r5.A04 = r4.A07;
            if (dragEvent.getClipData() != null) {
                Long valueOf = Long.valueOf((long) dragEvent.getClipData().getItemCount());
                r4.A05 = valueOf;
                r5.A01 = valueOf;
                HashSet A0o = C13680ns.A0o();
                for (int i2 = 0; i2 < dragEvent.getClipData().getItemCount(); i2++) {
                    Uri uri = dragEvent.getClipData().getItemAt(i2).getUri();
                    if (uri != null) {
                        byte A002 = this.A05.A00(uri);
                        A0o.add(A002 != -1 ? A002 != 9 ? A002 != 13 ? A002 != 1 ? A002 != 2 ? A002 != 3 ? A002 != 4 ? "none" : "contact" : "video" : "audio" : "photo" : "gif" : "document" : "invalid");
                    }
                }
                StringBuilder A0o2 = AnonymousClass000.A0o();
                Iterator it = A0o.iterator();
                while (it.hasNext()) {
                    A0o2.append(AnonymousClass000.A0m(it));
                    A0o2.append(",");
                }
                String obj = A0o2.toString();
                r4.A06 = obj;
                r5.A03 = obj;
            }
            C100054v1 r12 = this.A02;
            ClipData clipData = dragEvent.getClipData();
            r12.A00 = r5;
            if (clipData != null && clipData.getDescription() != null) {
                if (!clipData.getDescription().hasMimeType("text/plain") && !clipData.getDescription().hasMimeType("text/html")) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        ClipData.Item itemAt2 = clipData.getItemAt(i3);
                        if (!(itemAt2 == null || itemAt2.getUri() == null)) {
                            A0u.add(itemAt2.getUri());
                        }
                    }
                    Iterator it2 = A0u.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            r12.A00(A0u);
                            break;
                        }
                        if (r12.A0B.A00((Uri) it2.next()) == 9) {
                            AnonymousClass38E.A00(r12.A02, new IDxCListenerShape162S0100000_2_I1(r12, 7), new IDxCListenerShape29S0200000_2_I1(A0u, 10, r12), new IDxCListenerShape128S0100000_2_I1(r12, 43), r12.A06, r12.A05.A08(r12.A0A), r12.A08, A0u, (Map) null).show();
                            break;
                        }
                    }
                } else {
                    String charSequence = (clipData.getItemCount() != 1 || (itemAt = clipData.getItemAt(0)) == null || itemAt.getText() == null) ? "" : itemAt.getText().toString();
                    if (!TextUtils.isEmpty(charSequence)) {
                        r12.A0C.setText(charSequence);
                    }
                }
            } else {
                r12.A03.A09(R.string.str15fd, 0);
                C75223ro r3 = r12.A00;
                r3.A00 = Boolean.FALSE;
                r3.A02 = "clip_data_or_clip_description_null";
                r12.A09.A06(r3);
            }
            this.A00.A00 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action == 4) {
            view.setBackgroundColor(0);
            C75603sQ r32 = this.A00;
            r32.A01 = Long.valueOf(System.currentTimeMillis());
            this.A04.A06(r32);
            return true;
        } else if (action == 5) {
            view.setBackgroundColor(-2131824914);
            this.A00.A02 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action != 6) {
            return false;
        } else {
            view.setBackgroundColor(-2134061876);
            this.A00.A03 = Long.valueOf(System.currentTimeMillis());
            return true;
        }
    }
}
