package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2pE  reason: invalid class name and case insensitive filesystem */
public class C56952pE extends LinearLayout implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;

    public C56952pE(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
        this.A02 = false;
        setOrientation(1);
        setGravity(16);
        LinearLayout.inflate(getContext(), R.layout.layout0283, this);
        TextEmojiLabel A0Q = C13680ns.A0Q(this, R.id.file_attachment_metadata_title);
        this.A08 = A0Q;
        this.A06 = C13680ns.A0Q(this, R.id.file_attachment_metadata_description);
        this.A07 = C13680ns.A0Q(this, R.id.file_attachment_metadata_subtext);
        this.A04 = AnonymousClass00T.A00(context, R.color.color0505);
        this.A05 = AnonymousClass00T.A00(context, R.color.color0507);
        AnonymousClass1UP.A06(A0Q);
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel.getPaint().measureText(str) > ((float) textEmojiLabel.getMeasuredWidth())) {
            textEmojiLabel.setMaxLines(2);
            this.A06.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A06.setMaxLines(2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        this.A02 = true;
        TextEmojiLabel textEmojiLabel = this.A08;
        measureChild(textEmojiLabel, i2, i3);
        setupTitleAndDescriptionMaxLines(C13690nt.A0b(textEmojiLabel));
        super.onMeasure(i2, i3);
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A07;
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        textEmojiLabel.setVisibility(i2);
        if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.A0I((List) null, AnonymousClass2TP.A01(getContext(), this.A00, str, list));
        }
    }

    public void setTitleAndDescription(String str, String str2, List list) {
        TextEmojiLabel textEmojiLabel;
        TextEmojiLabel textEmojiLabel2 = this.A06;
        boolean z2 = false;
        int i2 = 0;
        if (TextUtils.isEmpty(str2)) {
            i2 = 8;
        }
        textEmojiLabel2.setVisibility(i2);
        if (this.A02 || this.A08.getMeasuredWidth() != 0) {
            z2 = true;
        }
        this.A02 = z2;
        if (z2) {
            setupTitleAndDescriptionMaxLines(str);
        }
        if (list == null || list.isEmpty()) {
            textEmojiLabel = this.A08;
            int i3 = this.A05;
        } else {
            textEmojiLabel = this.A08;
            int i4 = this.A04;
        }
        Context context = getContext();
        AnonymousClass013 r2 = this.A00;
        textEmojiLabel.A0I((List) null, AnonymousClass2TP.A01(context, r2, str, list));
        textEmojiLabel2.A0I((List) null, str2 != null ? AnonymousClass2TP.A01(getContext(), r2, str2, list) : "");
    }
}
