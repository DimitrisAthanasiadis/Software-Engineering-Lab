package erg_7;

public class MiSyndromitis extends Xristis
{

    private final float epivarinsi;

    public MiSyndromitis()
    {
        this(null);
    }

    public MiSyndromitis(Xristis user)
    {
        super(user.onoma, user.eponymo, user.email, user.tilefono);
        this.epivarinsi = (float) 14.5;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Epivarinsi = " + epivarinsi;
    }
}
