package idv.tryout.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class ImgIdGenerator {
  private static SecureRandom random = new SecureRandom();

  public static String nextImgId() {
    return new BigInteger(130, random).toString(32);
  }
}

