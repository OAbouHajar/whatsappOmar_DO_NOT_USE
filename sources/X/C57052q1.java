package X;

import android.view.View;
import android.widget.ListView;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2q1  reason: invalid class name and case insensitive filesystem */
public class C57052q1 extends C000700i {
    public final /* synthetic */ MediaAlbumActivity A00;

    public C57052q1(MediaAlbumActivity mediaAlbumActivity) {
        this.A00 = mediaAlbumActivity;
    }

    public void A03(List list, Map map) {
        View A06;
        View A062;
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        List list2 = mediaAlbumActivity.A08.A00;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i2 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                C16740tZ A0V = C13680ns.A0V(it);
                i2++;
                if (i2 <= 3) {
                    ListView ADA = mediaAlbumActivity.ADA();
                    C28381Vw r5 = A0V.A11;
                    View findViewWithTag = ADA.findViewWithTag(r5);
                    if (findViewWithTag == null || z2 || (findViewWithTag.getTop() < 0 && (findViewWithTag.getTop() >= 0 || findViewWithTag.getBottom() < mediaAlbumActivity.ADA().getHeight()))) {
                        map.remove(C47612Jr.A04(r5.toString()));
                        map.remove(C47612Jr.A03(A0V));
                    } else {
                        String A04 = C47612Jr.A04(r5.toString());
                        if (!map.containsKey(A04) && (A062 = C455529g.A06(mediaAlbumActivity.ADA(), A04)) != null) {
                            list.add(A04);
                            map.put(A04, A062);
                        }
                        String A03 = C47612Jr.A03(A0V);
                        if (!map.containsKey(A03) && (A06 = C455529g.A06(mediaAlbumActivity.ADA(), A03)) != null) {
                            list.add(A03);
                            map.put(A03, A06);
                        }
                        z2 = true;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
