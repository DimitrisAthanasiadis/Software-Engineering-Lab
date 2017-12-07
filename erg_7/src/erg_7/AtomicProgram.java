package erg_7;

public class AtomicProgram
{

    private Xristis user;
    private Synedria syn[];

    public AtomicProgram(Xristis user, Synedria syn[])
    {
        this.user = user;
        this.syn = syn;
    }

    public Xristis getUser()
    {
        return user;
    }

    public void setUser(Xristis user)
    {
        this.user = user;
    }

    public Synedria[] getSyn()
    {
        return syn;
    }

    public void setSyn(Synedria[] syn)
    {
        this.syn = syn;
    }

    @Override
    public String toString()
    {
        return this.user.toString() + this.syn.toString();
    }
}
