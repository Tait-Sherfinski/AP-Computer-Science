package Q2.LP3_14;

public class ClLP3_14 {
  private int aNewYork;
  private int mNewYork;
  private int aNewJersey;
  private int mNewJersey;
  private int aConnecticut;
  private int mConnecticut;
  private int aVotes;
  private int mVotes;
  private int total;

  public ClLP3_14(int aNY, int mNY, int aNJ, int mNJ, int aC, int mC) {
    aNewYork = aNY;
    mNewYork = mNY;
    aNewJersey = aNJ;
    mNewJersey = mNJ;
    aConnecticut = aC;
    mConnecticut = mC;
    aVotes = 0;
    mVotes = 0;
    total = 0;
  }

  public void calc() {
    aVotes = aNewYork + aNewJersey + aConnecticut;
    mVotes = mNewYork + mNewJersey + mConnecticut;
    total = aVotes + mVotes;
  }

  public int getAVotes() {
    return aVotes;
  }

  public int getMVotes() {
    return mVotes;
  }

  public int getTotal() {
    return total;
  }
}