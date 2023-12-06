package Q2.LP3_14;

public class ClLP3_14 {
  private double aNewYork;
  private double mNewYork;
  private double aNewJersey;
  private double mNewJersey;
  private double aConnecticut;
  private double mConnecticut;
  private double aVotes;
  private double mVotes;
  private double total;

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

  public double getAVotes() {
    return aVotes;
  }

  public double getMVotes() {
    return mVotes;
  }

  public double getTotal() {
    return total;
  }
}