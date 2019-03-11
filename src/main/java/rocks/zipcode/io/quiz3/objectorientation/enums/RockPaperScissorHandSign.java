package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    PAPER,
    ROCK,
    SCISSOR;

    private static RockPaperScissorHandSign[] vals = values();

    public RockPaperScissorHandSign getWinner() {
        return vals[((this.ordinal() - 1) + vals.length) % vals.length];
    }

    public RockPaperScissorHandSign getLoser() {
        return vals[(this.ordinal() + 1) % vals.length];
    }
}
