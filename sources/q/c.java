package q;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.youbasha.others;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final View f2386a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f2387b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f2388c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f2389d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f2390e;

    /* renamed from: f  reason: collision with root package name */
    public final Button f2391f;

    public c(View view) {
        this.f2386a = view;
        this.f2389d = (ImageView) view.findViewById(others.getID("flag", "id"));
        this.f2390e = (ImageView) view.findViewById(others.getID("flag2", "id"));
        this.f2387b = (TextView) view.findViewById(others.getID("rank", "id"));
        this.f2388c = (TextView) view.findViewById(others.getID("country", "id"));
        this.f2391f = (Button) view.findViewById(others.getID("div2", "id"));
    }
}
