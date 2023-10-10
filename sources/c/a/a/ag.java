package c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
class ag {

    /* renamed from: a  reason: collision with root package name */
    private static ag f18a;
    private static int[] bn = {5505542, 12249415, 47383578, 29118675};

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f19b;

    ag(Context context) {
        this.f19b = context.getSharedPreferences(new StringBuffer().append(context.getPackageName()).append(F("\ue23b㸴铸ﾚ\ue202㸡铸ﾚ\ue20a㸧铯ﾌ").intern()).toString(), 0);
    }

    private static String F(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            switch (i2 % 4) {
                case 0:
                    sb.append((char) (charArray[i2] ^ 57956));
                    int i3 = bn[1];
                    if (i3 >= 0) {
                        do {
                            i = i3 % (66200412 ^ i3);
                            i3 = 12249415;
                        } while (i != 12249415);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    sb.append((char) (charArray[i2] ^ 15940));
                    int i4 = bn[2];
                    if (i4 >= 0 && (i4 & (10930806 ^ i4)) != 38863880) {
                    }
                    break;
                case 2:
                    sb.append((char) (charArray[i2] ^ 38026));
                    int i5 = bn[3];
                    if (i5 >= 0 && i5 % (18211872 ^ i5) != 6874861) {
                    }
                    break;
                default:
                    sb.append((char) (charArray[i2] ^ 65535));
                    int i6 = bn[0];
                    if (i6 >= 0 && (i6 & (9574434 ^ i6)) != 4456964) {
                    }
                    break;
            }
        }
        return sb.toString();
    }

    public static ag a(Context context) {
        if (f18a == null) {
            f18a = new ag(context);
        }
        return f18a;
    }
}
