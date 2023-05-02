package d;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonReader;

/* compiled from: XFMFile */
public final class a extends JsonReaderInternalAccess {
    public final void promoteNameToValue(JsonReader jsonReader) {
        int i2;
        if (jsonReader instanceof JsonTreeReader) {
            ((JsonTreeReader) jsonReader).promoteNameToValue();
            return;
        }
        int i3 = jsonReader.f448h;
        if (i3 == 0) {
            i3 = jsonReader.b();
        }
        if (i3 == 13) {
            i2 = 9;
        } else if (i3 == 12) {
            i2 = 8;
        } else if (i3 == 14) {
            i2 = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + jsonReader.peek() + jsonReader.f());
        }
        jsonReader.f448h = i2;
    }
}
