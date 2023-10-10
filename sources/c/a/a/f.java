package c.a.a;
/* loaded from: classes.dex */
public interface f {
    private static int[] m = {78419, 98894526, 52752454, 3538622};

    private static String e(String str) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            switch (i3 % 4) {
                case 0:
                    sb.append((char) (charArray[i3] ^ 18475));
                    int i4 = m[1];
                    if (i4 >= 0 && (i4 & (54484019 ^ i4)) != 79692428) {
                    }
                    break;
                case 1:
                    sb.append((char) (charArray[i3] ^ 41365));
                    int i5 = m[2];
                    if (i5 >= 0) {
                        do {
                        } while ((i5 & (2069168 ^ i5)) <= 0);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    sb.append((char) (charArray[i3] ^ 3021));
                    int i6 = m[3];
                    if (i6 >= 0) {
                        do {
                            i = i6 % (64847870 ^ i6);
                            i6 = 3538622;
                        } while (i != 3538622);
                        break;
                    } else {
                        break;
                    }
                default:
                    sb.append((char) (charArray[i3] ^ 65535));
                    int i7 = m[0];
                    if (i7 >= 0) {
                        do {
                            i2 = i7 & (39750637 ^ i7);
                            i7 = 77842;
                        } while (i2 != 77842);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }
}
