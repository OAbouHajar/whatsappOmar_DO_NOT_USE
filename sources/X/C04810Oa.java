package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Oa  reason: invalid class name and case insensitive filesystem */
public class C04810Oa {
    public int A00 = -1;
    public int A01;
    public C06500Wj A02;
    public ArrayList A03 = AnonymousClass000.A0u();

    public C04810Oa(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AnonymousClass0NK.A06);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.A01 = obtainStyledAttributes.getResourceId(index, this.A01);
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getResourceId(index, this.A00);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A00);
                context.getResources().getResourceName(this.A00);
                if ("layout".equals(resourceTypeName)) {
                    C06500Wj r3 = new C06500Wj();
                    this.A02 = r3;
                    r3.A06((ConstraintLayout) LayoutInflater.from(context).inflate(this.A00, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
